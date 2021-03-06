package main.java.gov.va.vba.persistence.models.data;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

public class Decisions implements Serializable {

	private long ptcpntVetId;
	private Date prfilDt;
	private Date inactvDt;
	private String systemTypeCd;
	private long ratingDecnId;
	private String poa;
	private Date prmlgnDt;
	private Date ratingDt;
	private String vbmsRInd;
	private String jrsdtnTxt;
	private Date ratingRcvdDt;
	private long stationNumber;
	private String stationName;
	private String militarySvcPeriodCode;
	private String militarySvcPeriodDesc;
	private String ratingDecnTypeCd;
	private String ratingDecnTypeDesc;
	private String narrativeCodesheetInd;
	private String issueTxt;
	private String decnTxt;
	private String dsbltyDecnTypeCd;
	private String dsbltyDecnTypeDesc;
	private String dsbltyDecnBasisTypeCd;
	private String dsbltyDecnBasisTypeDesc;
	private String blatrlTypeCd;
	private String blatrlTypeDesc;
	private String diagnosisCode;
	private String diagnosisDescription;
	private long dsbltyId;
	private Date dsbltyDt;
	private String dgnstcTxt;
	private long relatdDsbltyId;
	private Date relatdDsbltyDt;
	private String relatdDgnstcTxt;
	private String fullDgnstcTxt;
	private String splmtlDecnTypeCd;
	private String hypntdDgnstcTypeCd;
	private String shedTypeCd;
	private String prgrphTypeCd;
	private String prcntNbr;
	private String majorInd;
	private String combatInd;
	private String prevEvaltnInd;
	private Date beginDt;
	private Date endDt;
	private Date futureExamDt;
	private String staticInd;
	private String ancilyDecnTypeCd;
	private String ancilyDecnTypeDesc;
	private String cmptnyDecnTypeCd;
	private String cmptnyDecnTypeDesc;
	private String dentalSvcCnectdInd;
	private String indvdlUnemplDecnTypeCd;
	private String indvdlUnemplDecnTypeDesc;
	private String permntTotalDecnTypeCd;
	private String permntTotalDecnTypeDesc;
	private String scDeathDecnTypeCd;
	private String scDeathDecnTypeDesc;
	private String smpDecnTypeCd;
	private String smpDecnTypeDesc;
	private String speclPrvsnLawDecnTypeCd;
	private String speclPrvsnLawDecnTypeDesc;
	private String smcTypeCd;
	private String smcTypeDesc;
	private String hsptlSmcTypeCd;
	private String hsptlSmcTypeDesc;
	private String lossUseTypeCd;
	private String lossUseTypeDesc;
	private String antmclLossTypeCd;
	private String antmclLossTypeDesc;
	private String otherLossTypeCd;
	private String otherLossTypeDesc;
	private String smcPrgrphKeyCd;
	private String smcPrgrphTxt;

	public Decisions() {
	}

	public Decisions(long ptcpntVetId, Date prfilDt, long stationNumber, String stationName) {
		this.ptcpntVetId = ptcpntVetId;
		this.prfilDt = prfilDt;
		this.stationNumber = stationNumber;
		this.stationName = stationName;
	}

	public Decisions(long ptcpntVetId, Date prfilDt, Date inactvDt, String systemTypeCd,
			long ratingDecnId, String poa, Date prmlgnDt, Date ratingDt, String vbmsRInd, String jrsdtnTxt,
			Date ratingRcvdDt, long stationNumber, String stationName, String militarySvcPeriodCode,
			String militarySvcPeriodDesc, String ratingDecnTypeCd, String ratingDecnTypeDesc,
			String narrativeCodesheetInd, String issueTxt, String decnTxt, String dsbltyDecnTypeCd,
			String dsbltyDecnTypeDesc, String dsbltyDecnBasisTypeCd, String dsbltyDecnBasisTypeDesc,
			String blatrlTypeCd, String blatrlTypeDesc, String diagnosisCode, String diagnosisDescription,
			long dsbltyId, Date dsbltyDt, String dgnstcTxt, long relatdDsbltyId, Date relatdDsbltyDt,
			String relatdDgnstcTxt, String fullDgnstcTxt, String splmtlDecnTypeCd, String hypntdDgnstcTypeCd,
			String shedTypeCd, String prgrphTypeCd, String prcntNbr, String majorInd, String combatInd,
			String prevEvaltnInd, Date beginDt, Date endDt, Date futureExamDt, String staticInd,
			String ancilyDecnTypeCd, String ancilyDecnTypeDesc, String cmptnyDecnTypeCd, String cmptnyDecnTypeDesc,
			String dentalSvcCnectdInd, String indvdlUnemplDecnTypeCd, String indvdlUnemplDecnTypeDesc,
			String permntTotalDecnTypeCd, String permntTotalDecnTypeDesc, String scDeathDecnTypeCd,
			String scDeathDecnTypeDesc, String smpDecnTypeCd, String smpDecnTypeDesc, String speclPrvsnLawDecnTypeCd,
			String speclPrvsnLawDecnTypeDesc, String smcTypeCd, String smcTypeDesc, String hsptlSmcTypeCd,
			String hsptlSmcTypeDesc, String lossUseTypeCd, String lossUseTypeDesc, String antmclLossTypeCd,
			String antmclLossTypeDesc, String otherLossTypeCd, String otherLossTypeDesc, String smcPrgrphKeyCd,
			String smcPrgrphTxt) {
		this.ptcpntVetId = ptcpntVetId;
		this.prfilDt = prfilDt;
		this.inactvDt = inactvDt;
		this.systemTypeCd = systemTypeCd;
		this.ratingDecnId = ratingDecnId;
		this.poa = poa;
		this.prmlgnDt = prmlgnDt;
		this.ratingDt = ratingDt;
		this.vbmsRInd = vbmsRInd;
		this.jrsdtnTxt = jrsdtnTxt;
		this.ratingRcvdDt = ratingRcvdDt;
		this.stationNumber = stationNumber;
		this.stationName = stationName;
		this.militarySvcPeriodCode = militarySvcPeriodCode;
		this.militarySvcPeriodDesc = militarySvcPeriodDesc;
		this.ratingDecnTypeCd = ratingDecnTypeCd;
		this.ratingDecnTypeDesc = ratingDecnTypeDesc;
		this.narrativeCodesheetInd = narrativeCodesheetInd;
		this.issueTxt = issueTxt;
		this.decnTxt = decnTxt;
		this.dsbltyDecnTypeCd = dsbltyDecnTypeCd;
		this.dsbltyDecnTypeDesc = dsbltyDecnTypeDesc;
		this.dsbltyDecnBasisTypeCd = dsbltyDecnBasisTypeCd;
		this.dsbltyDecnBasisTypeDesc = dsbltyDecnBasisTypeDesc;
		this.blatrlTypeCd = blatrlTypeCd;
		this.blatrlTypeDesc = blatrlTypeDesc;
		this.diagnosisCode = diagnosisCode;
		this.diagnosisDescription = diagnosisDescription;
		this.dsbltyId = dsbltyId;
		this.dsbltyDt = dsbltyDt;
		this.dgnstcTxt = dgnstcTxt;
		this.relatdDsbltyId = relatdDsbltyId;
		this.relatdDsbltyDt = relatdDsbltyDt;
		this.relatdDgnstcTxt = relatdDgnstcTxt;
		this.fullDgnstcTxt = fullDgnstcTxt;
		this.splmtlDecnTypeCd = splmtlDecnTypeCd;
		this.hypntdDgnstcTypeCd = hypntdDgnstcTypeCd;
		this.shedTypeCd = shedTypeCd;
		this.prgrphTypeCd = prgrphTypeCd;
		this.prcntNbr = prcntNbr;
		this.majorInd = majorInd;
		this.combatInd = combatInd;
		this.prevEvaltnInd = prevEvaltnInd;
		this.beginDt = beginDt;
		this.endDt = endDt;
		this.futureExamDt = futureExamDt;
		this.staticInd = staticInd;
		this.ancilyDecnTypeCd = ancilyDecnTypeCd;
		this.ancilyDecnTypeDesc = ancilyDecnTypeDesc;
		this.cmptnyDecnTypeCd = cmptnyDecnTypeCd;
		this.cmptnyDecnTypeDesc = cmptnyDecnTypeDesc;
		this.dentalSvcCnectdInd = dentalSvcCnectdInd;
		this.indvdlUnemplDecnTypeCd = indvdlUnemplDecnTypeCd;
		this.indvdlUnemplDecnTypeDesc = indvdlUnemplDecnTypeDesc;
		this.permntTotalDecnTypeCd = permntTotalDecnTypeCd;
		this.permntTotalDecnTypeDesc = permntTotalDecnTypeDesc;
		this.scDeathDecnTypeCd = scDeathDecnTypeCd;
		this.scDeathDecnTypeDesc = scDeathDecnTypeDesc;
		this.smpDecnTypeCd = smpDecnTypeCd;
		this.smpDecnTypeDesc = smpDecnTypeDesc;
		this.speclPrvsnLawDecnTypeCd = speclPrvsnLawDecnTypeCd;
		this.speclPrvsnLawDecnTypeDesc = speclPrvsnLawDecnTypeDesc;
		this.smcTypeCd = smcTypeCd;
		this.smcTypeDesc = smcTypeDesc;
		this.hsptlSmcTypeCd = hsptlSmcTypeCd;
		this.hsptlSmcTypeDesc = hsptlSmcTypeDesc;
		this.lossUseTypeCd = lossUseTypeCd;
		this.lossUseTypeDesc = lossUseTypeDesc;
		this.antmclLossTypeCd = antmclLossTypeCd;
		this.antmclLossTypeDesc = antmclLossTypeDesc;
		this.otherLossTypeCd = otherLossTypeCd;
		this.otherLossTypeDesc = otherLossTypeDesc;
		this.smcPrgrphKeyCd = smcPrgrphKeyCd;
		this.smcPrgrphTxt = smcPrgrphTxt;
	}

