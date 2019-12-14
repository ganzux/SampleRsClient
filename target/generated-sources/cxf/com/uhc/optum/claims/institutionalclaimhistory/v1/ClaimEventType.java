
package com.uhc.optum.claims.institutionalclaimhistory.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claimEventAdjudicationDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimEventType" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}CodeDescPairType" minOccurs="0"/>
 *         &lt;element name="claimEventSeqNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimDocument" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}ClaimDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="claimEventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimEventStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimEventStatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimEventStatusDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adjudicatedClaimPaymentRequest" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}AdjudicatedClaimPaymentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimEventType", propOrder = {
    "claimEventAdjudicationDateTime",
    "claimEventType",
    "claimEventSeqNum",
    "claimDocument",
    "claimEventId",
    "claimEventStatus",
    "claimEventStatusDescription",
    "claimEventStatusDate",
    "adjudicatedClaimPaymentRequest"
})
public class ClaimEventType {

    protected String claimEventAdjudicationDateTime;
    protected CodeDescPairType claimEventType;
    protected String claimEventSeqNum;
    @XmlElement(nillable = true)
    protected List<ClaimDocumentType> claimDocument;
    protected String claimEventId;
    protected String claimEventStatus;
    protected String claimEventStatusDescription;
    protected String claimEventStatusDate;
    @XmlElement(nillable = true)
    protected List<AdjudicatedClaimPaymentType> adjudicatedClaimPaymentRequest;

    /**
     * Gets the value of the claimEventAdjudicationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimEventAdjudicationDateTime() {
        return claimEventAdjudicationDateTime;
    }

    /**
     * Sets the value of the claimEventAdjudicationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimEventAdjudicationDateTime(String value) {
        this.claimEventAdjudicationDateTime = value;
    }

    /**
     * Gets the value of the claimEventType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescPairType }
     *     
     */
    public CodeDescPairType getClaimEventType() {
        return claimEventType;
    }

    /**
     * Sets the value of the claimEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescPairType }
     *     
     */
    public void setClaimEventType(CodeDescPairType value) {
        this.claimEventType = value;
    }

    /**
     * Gets the value of the claimEventSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimEventSeqNum() {
        return claimEventSeqNum;
    }

    /**
     * Sets the value of the claimEventSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimEventSeqNum(String value) {
        this.claimEventSeqNum = value;
    }

    /**
     * Gets the value of the claimDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimDocumentType }
     * 
     * 
     */
    public List<ClaimDocumentType> getClaimDocument() {
        if (claimDocument == null) {
            claimDocument = new ArrayList<ClaimDocumentType>();
        }
        return this.claimDocument;
    }

    /**
     * Gets the value of the claimEventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimEventId() {
        return claimEventId;
    }

    /**
     * Sets the value of the claimEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimEventId(String value) {
        this.claimEventId = value;
    }

    /**
     * Gets the value of the claimEventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimEventStatus() {
        return claimEventStatus;
    }

    /**
     * Sets the value of the claimEventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimEventStatus(String value) {
        this.claimEventStatus = value;
    }

    /**
     * Gets the value of the claimEventStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimEventStatusDescription() {
        return claimEventStatusDescription;
    }

    /**
     * Sets the value of the claimEventStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimEventStatusDescription(String value) {
        this.claimEventStatusDescription = value;
    }

    /**
     * Gets the value of the claimEventStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimEventStatusDate() {
        return claimEventStatusDate;
    }

    /**
     * Sets the value of the claimEventStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimEventStatusDate(String value) {
        this.claimEventStatusDate = value;
    }

    /**
     * Gets the value of the adjudicatedClaimPaymentRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjudicatedClaimPaymentRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjudicatedClaimPaymentRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdjudicatedClaimPaymentType }
     * 
     * 
     */
    public List<AdjudicatedClaimPaymentType> getAdjudicatedClaimPaymentRequest() {
        if (adjudicatedClaimPaymentRequest == null) {
            adjudicatedClaimPaymentRequest = new ArrayList<AdjudicatedClaimPaymentType>();
        }
        return this.adjudicatedClaimPaymentRequest;
    }

}
