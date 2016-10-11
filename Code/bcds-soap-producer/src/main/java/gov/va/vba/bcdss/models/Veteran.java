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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Veteran complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Veteran">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VeteranId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VeteranName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Veteran", propOrder = {
    "veteranId",
    "veteranName",
    "dob"
})
public class Veteran {

    @XmlElement(name = "VeteranId")
    protected int veteranId;
    @XmlElement(name = "VeteranName", required = true)
    protected String veteranName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dob;

    /**
     * Gets the value of the veteranId property.
     * 
     */
    public int getVeteranId() {
        return veteranId;
    }

    /**
     * Sets the value of the veteranId property.
     * 
     */
    public void setVeteranId(int value) {
        this.veteranId = value;
    }

    /**
     * Gets the value of the veteranName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeteranName() {
        return veteranName;
    }

    /**
     * Sets the value of the veteranName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeteranName(String value) {
        this.veteranName = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDob(XMLGregorianCalendar value) {
        this.dob = value;
    }

}