	public long getPtcpntVetId() {
		return this.ptcpntVetId;
	}

	public void setPtcpntVetId(long ptcpntVetId) {
		this.ptcpntVetId = ptcpntVetId;
	}

	public Date getPrfilDt() {
		return this.prfilDt;
	}

	public void setPrfilDt(Date prfilDt) {
		this.prfilDt = prfilDt;
	}

	public Date getInactvDt() {
		return this.inactvDt;
	}

	public void setInactvDt(Date inactvDt) {
		this.inactvDt = inactvDt;
	}

	public String getSystemTypeCd() {
		return this.systemTypeCd;
	}

	public void setSystemTypeCd(String systemTypeCd) {
		this.systemTypeCd = systemTypeCd;
	}

	public long getRatingDecnId() {
		return this.ratingDecnId;
	}

	public void setRatingDecnId(long ratingDecnId) {
		this.ratingDecnId = ratingDecnId;
	}

	public String getPoa() {
		return this.poa;
	}

	public void setPoa(String poa) {
		this.poa = poa;
	}

	public Date getPrmlgnDt() {
		return this.prmlgnDt;
	}

	public void setPrmlgnDt(Date prmlgnDt) {
		this.prmlgnDt = prmlgnDt;
	}

	public Date getRatingDt() {
		return this.ratingDt;
	}

	public void setRatingDt(Date ratingDt) {
		this.ratingDt = ratingDt;
	}

	public String getVbmsRInd() {
		return this.vbmsRInd;
	}

	public void setVbmsRInd(String vbmsRInd) {
		this.vbmsRInd = vbmsRInd;
	}

	public String getJrsdtnTxt() {
		return this.jrsdtnTxt;
	}

	public void setJrsdtnTxt(String jrsdtnTxt) {
		this.jrsdtnTxt = jrsdtnTxt;
	}

	public Date getRatingRcvdDt() {
		return this.ratingRcvdDt;
	}

	public void setRatingRcvdDt(Date ratingRcvdDt) {
		this.ratingRcvdDt = ratingRcvdDt;
	}

	public long getStationNumber() {
		return this.stationNumber;
	}

	public void setStationNumber(long stationNumber) {
		this.stationNumber = stationNumber;
	}

