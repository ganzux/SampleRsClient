
package com.uhc.optum.claims.institutionalclaimhistory.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BenefitClaimAccumType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BenefitClaimAccumType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="benefitPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefitBundleOptionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefitCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="claimAccumulator" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}AccumType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenefitClaimAccumType", propOrder = {
    "benefitPlanId",
    "benefitBundleOptionId",
    "benefitCode",
    "claimAccumulator"
})
public class BenefitClaimAccumType {

    protected String benefitPlanId;
    protected String benefitBundleOptionId;
    protected CodeDescPairType benefitCode;
    protected AccumType claimAccumulator;

    /**
     * Gets the value of the benefitPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitPlanId() {
        return benefitPlanId;
    }

    /**
     * Sets the value of the benefitPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitPlanId(String value) {
        this.benefitPlanId = value;
    }

    /**
     * Gets the value of the benefitBundleOptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitBundleOptionId() {
        return benefitBundleOptionId;
    }

    /**
     * Sets the value of the benefitBundleOptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitBundleOptionId(String value) {
        this.benefitBundleOptionId = value;
    }

    /**
     * Gets the value of the benefitCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getBenefitCode() {
        return benefitCode;
    }

    /**
     * Sets the value of the benefitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setBenefitCode(CodeDescPairType value) {
        this.benefitCode = value;
    }

    /**
     * Gets the value of the claimAccumulator property.
     * 
     * @return
     *     possible object is
     *     {@link AccumType }
     *     
     */
    public AccumType getClaimAccumulator() {
        return claimAccumulator;
    }

    /**
     * Sets the value of the claimAccumulator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccumType }
     *     
     */
    public void setClaimAccumulator(AccumType value) {
        this.claimAccumulator = value;
    }

}
