
package com.uhc.optum.claims.institutionalclaimhistory.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosisCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosisCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="levelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimPresentOnAdmissionsIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="admittingDiagnosisIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosisCodeType", propOrder = {
    "code",
    "levelType",
    "sequenceNumber",
    "claimPresentOnAdmissionsIndicator",
    "admittingDiagnosisIndicator"
})
public class DiagnosisCodeType {

    protected CodeDescPairType code;
    protected String levelType;
    protected String sequenceNumber;
    protected String claimPresentOnAdmissionsIndicator;
    protected String admittingDiagnosisIndicator;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setCode(CodeDescPairType value) {
        this.code = value;
    }

    /**
     * Gets the value of the levelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelType() {
        return levelType;
    }

    /**
     * Sets the value of the levelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelType(String value) {
        this.levelType = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the claimPresentOnAdmissionsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimPresentOnAdmissionsIndicator() {
        return claimPresentOnAdmissionsIndicator;
    }

    /**
     * Sets the value of the claimPresentOnAdmissionsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimPresentOnAdmissionsIndicator(String value) {
        this.claimPresentOnAdmissionsIndicator = value;
    }

    /**
     * Gets the value of the admittingDiagnosisIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmittingDiagnosisIndicator() {
        return admittingDiagnosisIndicator;
    }

    /**
     * Sets the value of the admittingDiagnosisIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmittingDiagnosisIndicator(String value) {
        this.admittingDiagnosisIndicator = value;
    }

}
