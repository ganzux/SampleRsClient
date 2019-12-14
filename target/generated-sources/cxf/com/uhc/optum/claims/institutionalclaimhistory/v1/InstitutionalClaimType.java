
package com.uhc.optum.claims.institutionalclaimhistory.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstitutionalClaimType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstitutionalClaimType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claimType" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="claimSubmissionType" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="claimFirstDateofService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimLastDateofService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimFLNNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceClaimId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceClaimID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="adjudicatedCOBLevel" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="billTypeCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="claimSourceSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimSplitIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimStatusCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="claimNetworkIndicator" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="claimCauseCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="pendReasonCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="encounterIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurrenceCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}OccurenceCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="occurenceSpanCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}OccurenceCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="conditionCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="surgeryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dischargeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dischargeTimeHour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="admitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="admitTimeHour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surgicalProcedure" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timelyFilingLimitDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimReceiptDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimEvent" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}ClaimEventType" minOccurs="0"/>
 *         &lt;element name="cesMnemonic" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}MnemonicType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="carcAdjustments" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}ClaimAdjustmentType" minOccurs="0"/>
 *         &lt;element name="claimRemarks" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}RemarkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="diagnosisCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}DiagnosisCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="drgNumber" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}IndividualType" minOccurs="0"/>
 *         &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="privacyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provider" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}ProviderResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subscriber" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}SubscriberType" minOccurs="0"/>
 *         &lt;element name="payerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherPayer" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}OtherPayerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="claimUHCTotals" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}UHCTotalsType" minOccurs="0"/>
 *         &lt;element name="claimNotes" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}NotesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serviceLine" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}ServiceLineType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstitutionalClaimType", propOrder = {
    "claimType",
    "claimSubmissionType",
    "claimFirstDateofService",
    "claimLastDateofService",
    "claimFLNNumber",
    "sourceClaimId",
    "claimId",
    "referenceClaimID",
    "adjudicatedCOBLevel",
    "billTypeCode",
    "claimSourceSystemCode",
    "claimSplitIndicator",
    "claimStatusCode",
    "claimNetworkIndicator",
    "claimCauseCode",
    "pendReasonCode",
    "encounterIndicator",
    "occurrenceCode",
    "occurenceSpanCode",
    "conditionCode",
    "surgeryDate",
    "dischargeDate",
    "dischargeTimeHour",
    "admitDate",
    "admitTimeHour",
    "surgicalProcedure",
    "timelyFilingLimitDays",
    "claimReceiptDate",
    "claimEvent",
    "cesMnemonic",
    "carcAdjustments",
    "claimRemarks",
    "diagnosisCode",
    "drgNumber",
    "patient",
    "patientAccountNumber",
    "privacyIndicator",
    "provider",
    "subscriber",
    "payerType",
    "otherPayer",
    "claimUHCTotals",
    "claimNotes",
    "serviceLine"
})
public class InstitutionalClaimType {

