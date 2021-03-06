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
 * <p>Java class for MultipleLinkStyleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MultipleLinkStyleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MultiplicityDirected"/>
 *     &lt;enumeration value="MultiplicityMultiple"/>
 *     &lt;enumeration value="MultiplicitySingle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MultipleLinkStyleEnum")
@XmlEnum
public enum MultipleLinkStyleEnum {


    /**
     * Multiple links in the same direction will be merged.
     * 
     */
    @XmlEnumValue("MultiplicityDirected")
    MULTIPLICITY_DIRECTED("MultiplicityDirected"),

    /**
     * Multiple links will not be merged.
     * 
     */
    @XmlEnumValue("MultiplicityMultiple")
    MULTIPLICITY_MULTIPLE("MultiplicityMultiple"),

    /**
     * Multiple links will be merged into one, regardless of their direction.
     * 
     */
    @XmlEnumValue("MultiplicitySingle")
    MULTIPLICITY_SINGLE("MultiplicitySingle");
    private final java.lang.String value;

    MultipleLinkStyleEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static MultipleLinkStyleEnum fromValue(java.lang.String v) {
        for (MultipleLinkStyleEnum c: MultipleLinkStyleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
