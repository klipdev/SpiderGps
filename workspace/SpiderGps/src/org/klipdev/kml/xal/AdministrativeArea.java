//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.08 à 11:14:04 PM CEST 
//


package org.klipdev.kml.xal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdministrativeAreaName" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}grPostal"/>
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;anyAttribute namespace='##other'/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SubAdministrativeArea" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="SubAdministrativeAreaName" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}grPostal"/>
 *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;anyAttribute namespace='##other'/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}Locality"/>
 *                     &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PostOffice"/>
 *                     &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PostalCode"/>
 *                   &lt;/choice>
 *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="UsageType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Indicator" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;anyAttribute namespace='##other'/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}Locality"/>
 *           &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PostOffice"/>
 *           &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PostalCode"/>
 *         &lt;/choice>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UsageType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Indicator" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;anyAttribute namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addressLine",
    "administrativeAreaName",
    "subAdministrativeArea",
    "locality",
    "postOffice",
    "postalCode",
    "any"
})
@XmlRootElement(name = "AdministrativeArea")
public class AdministrativeArea {

    @XmlElement(name = "AddressLine")
    protected List<AddressLine> addressLine;
    @XmlElement(name = "AdministrativeAreaName")
    protected List<AdministrativeArea.AdministrativeAreaName> administrativeAreaName;
    @XmlElement(name = "SubAdministrativeArea")
    protected AdministrativeArea.SubAdministrativeArea subAdministrativeArea;
    @XmlElement(name = "Locality")
    protected Locality locality;
    @XmlElement(name = "PostOffice")
    protected PostOffice postOffice;
    @XmlElement(name = "PostalCode")
    protected PostalCode postalCode;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Type")
    @XmlSchemaType(name = "anySimpleType")
    protected String type;
    @XmlAttribute(name = "UsageType")
    @XmlSchemaType(name = "anySimpleType")
    protected String usageType;
    @XmlAttribute(name = "Indicator")
    @XmlSchemaType(name = "anySimpleType")
    protected String indicator;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the addressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressLine }
     * 
     * 
     */
    public List<AddressLine> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<AddressLine>();
        }
        return this.addressLine;
    }

    /**
     * Gets the value of the administrativeAreaName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the administrativeAreaName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministrativeAreaName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdministrativeArea.AdministrativeAreaName }
     * 
     * 
     */
    public List<AdministrativeArea.AdministrativeAreaName> getAdministrativeAreaName() {
        if (administrativeAreaName == null) {
            administrativeAreaName = new ArrayList<AdministrativeArea.AdministrativeAreaName>();
        }
        return this.administrativeAreaName;
    }

    /**
     * Obtient la valeur de la propriété subAdministrativeArea.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeArea.SubAdministrativeArea }
     *     
     */
    public AdministrativeArea.SubAdministrativeArea getSubAdministrativeArea() {
        return subAdministrativeArea;
    }

    /**
     * Définit la valeur de la propriété subAdministrativeArea.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeArea.SubAdministrativeArea }
     *     
     */
    public void setSubAdministrativeArea(AdministrativeArea.SubAdministrativeArea value) {
        this.subAdministrativeArea = value;
    }

    /**
     * Obtient la valeur de la propriété locality.
     * 
     * @return
     *     possible object is
     *     {@link Locality }
     *     
     */
    public Locality getLocality() {
        return locality;
    }

    /**
     * Définit la valeur de la propriété locality.
     * 
     * @param value
     *     allowed object is
     *     {@link Locality }
     *     
     */
    public void setLocality(Locality value) {
        this.locality = value;
    }

    /**
     * Obtient la valeur de la propriété postOffice.
     * 
     * @return
     *     possible object is
     *     {@link PostOffice }
     *     
     */
    public PostOffice getPostOffice() {
        return postOffice;
    }

    /**
     * Définit la valeur de la propriété postOffice.
     * 
     * @param value
     *     allowed object is
     *     {@link PostOffice }
     *     
     */
    public void setPostOffice(PostOffice value) {
        this.postOffice = value;
    }

    /**
     * Obtient la valeur de la propriété postalCode.
     * 
     * @return
     *     possible object is
     *     {@link PostalCode }
     *     
     */
    public PostalCode getPostalCode() {
        return postalCode;
    }

    /**
     * Définit la valeur de la propriété postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalCode }
     *     
     */
    public void setPostalCode(PostalCode value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété usageType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageType() {
        return usageType;
    }

    /**
     * Définit la valeur de la propriété usageType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageType(String value) {
        this.usageType = value;
    }

    /**
     * Obtient la valeur de la propriété indicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator() {
        return indicator;
    }

    /**
     * Définit la valeur de la propriété indicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator(String value) {
        this.indicator = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}grPostal"/>
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;anyAttribute namespace='##other'/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class AdministrativeAreaName {

        @XmlValue
        protected String content;
        @XmlAttribute(name = "Type")
        @XmlSchemaType(name = "anySimpleType")
        protected String type;
        @XmlAttribute(name = "Code")
        @XmlSchemaType(name = "anySimpleType")
        protected String code;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Obtient la valeur de la propriété content.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            return content;
        }

        /**
         * Définit la valeur de la propriété content.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
        }

        /**
         * Obtient la valeur de la propriété type.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Définit la valeur de la propriété type.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Obtient la valeur de la propriété code.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Définit la valeur de la propriété code.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="SubAdministrativeAreaName" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}grPostal"/>
     *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;anyAttribute namespace='##other'/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;choice minOccurs="0">
     *           &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}Locality"/>
     *           &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PostOffice"/>
     *           &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PostalCode"/>
     *         &lt;/choice>
     *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="UsageType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Indicator" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;anyAttribute namespace='##other'/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "addressLine",
        "subAdministrativeAreaName",
        "locality",
        "postOffice",
        "postalCode",
        "any"
    })
    public static class SubAdministrativeArea {

        @XmlElement(name = "AddressLine")
        protected List<AddressLine> addressLine;
        @XmlElement(name = "SubAdministrativeAreaName")
        protected List<AdministrativeArea.SubAdministrativeArea.SubAdministrativeAreaName> subAdministrativeAreaName;
        @XmlElement(name = "Locality")
        protected Locality locality;
        @XmlElement(name = "PostOffice")
        protected PostOffice postOffice;
        @XmlElement(name = "PostalCode")
        protected PostalCode postalCode;
        @XmlAnyElement(lax = true)
        protected List<Object> any;
        @XmlAttribute(name = "Type")
        @XmlSchemaType(name = "anySimpleType")
        protected String type;
        @XmlAttribute(name = "UsageType")
        @XmlSchemaType(name = "anySimpleType")
        protected String usageType;
        @XmlAttribute(name = "Indicator")
        @XmlSchemaType(name = "anySimpleType")
        protected String indicator;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the addressLine property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addressLine property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddressLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddressLine }
         * 
         * 
         */
        public List<AddressLine> getAddressLine() {
            if (addressLine == null) {
                addressLine = new ArrayList<AddressLine>();
            }
            return this.addressLine;
        }

        /**
         * Gets the value of the subAdministrativeAreaName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subAdministrativeAreaName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubAdministrativeAreaName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AdministrativeArea.SubAdministrativeArea.SubAdministrativeAreaName }
         * 
         * 
         */
        public List<AdministrativeArea.SubAdministrativeArea.SubAdministrativeAreaName> getSubAdministrativeAreaName() {
            if (subAdministrativeAreaName == null) {
                subAdministrativeAreaName = new ArrayList<AdministrativeArea.SubAdministrativeArea.SubAdministrativeAreaName>();
            }
            return this.subAdministrativeAreaName;
        }

        /**
         * Obtient la valeur de la propriété locality.
         * 
         * @return
         *     possible object is
         *     {@link Locality }
         *     
         */
        public Locality getLocality() {
            return locality;
        }

        /**
         * Définit la valeur de la propriété locality.
         * 
         * @param value
         *     allowed object is
         *     {@link Locality }
         *     
         */
        public void setLocality(Locality value) {
            this.locality = value;
        }

        /**
         * Obtient la valeur de la propriété postOffice.
         * 
         * @return
         *     possible object is
         *     {@link PostOffice }
         *     
         */
        public PostOffice getPostOffice() {
            return postOffice;
        }

        /**
         * Définit la valeur de la propriété postOffice.
         * 
         * @param value
         *     allowed object is
         *     {@link PostOffice }
         *     
         */
        public void setPostOffice(PostOffice value) {
            this.postOffice = value;
        }

        /**
         * Obtient la valeur de la propriété postalCode.
         * 
         * @return
         *     possible object is
         *     {@link PostalCode }
         *     
         */
        public PostalCode getPostalCode() {
            return postalCode;
        }

        /**
         * Définit la valeur de la propriété postalCode.
         * 
         * @param value
         *     allowed object is
         *     {@link PostalCode }
         *     
         */
        public void setPostalCode(PostalCode value) {
            this.postalCode = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        /**
         * Obtient la valeur de la propriété type.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Définit la valeur de la propriété type.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Obtient la valeur de la propriété usageType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsageType() {
            return usageType;
        }

        /**
         * Définit la valeur de la propriété usageType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsageType(String value) {
            this.usageType = value;
        }

        /**
         * Obtient la valeur de la propriété indicator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndicator() {
            return indicator;
        }

        /**
         * Définit la valeur de la propriété indicator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndicator(String value) {
            this.indicator = value;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}grPostal"/>
         *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;anyAttribute namespace='##other'/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "content"
        })
        public static class SubAdministrativeAreaName {

            @XmlValue
            protected String content;
            @XmlAttribute(name = "Type")
            @XmlSchemaType(name = "anySimpleType")
            protected String type;
            @XmlAttribute(name = "Code")
            @XmlSchemaType(name = "anySimpleType")
            protected String code;
            @XmlAnyAttribute
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Obtient la valeur de la propriété content.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContent() {
                return content;
            }

            /**
             * Définit la valeur de la propriété content.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContent(String value) {
                this.content = value;
            }

            /**
             * Obtient la valeur de la propriété type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Définit la valeur de la propriété type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Obtient la valeur de la propriété code.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Définit la valeur de la propriété code.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets a map that contains attributes that aren't bound to any typed property on this class.
             * 
             * <p>
             * the map is keyed by the name of the attribute and 
             * the value is the string value of the attribute.
             * 
             * the map returned by this method is live, and you can add new attribute
             * by updating the map directly. Because of this design, there's no setter.
             * 
             * 
             * @return
             *     always non-null
             */
            public Map<QName, String> getOtherAttributes() {
                return otherAttributes;
            }

        }

    }

}
