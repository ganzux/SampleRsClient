
package com.uhc.optum.claims.institutionalclaimhistory.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UHCTotalsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UHCTotalsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claimTotalBilledChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimTotalDeductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimTotalInterestAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimTotalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCopayAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalNotCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalPatientResponsibilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimTotalUHCProvWriteOffAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimTotalReimbursementReductionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimTotalMemberReimbursementReductionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimTotalProviderReimbursementReductionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimTotalPenaltyAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimTotalMemberPenaltyAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimTotaProviderPenaltyAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimTotalStateSurchargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimTotalAllowedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimTotalCoinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UHCTotalsType", propOrder = {
    "claimTotalBilledChargeAmount",
    "claimTotalDeductibleAmount",
    "claimTotalInterestAmount",
    "claimTotalPaidAmount",
    "totalCopayAmount",
    "totalNotCoveredAmount",
    "totalPatientResponsibilityAmount",
    "claimTotalUHCProvWriteOffAmount",
    "claimTotalReimbursementReductionAmount",
    "claimTotalMemberReimbursementReductionAmount",
    "claimTotalProviderReimbursementReductionAmount",
    "claimTotalPenaltyAmount",
    "claimTotalMemberPenaltyAmount",
    "claimTotaProviderPenaltyAmount",
    "claimTotalStateSurchargeAmount",
    "claimTotalAllowedAmount",
    "claimTotalCoinsuranceAmount"
})
public class UHCTotalsType {

    protected String claimTotalBilledChargeAmount;
    protected String claimTotalDeductibleAmount;
    protected String claimTotalInterestAmount;
    protected String claimTotalPaidAmount;
    protected String totalCopayAmount;
    protected String totalNotCoveredAmount;
    protected String totalPatientResponsibilityAmount;
    protected String claimTotalUHCProvWriteOffAmount;
    protected String claimTotalReimbursementReductionAmount;
    protected String claimTotalMemberReimbursementReductionAmount;
    protected String claimTotalProviderReimbursementReductionAmount;
    protected String claimTotalPenaltyAmount;
    protected String claimTotalMemberPenaltyAmount;
    protected String claimTotaProviderPenaltyAmount;
    protected String claimTotalStateSurchargeAmount;
    protected String claimTotalAllowedAmount;
    protected String claimTotalCoinsuranceAmount;