	public String getStationName() {
		return this.stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getMilitarySvcPeriodCode() {
		return this.militarySvcPeriodCode;
	}

	public void setMilitarySvcPeriodCode(String militarySvcPeriodCode) {
		this.militarySvcPeriodCode = militarySvcPeriodCode;
	}

	public String getMilitarySvcPeriodDesc() {
		return this.militarySvcPeriodDesc;
	}

	public void setMilitarySvcPeriodDesc(String militarySvcPeriodDesc) {
		this.militarySvcPeriodDesc = militarySvcPeriodDesc;
	}

	public String getRatingDecnTypeCd() {
		return this.ratingDecnTypeCd;
	}

	public void setRatingDecnTypeCd(String ratingDecnTypeCd) {
		this.ratingDecnTypeCd = ratingDecnTypeCd;
	}

	public String getRatingDecnTypeDesc() {
		return this.ratingDecnTypeDesc;
	}

	public void setRatingDecnTypeDesc(String ratingDecnTypeDesc) {
		this.ratingDecnTypeDesc = ratingDecnTypeDesc;
	}

	public String getNarrativeCodesheetInd() {
		return this.narrativeCodesheetInd;
	}

	public void setNarrativeCodesheetInd(String narrativeCodesheetInd) {
		this.narrativeCodesheetInd = narrativeCodesheetInd;
	}

	public String getIssueTxt() {
		return this.issueTxt;
	}

	public void setIssueTxt(String issueTxt) {
		this.issueTxt = issueTxt;
	}

	public String getDecnTxt() {
		return this.decnTxt;
	}

	public void setDecnTxt(String decnTxt) {
		this.decnTxt = decnTxt;
	}

	public String getDsbltyDecnTypeCd() {
		return this.dsbltyDecnTypeCd;
	}

	public void setDsbltyDecnTypeCd(String dsbltyDecnTypeCd) {
		this.dsbltyDecnTypeCd = dsbltyDecnTypeCd;
	}

	public String getDsbltyDecnTypeDesc() {
		return this.dsbltyDecnTypeDesc;
	}

	public void setDsbltyDecnTypeDesc(String dsbltyDecnTypeDesc) {
		this.dsbltyDecnTypeDesc = dsbltyDecnTypeDesc;
	}

	public String getDsbltyDecnBasisTypeCd() {
		return this.dsbltyDecnBasisTypeCd;
	}

	public void setDsbltyDecnBasisTypeCd(String dsbltyDecnBasisTypeCd) {
		this.dsbltyDecnBasisTypeCd = dsbltyDecnBasisTypeCd;
	}

	public String getDsbltyDecnBasisTypeDesc() {
		return this.dsbltyDecnBasisTypeDesc;
	}

	public void setDsbltyDecnBasisTypeDesc(String dsbltyDecnBasisTypeDesc) {
		this.dsbltyDecnBasisTypeDesc = dsbltyDecnBasisTypeDesc;
	}

	public String getBlatrlTypeCd() {
		return this.blatrlTypeCd;
	}

	public void setBlatrlTypeCd(String blatrlTypeCd) {
		this.blatrlTypeCd = blatrlTypeCd;
	}

	public String getBlatrlTypeDesc() {
		return this.blatrlTypeDesc;
	}

	public void setBlatrlTypeDesc(String blatrlTypeDesc) {
		this.blatrlTypeDesc = blatrlTypeDesc;
	}

	public String getDiagnosisCode() {
		return this.diagnosisCode;
	}

	public void setDiagnosisCode(String diagnosisCode) {
		this.diagnosisCode = diagnosisCode;
	}

	public String getDiagnosisDescription() {
		return this.diagnosisDescription;
	}

	public void setDiagnosisDescription(String diagnosisDescription) {
		this.diagnosisDescription = diagnosisDescription;
	}

	public long getDsbltyId() {
		return this.dsbltyId;
	}

	public void setDsbltyId(long dsbltyId) {
		this.dsbltyId = dsbltyId;
	}

	public Date getDsbltyDt() {
		return this.dsbltyDt;
	}

	public void setDsbltyDt(Date dsbltyDt) {
		this.dsbltyDt = dsbltyDt;
	}

	public String getDgnstcTxt() {
		return this.dgnstcTxt;
	}

	public void setDgnstcTxt(String dgnstcTxt) {
		this.dgnstcTxt = dgnstcTxt;
	}

	public long getRelatdDsbltyId() {
		return this.relatdDsbltyId;
	}

	public void setRelatdDsbltyId(long relatdDsbltyId) {
		this.relatdDsbltyId = relatdDsbltyId;
	}

	public Date getRelatdDsbltyDt() {
		return this.relatdDsbltyDt;
	}

	public void setRelatdDsbltyDt(Date relatdDsbltyDt) {
		this.relatdDsbltyDt = relatdDsbltyDt;
	}

	public String getRelatdDgnstcTxt() {
		return this.relatdDgnstcTxt;
	}

	public void setRelatdDgnstcTxt(String relatdDgnstcTxt) {
		this.relatdDgnstcTxt = relatdDgnstcTxt;
	}

	public String getFullDgnstcTxt() {
		return this.fullDgnstcTxt;
	}

	public void setFullDgnstcTxt(String fullDgnstcTxt) {
		this.fullDgnstcTxt = fullDgnstcTxt;
	}

	public String getSplmtlDecnTypeCd() {
		return this.splmtlDecnTypeCd;
	}

	public void setSplmtlDecnTypeCd(String splmtlDecnTypeCd) {
		this.splmtlDecnTypeCd = splmtlDecnTypeCd;
	}

	public String getHypntdDgnstcTypeCd() {
		return this.hypntdDgnstcTypeCd;
	}

	public void setHypntdDgnstcTypeCd(String hypntdDgnstcTypeCd) {
		this.hypntdDgnstcTypeCd = hypntdDgnstcTypeCd;
	}

	public String getShedTypeCd() {
		return this.shedTypeCd;
	}

	public void setShedTypeCd(String shedTypeCd) {
		this.shedTypeCd = shedTypeCd;
	}

	public String getPrgrphTypeCd() {
		return this.prgrphTypeCd;
	}

	public void setPrgrphTypeCd(String prgrphTypeCd) {
		this.prgrphTypeCd = prgrphTypeCd;
	}

	public String getPrcntNbr() {
		return this.prcntNbr;
	}

	public void setPrcntNbr(String prcntNbr) {
		this.prcntNbr = prcntNbr;
	}

	public String getMajorInd() {
		return this.majorInd;
	}

	public void setMajorInd(String majorInd) {
		this.majorInd = majorInd;
	}

	public String getCombatInd() {
		return this.combatInd;
	}

	public void setCombatInd(String combatInd) {
		this.combatInd = combatInd;
	}

	public String getPrevEvaltnInd() {
		return this.prevEvaltnInd;
	}

	public void setPrevEvaltnInd(String prevEvaltnInd) {
		this.prevEvaltnInd = prevEvaltnInd;
	}

	public Date getBeginDt() {
		return this.beginDt;
	}

	public void setBeginDt(Date beginDt) {
		this.beginDt = beginDt;
	}

	public Date getEndDt() {
		return this.endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public Date getFutureExamDt() {
		return this.futureExamDt;
	}

	public void setFutureExamDt(Date futureExamDt) {
		this.futureExamDt = futureExamDt;
	}

	public String getStaticInd() {
		return this.staticInd;
	}

	public void setStaticInd(String staticInd) {
		this.staticInd = staticInd;
	}

	public String getAncilyDecnTypeCd() {
		return this.ancilyDecnTypeCd;
	}

	public void setAncilyDecnTypeCd(String ancilyDecnTypeCd) {
		this.ancilyDecnTypeCd = ancilyDecnTypeCd;
	}

	public String getAncilyDecnTypeDesc() {
		return this.ancilyDecnTypeDesc;
	}

	public void setAncilyDecnTypeDesc(String ancilyDecnTypeDesc) {
		this.ancilyDecnTypeDesc = ancilyDecnTypeDesc;
	}

	public String getCmptnyDecnTypeCd() {
		return this.cmptnyDecnTypeCd;
	}

	public void setCmptnyDecnTypeCd(String cmptnyDecnTypeCd) {
		this.cmptnyDecnTypeCd = cmptnyDecnTypeCd;
	}

	public String getCmptnyDecnTypeDesc() {
		return this.cmptnyDecnTypeDesc;
	}

	public void setCmptnyDecnTypeDesc(String cmptnyDecnTypeDesc) {
		this.cmptnyDecnTypeDesc = cmptnyDecnTypeDesc;
	}

	public String getDentalSvcCnectdInd() {
		return this.dentalSvcCnectdInd;
	}

	public void setDentalSvcCnectdInd(String dentalSvcCnectdInd) {
		this.dentalSvcCnectdInd = dentalSvcCnectdInd;
	}

	public String getIndvdlUnemplDecnTypeCd() {
		return this.indvdlUnemplDecnTypeCd;
	}

	public void setIndvdlUnemplDecnTypeCd(String indvdlUnemplDecnTypeCd) {
		this.indvdlUnemplDecnTypeCd = indvdlUnemplDecnTypeCd;
	}

	public String getIndvdlUnemplDecnTypeDesc() {
		return this.indvdlUnemplDecnTypeDesc;
	}

	public void setIndvdlUnemplDecnTypeDesc(String indvdlUnemplDecnTypeDesc) {
		this.indvdlUnemplDecnTypeDesc = indvdlUnemplDecnTypeDesc;
	}

	public String getPermntTotalDecnTypeCd() {
		return this.permntTotalDecnTypeCd;
	}

	public void setPermntTotalDecnTypeCd(String permntTotalDecnTypeCd) {
		this.permntTotalDecnTypeCd = permntTotalDecnTypeCd;
	}

	public String getPermntTotalDecnTypeDesc() {
		return this.permntTotalDecnTypeDesc;
	}

	public void setPermntTotalDecnTypeDesc(String permntTotalDecnTypeDesc) {
		this.permntTotalDecnTypeDesc = permntTotalDecnTypeDesc;
	}

	public String getScDeathDecnTypeCd() {
		return this.scDeathDecnTypeCd;
	}

	public void setScDeathDecnTypeCd(String scDeathDecnTypeCd) {
		this.scDeathDecnTypeCd = scDeathDecnTypeCd;
	}

	public String getScDeathDecnTypeDesc() {
		return this.scDeathDecnTypeDesc;
	}

	public void setScDeathDecnTypeDesc(String scDeathDecnTypeDesc) {
		this.scDeathDecnTypeDesc = scDeathDecnTypeDesc;
	}

	public String getSmpDecnTypeCd() {
		return this.smpDecnTypeCd;
	}

	public void setSmpDecnTypeCd(String smpDecnTypeCd) {
		this.smpDecnTypeCd = smpDecnTypeCd;
	}

	public String getSmpDecnTypeDesc() {
		return this.smpDecnTypeDesc;
	}

	public void setSmpDecnTypeDesc(String smpDecnTypeDesc) {
		this.smpDecnTypeDesc = smpDecnTypeDesc;
	}

	public String getSpeclPrvsnLawDecnTypeCd() {
		return this.speclPrvsnLawDecnTypeCd;
	}

	public void setSpeclPrvsnLawDecnTypeCd(String speclPrvsnLawDecnTypeCd) {
		this.speclPrvsnLawDecnTypeCd = speclPrvsnLawDecnTypeCd;
	}

	public String getSpeclPrvsnLawDecnTypeDesc() {
		return this.speclPrvsnLawDecnTypeDesc;
	}

	public void setSpeclPrvsnLawDecnTypeDesc(String speclPrvsnLawDecnTypeDesc) {
		this.speclPrvsnLawDecnTypeDesc = speclPrvsnLawDecnTypeDesc;
	}

	public String getSmcTypeCd() {
		return this.smcTypeCd;
	}

	public void setSmcTypeCd(String smcTypeCd) {
		this.smcTypeCd = smcTypeCd;
	}

	public String getSmcTypeDesc() {
		return this.smcTypeDesc;
	}

	public void setSmcTypeDesc(String smcTypeDesc) {
		this.smcTypeDesc = smcTypeDesc;
	}

	public String getHsptlSmcTypeCd() {
		return this.hsptlSmcTypeCd;
	}

	public void setHsptlSmcTypeCd(String hsptlSmcTypeCd) {
		this.hsptlSmcTypeCd = hsptlSmcTypeCd;
	}

	public String getHsptlSmcTypeDesc() {
		return this.hsptlSmcTypeDesc;
	}

	public void setHsptlSmcTypeDesc(String hsptlSmcTypeDesc) {
		this.hsptlSmcTypeDesc = hsptlSmcTypeDesc;
	}

	public String getLossUseTypeCd() {
		return this.lossUseTypeCd;
	}

	public void setLossUseTypeCd(String lossUseTypeCd) {
		this.lossUseTypeCd = lossUseTypeCd;
	}

	public String getLossUseTypeDesc() {
		return this.lossUseTypeDesc;
	}

	public void setLossUseTypeDesc(String lossUseTypeDesc) {
		this.lossUseTypeDesc = lossUseTypeDesc;
	}

	public String getAntmclLossTypeCd() {
		return this.antmclLossTypeCd;
	}

	public void setAntmclLossTypeCd(String antmclLossTypeCd) {
		this.antmclLossTypeCd = antmclLossTypeCd;
	}

	public String getAntmclLossTypeDesc() {
		return this.antmclLossTypeDesc;
	}

	public void setAntmclLossTypeDesc(String antmclLossTypeDesc) {
		this.antmclLossTypeDesc = antmclLossTypeDesc;
	}

	public String getOtherLossTypeCd() {
		return this.otherLossTypeCd;
	}

	public void setOtherLossTypeCd(String otherLossTypeCd) {
		this.otherLossTypeCd = otherLossTypeCd;
	}

	public String getOtherLossTypeDesc() {
		return this.otherLossTypeDesc;
	}

	public void setOtherLossTypeDesc(String otherLossTypeDesc) {
		this.otherLossTypeDesc = otherLossTypeDesc;
	}

	public String getSmcPrgrphKeyCd() {
		return this.smcPrgrphKeyCd;
	}

	public void setSmcPrgrphKeyCd(String smcPrgrphKeyCd) {
		this.smcPrgrphKeyCd = smcPrgrphKeyCd;
	}

	public String getSmcPrgrphTxt() {
		return this.smcPrgrphTxt;
	}

	public void setSmcPrgrphTxt(String smcPrgrphTxt) {
		this.smcPrgrphTxt = smcPrgrphTxt;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Decisions))
			return false;
		Decisions castOther = (Decisions) other;

		return ((this.getPtcpntVetId() == castOther.getPtcpntVetId()) || (this.getPtcpntVetId() != 0
				&& castOther.getPtcpntVetId() != 0 && (this.getPtcpntVetId() == castOther.getPtcpntVetId())))
				&& ((this.getPrfilDt() == castOther.getPrfilDt()) || (this.getPrfilDt() != null
						&& castOther.getPrfilDt() != null && this.getPrfilDt().equals(castOther.getPrfilDt())))
				&& ((this.getInactvDt() == castOther.getInactvDt()) || (this.getInactvDt() != null
						&& castOther.getInactvDt() != null && this.getInactvDt().equals(castOther.getInactvDt())))
				&& ((this.getSystemTypeCd() == castOther.getSystemTypeCd())
						|| (this.getSystemTypeCd() != null && castOther.getSystemTypeCd() != null
								&& this.getSystemTypeCd().equals(castOther.getSystemTypeCd())))
				&& ((this.getRatingDecnId() == castOther.getRatingDecnId())
						|| (this.getRatingDecnId() <= 0 && castOther.getRatingDecnId() <= 0
								&& (this.getRatingDecnId() == castOther.getRatingDecnId())))
				&& ((this.getPoa() == castOther.getPoa()) || (this.getPoa() != null && castOther.getPoa() != null
						&& this.getPoa().equals(castOther.getPoa())))
				&& ((this.getPrmlgnDt() == castOther.getPrmlgnDt()) || (this.getPrmlgnDt() != null
						&& castOther.getPrmlgnDt() != null && this.getPrmlgnDt().equals(castOther.getPrmlgnDt())))
				&& ((this.getRatingDt() == castOther.getRatingDt()) || (this.getRatingDt() != null
						&& castOther.getRatingDt() != null && this.getRatingDt().equals(castOther.getRatingDt())))
				&& ((this.getVbmsRInd() == castOther.getVbmsRInd()) || (this.getVbmsRInd() != null
						&& castOther.getVbmsRInd() != null && this.getVbmsRInd().equals(castOther.getVbmsRInd())))
				&& ((this.getJrsdtnTxt() == castOther.getJrsdtnTxt()) || (this.getJrsdtnTxt() != null
						&& castOther.getJrsdtnTxt() != null && this.getJrsdtnTxt().equals(castOther.getJrsdtnTxt())))
				&& ((this.getRatingRcvdDt() == castOther.getRatingRcvdDt())
						|| (this.getRatingRcvdDt() != null && castOther.getRatingRcvdDt() != null
								&& this.getRatingRcvdDt().equals(castOther.getRatingRcvdDt())))
				&& ((this.getStationNumber() == castOther.getStationNumber())
						|| (this.getStationNumber() != 0 && castOther.getStationNumber() != 0
								&& (this.getStationNumber() == castOther.getStationNumber())))
				&& ((this.getStationName() == castOther.getStationName())
						|| (this.getStationName() != null && castOther.getStationName() != null
								&& this.getStationName().equals(castOther.getStationName())))
				&& ((this.getMilitarySvcPeriodCode() == castOther.getMilitarySvcPeriodCode())
						|| (this.getMilitarySvcPeriodCode() != null && castOther.getMilitarySvcPeriodCode() != null
								&& this.getMilitarySvcPeriodCode().equals(castOther.getMilitarySvcPeriodCode())))
				&& ((this.getMilitarySvcPeriodDesc() == castOther.getMilitarySvcPeriodDesc())
						|| (this.getMilitarySvcPeriodDesc() != null && castOther.getMilitarySvcPeriodDesc() != null
								&& this.getMilitarySvcPeriodDesc().equals(castOther.getMilitarySvcPeriodDesc())))
				&& ((this.getRatingDecnTypeCd() == castOther.getRatingDecnTypeCd())
						|| (this.getRatingDecnTypeCd() != null && castOther.getRatingDecnTypeCd() != null
								&& this.getRatingDecnTypeCd().equals(castOther.getRatingDecnTypeCd())))
				&& ((this.getRatingDecnTypeDesc() == castOther.getRatingDecnTypeDesc())
						|| (this.getRatingDecnTypeDesc() != null && castOther.getRatingDecnTypeDesc() != null
								&& this.getRatingDecnTypeDesc().equals(castOther.getRatingDecnTypeDesc())))
				&& ((this.getNarrativeCodesheetInd() == castOther.getNarrativeCodesheetInd())
						|| (this.getNarrativeCodesheetInd() != null && castOther.getNarrativeCodesheetInd() != null
								&& this.getNarrativeCodesheetInd().equals(castOther.getNarrativeCodesheetInd())))
				&& ((this.getIssueTxt() == castOther.getIssueTxt()) || (this.getIssueTxt() != null
						&& castOther.getIssueTxt() != null && this.getIssueTxt().equals(castOther.getIssueTxt())))
				&& ((this.getDecnTxt() == castOther.getDecnTxt()) || (this.getDecnTxt() != null
						&& castOther.getDecnTxt() != null && this.getDecnTxt().equals(castOther.getDecnTxt())))
				&& ((this.getDsbltyDecnTypeCd() == castOther.getDsbltyDecnTypeCd())
						|| (this.getDsbltyDecnTypeCd() != null && castOther.getDsbltyDecnTypeCd() != null
								&& this.getDsbltyDecnTypeCd().equals(castOther.getDsbltyDecnTypeCd())))
				&& ((this.getDsbltyDecnTypeDesc() == castOther.getDsbltyDecnTypeDesc())
						|| (this.getDsbltyDecnTypeDesc() != null && castOther.getDsbltyDecnTypeDesc() != null
								&& this.getDsbltyDecnTypeDesc().equals(castOther.getDsbltyDecnTypeDesc())))
				&& ((this.getDsbltyDecnBasisTypeCd() == castOther.getDsbltyDecnBasisTypeCd())
						|| (this.getDsbltyDecnBasisTypeCd() != null && castOther.getDsbltyDecnBasisTypeCd() != null
								&& this.getDsbltyDecnBasisTypeCd().equals(castOther.getDsbltyDecnBasisTypeCd())))
				&& ((this.getDsbltyDecnBasisTypeDesc() == castOther.getDsbltyDecnBasisTypeDesc())
						|| (this.getDsbltyDecnBasisTypeDesc() != null && castOther.getDsbltyDecnBasisTypeDesc() != null
								&& this.getDsbltyDecnBasisTypeDesc().equals(castOther.getDsbltyDecnBasisTypeDesc())))
				&& ((this.getBlatrlTypeCd() == castOther.getBlatrlTypeCd())
						|| (this.getBlatrlTypeCd() != null && castOther.getBlatrlTypeCd() != null
								&& this.getBlatrlTypeCd().equals(castOther.getBlatrlTypeCd())))
				&& ((this.getBlatrlTypeDesc() == castOther.getBlatrlTypeDesc())
						|| (this.getBlatrlTypeDesc() != null && castOther.getBlatrlTypeDesc() != null
								&& this.getBlatrlTypeDesc().equals(castOther.getBlatrlTypeDesc())))
				&& ((this.getDiagnosisCode() == castOther.getDiagnosisCode())
						|| (this.getDiagnosisCode() != null && castOther.getDiagnosisCode() != null
								&& this.getDiagnosisCode().equals(castOther.getDiagnosisCode())))
				&& ((this.getDiagnosisDescription() == castOther.getDiagnosisDescription())
						|| (this.getDiagnosisDescription() != null && castOther.getDiagnosisDescription() != null
								&& this.getDiagnosisDescription().equals(castOther.getDiagnosisDescription())))
				&& ((this.getDsbltyId() == castOther.getDsbltyId()) || (this.getDsbltyId() != 0
						&& castOther.getDsbltyId() != 0 && (this.getDsbltyId() == castOther.getDsbltyId())))
				&& ((this.getDsbltyDt() == castOther.getDsbltyDt()) || (this.getDsbltyDt() != null
						&& castOther.getDsbltyDt() != null && this.getDsbltyDt().equals(castOther.getDsbltyDt())))
				&& ((this.getDgnstcTxt() == castOther.getDgnstcTxt()) || (this.getDgnstcTxt() != null
						&& castOther.getDgnstcTxt() != null && this.getDgnstcTxt().equals(castOther.getDgnstcTxt())))
				&& ((this.getRelatdDsbltyId() == castOther.getRelatdDsbltyId())
						|| (this.getRelatdDsbltyId() != 0 && castOther.getRelatdDsbltyId() != 0
								&& (this.getRelatdDsbltyId() == castOther.getRelatdDsbltyId())))
				&& ((this.getRelatdDsbltyDt() == castOther.getRelatdDsbltyDt())
						|| (this.getRelatdDsbltyDt() != null && castOther.getRelatdDsbltyDt() != null
								&& this.getRelatdDsbltyDt().equals(castOther.getRelatdDsbltyDt())))
				&& ((this.getRelatdDgnstcTxt() == castOther.getRelatdDgnstcTxt())
						|| (this.getRelatdDgnstcTxt() != null && castOther.getRelatdDgnstcTxt() != null
								&& this.getRelatdDgnstcTxt().equals(castOther.getRelatdDgnstcTxt())))
				&& ((this.getFullDgnstcTxt() == castOther.getFullDgnstcTxt())
						|| (this.getFullDgnstcTxt() != null && castOther.getFullDgnstcTxt() != null
								&& this.getFullDgnstcTxt().equals(castOther.getFullDgnstcTxt())))
				&& ((this.getSplmtlDecnTypeCd() == castOther.getSplmtlDecnTypeCd())
						|| (this.getSplmtlDecnTypeCd() != null && castOther.getSplmtlDecnTypeCd() != null
								&& this.getSplmtlDecnTypeCd().equals(castOther.getSplmtlDecnTypeCd())))
				&& ((this.getHypntdDgnstcTypeCd() == castOther.getHypntdDgnstcTypeCd())
						|| (this.getHypntdDgnstcTypeCd() != null && castOther.getHypntdDgnstcTypeCd() != null
								&& this.getHypntdDgnstcTypeCd().equals(castOther.getHypntdDgnstcTypeCd())))
				&& ((this.getShedTypeCd() == castOther.getShedTypeCd()) || (this.getShedTypeCd() != null
						&& castOther.getShedTypeCd() != null && this.getShedTypeCd().equals(castOther.getShedTypeCd())))
				&& ((this.getPrgrphTypeCd() == castOther.getPrgrphTypeCd())
						|| (this.getPrgrphTypeCd() != null && castOther.getPrgrphTypeCd() != null
								&& this.getPrgrphTypeCd().equals(castOther.getPrgrphTypeCd())))
				&& ((this.getPrcntNbr() == castOther.getPrcntNbr()) || (this.getPrcntNbr() != null
						&& castOther.getPrcntNbr() != null && this.getPrcntNbr().equals(castOther.getPrcntNbr())))
				&& ((this.getMajorInd() == castOther.getMajorInd()) || (this.getMajorInd() != null
						&& castOther.getMajorInd() != null && this.getMajorInd().equals(castOther.getMajorInd())))
				&& ((this.getCombatInd() == castOther.getCombatInd()) || (this.getCombatInd() != null
						&& castOther.getCombatInd() != null && this.getCombatInd().equals(castOther.getCombatInd())))
				&& ((this.getPrevEvaltnInd() == castOther.getPrevEvaltnInd())
						|| (this.getPrevEvaltnInd() != null && castOther.getPrevEvaltnInd() != null
								&& this.getPrevEvaltnInd().equals(castOther.getPrevEvaltnInd())))
				&& ((this.getBeginDt() == castOther.getBeginDt()) || (this.getBeginDt() != null
						&& castOther.getBeginDt() != null && this.getBeginDt().equals(castOther.getBeginDt())))
				&& ((this.getEndDt() == castOther.getEndDt()) || (this.getEndDt() != null
						&& castOther.getEndDt() != null && this.getEndDt().equals(castOther.getEndDt())))
				&& ((this.getFutureExamDt() == castOther.getFutureExamDt())
						|| (this.getFutureExamDt() != null && castOther.getFutureExamDt() != null
								&& this.getFutureExamDt().equals(castOther.getFutureExamDt())))
				&& ((this.getStaticInd() == castOther.getStaticInd()) || (this.getStaticInd() != null
						&& castOther.getStaticInd() != null && this.getStaticInd().equals(castOther.getStaticInd())))
				&& ((this.getAncilyDecnTypeCd() == castOther.getAncilyDecnTypeCd())
						|| (this.getAncilyDecnTypeCd() != null && castOther.getAncilyDecnTypeCd() != null
								&& this.getAncilyDecnTypeCd().equals(castOther.getAncilyDecnTypeCd())))
				&& ((this.getAncilyDecnTypeDesc() == castOther.getAncilyDecnTypeDesc())
						|| (this.getAncilyDecnTypeDesc() != null && castOther.getAncilyDecnTypeDesc() != null
								&& this.getAncilyDecnTypeDesc().equals(castOther.getAncilyDecnTypeDesc())))
				&& ((this.getCmptnyDecnTypeCd() == castOther.getCmptnyDecnTypeCd())
						|| (this.getCmptnyDecnTypeCd() != null && castOther.getCmptnyDecnTypeCd() != null
								&& this.getCmptnyDecnTypeCd().equals(castOther.getCmptnyDecnTypeCd())))
				&& ((this.getCmptnyDecnTypeDesc() == castOther.getCmptnyDecnTypeDesc())
						|| (this.getCmptnyDecnTypeDesc() != null && castOther.getCmptnyDecnTypeDesc() != null
								&& this.getCmptnyDecnTypeDesc().equals(castOther.getCmptnyDecnTypeDesc())))
				&& ((this.getDentalSvcCnectdInd() == castOther.getDentalSvcCnectdInd())
						|| (this.getDentalSvcCnectdInd() != null && castOther.getDentalSvcCnectdInd() != null
								&& this.getDentalSvcCnectdInd().equals(castOther.getDentalSvcCnectdInd())))
				&& ((this.getIndvdlUnemplDecnTypeCd() == castOther.getIndvdlUnemplDecnTypeCd())
						|| (this.getIndvdlUnemplDecnTypeCd() != null && castOther.getIndvdlUnemplDecnTypeCd() != null
								&& this.getIndvdlUnemplDecnTypeCd().equals(castOther.getIndvdlUnemplDecnTypeCd())))
				&& ((this.getIndvdlUnemplDecnTypeDesc() == castOther.getIndvdlUnemplDecnTypeDesc())
						|| (this.getIndvdlUnemplDecnTypeDesc() != null
								&& castOther.getIndvdlUnemplDecnTypeDesc() != null
								&& this.getIndvdlUnemplDecnTypeDesc().equals(castOther.getIndvdlUnemplDecnTypeDesc())))
				&& ((this.getPermntTotalDecnTypeCd() == castOther.getPermntTotalDecnTypeCd())
						|| (this.getPermntTotalDecnTypeCd() != null && castOther.getPermntTotalDecnTypeCd() != null
								&& this.getPermntTotalDecnTypeCd().equals(castOther.getPermntTotalDecnTypeCd())))
				&& ((this.getPermntTotalDecnTypeDesc() == castOther.getPermntTotalDecnTypeDesc())
						|| (this.getPermntTotalDecnTypeDesc() != null && castOther.getPermntTotalDecnTypeDesc() != null
								&& this.getPermntTotalDecnTypeDesc().equals(castOther.getPermntTotalDecnTypeDesc())))
				&& ((this.getScDeathDecnTypeCd() == castOther.getScDeathDecnTypeCd())
						|| (this.getScDeathDecnTypeCd() != null && castOther.getScDeathDecnTypeCd() != null
								&& this.getScDeathDecnTypeCd().equals(castOther.getScDeathDecnTypeCd())))
				&& ((this.getScDeathDecnTypeDesc() == castOther.getScDeathDecnTypeDesc())
						|| (this.getScDeathDecnTypeDesc() != null && castOther.getScDeathDecnTypeDesc() != null
								&& this.getScDeathDecnTypeDesc().equals(castOther.getScDeathDecnTypeDesc())))
				&& ((this.getSmpDecnTypeCd() == castOther.getSmpDecnTypeCd())
						|| (this.getSmpDecnTypeCd() != null && castOther.getSmpDecnTypeCd() != null
								&& this.getSmpDecnTypeCd().equals(castOther.getSmpDecnTypeCd())))
				&& ((this.getSmpDecnTypeDesc() == castOther.getSmpDecnTypeDesc())
						|| (this.getSmpDecnTypeDesc() != null && castOther.getSmpDecnTypeDesc() != null
								&& this.getSmpDecnTypeDesc().equals(castOther.getSmpDecnTypeDesc())))
				&& ((this.getSpeclPrvsnLawDecnTypeCd() == castOther.getSpeclPrvsnLawDecnTypeCd())
						|| (this.getSpeclPrvsnLawDecnTypeCd() != null && castOther.getSpeclPrvsnLawDecnTypeCd() != null
								&& this.getSpeclPrvsnLawDecnTypeCd().equals(castOther.getSpeclPrvsnLawDecnTypeCd())))
				&& ((this.getSpeclPrvsnLawDecnTypeDesc() == castOther.getSpeclPrvsnLawDecnTypeDesc())
						|| (this.getSpeclPrvsnLawDecnTypeDesc() != null
								&& castOther.getSpeclPrvsnLawDecnTypeDesc() != null
								&& this.getSpeclPrvsnLawDecnTypeDesc()
										.equals(castOther.getSpeclPrvsnLawDecnTypeDesc())))
				&& ((this.getSmcTypeCd() == castOther.getSmcTypeCd()) || (this.getSmcTypeCd() != null
						&& castOther.getSmcTypeCd() != null && this.getSmcTypeCd().equals(castOther.getSmcTypeCd())))
				&& ((this.getSmcTypeDesc() == castOther.getSmcTypeDesc())
						|| (this.getSmcTypeDesc() != null && castOther.getSmcTypeDesc() != null
								&& this.getSmcTypeDesc().equals(castOther.getSmcTypeDesc())))
				&& ((this.getHsptlSmcTypeCd() == castOther.getHsptlSmcTypeCd())
						|| (this.getHsptlSmcTypeCd() != null && castOther.getHsptlSmcTypeCd() != null
								&& this.getHsptlSmcTypeCd().equals(castOther.getHsptlSmcTypeCd())))
				&& ((this.getHsptlSmcTypeDesc() == castOther.getHsptlSmcTypeDesc())
						|| (this.getHsptlSmcTypeDesc() != null && castOther.getHsptlSmcTypeDesc() != null
								&& this.getHsptlSmcTypeDesc().equals(castOther.getHsptlSmcTypeDesc())))
				&& ((this.getLossUseTypeCd() == castOther.getLossUseTypeCd())
						|| (this.getLossUseTypeCd() != null && castOther.getLossUseTypeCd() != null
								&& this.getLossUseTypeCd().equals(castOther.getLossUseTypeCd())))
				&& ((this.getLossUseTypeDesc() == castOther.getLossUseTypeDesc())
						|| (this.getLossUseTypeDesc() != null && castOther.getLossUseTypeDesc() != null
								&& this.getLossUseTypeDesc().equals(castOther.getLossUseTypeDesc())))
				&& ((this.getAntmclLossTypeCd() == castOther.getAntmclLossTypeCd())
						|| (this.getAntmclLossTypeCd() != null && castOther.getAntmclLossTypeCd() != null
								&& this.getAntmclLossTypeCd().equals(castOther.getAntmclLossTypeCd())))
				&& ((this.getAntmclLossTypeDesc() == castOther.getAntmclLossTypeDesc())
						|| (this.getAntmclLossTypeDesc() != null && castOther.getAntmclLossTypeDesc() != null
								&& this.getAntmclLossTypeDesc().equals(castOther.getAntmclLossTypeDesc())))
				&& ((this.getOtherLossTypeCd() == castOther.getOtherLossTypeCd())
						|| (this.getOtherLossTypeCd() != null && castOther.getOtherLossTypeCd() != null
								&& this.getOtherLossTypeCd().equals(castOther.getOtherLossTypeCd())))
				&& ((this.getOtherLossTypeDesc() == castOther.getOtherLossTypeDesc())
						|| (this.getOtherLossTypeDesc() != null && castOther.getOtherLossTypeDesc() != null
								&& this.getOtherLossTypeDesc().equals(castOther.getOtherLossTypeDesc())))
				&& ((this.getSmcPrgrphKeyCd() == castOther.getSmcPrgrphKeyCd())
						|| (this.getSmcPrgrphKeyCd() != null && castOther.getSmcPrgrphKeyCd() != null
								&& this.getSmcPrgrphKeyCd().equals(castOther.getSmcPrgrphKeyCd())))
				&& ((this.getSmcPrgrphTxt() == castOther.getSmcPrgrphTxt())
						|| (this.getSmcPrgrphTxt() != null && castOther.getSmcPrgrphTxt() != null
								&& this.getSmcPrgrphTxt().equals(castOther.getSmcPrgrphTxt())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getPtcpntVetId();
		result = 37 * result + (getPrfilDt() == null ? 0 : this.getPrfilDt().hashCode());
		result = 37 * result + (getInactvDt() == null ? 0 : this.getInactvDt().hashCode());
		result = 37 * result + (getSystemTypeCd() == null ? 0 : this.getSystemTypeCd().hashCode());
		result = 37 * result + (int) this.getRatingDecnId();
		result = 37 * result + (getPoa() == null ? 0 : this.getPoa().hashCode());
		result = 37 * result + (getPrmlgnDt() == null ? 0 : this.getPrmlgnDt().hashCode());
		result = 37 * result + (getRatingDt() == null ? 0 : this.getRatingDt().hashCode());
		result = 37 * result + (getVbmsRInd() == null ? 0 : this.getVbmsRInd().hashCode());
		result = 37 * result + (getJrsdtnTxt() == null ? 0 : this.getJrsdtnTxt().hashCode());
		result = 37 * result + (getRatingRcvdDt() == null ? 0 : this.getRatingRcvdDt().hashCode());
		result = 37 * result + (int) this.getStationNumber();
		result = 37 * result + (getStationName() == null ? 0 : this.getStationName().hashCode());
		result = 37 * result + (getMilitarySvcPeriodCode() == null ? 0 : this.getMilitarySvcPeriodCode().hashCode());
		result = 37 * result + (getMilitarySvcPeriodDesc() == null ? 0 : this.getMilitarySvcPeriodDesc().hashCode());
		result = 37 * result + (getRatingDecnTypeCd() == null ? 0 : this.getRatingDecnTypeCd().hashCode());
		result = 37 * result + (getRatingDecnTypeDesc() == null ? 0 : this.getRatingDecnTypeDesc().hashCode());
		result = 37 * result + (getNarrativeCodesheetInd() == null ? 0 : this.getNarrativeCodesheetInd().hashCode());
		result = 37 * result + (getIssueTxt() == null ? 0 : this.getIssueTxt().hashCode());
		result = 37 * result + (getDecnTxt() == null ? 0 : this.getDecnTxt().hashCode());
		result = 37 * result + (getDsbltyDecnTypeCd() == null ? 0 : this.getDsbltyDecnTypeCd().hashCode());
		result = 37 * result + (getDsbltyDecnTypeDesc() == null ? 0 : this.getDsbltyDecnTypeDesc().hashCode());
		result = 37 * result + (getDsbltyDecnBasisTypeCd() == null ? 0 : this.getDsbltyDecnBasisTypeCd().hashCode());
		result = 37 * result + (getDsbltyDecnBasisTypeDesc() == null ? 0 : this.getDsbltyDecnBasisTypeDesc().hashCode());
		result = 37 * result + (getBlatrlTypeCd() == null ? 0 : this.getBlatrlTypeCd().hashCode());
		result = 37 * result + (getBlatrlTypeDesc() == null ? 0 : this.getBlatrlTypeDesc().hashCode());
		result = 37 * result + (getDiagnosisCode() == null ? 0 : this.getDiagnosisCode().hashCode());
		result = 37 * result + (getDiagnosisDescription() == null ? 0 : this.getDiagnosisDescription().hashCode());
		result = 37 * result + (int) this.getDsbltyId();
		result = 37 * result + (getDsbltyDt() == null ? 0 : this.getDsbltyDt().hashCode());
		result = 37 * result + (getDgnstcTxt() == null ? 0 : this.getDgnstcTxt().hashCode());
		result = 37 * result + (int) this.getRelatdDsbltyId();
		result = 37 * result + (getRelatdDsbltyDt() == null ? 0 : this.getRelatdDsbltyDt().hashCode());
		result = 37 * result + (getRelatdDgnstcTxt() == null ? 0 : this.getRelatdDgnstcTxt().hashCode());
		result = 37 * result + (getFullDgnstcTxt() == null ? 0 : this.getFullDgnstcTxt().hashCode());
		result = 37 * result + (getSplmtlDecnTypeCd() == null ? 0 : this.getSplmtlDecnTypeCd().hashCode());
		result = 37 * result + (getHypntdDgnstcTypeCd() == null ? 0 : this.getHypntdDgnstcTypeCd().hashCode());
		result = 37 * result + (getShedTypeCd() == null ? 0 : this.getShedTypeCd().hashCode());
		result = 37 * result + (getPrgrphTypeCd() == null ? 0 : this.getPrgrphTypeCd().hashCode());
		result = 37 * result + (getPrcntNbr() == null ? 0 : this.getPrcntNbr().hashCode());
		result = 37 * result + (getMajorInd() == null ? 0 : this.getMajorInd().hashCode());
		result = 37 * result + (getCombatInd() == null ? 0 : this.getCombatInd().hashCode());
		result = 37 * result + (getPrevEvaltnInd() == null ? 0 : this.getPrevEvaltnInd().hashCode());
		result = 37 * result + (getBeginDt() == null ? 0 : this.getBeginDt().hashCode());
		result = 37 * result + (getEndDt() == null ? 0 : this.getEndDt().hashCode());
		result = 37 * result + (getFutureExamDt() == null ? 0 : this.getFutureExamDt().hashCode());
		result = 37 * result + (getStaticInd() == null ? 0 : this.getStaticInd().hashCode());
		result = 37 * result + (getAncilyDecnTypeCd() == null ? 0 : this.getAncilyDecnTypeCd().hashCode());
		result = 37 * result + (getAncilyDecnTypeDesc() == null ? 0 : this.getAncilyDecnTypeDesc().hashCode());
		result = 37 * result + (getCmptnyDecnTypeCd() == null ? 0 : this.getCmptnyDecnTypeCd().hashCode());
		result = 37 * result + (getCmptnyDecnTypeDesc() == null ? 0 : this.getCmptnyDecnTypeDesc().hashCode());
		result = 37 * result + (getDentalSvcCnectdInd() == null ? 0 : this.getDentalSvcCnectdInd().hashCode());
		result = 37 * result + (getIndvdlUnemplDecnTypeCd() == null ? 0 : this.getIndvdlUnemplDecnTypeCd().hashCode());
		result = 37 * result + (getIndvdlUnemplDecnTypeDesc() == null ? 0 : this.getIndvdlUnemplDecnTypeDesc().hashCode());
		result = 37 * result + (getPermntTotalDecnTypeCd() == null ? 0 : this.getPermntTotalDecnTypeCd().hashCode());
		result = 37 * result + (getPermntTotalDecnTypeDesc() == null ? 0 : this.getPermntTotalDecnTypeDesc().hashCode());
		result = 37 * result + (getScDeathDecnTypeCd() == null ? 0 : this.getScDeathDecnTypeCd().hashCode());
		result = 37 * result + (getScDeathDecnTypeDesc() == null ? 0 : this.getScDeathDecnTypeDesc().hashCode());
		result = 37 * result + (getSmpDecnTypeCd() == null ? 0 : this.getSmpDecnTypeCd().hashCode());
		result = 37 * result + (getSmpDecnTypeDesc() == null ? 0 : this.getSmpDecnTypeDesc().hashCode());
		result = 37 * result + (getSpeclPrvsnLawDecnTypeCd() == null ? 0 : this.getSpeclPrvsnLawDecnTypeCd().hashCode());
		result = 37 * result + (getSpeclPrvsnLawDecnTypeDesc() == null ? 0 : this.getSpeclPrvsnLawDecnTypeDesc().hashCode());
		result = 37 * result + (getSmcTypeCd() == null ? 0 : this.getSmcTypeCd().hashCode());
		result = 37 * result + (getSmcTypeDesc() == null ? 0 : this.getSmcTypeDesc().hashCode());
		result = 37 * result + (getHsptlSmcTypeCd() == null ? 0 : this.getHsptlSmcTypeCd().hashCode());
		result = 37 * result + (getHsptlSmcTypeDesc() == null ? 0 : this.getHsptlSmcTypeDesc().hashCode());
		result = 37 * result + (getLossUseTypeCd() == null ? 0 : this.getLossUseTypeCd().hashCode());
		result = 37 * result + (getLossUseTypeDesc() == null ? 0 : this.getLossUseTypeDesc().hashCode());
		result = 37 * result + (getAntmclLossTypeCd() == null ? 0 : this.getAntmclLossTypeCd().hashCode());
		result = 37 * result + (getAntmclLossTypeDesc() == null ? 0 : this.getAntmclLossTypeDesc().hashCode());
		result = 37 * result + (getOtherLossTypeCd() == null ? 0 : this.getOtherLossTypeCd().hashCode());
		result = 37 * result + (getOtherLossTypeDesc() == null ? 0 : this.getOtherLossTypeDesc().hashCode());
		result = 37 * result + (getSmcPrgrphKeyCd() == null ? 0 : this.getSmcPrgrphKeyCd().hashCode());
		result = 37 * result + (getSmcPrgrphTxt() == null ? 0 : this.getSmcPrgrphTxt().hashCode());
		return result;
	}

}
