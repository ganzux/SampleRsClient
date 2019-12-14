
package com.uhc.optum.claims.institutionalclaimhistory.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherPayerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherPayerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="otherInsuranceSubscriberID" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}IdentifierType" minOccurs="0"/>
 *         &lt;element name="otherInsuranceSubscriberName" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}SubscriberNameType" minOccurs="0"/>
 *         &lt;element name="payerResponsibilitySequenceCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="otherInsurancePayerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherInsurancePayerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceTypeCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="claimTotalOtherPayerPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimTotalOtherPayerPatientResponsibilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimTotalOtherPayerNotCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherPayerType", propOrder = {
    "otherInsuranceSubscriberID",
    "otherInsuranceSubscriberName",
    "payerResponsibilitySequenceCode",
    "otherInsurancePayerID",
    "otherInsurancePayerName",
    "insuranceTypeCode",
    "claimTotalOtherPayerPaidAmount",
    "claimTotalOtherPayerPatientResponsibilityAmount",
    "claimTotalOtherPayerNotCoveredAmount"
})
public class OtherPayerType {

    protected IdentifierType otherInsuranceSubscriberID;
    protected SubscriberNameType otherInsuranceSubscriberName;
    protected CodeDescPairType payerResponsibilitySequenceCode;
    protected String otherInsurancePayerID;
    protected String otherInsurancePayerName;
    protected CodeDescPairType insuranceTypeCode;
    protected String claimTotalOtherPayerPaidAmount;
    protected String claimTotalOtherPayerPatientResponsibilityAmount;
    protected String claimTotalOtherPayerNotCoveredAmount;

    /**
     * Gets the value of the otherInsuranceSubscriberID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getOtherInsuranceSubscriberID() {
        return otherInsuranceSubscriberID;
    }

    /**
     * Sets the value of the otherInsuranceSubscriberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setOtherInsuranceSubscriberID(IdentifierType value) {
        this.otherInsuranceSubscriberID = value;
    }

    /**
     * Gets the value of the otherInsuranceSubscriberName property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberNameType }
     *     
     */
    public SubscriberNameType getOtherInsuranceSubscriberName() {
        return otherInsuranceSubscriberName;
    }

    /**
     * Sets the value of the otherInsuranceSubscriberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberNameType }
     *     
     */
    public void setOtherInsuranceSubscriberName(SubscriberNameType value) {
        this.otherInsuranceSubscriberName = value;
    }

    /**
     * Gets the value of the payerResponsibilitySequenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getPayerResponsibilitySequenceCode() {
        return payerResponsibilitySequenceCode;
    }

    /**
     * Sets the value of the payerResponsibilitySequenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setPayerResponsibilitySequenceCode(CodeDescPairType value) {
        this.payerResponsibilitySequenceCode = value;
    }

    /**
     * Gets the value of the otherInsurancePayerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInsurancePayerID() {
        return otherInsurancePayerID;
    }

    /**
     * Sets the value of the otherInsurancePayerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInsurancePayerID(String value) {
        this.otherInsurancePayerID = value;
    }

    /**
     * Gets the value of the otherInsurancePayerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInsurancePayerName() {
        return otherInsurancePayerName;
    }

    /**
     * Sets the value of the otherInsurancePayerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInsurancePayerName(String value) {
        this.otherInsurancePayerName = value;
    }

    /**
     * Gets the value of the insuranceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getInsuranceTypeCode() {
        return insuranceTypeCode;
    }

    /**
     * Sets the value of the insuranceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setInsuranceTypeCode(CodeDescPairType value) {
        this.insuranceTypeCode = value;
    }

    /**
     * Gets the value of the claimTotalOtherPayerPaidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimTotalOtherPayerPaidAmount() {
        return claimTotalOtherPayerPaidAmount;
    }

    /**
     * Sets the value of the claimTotalOtherPayerPaidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimTotalOtherPayerPaidAmount(String value) {
        this.claimTotalOtherPayerPaidAmount = value;
    }

    /**
     * Gets the value of the claimTotalOtherPayerPatientResponsibilityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimTotalOtherPayerPatientResponsibilityAmount() {
        return claimTotalOtherPayerPatientResponsibilityAmount;
    }

    /**
     * Sets the value of the claimTotalOtherPayerPatientResponsibilityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimTotalOtherPayerPatientResponsibilityAmount(String value) {
        this.claimTotalOtherPayerPatientResponsibilityAmount = value;
    }

    /**
     * Gets the value of the claimTotalOtherPayerNotCoveredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimTotalOtherPayerNotCoveredAmount() {
        return claimTotalOtherPayerNotCoveredAmount;
    }

    /**
     * Sets the value of the claimTotalOtherPayerNotCoveredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimTotalOtherPayerNotCoveredAmount(String value) {
        this.claimTotalOtherPayerNotCoveredAmount = value;
    }

}
