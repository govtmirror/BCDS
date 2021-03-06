package gov.va.vba.service.data;

import gov.va.vba.bcdss.models.ClaimRating;
import gov.va.vba.bcdss.models.EarDecision;
import gov.va.vba.bcdss.models.KneeDecision;
import gov.va.vba.bcdss.models.Rating;
import gov.va.vba.bcdss.models.RatingDecisions;
import gov.va.vba.bcdss.models.VeteranClaim;
import gov.va.vba.bcdss.models.VeteranClaimRating;
import gov.va.vba.domain.Claim;
import gov.va.vba.persistence.entity.DDMModelPattern;
import gov.va.vba.persistence.entity.ModelRatingResults;
import gov.va.vba.persistence.entity.ModelRatingResultsCntnt;
import gov.va.vba.persistence.entity.ModelRatingResultsCntntId;
import gov.va.vba.persistence.entity.ModelRatingResultsDiag;
import gov.va.vba.persistence.entity.ModelRatingResultsDiagId;
import gov.va.vba.persistence.entity.ModelRatingResultsStatus;
import gov.va.vba.persistence.entity.ModelRatingResultsStatusId;
import gov.va.vba.persistence.entity.RatingDecision;
import gov.va.vba.persistence.entity.Veteran;
import gov.va.vba.persistence.models.data.DecisionDetails;
import gov.va.vba.persistence.models.data.DiagnosisCount;
import gov.va.vba.persistence.models.data.KneeClaim;
import gov.va.vba.persistence.repository.ClaimRepository;
import gov.va.vba.persistence.repository.DDMContentionRepository;
import gov.va.vba.persistence.repository.DDMModelPatternRepository;
import gov.va.vba.persistence.repository.ModelRatingResultsCntnRepository;
import gov.va.vba.persistence.repository.ModelRatingResultsDiagRepository;
import gov.va.vba.persistence.repository.ModelRatingResultsRepository;
import gov.va.vba.persistence.repository.ModelRatingResultsStatusRepository;
import gov.va.vba.persistence.repository.RatingDao;
import gov.va.vba.persistence.repository.RatingDecisionRepository;
import gov.va.vba.persistence.repository.VeteranRepository;
import gov.va.vba.persistence.util.KneeCalculator;
import gov.va.vba.service.AppUtill;
import gov.va.vba.service.orika.ClaimMapper;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ClaimDataService extends AbsDataService<gov.va.vba.persistence.entity.Claim, Claim> {

    private static final Logger LOG = LoggerFactory.getLogger(ClaimDataService.class);
    private static final List<Long> KNEE_CONTENTION_IDS = Arrays.asList(230L, 270L, 3690L, 3700L, 3710L, 8919L, 3720L, 3730L, 3780L, 3790L, 3800L);
    private static final List<String> KNEE_DIAGNOSIS_CODES = Arrays.asList("5055", "5161", "5162", "5163", "5164", "5165", "5256", "5257", "5258", "5259", "5260", "5261", "5262", "5263", "5264", "5313", "5314", "5315");

    @Autowired
    private ClaimRepository claimRepository;

    @Autowired
    private VeteranRepository veteranRepository;

    @Autowired
    private RatingDecisionRepository ratingDecisionRepository;

    @Autowired
    private ClaimMapper claimMapper;

    @Autowired
    private ModelRatingResultsRepository modelRatingResultsRepository;

    @Autowired
    private ModelRatingResultsCntnRepository modelRatingResultsCntnRepository;

    @Autowired
    private ModelRatingResultsDiagRepository modelRatingResultsDiagRepository;

    @Autowired
    private ModelRatingResultsStatusRepository modelRatingResultsStatusRepository;

    @Autowired
    private DDMContentionRepository ddmContentionRepository;

    @Autowired
    private RatingDao ratingDao;

    @Autowired
    private DDMDataService ddmDataService;

    @Autowired
    private DDMModelCntntService ddmModelCntntService;

    public ClaimDataService() {
        this.setClasses(gov.va.vba.persistence.entity.Claim.class, Claim.class);
    }

    public List<Claim> findAll() {
        List<Claim> output = new ArrayList<>();
        List<gov.va.vba.persistence.entity.Claim> input = ((ClaimRepository) repository).findAll();
        mapper.mapAsCollection(input, output, outputClass);
        return output;
    }

    public List<Claim> findFirstNumberedRow() {
        List<gov.va.vba.persistence.entity.Claim> input = ((ClaimRepository) repository).findFirstNumberedRow();
        List<Claim> claims = claimMapper.mapCollection(input);
        for (Claim c : claims) {
            c.setCestDate(calculateCestDate(c.getClaimDate()));
        }
        LOG.info("SIZE :::: " + claims.size());
        return claims;
    }

    public List<VeteranClaimRating> findByVeteranId(List<VeteranClaim> veteranClaims, String currentLogin) {
        List<VeteranClaimRating> veteranClaimRatings = new ArrayList<>();
        for (VeteranClaim vc : veteranClaims) {

            VeteranClaimRating veteranClaimRating = new VeteranClaimRating();
            veteranClaimRating.setVeteran(vc.getVeteran());
            int veteranId = vc.getVeteran().getVeteranId();
            Veteran veteran = veteranRepository.findOneByVeteranId((long) veteranId);
            List<gov.va.vba.bcdss.models.Claim> claims = vc.getClaim();
            List<ClaimRating> claimRatings = new ArrayList<>();

            for (gov.va.vba.bcdss.models.Claim c : claims) {
                int claimId = c.getClaimId();
                List<KneeClaim> kneeClaims = ratingDao.getPreviousClaims(veteranId, claimId);

                if (CollectionUtils.isNotEmpty(kneeClaims)) {
                    KneeClaim kneeClaim = kneeClaims.get(0);
                    Set<Long> claimsList = new HashSet<>();
                    Map<Long, Integer> contentionCounts = new HashMap<>();
                    for(KneeClaim kc : kneeClaims) {
                        claimsList.add(kc.getClaimId());
                        if(contentionCounts.containsKey(kc.getContentionClassificationId())) {
                            int value = contentionCounts.get(kc.getContentionClassificationId());
                            contentionCounts.put(kc.getContentionClassificationId(), value + 1);
                        } else {
                            contentionCounts.put(kc.getContentionClassificationId(), 1);
                        }
                    }
                    //List<DiagnosisCount> diagnosisCount = ratingDao.getDiagnosisCount((long) veteranId, kneeClaim.getClaimDate());
                    List<DecisionDetails> decisions = ratingDao.getDecisionsPercentByClaimDate(veteranId, kneeClaim.getClaimDate());
                    int calculatedValue = calculateKneeRating(decisions);

                    int birthYear = Integer.parseInt(veteran.getBirthYear());
                    Calendar dob = Calendar.getInstance();
                    dob.set(1, 1, birthYear);
                    int age = KneeCalculator.claimantAge(kneeClaim.getClaimDate(), dob.getTime());

                    ModelRatingResults results = new ModelRatingResults();
                    results.setProcessDate(new Date());
                    results.setProcessId(generateRandomId());
                    //results.setCDDAge((long) cddAge);
                    //results.setClaimAge((long) age);
                    results.setClaimId(kneeClaim.getClaimId());
                    results.setClaimDate(kneeClaim.getClaimDate());
                        /*results.setProfileDate(claim.getProfileDate());*/
                    results.setVeteranId((long) veteranId);
                    results.setRegionalOfficeNumber(kneeClaim.getClaimRONumber());
                    results.setClaimantAge((long) age);
                    results.setClaimCount((long) claimsList.size());
                    results.setModelType("Knee");
                    results.setContentionCount((long) contentionCounts.keySet().size());
                    //results.setQuantCDD(calculatedCdd.longValue());
                    //results.setCurrentCDD(calculatedCdd.longValue());
                    //results.setPriorCDD((long) previousCddSum);
                    ModelRatingResults savedResults = modelRatingResultsRepository.save(results);
                    BigDecimal processId = BigDecimal.valueOf(savedResults.getProcessId());

                    List<ModelRatingResultsCntnt> resultsCntnts = saveModelResultsCtnts(contentionCounts, savedResults);
                    saveModelResultsDiag(savedResults);
                    saveResultStatus(results, currentLogin);

                    //TODO: last param
                    List<DDMModelPattern> patterns = ddmDataService.getPatternId(results.getModelType(), results.getClaimantAge(), results.getClaimCount(), (long) contentionCounts.keySet().size(), 0L);
                    //ddmModelCntntService.getPatternId(results.getModelType(), )
                    if (CollectionUtils.isNotEmpty(patterns)) {
                        DDMModelPattern ddmModelPattern = patterns.get(0);
                        results.setPatternId(ddmModelPattern.getPatternId());
                        /*for(DDMModelPattern p : patterns) {
                            p.
                        }*/
                        modelRatingResultsRepository.save(results);
                    }

                    EarDecision ed = new EarDecision();
                    KneeDecision kd = new KneeDecision();
                    RatingDecisions ratingDecisions = new RatingDecisions();
                    ratingDecisions.setProcessId(processId.intValue());
                    ratingDecisions.setEarRatings(ed);
                    ratingDecisions.setKneeRatings(kd);
                    gov.va.vba.bcdss.models.Rating rating = new Rating();
                    rating.setCddAge(age);
                    rating.setClaimAge(age);
                    rating.setClaimantAge(age);
                    rating.setClaimCount(savedResults.getClaimCount().intValue());
                    //rating.setContationCount(contentionsCount);
                    //rating.setCurrentCdd(calculatedCdd.intValue());
                    //rating.setPriorCdd(previousCddSum);
                    rating.setProcessId(processId.intValue());
                    //rating.setQuantCdd(calculatedCdd.intValue());
                    rating.setRatingDecisions(ratingDecisions);
                    rating.setModelType("KNEE");

                    rating.setProcessDate(savedResults.getClaimDate());
                    c.setClaimDate(kneeClaim.getClaimDate());
                        /*c.setProfileDate(claim.getProfileDate());*/
                    //c.setContentionClassificationId(String.valueOf(kneeClaim.getContentionClsfcnId()));
                    //c.setContentionId(Integer.parseInt(kneeClaim.getContentionId()));
                    //c.setProductTypeCode(kneeClaim.getEndPrdctTypeCode());
                   // c.setContentionBeginDate(kneeClaim.getContentionBeginDate());
                    ClaimRating cr = new ClaimRating();
                    cr.setClaim(c);
                    cr.setRating(rating);
                    claimRatings.add(cr);

                }
            }
            veteranClaimRating.getClaimRating().addAll(claimRatings);
            veteranClaimRatings.add(veteranClaimRating);
        }
        return veteranClaimRatings;
    }

    /**
     * Description: This method is used to save contentions count
     *
     * @param counts   - claimId
     * @param results   - results
     */
    private List<ModelRatingResultsCntnt> saveModelResultsCtnts(Map<Long, Integer> counts, ModelRatingResults results) {
        //TODO:
        //List<Object[]> contentionsCount = claimRepository.aggregateContentions(claimId, veteranId);
        HashMap<Long, Long> countMap = new HashMap<>();
        for (Long i : KNEE_CONTENTION_IDS) {
            countMap.put(i, 0L);
        }
        for (Map.Entry<Long, Integer> x : counts.entrySet()) {
            if (countMap.containsKey(x.getKey())) {
                countMap.put(x.getKey(), (long) x.getValue());
            }
        }
        List<ModelRatingResultsCntnt> cntntList = new ArrayList<>();
        for (Map.Entry<Long, Long> x : countMap.entrySet()) {
            ModelRatingResultsCntntId cntntId = new ModelRatingResultsCntntId(x.getKey(), results.getProcessId());
            ModelRatingResultsCntnt cntnt = new ModelRatingResultsCntnt();
            cntnt.setId(cntntId);
            cntnt.setCount(BigDecimal.valueOf(x.getValue()));
            cntnt.setModelRatingResults(results);
            cntntList.add(cntnt);
        }
        modelRatingResultsCntnRepository.save(cntntList);
        LOG.info("SUCCESSFULLY SAVED CONTENTION COUNT INTO MODEL_RATING_RESULTS_CNTNT TABLE");
        return cntntList;
    }

    /**
     * Description:
     *
     * @param results
     */
    private void saveModelResultsDiag(ModelRatingResults results) {
        List<DiagnosisCount> diagnosisCount = ratingDao.getDiagnosisCount(results.getVeteranId(), results.getClaimDate());
        HashMap<String, Long> diagCount = new HashMap<>();
        for (String i : KNEE_DIAGNOSIS_CODES) {
            diagCount.put(i, 0L);
        }
        for (DiagnosisCount x : diagnosisCount) {
            String diagCode = x.getDecisionCode();
            int count = x.getCount();
            if (diagCount.containsKey(diagCode)) {
                diagCount.put(diagCode, (long) count);
            }
        }
        List<ModelRatingResultsDiag> diagList = new ArrayList<>();
        for (Map.Entry<String, Long> x : diagCount.entrySet()) {
            ModelRatingResultsDiagId diagId = new ModelRatingResultsDiagId(Long.valueOf(x.getKey()), results.getProcessId());
            ModelRatingResultsDiag diag = new ModelRatingResultsDiag();
            diag.setId(diagId);
            diag.setCount(x.getValue());
            diag.setModelRatingResults(results);
            diagList.add(diag);
        }
        modelRatingResultsDiagRepository.save(diagList);
        LOG.info("SUCCESSFULLY SAVED DIGANOSIS COUNT INTO MODEL_RATING_RESULTS_DIAG TABLE");

    }

    private void saveResultStatus(ModelRatingResults results, String user) {
        ModelRatingResultsStatusId id = new ModelRatingResultsStatusId();
        id.setProcessId(results.getProcessId());
        id.setProcessStatus("PENDING");
        ModelRatingResultsStatus status = new ModelRatingResultsStatus();
        status.setId(id);
        status.setModelRatingResults(results);
        status.setCrtdDtm(new Date());
        status.setCrtdBy(user);
        modelRatingResultsStatusRepository.save(status);
        LOG.info("SAVED MODEL RATING RESULTS STATUS SUCCESSFULLY");
    }

    private Map<RatingDecision, BigDecimal> aggregateRatingDecisions(List<RatingDecision> decisions) {
        Map<RatingDecision, BigDecimal> m = new HashMap<>();
        for (RatingDecision decision : decisions) {
            boolean isFound = false;
            for (Map.Entry<RatingDecision, BigDecimal> r : m.entrySet()) {
                RatingDecision key = r.getKey();
                if (key.getDiagnosisCode().equals(decision.getDiagnosisCode()) && key.getProfileDate().equals(decision.getProfileDate())) {
                    BigDecimal value = r.getValue();
                    BigDecimal bigDecimal = new BigDecimal(key.getPercentNumber());
                    m.put(key, value.add(bigDecimal));
                    isFound = true;
                }
            }
            if (!isFound) {
                m.put(decision, new BigDecimal(decision.getPercentNumber()));
            }


        }
        return m;
    }

    public List<Claim> findClaimsInRanged(Date from, Date to) {
        List<gov.va.vba.persistence.entity.Claim> result = claimRepository.findByClaimDateBetween(from, to);
        List<Claim> output = new ArrayList<>();
        mapper.mapAsCollection(result, output, outputClass);
        return output;
    }

    public List<Claim> findClaims(boolean isRegionalExist, String contentionType, Long regionalOfficeNumber) {
    	LOG.debug("REST request to get advance filtered Claims");
    	List<gov.va.vba.persistence.entity.Claim> input = (isRegionalExist) ? claimRepository.findClaimsByRegionalOffice(contentionType, regionalOfficeNumber) : claimRepository.findClaimsByContention(contentionType);
        
        List<Claim> claims = claimMapper.mapCollection(input);
        LOG.info("SIZE :::: " + claims.size());
        return claims;
    }
    
    public List<Claim> getProcessClaimsResults(boolean establishedDate, Date fromDate, Date toDate, String contentionType, Long regionalOfficeNumber) {
        if (fromDate == null) {
            Calendar instance = Calendar.getInstance();
            instance.set(1900, 12, 31);
            fromDate = instance.getTime();
        }
        if (toDate == null) {
            toDate = new Date();
        }
        List<gov.va.vba.persistence.entity.Claim> result =  claimRepository.findClaimSByRangeOnClaimDate(contentionType, regionalOfficeNumber, fromDate, toDate);
        List<Claim> output = new ArrayList<>();
        mapper.mapAsCollection(result, output, outputClass);
        return output;
    }
    
    public List<Claim> calculateContentions(Long claimId, Long veteranId) {
        List<Object[]> objects = claimRepository.aggregateContentions(claimId, veteranId);
        List<Date> previousClaims = ratingDecisionRepository.findPreviousClaims(21213L, new Date());
        return null;
    }

    private Date calculateCestDate(Date claimDate) {
        if (claimDate != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTime(claimDate);
            instance.add(Calendar.DAY_OF_MONTH, 10);
            return instance.getTime();
        }
        return null;
    }

    // -- remove this use @GeneratedValue
    @Deprecated
    private long generateRandomId() {
        long x = 12345L;
        long y = 23456789L;
        Random r = new Random();
        return x + ((long) (r.nextDouble() * (y - x)));
    }

    private float calculateKneeRating(Map<String, Float> calculatedPercentNumber) {
        float calVal = 1;
        for (Float x : calculatedPercentNumber.values()) {
            calVal *= 1 - (x / 100);
        }
        calVal = (1 - calVal) * 100;
        return (calVal < 60) ? 60 : calVal;
    }

    private int calculateKneeRating(List<DecisionDetails> decisions) {
        float calVal = 1;
        for (DecisionDetails dd : decisions) {
            String percentNumber = dd.getPercentNumber();
            calVal *= 1 - (Integer.parseInt(percentNumber) / 100);
        }
        calVal = (1 - calVal) * 100;
        float calculatedValue = (calVal < 60) ? 60 : calVal;
        LOG.info("CALCULATED VALUE ::::::  {}", calculatedValue);
        return Math.round(calculatedValue / 10) * 10;
    }

}
