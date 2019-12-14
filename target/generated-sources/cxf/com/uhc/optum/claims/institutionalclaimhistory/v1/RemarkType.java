
package com.uhc.optum.claims.institutionalclaimhistory.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemarkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemarkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="remarkCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="remarkCodeRecipientType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarkCodeMemberDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarkCodeProviderDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarkCodeMemberProviderDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemarkType", propOrder = {
    "remarkCode",
    "remarkCodeRecipientType",
    "remarkCodeMemberDesc",
    "remarkCodeProviderDesc",
    "remarkCodeMemberProviderDesc"
})
public class RemarkType {

    protected CodeDescPairType remarkCode;
    protected String remarkCodeRecipientType;
    protected String remarkCodeMemberDesc;
    protected String remarkCodeProviderDesc;
    protected String remarkCodeMemberProviderDesc;

    /**
     * Gets the value of the remarkCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getRemarkCode() {
        return remarkCode;
    }

    /**
     * Sets the value of the remarkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setRemarkCode(CodeDescPairType value) {
        this.remarkCode = value;
    }

    /**
     * Gets the value of the remarkCodeRecipientType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkCodeRecipientType() {
        return remarkCodeRecipientType;
    }

    /**
     * Sets the value of the remarkCodeRecipientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkCodeRecipientType(String value) {
        this.remarkCodeRecipientType = value;
    }

    /**
     * Gets the value of the remarkCodeMemberDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkCodeMemberDesc() {
        return remarkCodeMemberDesc;
    }

    /**
     * Sets the value of the remarkCodeMemberDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkCodeMemberDesc(String value) {
        this.remarkCodeMemberDesc = value;
    }

    /**
     * Gets the value of the remarkCodeProviderDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkCodeProviderDesc() {
        return remarkCodeProviderDesc;
    }

    /**
     * Sets the value of the remarkCodeProviderDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkCodeProviderDesc(String value) {
        this.remarkCodeProviderDesc = value;
    }

    /**
     * Gets the value of the remarkCodeMemberProviderDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkCodeMemberProviderDesc() {
        return remarkCodeMemberProviderDesc;
    }

    /**
     * Sets the value of the remarkCodeMemberProviderDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkCodeMemberProviderDesc(String value) {
        this.remarkCodeMemberProviderDesc = value;
    }

}