    protected CodeDescPairType claimType;
    protected CodeDescPairType claimSubmissionType;
    protected String claimFirstDateofService;
    protected String claimLastDateofService;
    protected String claimFLNNumber;
    protected String sourceClaimId;
    protected String claimId;
    @XmlElement(nillable = true)
    protected List<String> referenceClaimID;
    protected CodeDescPairType adjudicatedCOBLevel;
    protected CodeDescPairType billTypeCode;
    protected String claimSourceSystemCode;
    protected String claimSplitIndicator;
    protected CodeDescPairType claimStatusCode;
    protected CodeDescPairType claimNetworkIndicator;
    protected CodeDescPairType claimCauseCode;
    @XmlElement(nillable = true)
    protected List<CodeDescPairType> pendReasonCode;
    protected String encounterIndicator;
    @XmlElement(nillable = true)
    protected List<OccurenceCodeType> occurrenceCode;
    @XmlElement(nillable = true)
    protected List<OccurenceCodeType> occurenceSpanCode;
    @XmlElement(nillable = true)
    protected List<CodeDescPairType> conditionCode;
    protected String surgeryDate;
    protected String dischargeDate;
    protected String dischargeTimeHour;
    protected String admitDate;
    protected String admitTimeHour;
    @XmlElement(nillable = true)
    protected List<CodeDescPairType> surgicalProcedure;
    protected String timelyFilingLimitDays;
    protected String claimReceiptDate;
    protected ClaimEventType claimEvent;
    @XmlElement(nillable = true)
    protected List<MnemonicType> cesMnemonic;
    protected ClaimAdjustmentType carcAdjustments;
    @XmlElement(nillable = true)
    protected List<RemarkType> claimRemarks;
    @XmlElement(nillable = true)
    protected List<DiagnosisCodeType> diagnosisCode;
    protected CodeDescPairType drgNumber;
    protected IndividualType patient;
    protected String patientAccountNumber;
    protected String privacyIndicator;
    @XmlElement(nillable = true)
    protected List<ProviderResponseType> provider;
    protected SubscriberType subscriber;
    protected String payerType;
    @XmlElement(nillable = true)
    protected List<OtherPayerType> otherPayer;
    protected UHCTotalsType claimUHCTotals;
    @XmlElement(nillable = true)
    protected List<NotesType> claimNotes;
    @XmlElement(nillable = true)
    protected List<ServiceLineType> serviceLine;

    /**
     * Gets the value of the claimType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getClaimType() {
        return claimType;
    }

    /**
     * Sets the value of the claimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setClaimType(CodeDescPairType value) {
        this.claimType = value;
    }

    /**
     * Gets the value of the claimSubmissionType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getClaimSubmissionType() {
        return claimSubmissionType;
    }

    /**
     * Sets the value of the claimSubmissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setClaimSubmissionType(CodeDescPairType value) {
        this.claimSubmissionType = value;
    }

    /**
     * Gets the value of the claimFirstDateofService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimFirstDateofService() {
        return claimFirstDateofService;
    }

    /**
     * Sets the value of the claimFirstDateofService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimFirstDateofService(String value) {
        this.claimFirstDateofService = value;
    }

    /**
     * Gets the value of the claimLastDateofService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimLastDateofService() {
        return claimLastDateofService;
    }

    /**
     * Sets the value of the claimLastDateofService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimLastDateofService(String value) {
        this.claimLastDateofService = value;
    }

    /**
     * Gets the value of the claimFLNNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimFLNNumber() {
        return claimFLNNumber;
    }

    /**
     * Sets the value of the claimFLNNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimFLNNumber(String value) {
        this.claimFLNNumber = value;
    }

    /**
     * Gets the value of the sourceClaimId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceClaimId() {
        return sourceClaimId;
    }

    /**
     * Sets the value of the sourceClaimId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceClaimId(String value) {
        this.sourceClaimId = value;
    }

    /**
     * Gets the value of the claimId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimId() {
        return claimId;
    }

    /**
     * Sets the value of the claimId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimId(String value) {
        this.claimId = value;
    }

    /**
     * Gets the value of the referenceClaimID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceClaimID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceClaimID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReferenceClaimID() {
        if (referenceClaimID == null) {
            referenceClaimID = new ArrayList<String>();
        }
        return this.referenceClaimID;
    }

    /**
     * Gets the value of the adjudicatedCOBLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getAdjudicatedCOBLevel() {
        return adjudicatedCOBLevel;
    }

    /**
     * Sets the value of the adjudicatedCOBLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setAdjudicatedCOBLevel(CodeDescPairType value) {
        this.adjudicatedCOBLevel = value;
    }

    /**
     * Gets the value of the billTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getBillTypeCode() {
        return billTypeCode;
    }

    /**
     * Sets the value of the billTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setBillTypeCode(CodeDescPairType value) {
        this.billTypeCode = value;
    }

    /**
     * Gets the value of the claimSourceSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimSourceSystemCode() {
        return claimSourceSystemCode;
    }

    /**
     * Sets the value of the claimSourceSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimSourceSystemCode(String value) {
        this.claimSourceSystemCode = value;
    }

    /**
     * Gets the value of the claimSplitIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimSplitIndicator() {
        return claimSplitIndicator;
    }

    /**
     * Sets the value of the claimSplitIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimSplitIndicator(String value) {
        this.claimSplitIndicator = value;
    }

    /**
     * Gets the value of the claimStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getClaimStatusCode() {
        return claimStatusCode;
    }

    /**
     * Sets the value of the claimStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setClaimStatusCode(CodeDescPairType value) {
        this.claimStatusCode = value;
    }

    /**
     * Gets the value of the claimNetworkIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getClaimNetworkIndicator() {
        return claimNetworkIndicator;
    }

    /**
     * Sets the value of the claimNetworkIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setClaimNetworkIndicator(CodeDescPairType value) {
        this.claimNetworkIndicator = value;
    }

    /**
     * Gets the value of the claimCauseCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getClaimCauseCode() {
        return claimCauseCode;
    }

    /**
     * Sets the value of the claimCauseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setClaimCauseCode(CodeDescPairType value) {
        this.claimCauseCode = value;
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
     * {@link CodeDescPairType }
     * 
     * 
     */
    public List<CodeDescPairType> getPendReasonCode() {
        if (pendReasonCode == null) {
            pendReasonCode = new ArrayList<CodeDescPairType>();
        }
        return this.pendReasonCode;
    }

