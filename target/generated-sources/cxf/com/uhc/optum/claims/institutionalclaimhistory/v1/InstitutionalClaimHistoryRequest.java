
package com.uhc.optum.claims.institutionalclaimhistory.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claimType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="claimId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="claimEventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="pagination" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}RequestPaginationType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="sortType" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}RequestSortingType" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "claimType",
    "claimId",
    "claimEventId",
    "pagination",
    "sortType"
})
@XmlRootElement(name = "institutionalClaimHistoryRequest")
public class InstitutionalClaimHistoryRequest {

    @XmlElement(namespace = "")
    protected String claimType;
    @XmlElement(namespace = "")
    protected String claimId;
    @XmlElement(namespace = "")
    protected String claimEventId;
    @XmlElement(namespace = "")
    protected RequestPaginationType pagination;
    @XmlElement(namespace = "")
    protected RequestSortingType sortType;

    /**
     * Gets the value of the claimType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimType() {
        return claimType;
    }

    /**
     * Sets the value of the claimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimType(String value) {
        this.claimType = value;
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
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link RequestPaginationType }
     *     
     */
    public RequestPaginationType getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestPaginationType }
     *     
     */
    public void setPagination(RequestPaginationType value) {
        this.pagination = value;
    }

    /**
     * Gets the value of the sortType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestSortingType }
     *     
     */
    public RequestSortingType getSortType() {
        return sortType;
    }

    /**
     * Sets the value of the sortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestSortingType }
     *     
     */
    public void setSortType(RequestSortingType value) {
        this.sortType = value;
    }

}
