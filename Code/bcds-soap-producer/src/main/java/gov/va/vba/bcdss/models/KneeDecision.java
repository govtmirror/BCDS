//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.11 at 02:39:20 PM EDT 
//


package gov.va.vba.bcdss.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KneeDecision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KneeDecision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentionKnee" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ContentionLeft" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ContentionRight " type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ContentionBilateral" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ContentionLeg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ContentionAmputation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DecisionKnee" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DecisionLeft" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DecisionRight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DecisionBilateral" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DecisionLimitation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DecisionImpairment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DecisionAnkyloses" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DecisionAmputation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KneeDecision", propOrder = {
    "contentionKnee",
    "contentionLeft",
    "contentionRight0020",
    "contentionBilateral",
    "contentionLeg",
    "contentionAmputation",
    "decisionKnee",
    "decisionLeft",
    "decisionRight",
    "decisionBilateral",
    "decisionLimitation",
    "decisionImpairment",
    "decisionAnkyloses",
    "decisionAmputation"
})
public class KneeDecision {

    @XmlElement(name = "ContentionKnee")
    protected int contentionKnee;
    @XmlElement(name = "ContentionLeft")
    protected int contentionLeft;
    @XmlElement(name = "ContentionRight ")
    protected int contentionRight0020;
    @XmlElement(name = "ContentionBilateral")
    protected int contentionBilateral;
    @XmlElement(name = "ContentionLeg")
    protected int contentionLeg;
    @XmlElement(name = "ContentionAmputation")
    protected int contentionAmputation;
    @XmlElement(name = "DecisionKnee")
    protected int decisionKnee;
    @XmlElement(name = "DecisionLeft")
    protected int decisionLeft;
    @XmlElement(name = "DecisionRight")
    protected int decisionRight;
    @XmlElement(name = "DecisionBilateral")
    protected int decisionBilateral;
    @XmlElement(name = "DecisionLimitation")
    protected int decisionLimitation;
    @XmlElement(name = "DecisionImpairment")
    protected int decisionImpairment;
    @XmlElement(name = "DecisionAnkyloses")
    protected int decisionAnkyloses;
    @XmlElement(name = "DecisionAmputation")
    protected int decisionAmputation;

    /**
     * Gets the value of the contentionKnee property.
     * 
     */
    public int getContentionKnee() {
        return contentionKnee;
    }

    /**
     * Sets the value of the contentionKnee property.
     * 
     */
    public void setContentionKnee(int value) {
        this.contentionKnee = value;
    }

    /**
     * Gets the value of the contentionLeft property.
     * 
     */
    public int getContentionLeft() {
        return contentionLeft;
    }

    /**
     * Sets the value of the contentionLeft property.
     * 
     */
    public void setContentionLeft(int value) {
        this.contentionLeft = value;
    }

    /**
     * Gets the value of the contentionRight0020 property.
     * 
     */
    public int getContentionRight_0020() {
        return contentionRight0020;
    }

    /**
     * Sets the value of the contentionRight0020 property.
     * 
     */
    public void setContentionRight_0020(int value) {
        this.contentionRight0020 = value;
    }

    /**
     * Gets the value of the contentionBilateral property.
     * 
     */
    public int getContentionBilateral() {
        return contentionBilateral;
    }

    /**
     * Sets the value of the contentionBilateral property.
     * 
     */
    public void setContentionBilateral(int value) {
        this.contentionBilateral = value;
    }

    /**
     * Gets the value of the contentionLeg property.
     * 
     */
    public int getContentionLeg() {
        return contentionLeg;
    }

    /**
     * Sets the value of the contentionLeg property.
     * 
     */
    public void setContentionLeg(int value) {
        this.contentionLeg = value;
    }

    /**
     * Gets the value of the contentionAmputation property.
     * 
     */
    public int getContentionAmputation() {
        return contentionAmputation;
    }

    /**
     * Sets the value of the contentionAmputation property.
     * 
     */
    public void setContentionAmputation(int value) {
        this.contentionAmputation = value;
    }

    /**
     * Gets the value of the decisionKnee property.
     * 
     */
    public int getDecisionKnee() {
        return decisionKnee;
    }

    /**
     * Sets the value of the decisionKnee property.
     * 
     */
    public void setDecisionKnee(int value) {
        this.decisionKnee = value;
    }

    /**
     * Gets the value of the decisionLeft property.
     * 
     */
    public int getDecisionLeft() {
        return decisionLeft;
    }

    /**
     * Sets the value of the decisionLeft property.
     * 
     */
    public void setDecisionLeft(int value) {
        this.decisionLeft = value;
    }

    /**
     * Gets the value of the decisionRight property.
     * 
     */
    public int getDecisionRight() {
        return decisionRight;
    }

    /**
     * Sets the value of the decisionRight property.
     * 
     */
    public void setDecisionRight(int value) {
        this.decisionRight = value;
    }

    /**
     * Gets the value of the decisionBilateral property.
     * 
     */
    public int getDecisionBilateral() {
        return decisionBilateral;
    }

    /**
     * Sets the value of the decisionBilateral property.
     * 
     */
    public void setDecisionBilateral(int value) {
        this.decisionBilateral = value;
    }

    /**
     * Gets the value of the decisionLimitation property.
     * 
     */
    public int getDecisionLimitation() {
        return decisionLimitation;
    }

    /**
     * Sets the value of the decisionLimitation property.
     * 
     */
    public void setDecisionLimitation(int value) {
        this.decisionLimitation = value;
    }

    /**
     * Gets the value of the decisionImpairment property.
     * 
     */
    public int getDecisionImpairment() {
        return decisionImpairment;
    }

    /**
     * Sets the value of the decisionImpairment property.
     * 
     */
    public void setDecisionImpairment(int value) {
        this.decisionImpairment = value;
    }

    /**
     * Gets the value of the decisionAnkyloses property.
     * 
     */
    public int getDecisionAnkyloses() {
        return decisionAnkyloses;
    }

    /**
     * Sets the value of the decisionAnkyloses property.
     * 
     */
    public void setDecisionAnkyloses(int value) {
        this.decisionAnkyloses = value;
    }

    /**
     * Gets the value of the decisionAmputation property.
     * 
     */
    public int getDecisionAmputation() {
        return decisionAmputation;
    }

    /**
     * Sets the value of the decisionAmputation property.
     * 
     */
    public void setDecisionAmputation(int value) {
        this.decisionAmputation = value;
    }

}
