
package com.uhc.optum.claims.institutionalclaimhistory.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claimServiceLineID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceFirstDateofService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceLastDateofService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceNetworkIndicator" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="serviceLineStatusCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="pendReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="healthCoverageType" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="serviceUnitCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revenueCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="ambulatoryPaymentClassificationCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="ambulatoryPaymentStatusCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="cesMnemonic" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}MnemonicType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="benefitClaimAccumulator" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}BenefitClaimAccumType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="benefitPlan" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}BenefitPlanType" minOccurs="0"/>
 *         &lt;element name="overrideIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="penaltyReasonCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="semiPrivateRoomRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cobMethod" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="procedureCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}ProcedureCodeType" minOccurs="0"/>
 *         &lt;element name="provider" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}ProviderResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="claimLineAdjudicationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carcAdjustments" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}ClaimAdjustmentType" minOccurs="0"/>
 *         &lt;element name="serviceRemarks" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}RemarkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="authorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referralNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceLineUHCAmounts" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}ServiceLineUHCTotalsType" minOccurs="0"/>
 *         &lt;element name="serviceLineOtherPayer" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}ServiceLineOtherPayerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serviceNotes" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}NotesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cancelReason" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="alphaParentLineNum" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLineType", propOrder = {
    "claimServiceLineID",
    "serviceFirstDateofService",
    "serviceLastDateofService",
    "serviceNetworkIndicator",
    "serviceLineStatusCode",
    "pendReasonCode",
    "healthCoverageType",
    "serviceUnitCount",
    "unitOfMeasure",
    "revenueCode",
    "ambulatoryPaymentClassificationCode",
    "ambulatoryPaymentStatusCode",
    "cesMnemonic",
    "benefitClaimAccumulator",
    "benefitPlan",
    "overrideIndicator",
    "penaltyReasonCode",
    "semiPrivateRoomRate",
    "cobMethod",
    "procedureCode",
    "provider",
    "claimLineAdjudicationDate",
    "carcAdjustments",
    "serviceRemarks",
    "authorizationNumber",
    "referralNumber",
    "serviceLineUHCAmounts",
    "serviceLineOtherPayer",
    "serviceNotes",
    "cancelReason",
    "alphaParentLineNum"
})
public class ServiceLineType {

    protected String claimServiceLineID;
    protected String serviceFirstDateofService;
    protected String serviceLastDateofService;
    protected CodeDescPairType serviceNetworkIndicator;
    protected CodeDescPairType serviceLineStatusCode;
    @XmlElement(nillable = true)
    protected List<String> pendReasonCode;
    protected CodeDescPairType healthCoverageType;
    protected String serviceUnitCount;
    protected String unitOfMeasure;
    protected CodeDescPairType revenueCode;
    protected CodeDescPairType ambulatoryPaymentClassificationCode;
    protected CodeDescPairType ambulatoryPaymentStatusCode;
    @XmlElement(nillable = true)
    protected List<MnemonicType> cesMnemonic;
    @XmlElement(nillable = true)
    protected List<BenefitClaimAccumType> benefitClaimAccumulator;
    protected BenefitPlanType benefitPlan;
    protected String overrideIndicator;
    protected CodeDescPairType penaltyReasonCode;
    protected String semiPrivateRoomRate;
    protected CodeDescPairType cobMethod;
    protected ProcedureCodeType procedureCode;
    @XmlElement(nillable = true)
    protected List<ProviderResponseType> provider;
    protected String claimLineAdjudicationDate;
    protected ClaimAdjustmentType carcAdjustments;
    @XmlElement(nillable = true)
    protected List<RemarkType> serviceRemarks;
    protected String authorizationNumber;
    protected String referralNumber;
    protected ServiceLineUHCTotalsType serviceLineUHCAmounts;
    @XmlElement(nillable = true)
    protected List<ServiceLineOtherPayerType> serviceLineOtherPayer;
    @XmlElement(nillable = true)
    protected List<NotesType> serviceNotes;
    protected CodeDescPairType cancelReason;
    @XmlElement(nillable = true)
    protected List<String> alphaParentLineNum;

