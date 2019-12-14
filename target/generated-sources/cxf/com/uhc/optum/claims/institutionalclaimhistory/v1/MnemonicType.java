
package com.uhc.optum.claims.institutionalclaimhistory.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MnemonicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MnemonicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cesMnemonicCode" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="cesRemarkCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cesRemarkText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MnemonicType", propOrder = {
    "cesMnemonicCode",
    "cesRemarkCode",
    "cesRemarkText"
})
public class MnemonicType {

    protected CodeDescPairType cesMnemonicCode;
    protected String cesRemarkCode;
    protected String cesRemarkText;

    /**
     * Gets the value of the cesMnemonicCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getCesMnemonicCode() {
        return cesMnemonicCode;
    }

    /**
     * Sets the value of the cesMnemonicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setCesMnemonicCode(CodeDescPairType value) {
        this.cesMnemonicCode = value;
    }

    /**
     * Gets the value of the cesRemarkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCesRemarkCode() {
        return cesRemarkCode;
    }

    /**
     * Sets the value of the cesRemarkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCesRemarkCode(String value) {
        this.cesRemarkCode = value;
    }

    /**
     * Gets the value of the cesRemarkText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCesRemarkText() {
        return cesRemarkText;
    }

    /**
     * Sets the value of the cesRemarkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCesRemarkText(String value) {
        this.cesRemarkText = value;
    }

}
