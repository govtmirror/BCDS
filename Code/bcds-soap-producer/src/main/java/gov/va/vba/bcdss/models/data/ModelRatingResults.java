package gov.va.vba.bcdss.data;
// Generated Oct 21, 2016 1:08:50 PM by Hibernate Tools 5.2.0.Beta1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ModelRatingResults generated by hbm2java
 */
public class ModelRatingResults implements java.io.Serializable {

	private BigDecimal processId;
	private BigDecimal vetId;
	private BigDecimal patternId;
	private Date processDate;
	private BigDecimal claimId;
	private BigDecimal claimantAge;
	private Date dob;
	private String endProductCode;
	private BigDecimal roNumber;
	private Date claimDate;
	private Date profileDate;
	private Date promulgationDate;
	private Date recentDate;
	private String modelType;
	private BigDecimal modelContentionCount;
	private BigDecimal contentionCount;
	private BigDecimal priorCdd;
	private BigDecimal quantPriorCdd;
	private BigDecimal currCdd;
	private BigDecimal quantCdd;
	private BigDecimal claimAge;
	private BigDecimal cddAge;
	private BigDecimal claimCount;
	private Set modelRatingResultsCntnts = new HashSet(0);
	private Set modelRatingResultsStatuses = new HashSet(0);
	private Set modelRatingResultsDiags = new HashSet(0);

	public ModelRatingResults() {
	}

	public ModelRatingResults(BigDecimal processId) {
		this.processId = processId;
	}

	public ModelRatingResults(BigDecimal processId, BigDecimal vetId, BigDecimal patternId, Date processDate,
			BigDecimal claimId, BigDecimal claimantAge, Date dob, String endProductCode, BigDecimal roNumber,
			Date claimDate, Date profileDate, Date promulgationDate, Date recentDate, String modelType,
			BigDecimal modelContentionCount, BigDecimal contentionCount, BigDecimal priorCdd, BigDecimal quantPriorCdd,
			BigDecimal currCdd, BigDecimal quantCdd, BigDecimal claimAge, BigDecimal cddAge, BigDecimal claimCount,
			Set modelRatingResultsCntnts, Set modelRatingResultsStatuses, Set modelRatingResultsDiags) {
		this.processId = processId;
		this.vetId = vetId;
		this.patternId = patternId;
		this.processDate = processDate;
		this.claimId = claimId;
		this.claimantAge = claimantAge;
		this.dob = dob;
		this.endProductCode = endProductCode;
		this.roNumber = roNumber;
		this.claimDate = claimDate;
		this.profileDate = profileDate;
		this.promulgationDate = promulgationDate;
		this.recentDate = recentDate;
		this.modelType = modelType;
		this.modelContentionCount = modelContentionCount;
		this.contentionCount = contentionCount;
		this.priorCdd = priorCdd;
		this.quantPriorCdd = quantPriorCdd;
		this.currCdd = currCdd;
		this.quantCdd = quantCdd;
		this.claimAge = claimAge;
		this.cddAge = cddAge;
		this.claimCount = claimCount;
		this.modelRatingResultsCntnts = modelRatingResultsCntnts;
		this.modelRatingResultsStatuses = modelRatingResultsStatuses;
		this.modelRatingResultsDiags = modelRatingResultsDiags;
	}

	public BigDecimal getProcessId() {
		return this.processId;
	}

	public void setProcessId(BigDecimal processId) {
		this.processId = processId;
	}

	public BigDecimal getVetId() {
		return this.vetId;
	}

	public void setVetId(BigDecimal vetId) {
		this.vetId = vetId;
	}

	public BigDecimal getPatternId() {
		return this.patternId;
	}

	public void setPatternId(BigDecimal patternId) {
		this.patternId = patternId;
	}

	public Date getProcessDate() {
		return this.processDate;
	}

	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}

	public BigDecimal getClaimId() {
		return this.claimId;
	}

	public void setClaimId(BigDecimal claimId) {
		this.claimId = claimId;
	}

	public BigDecimal getClaimantAge() {
		return this.claimantAge;
	}

	public void setClaimantAge(BigDecimal claimantAge) {
		this.claimantAge = claimantAge;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEndProductCode() {
		return this.endProductCode;
	}

	public void setEndProductCode(String endProductCode) {
		this.endProductCode = endProductCode;
	}

	public BigDecimal getRoNumber() {
		return this.roNumber;
	}

	public void setRoNumber(BigDecimal roNumber) {
		this.roNumber = roNumber;
	}

	public Date getClaimDate() {
		return this.claimDate;
	}

	public void setClaimDate(Date claimDate) {
		this.claimDate = claimDate;
	}

	public Date getProfileDate() {
		return this.profileDate;
	}

	public void setProfileDate(Date profileDate) {
		this.profileDate = profileDate;
	}

	public Date getPromulgationDate() {
		return this.promulgationDate;
	}

	public void setPromulgationDate(Date promulgationDate) {
		this.promulgationDate = promulgationDate;
	}

	public Date getRecentDate() {
		return this.recentDate;
	}

	public void setRecentDate(Date recentDate) {
		this.recentDate = recentDate;
	}

	public String getModelType() {
		return this.modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public BigDecimal getModelContentionCount() {
		return this.modelContentionCount;
	}

	public void setModelContentionCount(BigDecimal modelContentionCount) {
		this.modelContentionCount = modelContentionCount;
	}

	public BigDecimal getContentionCount() {
		return this.contentionCount;
	}

	public void setContentionCount(BigDecimal contentionCount) {
		this.contentionCount = contentionCount;
	}

	public BigDecimal getPriorCdd() {
		return this.priorCdd;
	}

	public void setPriorCdd(BigDecimal priorCdd) {
		this.priorCdd = priorCdd;
	}

	public BigDecimal getQuantPriorCdd() {
		return this.quantPriorCdd;
	}

	public void setQuantPriorCdd(BigDecimal quantPriorCdd) {
		this.quantPriorCdd = quantPriorCdd;
	}

	public BigDecimal getCurrCdd() {
		return this.currCdd;
	}

	public void setCurrCdd(BigDecimal currCdd) {
		this.currCdd = currCdd;
	}

	public BigDecimal getQuantCdd() {
		return this.quantCdd;
	}

	public void setQuantCdd(BigDecimal quantCdd) {
		this.quantCdd = quantCdd;
	}

	public BigDecimal getClaimAge() {
		return this.claimAge;
	}

	public void setClaimAge(BigDecimal claimAge) {
		this.claimAge = claimAge;
	}

	public BigDecimal getCddAge() {
		return this.cddAge;
	}

	public void setCddAge(BigDecimal cddAge) {
		this.cddAge = cddAge;
	}

	public BigDecimal getClaimCount() {
		return this.claimCount;
	}

	public void setClaimCount(BigDecimal claimCount) {
		this.claimCount = claimCount;
	}

	public Set getModelRatingResultsCntnts() {
		return this.modelRatingResultsCntnts;
	}

	public void setModelRatingResultsCntnts(Set modelRatingResultsCntnts) {
		this.modelRatingResultsCntnts = modelRatingResultsCntnts;
	}

	public Set getModelRatingResultsStatuses() {
		return this.modelRatingResultsStatuses;
	}

	public void setModelRatingResultsStatuses(Set modelRatingResultsStatuses) {
		this.modelRatingResultsStatuses = modelRatingResultsStatuses;
	}

	public Set getModelRatingResultsDiags() {
		return this.modelRatingResultsDiags;
	}

	public void setModelRatingResultsDiags(Set modelRatingResultsDiags) {
		this.modelRatingResultsDiags = modelRatingResultsDiags;
	}

}
