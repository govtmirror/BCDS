package gov.va.vba.persistence.entity;
// Generated Nov 17, 2016 12:12:28 PM by Hibernate Tools 5.2.0.Beta1

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * ModelRatingResultsDiag generated by hbm2java
 */
@Entity
@Table(name = "MODEL_RATING_RESULTS_DIAG", schema = "BCDSS")
public class ModelRatingResultsDiag implements java.io.Serializable {

    private ModelRatingResultsDiagId id;
    private Long count;
    private ModelRatingResults modelRatingResults;
    //private DDMDiagnosis diagnosis;

    @EmbeddedId
    public ModelRatingResultsDiagId getId() {
        return this.id;
    }

    public void setId(ModelRatingResultsDiagId id) {
        this.id = id;
    }

    @MapsId("processId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROCESS_ID", insertable = false, updatable = false)
    public ModelRatingResults getModelRatingResults() {
        return this.modelRatingResults;
    }

    public void setModelRatingResults(ModelRatingResults modelRatingResults) {
        this.modelRatingResults = modelRatingResults;
    }

    @Column(name = "COUNT")
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

	/*@MapsId("diagId")
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DIAG_ID", insertable = false, updatable = false)
	public DDMDiagnosis getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(DDMDiagnosis diagnosis) {
		this.diagnosis = diagnosis;
	}*/

}
