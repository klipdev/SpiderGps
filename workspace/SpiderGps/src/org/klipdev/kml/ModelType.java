//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.08 à 11:14:04 PM CEST 
//


package org.klipdev.kml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ModelType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ModelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractGeometryType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}altitudeModeGroup" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}Location" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}Orientation" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}Scale" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}Link" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}ResourceMap" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}ModelSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}ModelObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelType", propOrder = {
    "altitudeModeGroup",
    "location",
    "orientation",
    "scale",
    "link",
    "resourceMap",
    "modelSimpleExtensionGroup",
    "modelObjectExtensionGroup"
})
public class ModelType
    extends AbstractGeometryType
{

    @XmlElementRef(name = "altitudeModeGroup", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false)
    protected JAXBElement<?> altitudeModeGroup;
    @XmlElement(name = "Location")
    protected LocationType location;
    @XmlElement(name = "Orientation")
    protected OrientationType orientation;
    @XmlElement(name = "Scale")
    protected ScaleType scale;
    @XmlElement(name = "Link")
    protected LinkType link;
    @XmlElement(name = "ResourceMap")
    protected ResourceMapType resourceMap;
    @XmlElement(name = "ModelSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> modelSimpleExtensionGroup;
    @XmlElement(name = "ModelObjectExtensionGroup")
    protected List<AbstractObjectType> modelObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété altitudeModeGroup.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link AltitudeModeEnumType }{@code >}
     *     
     */
    public JAXBElement<?> getAltitudeModeGroup() {
        return altitudeModeGroup;
    }

    /**
     * Définit la valeur de la propriété altitudeModeGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link AltitudeModeEnumType }{@code >}
     *     
     */
    public void setAltitudeModeGroup(JAXBElement<?> value) {
        this.altitudeModeGroup = value;
    }

    /**
     * Obtient la valeur de la propriété location.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * Définit la valeur de la propriété location.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocation(LocationType value) {
        this.location = value;
    }

    /**
     * Obtient la valeur de la propriété orientation.
     * 
     * @return
     *     possible object is
     *     {@link OrientationType }
     *     
     */
    public OrientationType getOrientation() {
        return orientation;
    }

    /**
     * Définit la valeur de la propriété orientation.
     * 
     * @param value
     *     allowed object is
     *     {@link OrientationType }
     *     
     */
    public void setOrientation(OrientationType value) {
        this.orientation = value;
    }

    /**
     * Obtient la valeur de la propriété scale.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getScale() {
        return scale;
    }

    /**
     * Définit la valeur de la propriété scale.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setScale(ScaleType value) {
        this.scale = value;
    }

    /**
     * Obtient la valeur de la propriété link.
     * 
     * @return
     *     possible object is
     *     {@link LinkType }
     *     
     */
    public LinkType getLink() {
        return link;
    }

    /**
     * Définit la valeur de la propriété link.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkType }
     *     
     */
    public void setLink(LinkType value) {
        this.link = value;
    }

    /**
     * Obtient la valeur de la propriété resourceMap.
     * 
     * @return
     *     possible object is
     *     {@link ResourceMapType }
     *     
     */
    public ResourceMapType getResourceMap() {
        return resourceMap;
    }

    /**
     * Définit la valeur de la propriété resourceMap.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceMapType }
     *     
     */
    public void setResourceMap(ResourceMapType value) {
        this.resourceMap = value;
    }

    /**
     * Gets the value of the modelSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modelSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModelSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getModelSimpleExtensionGroup() {
        if (modelSimpleExtensionGroup == null) {
            modelSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.modelSimpleExtensionGroup;
    }

    /**
     * Gets the value of the modelObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modelObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModelObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getModelObjectExtensionGroup() {
        if (modelObjectExtensionGroup == null) {
            modelObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.modelObjectExtensionGroup;
    }

}
