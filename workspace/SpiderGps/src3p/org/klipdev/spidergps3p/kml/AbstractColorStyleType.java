//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.08 à 11:14:04 PM CEST 
//


package org.klipdev.spidergps3p.kml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour AbstractColorStyleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractColorStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractSubStyleType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}color" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}colorMode" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractColorStyleSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractColorStyleObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractColorStyleType", propOrder = {
    "color",
    "colorMode",
    "abstractColorStyleSimpleExtensionGroup",
    "abstractColorStyleObjectExtensionGroup"
})
@XmlSeeAlso({
    LineStyleType.class,
    LabelStyleType.class,
    PolyStyleType.class,
    IconStyleType.class
})
public abstract class AbstractColorStyleType
    extends AbstractSubStyleType
{

    @XmlElement(type = String.class, defaultValue = "ffffffff")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] color;
    @XmlElement(defaultValue = "normal")
    @XmlSchemaType(name = "string")
    protected ColorModeEnumType colorMode;
    @XmlElement(name = "AbstractColorStyleSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> abstractColorStyleSimpleExtensionGroup;
    @XmlElement(name = "AbstractColorStyleObjectExtensionGroup")
    protected List<AbstractObjectType> abstractColorStyleObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété color.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getColor() {
        return color;
    }

    /**
     * Définit la valeur de la propriété color.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(byte[] value) {
        this.color = value;
    }

    /**
     * Obtient la valeur de la propriété colorMode.
     * 
     * @return
     *     possible object is
     *     {@link ColorModeEnumType }
     *     
     */
    public ColorModeEnumType getColorMode() {
        return colorMode;
    }

    /**
     * Définit la valeur de la propriété colorMode.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorModeEnumType }
     *     
     */
    public void setColorMode(ColorModeEnumType value) {
        this.colorMode = value;
    }

    /**
     * Gets the value of the abstractColorStyleSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractColorStyleSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractColorStyleSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAbstractColorStyleSimpleExtensionGroup() {
        if (abstractColorStyleSimpleExtensionGroup == null) {
            abstractColorStyleSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.abstractColorStyleSimpleExtensionGroup;
    }

    /**
     * Gets the value of the abstractColorStyleObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractColorStyleObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractColorStyleObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getAbstractColorStyleObjectExtensionGroup() {
        if (abstractColorStyleObjectExtensionGroup == null) {
            abstractColorStyleObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.abstractColorStyleObjectExtensionGroup;
    }

}