    /**
     * Gets the value of the claimServiceLineID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimServiceLineID() {
        return claimServiceLineID;
    }

    /**
     * Sets the value of the claimServiceLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimServiceLineID(String value) {
        this.claimServiceLineID = value;
    }

    /**
     * Gets the value of the serviceFirstDateofService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFirstDateofService() {
        return serviceFirstDateofService;
    }

    /**
     * Sets the value of the serviceFirstDateofService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFirstDateofService(String value) {
        this.serviceFirstDateofService = value;
    }

    /**
     * Gets the value of the serviceLastDateofService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLastDateofService() {
        return serviceLastDateofService;
    }

    /**
     * Sets the value of the serviceLastDateofService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLastDateofService(String value) {
        this.serviceLastDateofService = value;
    }

    /**
     * Gets the value of the serviceNetworkIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getServiceNetworkIndicator() {
        return serviceNetworkIndicator;
    }

    /**
     * Sets the value of the serviceNetworkIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setServiceNetworkIndicator(CodeDescPairType value) {
        this.serviceNetworkIndicator = value;
    }

    /**
     * Gets the value of the serviceLineStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getServiceLineStatusCode() {
        return serviceLineStatusCode;
    }

    /**
     * Sets the value of the serviceLineStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setServiceLineStatusCode(CodeDescPairType value) {
        this.serviceLineStatusCode = value;
    }

    /**
     * Gets the value of the pendReasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pendReasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPendReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPendReasonCode() {
        if (pendReasonCode == null) {
            pendReasonCode = new ArrayList<String>();
        }
        return this.pendReasonCode;
    }

    /**
     * Gets the value of the healthCoverageType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getHealthCoverageType() {
        return healthCoverageType;
    }

    /**
     * Sets the value of the healthCoverageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setHealthCoverageType(CodeDescPairType value) {
        this.healthCoverageType = value;
    }

    /**
     * Gets the value of the serviceUnitCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceUnitCount() {
        return serviceUnitCount;
    }

    /**
     * Sets the value of the serviceUnitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceUnitCount(String value) {
        this.serviceUnitCount = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the revenueCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getRevenueCode() {
        return revenueCode;
    }

    /**
     * Sets the value of the revenueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setRevenueCode(CodeDescPairType value) {
        this.revenueCode = value;
    }

    /**
     * Gets the value of the ambulatoryPaymentClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getAmbulatoryPaymentClassificationCode() {
        return ambulatoryPaymentClassificationCode;
    }

    /**
     * Sets the value of the ambulatoryPaymentClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setAmbulatoryPaymentClassificationCode(CodeDescPairType value) {
        this.ambulatoryPaymentClassificationCode = value;
    }

    /**
     * Gets the value of the ambulatoryPaymentStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getAmbulatoryPaymentStatusCode() {
        return ambulatoryPaymentStatusCode;
    }

    /**
     * Sets the value of the ambulatoryPaymentStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setAmbulatoryPaymentStatusCode(CodeDescPairType value) {
        this.ambulatoryPaymentStatusCode = value;
    }

    /**
     * Gets the value of the cesMnemonic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cesMnemonic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCesMnemonic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MnemonicType }
     * 
     * 
     */
    public List<MnemonicType> getCesMnemonic() {
        if (cesMnemonic == null) {
            cesMnemonic = new ArrayList<MnemonicType>();
        }
        return this.cesMnemonic;
    }

    /**
     * Gets the value of the benefitClaimAccumulator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the benefitClaimAccumulator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBenefitClaimAccumulator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BenefitClaimAccumType }
     * 
     * 
     */
    public List<BenefitClaimAccumType> getBenefitClaimAccumulator() {
        if (benefitClaimAccumulator == null) {
            benefitClaimAccumulator = new ArrayList<BenefitClaimAccumType>();
        }
        return this.benefitClaimAccumulator;
    }

    /**
     * Gets the value of the benefitPlan property.
     * 
     * @return
     *     possible object is
     *     {@link BenefitPlanType }
     *     
     */
    public BenefitPlanType getBenefitPlan() {
        return benefitPlan;
    }

    /**
     * Sets the value of the benefitPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenefitPlanType }
     *     
     */
    public void setBenefitPlan(BenefitPlanType value) {
        this.benefitPlan = value;
    }

