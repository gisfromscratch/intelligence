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
 * <p>Java class for PictureSizeMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PictureSizeMethodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UseEnlargement"/>
 *     &lt;enumeration value="UseCustomSize"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PictureSizeMethodEnum")
@XmlEnum
public enum PictureSizeMethodEnum {


    /**
     * The picture is resized according to the enlargement setting.
     * 
     */
    @XmlEnumValue("UseEnlargement")
    USE_ENLARGEMENT("UseEnlargement"),

    /**
     * The picture is resized according to the custom size.
     * 
     */
    @XmlEnumValue("UseCustomSize")
    USE_CUSTOM_SIZE("UseCustomSize");
    private final java.lang.String value;

    PictureSizeMethodEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PictureSizeMethodEnum fromValue(java.lang.String v) {
        for (PictureSizeMethodEnum c: PictureSizeMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}