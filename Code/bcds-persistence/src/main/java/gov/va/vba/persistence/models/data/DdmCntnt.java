package main.java.gov.va.vba.persistence.models.data;
// Generated Oct 21, 2016 1:08:50 PM by Hibernate Tools 5.2.0.Beta1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * DdmCntnt generated by hbm2java
 */
public class DdmCntnt implements java.io.Serializable {

	private BigDecimal cntntId;
	private DdmCtlg ddmCtlg;
	private BigDecimal cntntCd;
	private String modelType;
	private String cntntCdDesc;
	private String crtdBy;
	private Date crtdDtm;
	private Set ddmModelCntnts = new HashSet(0);
	private Set modelRatingResultsCntnts = new HashSet(0);

	public DdmCntnt() {
	}

	public DdmCntnt(BigDecimal cntntId) {
		this.cntntId = cntntId;
	}

	public DdmCntnt(BigDecimal cntntId, DdmCtlg ddmCtlg, BigDecimal cntntCd, String modelType, String cntntCdDesc,
			String crtdBy, Date crtdDtm, Set ddmModelCntnts, Set modelRatingResultsCntnts) {
		this.cntntId = cntntId;
		this.ddmCtlg = ddmCtlg;
		this.cntntCd = cntntCd;
		this.modelType = modelType;
		this.cntntCdDesc = cntntCdDesc;
		this.crtdBy = crtdBy;
		this.crtdDtm = crtdDtm;
		this.ddmModelCntnts = ddmModelCntnts;
		this.modelRatingResultsCntnts = modelRatingResultsCntnts;
	}

	public BigDecimal getCntntId() {
		return this.cntntId;
	}

	public void setCntntId(BigDecimal cntntId) {
		this.cntntId = cntntId;
	}

	public DdmCtlg getDdmCtlg() {
		return this.ddmCtlg;
	}

	public void setDdmCtlg(DdmCtlg ddmCtlg) {
		this.ddmCtlg = ddmCtlg;
	}

	public BigDecimal getCntntCd() {
		return this.cntntCd;
	}

	public void setCntntCd(BigDecimal cntntCd) {
		this.cntntCd = cntntCd;
	}

	public String getModelType() {
		return this.modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public String getCntntCdDesc() {
		return this.cntntCdDesc;
	}

	public void setCntntCdDesc(String cntntCdDesc) {
		this.cntntCdDesc = cntntCdDesc;
	}

	public String getCrtdBy() {
		return this.crtdBy;
	}

	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
	}

	public Date getCrtdDtm() {
		return this.crtdDtm;
	}

	public void setCrtdDtm(Date crtdDtm) {
		this.crtdDtm = crtdDtm;
	}

	public Set getDdmModelCntnts() {
		return this.ddmModelCntnts;
	}

	public void setDdmModelCntnts(Set ddmModelCntnts) {
		this.ddmModelCntnts = ddmModelCntnts;
	}

	public Set getModelRatingResultsCntnts() {
		return this.modelRatingResultsCntnts;
	}

	public void setModelRatingResultsCntnts(Set modelRatingResultsCntnts) {
		this.modelRatingResultsCntnts = modelRatingResultsCntnts;
	}

}