    /**
     * Gets the value of the encounterIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncounterIndicator() {
        return encounterIndicator;
    }

    /**
     * Sets the value of the encounterIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncounterIndicator(String value) {
        this.encounterIndicator = value;
    }

    /**
     * Gets the value of the occurrenceCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occurrenceCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccurrenceCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OccurenceCodeType }
     * 
     * 
     */
    public List<OccurenceCodeType> getOccurrenceCode() {
        if (occurrenceCode == null) {
            occurrenceCode = new ArrayList<OccurenceCodeType>();
        }
        return this.occurrenceCode;
    }

    /**
     * Gets the value of the occurenceSpanCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occurenceSpanCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccurenceSpanCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OccurenceCodeType }
     * 
     * 
     */
    public List<OccurenceCodeType> getOccurenceSpanCode() {
        if (occurenceSpanCode == null) {
            occurenceSpanCode = new ArrayList<OccurenceCodeType>();
        }
        return this.occurenceSpanCode;
    }

    /**
     * Gets the value of the conditionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeDescPairType }
     * 
     * 
     */
    public List<CodeDescPairType> getConditionCode() {
        if (conditionCode == null) {
            conditionCode = new ArrayList<CodeDescPairType>();
        }
        return this.conditionCode;
    }

    /**
     * Gets the value of the surgeryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurgeryDate() {
        return surgeryDate;
    }

    /**
     * Sets the value of the surgeryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurgeryDate(String value) {
        this.surgeryDate = value;
    }

    /**
     * Gets the value of the dischargeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDischargeDate() {
        return dischargeDate;
    }

    /**
     * Sets the value of the dischargeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDischargeDate(String value) {
        this.dischargeDate = value;
    }

    /**
     * Gets the value of the dischargeTimeHour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDischargeTimeHour() {
        return dischargeTimeHour;
    }

    /**
     * Sets the value of the dischargeTimeHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDischargeTimeHour(String value) {
        this.dischargeTimeHour = value;
    }

    /**
     * Gets the value of the admitDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmitDate() {
        return admitDate;
    }

    /**
     * Sets the value of the admitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmitDate(String value) {
        this.admitDate = value;
    }

    /**
     * Gets the value of the admitTimeHour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmitTimeHour() {
        return admitTimeHour;
    }

    /**
     * Sets the value of the admitTimeHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmitTimeHour(String value) {
        this.admitTimeHour = value;
    }

    /**
     * Gets the value of the surgicalProcedure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surgicalProcedure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurgicalProcedure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeDescPairType }
     * 
     * 
     */
    public List<CodeDescPairType> getSurgicalProcedure() {
        if (surgicalProcedure == null) {
            surgicalProcedure = new ArrayList<CodeDescPairType>();
        }
        return this.surgicalProcedure;
    }

