
package com.uhc.optum.claims.institutionalclaimhistory.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.optum.apiengine.Result;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://apiengine.optum.com}result">
 *       &lt;sequence>
 *         &lt;element name="institutionalClaim" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}InstitutionalClaimType" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="pagination" type="{http://optum.uhc.com/claims/institutionalclaimhistory/v1.0}ResponsePaginationType" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "institutionalClaim",
    "pagination"
})
@XmlRootElement(name = "institutionalClaimHistoryResponse")
public class InstitutionalClaimHistoryResponse
    extends Result
{

    @XmlElement(namespace = "", nillable = true)
    protected List<InstitutionalClaimType> institutionalClaim;
    @XmlElement(namespace = "")
    protected ResponsePaginationType pagination;

    /**
     * Gets the value of the institutionalClaim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the institutionalClaim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstitutionalClaim().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstitutionalClaimType }
     * 
     * 
     */
    public List<InstitutionalClaimType> getInstitutionalClaim() {
        if (institutionalClaim == null) {
            institutionalClaim = new ArrayList<InstitutionalClaimType>();
        }
        return this.institutionalClaim;
    }

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePaginationType }
     *     
     */
    public ResponsePaginationType getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePaginationType }
     *     
     */
    public void setPagination(ResponsePaginationType value) {
        this.pagination = value;
    }

}
