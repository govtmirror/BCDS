package gov.va.vba.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(schema = "BCDSS", name = "AH4929_RATING_CORP_CLAIM")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Claim implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/*private Date profileDate;*/
	private Long claimId;
	private String endPrdctTypeCode;
	private Date claimDate;
	private String payeeTypeCode;
	private String claimTypeCode;
	private String claimLabel;
	private String statusTypeCode;
	private Long claimRegionalOfficeNumber;
	private String regionalOfficeOfClaim;
	private String contentionId;
	private Long contentionClsfcnId;
	private String contentionTypeCode;
	private String contentionClaimTextKeyForModel;
	private String contentionMedInd;
	private String contentionWellGrndedAplcblInd;
	private Date contentionBeginDate;
	private String contentionSpecialIssueId;
	private String contentionSpecialIssueTypeCode;
	private Veteran veteran;

	@Id
	@Column(name = "BNFT_CLAIM_ID")
	public Long getClaimId() {
		return this.claimId;
	}

	public void setClaimId(Long claimId) {
		this.claimId = claimId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PTCPNT_VET_ID")
	public Veteran getVeteran() {
		return veteran;
	}

	public void setVeteran(Veteran veteran) {
		this.veteran = veteran;
	}

/*	@Temporal(TemporalType.DATE)
	@Column(name = "PRFIL_DT")
	public Date getProfileDate() {
		return this.profileDate;
	}

	public void setProfileDate(Date profileDate) {
		this.profileDate = profileDate;
	}*/

	@Column(name = "END_PRDCT_TYPE_CD")
	public String getEndPrdctTypeCode() {
		return this.endPrdctTypeCode;
	}

	public void setEndPrdctTypeCode(String endPrdctTypeCode) {
		this.endPrdctTypeCode = endPrdctTypeCode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_OF_CLAIM")
	public Date getClaimDate() {
		return claimDate;
	}

	public void setClaimDate(Date claimDate) {
		this.claimDate = claimDate;
	}

	@Column(name = "PAYEE_TYPE_CD")
	public String getPayeeTypeCode() {
		return this.payeeTypeCode;
	}

	public void setPayeeTypeCode(String payeeTypeCode) {
		this.payeeTypeCode = payeeTypeCode;
	}

	@Column(name = "BNFT_CLAIM_TYPE_CD")
	public String getClaimTypeCode() {
		return this.claimTypeCode;
	}

	public void setClaimTypeCode(String claimTypeCode) {
		this.claimTypeCode = claimTypeCode;
	}

	@Column(name = "CLAIM_LABEL")
	public String getClaimLabel() {
		return this.claimLabel;
	}

	public void setClaimLabel(String claimLabel) {
		this.claimLabel = claimLabel;
	}

	@Column(name = "STATUS_TYPE_CD")
	public String getStatusTypeCode() {
		return this.statusTypeCode;
	}

	public void setStatusTypeCode(String statusTypeCode) {
		this.statusTypeCode = statusTypeCode;
	}

	@Column(name = "CLAIM_RO_NUMBER")
	public Long getClaimRegionalOfficeNumber() {
		return this.claimRegionalOfficeNumber;
	}

	public void setClaimRegionalOfficeNumber(Long claimRegionalOfficeNumber) {
		this.claimRegionalOfficeNumber = claimRegionalOfficeNumber;
	}

	@Column(name = "CLAIM_RO_NAME")
	public String getRegionalOfficeOfClaim() {
		return regionalOfficeOfClaim;
	}

	public void setRegionalOfficeOfClaim(String regionalOfficeOfClaim) {
		this.regionalOfficeOfClaim = regionalOfficeOfClaim;
	}

	@Column(name = "CNTNTN_ID")
	public String getContentionId() {
		return this.contentionId;
	}

	public void setContentionId(String contentionId) {
		this.contentionId = contentionId;
	}

	@Column(name = "CNTNTN_CLSFCN_ID")
	public Long getContentionClsfcnId() {
		return this.contentionClsfcnId;
	}

	public void setContentionClsfcnId(Long contentionClsfcnId) {
		this.contentionClsfcnId = contentionClsfcnId;
	}

	@Column(name = "CNTNTN_TYPE_CD")
	public String getContentionTypeCode() {
		return this.contentionTypeCode;
	}

	public void setContentionTypeCode(String contentionTypeCode) {
		this.contentionTypeCode = contentionTypeCode;
	}

	@Column(name = "CNTNTN_CLMANT_TXT")
	public String getContentionClaimTextKeyForModel() {
		return contentionClaimTextKeyForModel;
	}

	public void setContentionClaimTextKeyForModel(String contentionClaimTextKeyForModel) {
		this.contentionClaimTextKeyForModel = contentionClaimTextKeyForModel;
	}

	@Column(name = "CNTNTN_MED_IND")
	public String getContentionMedInd() {
		return this.contentionMedInd;
	}

	public void setContentionMedInd(String contentionMedInd) {
		this.contentionMedInd = contentionMedInd;
	}

	@Column(name = "CNTNTN_WELL_GRNDED_APLCBL_IND")
	public String getContentionWellGrndedAplcblInd() {
		return this.contentionWellGrndedAplcblInd;
	}

	public void setContentionWellGrndedAplcblInd(String contentionWellGrndedAplcblInd) {
		this.contentionWellGrndedAplcblInd = contentionWellGrndedAplcblInd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CNTNTN_BEGIN_DT")
	public Date getContentionBeginDate() {
		return this.contentionBeginDate;
	}

	public void setContentionBeginDate(Date contentionBeginDate) {
		this.contentionBeginDate = contentionBeginDate;
	}

/*	@Column(name = "CNTNTN_SPECL_ISSUE_ID")
	public String getContentionSpecialIssueId() {
		return this.contentionSpecialIssueId;
	}

	public void setContentionSpecialIssueId(String contentionSpecialIssueId) {
		this.contentionSpecialIssueId = contentionSpecialIssueId;
	}

	@Column(name = "CNTNTN_SPECL_ISSUE_TYPE_CD")
	public String getContentionSpecialIssueTypeCode() {
		return this.contentionSpecialIssueTypeCode;
	}

	public void setContentionSpecialIssueTypeCode(String contentionSpecialIssueTypeCode) {
		this.contentionSpecialIssueTypeCode = contentionSpecialIssueTypeCode;
	}*/
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}