    /**
     * Gets the value of the timelyFilingLimitDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimelyFilingLimitDays() {
        return timelyFilingLimitDays;
    }

    /**
     * Sets the value of the timelyFilingLimitDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimelyFilingLimitDays(String value) {
        this.timelyFilingLimitDays = value;
    }

    /**
     * Gets the value of the claimReceiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimReceiptDate() {
        return claimReceiptDate;
    }

    /**
     * Sets the value of the claimReceiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimReceiptDate(String value) {
        this.claimReceiptDate = value;
    }

    /**
     * Gets the value of the claimEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimEventType }
     *     
     */
    public ClaimEventType getClaimEvent() {
        return claimEvent;
    }

    /**
     * Sets the value of the claimEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimEventType }
     *     
     */
    public void setClaimEvent(ClaimEventType value) {
        this.claimEvent = value;
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
     * Gets the value of the claimRemarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimRemarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkType }
     * 
     * 
     */
    public List<RemarkType> getClaimRemarks() {
        if (claimRemarks == null) {
            claimRemarks = new ArrayList<RemarkType>();
        }
        return this.claimRemarks;
    }

    /**
     * Gets the value of the diagnosisCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnosisCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosisCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosisCodeType }
     * 
     * 
     */
    public List<DiagnosisCodeType> getDiagnosisCode() {
        if (diagnosisCode == null) {
            diagnosisCode = new ArrayList<DiagnosisCodeType>();
        }
        return this.diagnosisCode;
    }

    /**
     * Gets the value of the drgNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getDrgNumber() {
        return drgNumber;
    }

    /**
     * Sets the value of the drgNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setDrgNumber(CodeDescPairType value) {
        this.drgNumber = value;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualType }
     *     
     */
    public IndividualType getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualType }
     *     
     */
    public void setPatient(IndividualType value) {
        this.patient = value;
    }

    /**
     * Gets the value of the patientAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientAccountNumber() {
        return patientAccountNumber;
    }

    /**
     * Sets the value of the patientAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientAccountNumber(String value) {
        this.patientAccountNumber = value;
    }

    /**
     * Gets the value of the privacyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivacyIndicator() {
        return privacyIndicator;
    }

    /**
     * Sets the value of the privacyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivacyIndicator(String value) {
        this.privacyIndicator = value;
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
     * Gets the value of the subscriber property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberType }
     *     
     */
    public SubscriberType getSubscriber() {
        return subscriber;
    }

    /**
     * Sets the value of the subscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberType }
     *     
     */
    public void setSubscriber(SubscriberType value) {
        this.subscriber = value;
    }

    /**
     * Gets the value of the payerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerType() {
        return payerType;
    }

    /**
     * Sets the value of the payerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerType(String value) {
        this.payerType = value;
    }

    /**
     * Gets the value of the otherPayer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPayer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherPayerType }
     * 
     * 
     */
    public List<OtherPayerType> getOtherPayer() {
        if (otherPayer == null) {
            otherPayer = new ArrayList<OtherPayerType>();
        }
        return this.otherPayer;
    }

    /**
     * Gets the value of the claimUHCTotals property.
     * 
     * @return
     *     possible object is
     *     {@link UHCTotalsType }
     *     
     */
    public UHCTotalsType getClaimUHCTotals() {
        return claimUHCTotals;
    }

    /**
     * Sets the value of the claimUHCTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link UHCTotalsType }
     *     
     */
    public void setClaimUHCTotals(UHCTotalsType value) {
        this.claimUHCTotals = value;
    }

    /**
     * Gets the value of the claimNotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimNotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotesType }
     * 
     * 
     */
    public List<NotesType> getClaimNotes() {
        if (claimNotes == null) {
            claimNotes = new ArrayList<NotesType>();
        }
        return this.claimNotes;
    }

    /**
     * Gets the value of the serviceLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLineType }
     * 
     * 
     */
    public List<ServiceLineType> getServiceLine() {
        if (serviceLine == null) {
            serviceLine = new ArrayList<ServiceLineType>();
        }
        return this.serviceLine;
    }

}
