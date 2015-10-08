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
 * <p>Java class for PropertyBagDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PropertyBagDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Boolean"/>
 *     &lt;enumeration value="DateTime"/>
 *     &lt;enumeration value="Decimal"/>
 *     &lt;enumeration value="Double"/>
 *     &lt;enumeration value="Integer"/>
 *     &lt;enumeration value="String"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PropertyBagDataType")
@XmlEnum
public enum PropertyBagDataType {


    /**
     * Boolean value
     * 
     */
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),

    /**
     * DateTime value
     * 
     */
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),

    /**
     * Decimal number
     * 
     */
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal"),

    /**
     * Floating point precision number
     * 
     */
    @XmlEnumValue("Double")
    DOUBLE("Double"),

    /**
     * Integer value
     * 
     */
    @XmlEnumValue("Integer")
    INTEGER("Integer"),

    /**
     * String value
     * 
     */
    @XmlEnumValue("String")
    STRING("String");
    private final java.lang.String value;

    PropertyBagDataType(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PropertyBagDataType fromValue(java.lang.String v) {
        for (PropertyBagDataType c: PropertyBagDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