    /**
     * Gets the value of the overrideIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideIndicator() {
        return overrideIndicator;
    }

    /**
     * Sets the value of the overrideIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideIndicator(String value) {
        this.overrideIndicator = value;
    }

    /**
     * Gets the value of the penaltyReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getPenaltyReasonCode() {
        return penaltyReasonCode;
    }

    /**
     * Sets the value of the penaltyReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setPenaltyReasonCode(CodeDescPairType value) {
        this.penaltyReasonCode = value;
    }

    /**
     * Gets the value of the semiPrivateRoomRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemiPrivateRoomRate() {
        return semiPrivateRoomRate;
    }

    /**
     * Sets the value of the semiPrivateRoomRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemiPrivateRoomRate(String value) {
        this.semiPrivateRoomRate = value;
    }

    /**
     * Gets the value of the cobMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getCobMethod() {
        return cobMethod;
    }

    /**
     * Sets the value of the cobMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setCobMethod(CodeDescPairType value) {
        this.cobMethod = value;
    }

    /**
     * Gets the value of the procedureCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureCodeType }
     *     
     */
    public ProcedureCodeType getProcedureCode() {
        return procedureCode;
    }

    /**
     * Sets the value of the procedureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureCodeType }
     *     
     */
    public void setProcedureCode(ProcedureCodeType value) {
        this.procedureCode = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvider().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderResponseType }
     * 
     * 
     */
    public List<ProviderResponseType> getProvider() {
        if (provider == null) {
            provider = new ArrayList<ProviderResponseType>();
        }
        return this.provider;
    }

    /**
     * Gets the value of the claimLineAdjudicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimLineAdjudicationDate() {
        return claimLineAdjudicationDate;
    }

    /**
     * Sets the value of the claimLineAdjudicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimLineAdjudicationDate(String value) {
        this.claimLineAdjudicationDate = value;
    }

    /**
     * Gets the value of the carcAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimAdjustmentType }
     *     
     */
    public ClaimAdjustmentType getCarcAdjustments() {
        return carcAdjustments;
    }

    /**
     * Sets the value of the carcAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimAdjustmentType }
     *     
     */
    public void setCarcAdjustments(ClaimAdjustmentType value) {
        this.carcAdjustments = value;
    }

    /**
     * Gets the value of the serviceRemarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceRemarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkType }
     * 
     * 
     */
    public List<RemarkType> getServiceRemarks() {
        if (serviceRemarks == null) {
            serviceRemarks = new ArrayList<RemarkType>();
        }
        return this.serviceRemarks;
    }

    /**
     * Gets the value of the authorizationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationNumber() {
        return authorizationNumber;
    }

    /**
     * Sets the value of the authorizationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationNumber(String value) {
        this.authorizationNumber = value;
    }

    /**
     * Gets the value of the referralNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralNumber() {
        return referralNumber;
    }

    /**
     * Sets the value of the referralNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralNumber(String value) {
        this.referralNumber = value;
    }

    /**
     * Gets the value of the serviceLineUHCAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLineUHCTotalsType }
     *     
     */
    public ServiceLineUHCTotalsType getServiceLineUHCAmounts() {
        return serviceLineUHCAmounts;
    }

    /**
     * Sets the value of the serviceLineUHCAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLineUHCTotalsType }
     *     
     */
    public void setServiceLineUHCAmounts(ServiceLineUHCTotalsType value) {
        this.serviceLineUHCAmounts = value;
    }

    /**
     * Gets the value of the serviceLineOtherPayer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceLineOtherPayer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceLineOtherPayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLineOtherPayerType }
     * 
     * 
     */
    public List<ServiceLineOtherPayerType> getServiceLineOtherPayer() {
        if (serviceLineOtherPayer == null) {
            serviceLineOtherPayer = new ArrayList<ServiceLineOtherPayerType>();
        }
        return this.serviceLineOtherPayer;
    }

    /**
     * Gets the value of the serviceNotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceNotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotesType }
     * 
     * 
     */
    public List<NotesType> getServiceNotes() {
        if (serviceNotes == null) {
            serviceNotes = new ArrayList<NotesType>();
        }
        return this.serviceNotes;
    }

    /**
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setCancelReason(CodeDescPairType value) {
        this.cancelReason = value;
    }

    /**
     * Gets the value of the alphaParentLineNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alphaParentLineNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlphaParentLineNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlphaParentLineNum() {
        if (alphaParentLineNum == null) {
            alphaParentLineNum = new ArrayList<String>();
        }
        return this.alphaParentLineNum;
    }

}
