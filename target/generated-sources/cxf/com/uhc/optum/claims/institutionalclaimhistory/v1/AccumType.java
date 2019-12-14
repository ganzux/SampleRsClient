
package com.uhc.optum.claims.institutionalclaimhistory.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccumType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccumType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tierTypeCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="coverageLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costShareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimAccumAppliedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accumSnapShotAppliedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccumType", propOrder = {
    "tierTypeCode",
    "coverageLevel",
    "costShareType",
    "claimAccumAppliedAmount",
    "accumSnapShotAppliedAmount"
})
public class AccumType {

    protected CodeDescPairType tierTypeCode;
    protected String coverageLevel;
    protected String costShareType;
    protected String claimAccumAppliedAmount;
    protected String accumSnapShotAppliedAmount;

    /**
     * Gets the value of the tierTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getTierTypeCode() {
        return tierTypeCode;
    }

    /**
     * Sets the value of the tierTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setTierTypeCode(CodeDescPairType value) {
        this.tierTypeCode = value;
    }

    /**
     * Gets the value of the coverageLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageLevel() {
        return coverageLevel;
    }

    /**
     * Sets the value of the coverageLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageLevel(String value) {
        this.coverageLevel = value;
    }

    /**
     * Gets the value of the costShareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostShareType() {
        return costShareType;
    }

    /**
     * Sets the value of the costShareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostShareType(String value) {
        this.costShareType = value;
    }

    /**
     * Gets the value of the claimAccumAppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimAccumAppliedAmount() {
        return claimAccumAppliedAmount;
    }

    /**
     * Sets the value of the claimAccumAppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimAccumAppliedAmount(String value) {
        this.claimAccumAppliedAmount = value;
    }

    /**
     * Gets the value of the accumSnapShotAppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccumSnapShotAppliedAmount() {
        return accumSnapShotAppliedAmount;
    }

    /**
     * Sets the value of the accumSnapShotAppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccumSnapShotAppliedAmount(String value) {
        this.accumSnapShotAppliedAmount = value;
    }

}
