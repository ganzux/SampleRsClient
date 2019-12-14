
package com.uhc.optum.claims.institutionalclaimhistory.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceLineOtherPayerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceLineOtherPayerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="otherPayerPrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patientResponsibilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLineOtherPayerType", propOrder = {
    "otherPayerPrimaryIdentifier",
    "paidAmount",
    "patientResponsibilityAmount"
})
public class ServiceLineOtherPayerType {

    protected String otherPayerPrimaryIdentifier;
    protected String paidAmount;
    protected String patientResponsibilityAmount;

    /**
     * Gets the value of the otherPayerPrimaryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPayerPrimaryIdentifier() {
        return otherPayerPrimaryIdentifier;
    }

    /**
     * Sets the value of the otherPayerPrimaryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPayerPrimaryIdentifier(String value) {
        this.otherPayerPrimaryIdentifier = value;
    }

    /**
     * Gets the value of the paidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidAmount() {
        return paidAmount;
    }

    /**
     * Sets the value of the paidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidAmount(String value) {
        this.paidAmount = value;
    }

    /**
     * Gets the value of the patientResponsibilityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientResponsibilityAmount() {
        return patientResponsibilityAmount;
    }

    /**
     * Sets the value of the patientResponsibilityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientResponsibilityAmount(String value) {
        this.patientResponsibilityAmount = value;
    }

}
