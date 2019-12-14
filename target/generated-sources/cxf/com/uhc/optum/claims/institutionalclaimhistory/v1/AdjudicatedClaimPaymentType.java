
package com.uhc.optum.claims.institutionalclaimhistory.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjudicatedClaimPaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjudicatedClaimPaymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentTrackingNumberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkSeriesDesignatorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjudicatedClaimPaymentType", propOrder = {
    "paymentTrackingNumberId",
    "checkSeriesDesignatorNumber",
    "paymentDate"
})
public class AdjudicatedClaimPaymentType {

    protected String paymentTrackingNumberId;
    protected String checkSeriesDesignatorNumber;
    protected String paymentDate;

    /**
     * Gets the value of the paymentTrackingNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTrackingNumberId() {
        return paymentTrackingNumberId;
    }

    /**
     * Sets the value of the paymentTrackingNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTrackingNumberId(String value) {
        this.paymentTrackingNumberId = value;
    }

    /**
     * Gets the value of the checkSeriesDesignatorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckSeriesDesignatorNumber() {
        return checkSeriesDesignatorNumber;
    }

    /**
     * Sets the value of the checkSeriesDesignatorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckSeriesDesignatorNumber(String value) {
        this.checkSeriesDesignatorNumber = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDate(String value) {
        this.paymentDate = value;
    }

}
