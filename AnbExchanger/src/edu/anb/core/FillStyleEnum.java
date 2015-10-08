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
 * <p>Java class for FillStyleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FillStyleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Transparent"/>
 *     &lt;enumeration value="Gradient"/>
 *     &lt;enumeration value="Solid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FillStyleEnum")
@XmlEnum
public enum FillStyleEnum {


    /**
     * The item is to be see-through.
     * 
     */
    @XmlEnumValue("Transparent")
    TRANSPARENT("Transparent"),

    /**
     * The item contains a colour-based gradient.
     * 
     */
    @XmlEnumValue("Gradient")
    GRADIENT("Gradient"),

    /**
     * The item is a solid colour.
     * 
     */
    @XmlEnumValue("Solid")
    SOLID("Solid");
    private final java.lang.String value;

    FillStyleEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FillStyleEnum fromValue(java.lang.String v) {
        for (FillStyleEnum c: FillStyleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}