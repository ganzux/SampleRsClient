
package com.uhc.optum.claims.institutionalclaimhistory.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimAdjustmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimAdjustmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adjustments" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CARCType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="adjustmentTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimAdjustmentType", propOrder = {
    "adjustments",
    "adjustmentTotal"
})
public class ClaimAdjustmentType {

    @XmlElement(nillable = true)
    protected List<CARCType> adjustments;
    protected String adjustmentTotal;

    /**
     * Gets the value of the adjustments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CARCType }
     * 
     * 
     */
    public List<CARCType> getAdjustments() {
        if (adjustments == null) {
            adjustments = new ArrayList<CARCType>();
        }
        return this.adjustments;
    }

    /**
     * Gets the value of the adjustmentTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentTotal() {
        return adjustmentTotal;
    }

    /**
     * Sets the value of the adjustmentTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentTotal(String value) {
        this.adjustmentTotal = value;
    }

}