    /**
     * Gets the value of the claimTotalBilledChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimTotalBilledChargeAmount() {
        return claimTotalBilledChargeAmount;
    }

    /**
     * Sets the value of the claimTotalBilledChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimTotalBilledChargeAmount(String value) {
        this.claimTotalBilledChargeAmount = value;
    }

    /**
     * Gets the value of the claimTotalDeductibleAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimTotalDeductibleAmount() {
        return claimTotalDeductibleAmount;
    }

    /**
     * Sets the value of the claimTotalDeductibleAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimTotalDeductibleAmount(String value) {
        this.claimTotalDeductibleAmount = value;
    }

    /**
     * Gets the value of the claimTotalInterestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimTotalInterestAmount() {
        return claimTotalInterestAmount;
    }

    /**
     * Sets the value of the claimTotalInterestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimTotalInterestAmount(String value) {
        this.claimTotalInterestAmount = value;
    }

    /**
     * Gets the value of the claimTotalPaidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimTotalPaidAmount() {
        return claimTotalPaidAmount;
    }

    /**
     * Sets the value of the claimTotalPaidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimTotalPaidAmount(String value) {
        this.claimTotalPaidAmount = value;
    }

    /**
     * Gets the value of the totalCopayAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCopayAmount() {
        return totalCopayAmount;
    }

    /**
     * Sets the value of the totalCopayAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCopayAmount(String value) {
        this.totalCopayAmount = value;
    }

    /**
     * Gets the value of the totalNotCoveredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalNotCoveredAmount() {
        return totalNotCoveredAmount;
    }

    /**
     * Sets the value of the totalNotCoveredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalNotCoveredAmount(String value) {
        this.totalNotCoveredAmount = value;
    }

    /**
     * Gets the value of the totalPatientResponsibilityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPatientResponsibilityAmount() {
        return totalPatientResponsibilityAmount;
    }

    /**
     * Sets the value of the totalPatientResponsibilityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPatientResponsibilityAmount(String value) {
        this.totalPatientResponsibilityAmount = value;
    }

    /**
     * Gets the value of the claimTotalUHCProvWriteOffAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimTotalUHCProvWriteOffAmount() {
        return claimTotalUHCProvWriteOffAmount;
    }

    /**
     * Sets the value of the claimTotalUHCProvWriteOffAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimTotalUHCProvWriteOffAmount(String value) {
        this.claimTotalUHCProvWriteOffAmount = value;
    }

    /**
     * Gets the value of the claimTotalReimbursementReductionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimTotalReimbursementReductionAmount() {
        return claimTotalReimbursementReductionAmount;
    }

    /**
     * Sets the value of the claimTotalReimbursementReductionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimTotalReimbursementReductionAmount(String value) {
        this.claimTotalReimbursementReductionAmount = value;
    }

    /**
     * Gets the value of the claimTotalMemberReimbursementReductionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimTotalMemberReimbursementReductionAmount() {
        return claimTotalMemberReimbursementReductionAmount;
    }

    /**
     * Sets the value of the claimTotalMemberReimbursementReductionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimTotalMemberReimbursementReductionAmount(String value) {
        this.claimTotalMemberReimbursementReductionAmount = value;
    }

    /**
     * Gets the value of the claimTotalProviderReimbursementReductionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimTotalProviderReimbursementReductionAmount() {
        return claimTotalProviderReimbursementReductionAmount;
    }

    /**
     * Sets the value of the claimTotalProviderReimbursementReductionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimTotalProviderReimbursementReductionAmount(String value) {
        this.claimTotalProviderReimbursementReductionAmount = value;
    }

    /**
     * Gets the value of the claimTotalPenaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimTotalPenaltyAmount() {
        return claimTotalPenaltyAmount;
    }

    /**
     * Sets the value of the claimTotalPenaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimTotalPenaltyAmount(String value) {
        this.claimTotalPenaltyAmount = value;
    }

    /**
     * Gets the value of the claimTotalMemberPenaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimTotalMemberPenaltyAmount() {
        return claimTotalMemberPenaltyAmount;
    }

    /**
     * Sets the value of the claimTotalMemberPenaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimTotalMemberPenaltyAmount(String value) {
        this.claimTotalMemberPenaltyAmount = value;
    }

    /**
     * Gets the value of the claimTotaProviderPenaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimTotaProviderPenaltyAmount() {
        return claimTotaProviderPenaltyAmount;
    }

    /**
     * Sets the value of the claimTotaProviderPenaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimTotaProviderPenaltyAmount(String value) {
        this.claimTotaProviderPenaltyAmount = value;
    }

    /**
     * Gets the value of the claimTotalStateSurchargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimTotalStateSurchargeAmount() {
        return claimTotalStateSurchargeAmount;
    }

    /**
     * Sets the value of the claimTotalStateSurchargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimTotalStateSurchargeAmount(String value) {
        this.claimTotalStateSurchargeAmount = value;
    }

    /**
     * Gets the value of the claimTotalAllowedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimTotalAllowedAmount() {
        return claimTotalAllowedAmount;
    }

    /**
     * Sets the value of the claimTotalAllowedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimTotalAllowedAmount(String value) {
        this.claimTotalAllowedAmount = value;
    }

    /**
     * Gets the value of the claimTotalCoinsuranceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimTotalCoinsuranceAmount() {
        return claimTotalCoinsuranceAmount;
    }

    /**
     * Sets the value of the claimTotalCoinsuranceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimTotalCoinsuranceAmount(String value) {
        this.claimTotalCoinsuranceAmount = value;
    }

}
