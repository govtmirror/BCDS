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
 * <p>Java class for ClaimRating complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimRating">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Claim" type="{http://bcdss.vba.va.gov/models}Claim"/>
 *         &lt;element name="Rating" type="{http://bcdss.vba.va.gov/models}Rating"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimRating", propOrder = {
    "claim",
    "rating"
})
public class ClaimRating {

    @XmlElement(name = "Claim", required = true)
    protected Claim claim;
    @XmlElement(name = "Rating", required = true)
    protected Rating rating;

    /**
     * Gets the value of the claim property.
     * 
     * @return
     *     possible object is
     *     {@link Claim }
     *     
     */
    public Claim getClaim() {
        return claim;
    }

    /**
     * Sets the value of the claim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Claim }
     *     
     */
    public void setClaim(Claim value) {
        this.claim = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link Rating }
     *     
     */
    public Rating getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rating }
     *     
     */
    public void setRating(Rating value) {
        this.rating = value;
    }

}
