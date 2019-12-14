
package com.uhc.optum.claims.institutionalclaimhistory.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceLineUHCTotalsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceLineUHCTotalsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceBilledChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceDeductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servicePaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceCopayAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceNotCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servicePatientResponsibilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceReimbursementReductionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceMemberReimbursementReductionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceProviderReimbursementReductionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceAllowedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceCoinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceUHCProvWriteOffAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servicePenaltyAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceMemberPenaltyAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceProviderPenaltyAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLineUHCTotalsType", propOrder = {
    "serviceBilledChargeAmount",
    "serviceDeductibleAmount",
    "servicePaidAmount",
    "serviceCopayAmount",
    "serviceNotCoveredAmount",
    "servicePatientResponsibilityAmount",
    "serviceReimbursementReductionAmount",
    "serviceMemberReimbursementReductionAmount",
    "serviceProviderReimbursementReductionAmount",
    "serviceAllowedAmount",
    "serviceCoinsuranceAmount",
    "serviceUHCProvWriteOffAmount",
    "servicePenaltyAmount",
    "serviceMemberPenaltyAmount",
    "serviceProviderPenaltyAmount"
})
public class ServiceLineUHCTotalsType {

    protected String serviceBilledChargeAmount;
    protected String serviceDeductibleAmount;
    protected String servicePaidAmount;
    protected String serviceCopayAmount;
    protected String serviceNotCoveredAmount;
    protected String servicePatientResponsibilityAmount;
    protected String serviceReimbursementReductionAmount;
    protected String serviceMemberReimbursementReductionAmount;
    protected String serviceProviderReimbursementReductionAmount;
    protected String serviceAllowedAmount;
    protected String serviceCoinsuranceAmount;
    protected String serviceUHCProvWriteOffAmount;
    protected String servicePenaltyAmount;
    protected String serviceMemberPenaltyAmount;
    protected String serviceProviderPenaltyAmount;

    /**
     * Gets the value of the serviceBilledChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceBilledChargeAmount() {
        return serviceBilledChargeAmount;
    }

    /**
     * Sets the value of the serviceBilledChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceBilledChargeAmount(String value) {
        this.serviceBilledChargeAmount = value;
    }

    /**
     * Gets the value of the serviceDeductibleAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDeductibleAmount() {
        return serviceDeductibleAmount;
    }

    /**
     * Sets the value of the serviceDeductibleAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDeductibleAmount(String value) {
        this.serviceDeductibleAmount = value;
    }

    /**
     * Gets the value of the servicePaidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePaidAmount() {
        return servicePaidAmount;
    }

    /**
     * Sets the value of the servicePaidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePaidAmount(String value) {
        this.servicePaidAmount = value;
    }

    /**
     * Gets the value of the serviceCopayAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCopayAmount() {
        return serviceCopayAmount;
    }

    /**
     * Sets the value of the serviceCopayAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCopayAmount(String value) {
        this.serviceCopayAmount = value;
    }

    /**
     * Gets the value of the serviceNotCoveredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceNotCoveredAmount() {
        return serviceNotCoveredAmount;
    }

    /**
     * Sets the value of the serviceNotCoveredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNotCoveredAmount(String value) {
        this.serviceNotCoveredAmount = value;
    }

    /**
     * Gets the value of the servicePatientResponsibilityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePatientResponsibilityAmount() {
        return servicePatientResponsibilityAmount;
    }

    /**
     * Sets the value of the servicePatientResponsibilityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePatientResponsibilityAmount(String value) {
        this.servicePatientResponsibilityAmount = value;
    }

    /**
     * Gets the value of the serviceReimbursementReductionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceReimbursementReductionAmount() {
        return serviceReimbursementReductionAmount;
    }

    /**
     * Sets the value of the serviceReimbursementReductionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceReimbursementReductionAmount(String value) {
        this.serviceReimbursementReductionAmount = value;
    }

    /**
     * Gets the value of the serviceMemberReimbursementReductionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceMemberReimbursementReductionAmount() {
        return serviceMemberReimbursementReductionAmount;
    }

    /**
     * Sets the value of the serviceMemberReimbursementReductionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceMemberReimbursementReductionAmount(String value) {
        this.serviceMemberReimbursementReductionAmount = value;
    }

    /**
     * Gets the value of the serviceProviderReimbursementReductionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProviderReimbursementReductionAmount() {
        return serviceProviderReimbursementReductionAmount;
    }

    /**
     * Sets the value of the serviceProviderReimbursementReductionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProviderReimbursementReductionAmount(String value) {
        this.serviceProviderReimbursementReductionAmount = value;
    }

    /**
     * Gets the value of the serviceAllowedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAllowedAmount() {
        return serviceAllowedAmount;
    }

    /**
     * Sets the value of the serviceAllowedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAllowedAmount(String value) {
        this.serviceAllowedAmount = value;
    }

    /**
     * Gets the value of the serviceCoinsuranceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCoinsuranceAmount() {
        return serviceCoinsuranceAmount;
    }

    /**
     * Sets the value of the serviceCoinsuranceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCoinsuranceAmount(String value) {
        this.serviceCoinsuranceAmount = value;
    }

    /**
     * Gets the value of the serviceUHCProvWriteOffAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceUHCProvWriteOffAmount() {
        return serviceUHCProvWriteOffAmount;
    }

    /**
     * Sets the value of the serviceUHCProvWriteOffAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceUHCProvWriteOffAmount(String value) {
        this.serviceUHCProvWriteOffAmount = value;
    }

    /**
     * Gets the value of the servicePenaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePenaltyAmount() {
        return servicePenaltyAmount;
    }

    /**
     * Sets the value of the servicePenaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePenaltyAmount(String value) {
        this.servicePenaltyAmount = value;
    }

    /**
     * Gets the value of the serviceMemberPenaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceMemberPenaltyAmount() {
        return serviceMemberPenaltyAmount;
    }

    /**
     * Sets the value of the serviceMemberPenaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceMemberPenaltyAmount(String value) {
        this.serviceMemberPenaltyAmount = value;
    }

    /**
     * Gets the value of the serviceProviderPenaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProviderPenaltyAmount() {
        return serviceProviderPenaltyAmount;
    }

    /**
     * Sets the value of the serviceProviderPenaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProviderPenaltyAmount(String value) {
        this.serviceProviderPenaltyAmount = value;
    }

}
