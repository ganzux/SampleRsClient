
package com.uhc.optum.claims.institutionalclaimhistory.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="noteTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noteTypeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notesCreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notesCreatedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotesType", propOrder = {
    "noteTypeCode",
    "noteTypeText",
    "notesCreatedBy",
    "notesCreatedDate"
})
public class NotesType {

    protected String noteTypeCode;
    protected String noteTypeText;
    protected String notesCreatedBy;
    protected String notesCreatedDate;

    /**
     * Gets the value of the noteTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteTypeCode() {
        return noteTypeCode;
    }

    /**
     * Sets the value of the noteTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteTypeCode(String value) {
        this.noteTypeCode = value;
    }

    /**
     * Gets the value of the noteTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteTypeText() {
        return noteTypeText;
    }

    /**
     * Sets the value of the noteTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteTypeText(String value) {
        this.noteTypeText = value;
    }

    /**
     * Gets the value of the notesCreatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotesCreatedBy() {
        return notesCreatedBy;
    }

    /**
     * Sets the value of the notesCreatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotesCreatedBy(String value) {
        this.notesCreatedBy = value;
    }

    /**
     * Gets the value of the notesCreatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotesCreatedDate() {
        return notesCreatedDate;
    }

    /**
     * Sets the value of the notesCreatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotesCreatedDate(String value) {
        this.notesCreatedDate = value;
    }

}
