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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element name="PremiseName" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}grPostal"/>
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="TypeOccurrence">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="Before"/>
 *                       &lt;enumeration value="After"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;anyAttribute namespace='##other'/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="PremiseLocation">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attGroup ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}grPostal"/>
 *                   &lt;anyAttribute namespace='##other'/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;choice>
 *             &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumber" maxOccurs="unbounded"/>
 *             &lt;element name="PremiseNumberRange">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="PremiseNumberRangeFrom">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
 *                                 &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumberPrefix" maxOccurs="unbounded" minOccurs="0"/>
 *                                 &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumber" maxOccurs="unbounded"/>
 *                                 &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumberSuffix" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="PremiseNumberRangeTo">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
 *                                 &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumberPrefix" maxOccurs="unbounded" minOccurs="0"/>
 *                                 &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumber" maxOccurs="unbounded"/>
 *                                 &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumberSuffix" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                     &lt;attribute name="RangeType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                     &lt;attribute name="Indicator" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                     &lt;attribute name="Separator" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                     &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                     &lt;attribute name="IndicatorOccurence">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                           &lt;enumeration value="Before"/>
 *                           &lt;enumeration value="After"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/attribute>
 *                     &lt;attribute name="NumberRangeOccurence">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                           &lt;enumeration value="BeforeName"/>
 *                           &lt;enumeration value="AfterName"/>
 *                           &lt;enumeration value="BeforeType"/>
 *                           &lt;enumeration value="AfterType"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/attribute>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/choice>
 *         &lt;/choice>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumberPrefix" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumberSuffix" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BuildingName" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}BuildingNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="SubPremise" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}SubPremiseType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="Firm" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}FirmType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="MailStop" type="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}MailStopType" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PostalCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}Premise" minOccurs="0"/>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PremiseDependency" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PremiseDependencyType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PremiseThoroughfareConnector" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
    "premiseName",
    "premiseLocation",
    "premiseNumber",
    "premiseNumberRange",
    "premiseNumberPrefix",
    "premiseNumberSuffix",
    "buildingName",
    "subPremise",
    "firm",
    "mailStop",
    "postalCode",
    "premise",
    "any"
})
@XmlRootElement(name = "Premise")
public class Premise {

