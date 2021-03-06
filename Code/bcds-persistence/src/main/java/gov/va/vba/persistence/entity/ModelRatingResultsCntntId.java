package gov.va.vba.persistence.entity;
// Generated Nov 17, 2016 12:12:28 PM by Hibernate Tools 5.2.0.Beta1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ModelRatingResultsCntntId generated by hbm2java
 */
@Embeddable
public class ModelRatingResultsCntntId implements java.io.Serializable {

	private Long cntntId;
	private Long processId;

	public ModelRatingResultsCntntId() {
	}

	public ModelRatingResultsCntntId(Long cntntId, Long processId) {
		this.cntntId = cntntId;
		this.processId = processId;
	}

	@Column(name = "CNTNT_CD")
	public Long getCntntId() {
		return this.cntntId;
	}

	public void setCntntId(Long cntntId) {
		this.cntntId = cntntId;
	}

	@Column(name = "PROCESS_ID")
	public Long getProcessId() {
		return this.processId;
	}

	public void setProcessId(Long processId) {
		this.processId = processId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ModelRatingResultsCntntId))
			return false;
		ModelRatingResultsCntntId castOther = (ModelRatingResultsCntntId) other;

		return ((this.getCntntId() == castOther.getCntntId()) || (this.getCntntId() != null
				&& castOther.getCntntId() != null && this.getCntntId().equals(castOther.getCntntId())))
				&& ((this.getProcessId() == castOther.getProcessId()) || (this.getProcessId() != null
						&& castOther.getProcessId() != null && this.getProcessId().equals(castOther.getProcessId())));
	}

	public int hashCode() {
		int result = 17;
		result = 37 * result + (getCntntId() == null ? 0 : this.getCntntId().hashCode());
		result = 37 * result + (getProcessId() == null ? 0 : this.getProcessId().hashCode());
		return result;
	}

}
