
package com.optum.apiengine;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusMessageLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusMessageLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INFORMATIONAL"/>
 *     &lt;enumeration value="FAULT"/>
 *     &lt;enumeration value="EXCEPTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusMessageLevel")
@XmlEnum
public enum StatusMessageLevel {

    INFORMATIONAL,
    FAULT,
    EXCEPTION;

    public String value() {
        return name();
    }

    public static StatusMessageLevel fromValue(String v) {
        return valueOf(v);
    }

}
