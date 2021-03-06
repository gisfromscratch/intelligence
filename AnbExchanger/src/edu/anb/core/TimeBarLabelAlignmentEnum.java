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
 * <p>Java class for TimeBarLabelAlignmentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeBarLabelAlignmentEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TimeBarAlignCentre"/>
 *     &lt;enumeration value="TimeBarAlignLeft"/>
 *     &lt;enumeration value="TimeBarAlignRight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeBarLabelAlignmentEnum")
@XmlEnum
public enum TimeBarLabelAlignmentEnum {


    /**
     * The labels are centered.
     * 
     */
    @XmlEnumValue("TimeBarAlignCentre")
    TIME_BAR_ALIGN_CENTRE("TimeBarAlignCentre"),

    /**
     * The labels are aligned at the left.
     * 
     */
    @XmlEnumValue("TimeBarAlignLeft")
    TIME_BAR_ALIGN_LEFT("TimeBarAlignLeft"),

    /**
     * The labels are aligned at the right.
     * 
     */
    @XmlEnumValue("TimeBarAlignRight")
    TIME_BAR_ALIGN_RIGHT("TimeBarAlignRight");
    private final java.lang.String value;

    TimeBarLabelAlignmentEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TimeBarLabelAlignmentEnum fromValue(java.lang.String v) {
        for (TimeBarLabelAlignmentEnum c: TimeBarLabelAlignmentEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
