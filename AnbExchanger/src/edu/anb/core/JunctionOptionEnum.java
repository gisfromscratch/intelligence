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
 * <p>Java class for JunctionOptionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JunctionOptionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="StyleCustom"/>
 *     &lt;enumeration value="StyleFromPrevious"/>
 *     &lt;enumeration value="StyleFromTheme"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JunctionOptionEnum")
@XmlEnum
public enum JunctionOptionEnum {


    /**
     * Use the style setting on this junction.
     * 
     */
    @XmlEnumValue("StyleCustom")
    STYLE_CUSTOM("StyleCustom"),

    /**
     * Use the style setting from the previous junction.
     * 
     */
    @XmlEnumValue("StyleFromPrevious")
    STYLE_FROM_PREVIOUS("StyleFromPrevious"),

    /**
     * Use the style setting from the theme line.
     * 
     */
    @XmlEnumValue("StyleFromTheme")
    STYLE_FROM_THEME("StyleFromTheme");
    private final java.lang.String value;

    JunctionOptionEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static JunctionOptionEnum fromValue(java.lang.String v) {
        for (JunctionOptionEnum c: JunctionOptionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