    @XmlElement(name = "AddressLine")
    protected List<AddressLine> addressLine;
    @XmlElement(name = "PremiseName")
    protected List<Premise.PremiseName> premiseName;
    @XmlElement(name = "PremiseLocation")
    protected Premise.PremiseLocation premiseLocation;
    @XmlElement(name = "PremiseNumber")
    protected List<PremiseNumber> premiseNumber;
    @XmlElement(name = "PremiseNumberRange")
    protected Premise.PremiseNumberRange premiseNumberRange;
    @XmlElement(name = "PremiseNumberPrefix")
    protected List<PremiseNumberPrefix> premiseNumberPrefix;
    @XmlElement(name = "PremiseNumberSuffix")
    protected List<PremiseNumberSuffix> premiseNumberSuffix;
    @XmlElement(name = "BuildingName")
    protected List<BuildingNameType> buildingName;
    @XmlElement(name = "SubPremise")
    protected List<SubPremiseType> subPremise;
    @XmlElement(name = "Firm")
    protected FirmType firm;
    @XmlElement(name = "MailStop")
    protected MailStopType mailStop;
    @XmlElement(name = "PostalCode")
    protected PostalCode postalCode;
    @XmlElement(name = "Premise")
    protected Premise premise;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Type")
    @XmlSchemaType(name = "anySimpleType")
    protected String type;
    @XmlAttribute(name = "PremiseDependency")
    @XmlSchemaType(name = "anySimpleType")
    protected String premiseDependency;
    @XmlAttribute(name = "PremiseDependencyType")
    @XmlSchemaType(name = "anySimpleType")
    protected String premiseDependencyType;
    @XmlAttribute(name = "PremiseThoroughfareConnector")
    @XmlSchemaType(name = "anySimpleType")
    protected String premiseThoroughfareConnector;
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
     * Gets the value of the premiseName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premiseName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremiseName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Premise.PremiseName }
     * 
     * 
     */
    public List<Premise.PremiseName> getPremiseName() {
        if (premiseName == null) {
            premiseName = new ArrayList<Premise.PremiseName>();
        }
        return this.premiseName;
    }

    /**
     * Obtient la valeur de la propriété premiseLocation.
     * 
     * @return
     *     possible object is
     *     {@link Premise.PremiseLocation }
     *     
     */
    public Premise.PremiseLocation getPremiseLocation() {
        return premiseLocation;
    }

    /**
     * Définit la valeur de la propriété premiseLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link Premise.PremiseLocation }
     *     
     */
    public void setPremiseLocation(Premise.PremiseLocation value) {
        this.premiseLocation = value;
    }

    /**
     * Gets the value of the premiseNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premiseNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremiseNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PremiseNumber }
     * 
     * 
     */
    public List<PremiseNumber> getPremiseNumber() {
        if (premiseNumber == null) {
            premiseNumber = new ArrayList<PremiseNumber>();
        }
        return this.premiseNumber;
    }

    /**
     * Obtient la valeur de la propriété premiseNumberRange.
     * 
     * @return
     *     possible object is
     *     {@link Premise.PremiseNumberRange }
     *     
     */
    public Premise.PremiseNumberRange getPremiseNumberRange() {
        return premiseNumberRange;
    }

    /**
     * Définit la valeur de la propriété premiseNumberRange.
     * 
     * @param value
     *     allowed object is
     *     {@link Premise.PremiseNumberRange }
     *     
     */
    public void setPremiseNumberRange(Premise.PremiseNumberRange value) {
        this.premiseNumberRange = value;
    }

    /**
     * Gets the value of the premiseNumberPrefix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premiseNumberPrefix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremiseNumberPrefix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PremiseNumberPrefix }
     * 
     * 
     */
    public List<PremiseNumberPrefix> getPremiseNumberPrefix() {
        if (premiseNumberPrefix == null) {
            premiseNumberPrefix = new ArrayList<PremiseNumberPrefix>();
        }
        return this.premiseNumberPrefix;
    }

    /**
     * Gets the value of the premiseNumberSuffix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premiseNumberSuffix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremiseNumberSuffix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PremiseNumberSuffix }
     * 
     * 
     */
    public List<PremiseNumberSuffix> getPremiseNumberSuffix() {
        if (premiseNumberSuffix == null) {
            premiseNumberSuffix = new ArrayList<PremiseNumberSuffix>();
        }
        return this.premiseNumberSuffix;
    }

    /**
     * Gets the value of the buildingName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buildingName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuildingName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuildingNameType }
     * 
     * 
     */
    public List<BuildingNameType> getBuildingName() {
        if (buildingName == null) {
            buildingName = new ArrayList<BuildingNameType>();
        }
        return this.buildingName;
    }

    /**
     * Gets the value of the subPremise property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subPremise property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubPremise().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubPremiseType }
     * 
     * 
     */
    public List<SubPremiseType> getSubPremise() {
        if (subPremise == null) {
            subPremise = new ArrayList<SubPremiseType>();
        }
        return this.subPremise;
    }

    /**
     * Obtient la valeur de la propriété firm.
     * 
     * @return
     *     possible object is
     *     {@link FirmType }
     *     
     */
    public FirmType getFirm() {
        return firm;
    }

    /**
     * Définit la valeur de la propriété firm.
     * 
     * @param value
     *     allowed object is
     *     {@link FirmType }
     *     
     */
    public void setFirm(FirmType value) {
        this.firm = value;
    }

    /**
     * Obtient la valeur de la propriété mailStop.
     * 
     * @return
     *     possible object is
     *     {@link MailStopType }
     *     
     */
    public MailStopType getMailStop() {
        return mailStop;
    }

    /**
     * Définit la valeur de la propriété mailStop.
     * 
     * @param value
     *     allowed object is
     *     {@link MailStopType }
     *     
     */
    public void setMailStop(MailStopType value) {
        this.mailStop = value;
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
     * Obtient la valeur de la propriété premise.
     * 
     * @return
     *     possible object is
     *     {@link Premise }
     *     
     */
    public Premise getPremise() {
        return premise;
    }

    /**
     * Définit la valeur de la propriété premise.
     * 
     * @param value
     *     allowed object is
     *     {@link Premise }
     *     
     */
    public void setPremise(Premise value) {
        this.premise = value;
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
     * Obtient la valeur de la propriété premiseDependency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiseDependency() {
        return premiseDependency;
    }

    /**
     * Définit la valeur de la propriété premiseDependency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiseDependency(String value) {
        this.premiseDependency = value;
    }

    /**
     * Obtient la valeur de la propriété premiseDependencyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiseDependencyType() {
        return premiseDependencyType;
    }

    /**
     * Définit la valeur de la propriété premiseDependencyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiseDependencyType(String value) {
        this.premiseDependencyType = value;
    }

    /**
     * Obtient la valeur de la propriété premiseThoroughfareConnector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiseThoroughfareConnector() {
        return premiseThoroughfareConnector;
    }

    /**
     * Définit la valeur de la propriété premiseThoroughfareConnector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiseThoroughfareConnector(String value) {
        this.premiseThoroughfareConnector = value;
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
    public static class PremiseLocation {

        @XmlValue
        protected String content;
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
     *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}grPostal"/>
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="TypeOccurrence">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="Before"/>
     *             &lt;enumeration value="After"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class PremiseName {

        @XmlValue
        protected String content;
        @XmlAttribute(name = "Type")
        @XmlSchemaType(name = "anySimpleType")
        protected String type;
        @XmlAttribute(name = "TypeOccurrence")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String typeOccurrence;
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
         * Obtient la valeur de la propriété typeOccurrence.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypeOccurrence() {
            return typeOccurrence;
        }

        /**
         * Définit la valeur de la propriété typeOccurrence.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypeOccurrence(String value) {
            this.typeOccurrence = value;
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
     *         &lt;element name="PremiseNumberRangeFrom">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumberPrefix" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumber" maxOccurs="unbounded"/>
     *                   &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumberSuffix" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PremiseNumberRangeTo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumberPrefix" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumber" maxOccurs="unbounded"/>
     *                   &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumberSuffix" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="RangeType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Indicator" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Separator" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="IndicatorOccurence">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="Before"/>
     *             &lt;enumeration value="After"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="NumberRangeOccurence">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="BeforeName"/>
     *             &lt;enumeration value="AfterName"/>
     *             &lt;enumeration value="BeforeType"/>
     *             &lt;enumeration value="AfterType"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "premiseNumberRangeFrom",
        "premiseNumberRangeTo"
    })
    public static class PremiseNumberRange {

        @XmlElement(name = "PremiseNumberRangeFrom", required = true)
        protected Premise.PremiseNumberRange.PremiseNumberRangeFrom premiseNumberRangeFrom;
        @XmlElement(name = "PremiseNumberRangeTo", required = true)
        protected Premise.PremiseNumberRange.PremiseNumberRangeTo premiseNumberRangeTo;
        @XmlAttribute(name = "RangeType")
        @XmlSchemaType(name = "anySimpleType")
        protected String rangeType;
        @XmlAttribute(name = "Indicator")
        @XmlSchemaType(name = "anySimpleType")
        protected String indicator;
        @XmlAttribute(name = "Separator")
        @XmlSchemaType(name = "anySimpleType")
        protected String separator;
        @XmlAttribute(name = "Type")
        @XmlSchemaType(name = "anySimpleType")
        protected String type;
        @XmlAttribute(name = "IndicatorOccurence")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String indicatorOccurence;
        @XmlAttribute(name = "NumberRangeOccurence")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String numberRangeOccurence;

        /**
         * Obtient la valeur de la propriété premiseNumberRangeFrom.
         * 
         * @return
         *     possible object is
         *     {@link Premise.PremiseNumberRange.PremiseNumberRangeFrom }
         *     
         */
        public Premise.PremiseNumberRange.PremiseNumberRangeFrom getPremiseNumberRangeFrom() {
            return premiseNumberRangeFrom;
        }

        /**
         * Définit la valeur de la propriété premiseNumberRangeFrom.
         * 
         * @param value
         *     allowed object is
         *     {@link Premise.PremiseNumberRange.PremiseNumberRangeFrom }
         *     
         */
        public void setPremiseNumberRangeFrom(Premise.PremiseNumberRange.PremiseNumberRangeFrom value) {
            this.premiseNumberRangeFrom = value;
        }

        /**
         * Obtient la valeur de la propriété premiseNumberRangeTo.
         * 
         * @return
         *     possible object is
         *     {@link Premise.PremiseNumberRange.PremiseNumberRangeTo }
         *     
         */
        public Premise.PremiseNumberRange.PremiseNumberRangeTo getPremiseNumberRangeTo() {
            return premiseNumberRangeTo;
        }

        /**
         * Définit la valeur de la propriété premiseNumberRangeTo.
         * 
         * @param value
         *     allowed object is
         *     {@link Premise.PremiseNumberRange.PremiseNumberRangeTo }
         *     
         */
        public void setPremiseNumberRangeTo(Premise.PremiseNumberRange.PremiseNumberRangeTo value) {
            this.premiseNumberRangeTo = value;
        }

        /**
         * Obtient la valeur de la propriété rangeType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRangeType() {
            return rangeType;
        }

        /**
         * Définit la valeur de la propriété rangeType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRangeType(String value) {
            this.rangeType = value;
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
         * Obtient la valeur de la propriété separator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeparator() {
            return separator;
        }

        /**
         * Définit la valeur de la propriété separator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeparator(String value) {
            this.separator = value;
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
         * Obtient la valeur de la propriété indicatorOccurence.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndicatorOccurence() {
            return indicatorOccurence;
        }

        /**
         * Définit la valeur de la propriété indicatorOccurence.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndicatorOccurence(String value) {
            this.indicatorOccurence = value;
        }

        /**
         * Obtient la valeur de la propriété numberRangeOccurence.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberRangeOccurence() {
            return numberRangeOccurence;
        }

        /**
         * Définit la valeur de la propriété numberRangeOccurence.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberRangeOccurence(String value) {
            this.numberRangeOccurence = value;
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
         *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumberPrefix" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumber" maxOccurs="unbounded"/>
         *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumberSuffix" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
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
            "premiseNumberPrefix",
            "premiseNumber",
            "premiseNumberSuffix"
        })
        public static class PremiseNumberRangeFrom {

            @XmlElement(name = "AddressLine")
            protected List<AddressLine> addressLine;
            @XmlElement(name = "PremiseNumberPrefix")
            protected List<PremiseNumberPrefix> premiseNumberPrefix;
            @XmlElement(name = "PremiseNumber", required = true)
            protected List<PremiseNumber> premiseNumber;
            @XmlElement(name = "PremiseNumberSuffix")
            protected List<PremiseNumberSuffix> premiseNumberSuffix;

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
             * Gets the value of the premiseNumberPrefix property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the premiseNumberPrefix property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPremiseNumberPrefix().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PremiseNumberPrefix }
             * 
             * 
             */
            public List<PremiseNumberPrefix> getPremiseNumberPrefix() {
                if (premiseNumberPrefix == null) {
                    premiseNumberPrefix = new ArrayList<PremiseNumberPrefix>();
                }
                return this.premiseNumberPrefix;
            }

            /**
             * Gets the value of the premiseNumber property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the premiseNumber property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPremiseNumber().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PremiseNumber }
             * 
             * 
             */
            public List<PremiseNumber> getPremiseNumber() {
                if (premiseNumber == null) {
                    premiseNumber = new ArrayList<PremiseNumber>();
                }
                return this.premiseNumber;
            }

            /**
             * Gets the value of the premiseNumberSuffix property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the premiseNumberSuffix property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPremiseNumberSuffix().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PremiseNumberSuffix }
             * 
             * 
             */
            public List<PremiseNumberSuffix> getPremiseNumberSuffix() {
                if (premiseNumberSuffix == null) {
                    premiseNumberSuffix = new ArrayList<PremiseNumberSuffix>();
                }
                return this.premiseNumberSuffix;
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
         *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumberPrefix" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumber" maxOccurs="unbounded"/>
         *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}PremiseNumberSuffix" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
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
            "premiseNumberPrefix",
            "premiseNumber",
            "premiseNumberSuffix"
        })
        public static class PremiseNumberRangeTo {

            @XmlElement(name = "AddressLine")
            protected List<AddressLine> addressLine;
            @XmlElement(name = "PremiseNumberPrefix")
            protected List<PremiseNumberPrefix> premiseNumberPrefix;
            @XmlElement(name = "PremiseNumber", required = true)
            protected List<PremiseNumber> premiseNumber;
            @XmlElement(name = "PremiseNumberSuffix")
            protected List<PremiseNumberSuffix> premiseNumberSuffix;

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
             * Gets the value of the premiseNumberPrefix property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the premiseNumberPrefix property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPremiseNumberPrefix().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PremiseNumberPrefix }
             * 
             * 
             */
            public List<PremiseNumberPrefix> getPremiseNumberPrefix() {
                if (premiseNumberPrefix == null) {
                    premiseNumberPrefix = new ArrayList<PremiseNumberPrefix>();
                }
                return this.premiseNumberPrefix;
            }

            /**
             * Gets the value of the premiseNumber property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the premiseNumber property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPremiseNumber().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PremiseNumber }
             * 
             * 
             */
            public List<PremiseNumber> getPremiseNumber() {
                if (premiseNumber == null) {
                    premiseNumber = new ArrayList<PremiseNumber>();
                }
                return this.premiseNumber;
            }

            /**
             * Gets the value of the premiseNumberSuffix property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the premiseNumberSuffix property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPremiseNumberSuffix().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PremiseNumberSuffix }
             * 
             * 
             */
            public List<PremiseNumberSuffix> getPremiseNumberSuffix() {
                if (premiseNumberSuffix == null) {
                    premiseNumberSuffix = new ArrayList<PremiseNumberSuffix>();
                }
                return this.premiseNumberSuffix;
            }

        }

    }

}
