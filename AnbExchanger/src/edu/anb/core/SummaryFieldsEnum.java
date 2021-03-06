//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.08 at 09:29:27 PM CEST 
//


package edu.anb.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummaryFieldsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SummaryFieldsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SummaryFieldApplication"/>
 *     &lt;enumeration value="SummaryFieldAuthor"/>
 *     &lt;enumeration value="SummaryFieldCategory"/>
 *     &lt;enumeration value="SummaryFieldComments"/>
 *     &lt;enumeration value="SummaryFieldKeywords"/>
 *     &lt;enumeration value="SummaryFieldSubject"/>
 *     &lt;enumeration value="SummaryFieldTemplate"/>
 *     &lt;enumeration value="SummaryFieldTitle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SummaryFieldsEnum")
@XmlEnum
public enum SummaryFieldsEnum {


    /**
     * Name of the application that created the document.
     * 
     */
    @XmlEnumValue("SummaryFieldApplication")
    SUMMARY_FIELD_APPLICATION("SummaryFieldApplication"),

    /**
     * Document author.
     * 
     */
    @XmlEnumValue("SummaryFieldAuthor")
    SUMMARY_FIELD_AUTHOR("SummaryFieldAuthor"),

    /**
     * Term or description used to categorize the document.
     * 
     */
    @XmlEnumValue("SummaryFieldCategory")
    SUMMARY_FIELD_CATEGORY("SummaryFieldCategory"),

    /**
     * Additional comments or description of the document.
     * 
     */
    @XmlEnumValue("SummaryFieldComments")
    SUMMARY_FIELD_COMMENTS("SummaryFieldComments"),

    /**
     * Keywords that describe the content of the document.
     * 
     */
    @XmlEnumValue("SummaryFieldKeywords")
    SUMMARY_FIELD_KEYWORDS("SummaryFieldKeywords"),

    /**
     * Subject of the document.
     * 
     */
    @XmlEnumValue("SummaryFieldSubject")
    SUMMARY_FIELD_SUBJECT("SummaryFieldSubject"),

    /**
     * Template from which the document was created.
     * 
     */
    @XmlEnumValue("SummaryFieldTemplate")
    SUMMARY_FIELD_TEMPLATE("SummaryFieldTemplate"),

    /**
     * Title of the document.
     * 
     */
    @XmlEnumValue("SummaryFieldTitle")
    SUMMARY_FIELD_TITLE("SummaryFieldTitle");
    private final java.lang.String value;

    SummaryFieldsEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SummaryFieldsEnum fromValue(java.lang.String v) {
        for (SummaryFieldsEnum c: SummaryFieldsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
