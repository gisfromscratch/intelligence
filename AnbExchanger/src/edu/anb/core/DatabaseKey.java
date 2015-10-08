//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.08 at 09:29:27 PM CEST 
//


package edu.anb.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Key" maxOccurs="unbounded"/>
 *         &lt;element ref="{}DatabasePropertyCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DatabaseObject" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute ref="{}DatabaseObjectProxyReference"/>
 *       &lt;attribute name="DatabaseProxyClassID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DatabaseProxyInstanceName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute ref="{}DatabaseProxyReference"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "key",
    "databasePropertyCollection"
})
@XmlRootElement(name = "DatabaseKey")
public class DatabaseKey {

    @XmlElement(name = "Key", required = true)
    protected List<Key> key;
    @XmlElement(name = "DatabasePropertyCollection")
    protected DatabasePropertyCollection databasePropertyCollection;
    @XmlAttribute(name = "DatabaseObject")
    protected java.lang.String databaseObject;
    @XmlAttribute(name = "DatabaseObjectProxyReference")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object databaseObjectProxyReference;
    @XmlAttribute(name = "DatabaseProxyClassID")
    protected java.lang.String databaseProxyClassID;
    @XmlAttribute(name = "DatabaseProxyInstanceName")
    protected java.lang.String databaseProxyInstanceName;
    @XmlAttribute(name = "DatabaseProxyReference")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object databaseProxyReference;

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Key }
     * 
     * 
     */
    public List<Key> getKey() {
        if (key == null) {
            key = new ArrayList<Key>();
        }
        return this.key;
    }

    /**
     * Gets the value of the databasePropertyCollection property.
     * 
     * @return
     *     possible object is
     *     {@link DatabasePropertyCollection }
     *     
     */
    public DatabasePropertyCollection getDatabasePropertyCollection() {
        return databasePropertyCollection;
    }

    /**
     * Sets the value of the databasePropertyCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabasePropertyCollection }
     *     
     */
    public void setDatabasePropertyCollection(DatabasePropertyCollection value) {
        this.databasePropertyCollection = value;
    }

    /**
     * Gets the value of the databaseObject property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDatabaseObject() {
        return databaseObject;
    }

    /**
     * Sets the value of the databaseObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDatabaseObject(java.lang.String value) {
        this.databaseObject = value;
    }

    /**
     * Proxy object IDREF for an entity object or a link object.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDatabaseObjectProxyReference() {
        return databaseObjectProxyReference;
    }

    /**
     * Sets the value of the databaseObjectProxyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDatabaseObjectProxyReference(Object value) {
        this.databaseObjectProxyReference = value;
    }

    /**
     * Gets the value of the databaseProxyClassID property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDatabaseProxyClassID() {
        return databaseProxyClassID;
    }

    /**
     * Sets the value of the databaseProxyClassID property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDatabaseProxyClassID(java.lang.String value) {
        this.databaseProxyClassID = value;
    }

    /**
     * Gets the value of the databaseProxyInstanceName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDatabaseProxyInstanceName() {
        return databaseProxyInstanceName;
    }

    /**
     * Sets the value of the databaseProxyInstanceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDatabaseProxyInstanceName(java.lang.String value) {
        this.databaseProxyInstanceName = value;
    }

    /**
     * Database proxy IDREF to which this database key belongs.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDatabaseProxyReference() {
        return databaseProxyReference;
    }

    /**
     * Sets the value of the databaseProxyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDatabaseProxyReference(Object value) {
        this.databaseProxyReference = value;
    }

}