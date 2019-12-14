
package com.uhc.optum.claims.institutionalclaimhistory.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BenefitPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BenefitPlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="benefitPlanID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefitBundleOptionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefitCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="planCoinsurancePercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberCoinsurancePercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenefitPlanType", propOrder = {
    "benefitPlanID",
    "benefitBundleOptionID",
    "benefitCode",
    "planCoinsurancePercent",
    "memberCoinsurancePercent"
})
public class BenefitPlanType {

    protected String benefitPlanID;
    protected String benefitBundleOptionID;
    protected CodeDescPairType benefitCode;
    protected String planCoinsurancePercent;
    protected String memberCoinsurancePercent;

    /**
     * Gets the value of the benefitPlanID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitPlanID() {
        return benefitPlanID;
    }

    /**
     * Sets the value of the benefitPlanID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitPlanID(String value) {
        this.benefitPlanID = value;
    }

    /**
     * Gets the value of the benefitBundleOptionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitBundleOptionID() {
        return benefitBundleOptionID;
    }

    /**
     * Sets the value of the benefitBundleOptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitBundleOptionID(String value) {
        this.benefitBundleOptionID = value;
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
     * Gets the value of the planCoinsurancePercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanCoinsurancePercent() {
        return planCoinsurancePercent;
    }

    /**
     * Sets the value of the planCoinsurancePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanCoinsurancePercent(String value) {
        this.planCoinsurancePercent = value;
    }

    /**
     * Gets the value of the memberCoinsurancePercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberCoinsurancePercent() {
        return memberCoinsurancePercent;
    }

    /**
     * Sets the value of the memberCoinsurancePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberCoinsurancePercent(String value) {
        this.memberCoinsurancePercent = value;
    }

}
