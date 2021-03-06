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
 * <p>Java class for DotStyleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DotStyleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DotStyleAny"/>
 *     &lt;enumeration value="DotStyleDashDot"/>
 *     &lt;enumeration value="DotStyleDashDotDot"/>
 *     &lt;enumeration value="DotStyleDashed"/>
 *     &lt;enumeration value="DotStyleDotted"/>
 *     &lt;enumeration value="DotStyleSolid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DotStyleEnum")
@XmlEnum
public enum DotStyleEnum {


    /**
     * DotStyle not specified. A run-time error is raised if you set a strength to this enumeration value.
     * 
     */
    @XmlEnumValue("DotStyleAny")
    DOT_STYLE_ANY("DotStyleAny"),

    /**
     * Dash-dot line.
     * 
     */
    @XmlEnumValue("DotStyleDashDot")
    DOT_STYLE_DASH_DOT("DotStyleDashDot"),

    /**
     * Dash-dot-dot line.
     * 
     */
    @XmlEnumValue("DotStyleDashDotDot")
    DOT_STYLE_DASH_DOT_DOT("DotStyleDashDotDot"),

    /**
     * Dashed line.
     * 
     */
    @XmlEnumValue("DotStyleDashed")
    DOT_STYLE_DASHED("DotStyleDashed"),

    /**
     * Dotted line.
     * 
     */
    @XmlEnumValue("DotStyleDotted")
    DOT_STYLE_DOTTED("DotStyleDotted"),

    /**
     * Solid line.
     * 
     */
    @XmlEnumValue("DotStyleSolid")
    DOT_STYLE_SOLID("DotStyleSolid");
    private final java.lang.String value;

    DotStyleEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DotStyleEnum fromValue(java.lang.String v) {
        for (DotStyleEnum c: DotStyleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
