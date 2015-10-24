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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ScaleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ScaleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}x" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}y" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}z" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}ScaleSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}ScaleObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScaleType", propOrder = {
    "x",
    "y",
    "z",
    "scaleSimpleExtensionGroup",
    "scaleObjectExtensionGroup"
})
public class ScaleType
    extends AbstractObjectType
{

    @XmlElement(defaultValue = "1.0")
    protected Double x;
    @XmlElement(defaultValue = "1.0")
    protected Double y;
    @XmlElement(defaultValue = "1.0")
    protected Double z;
    @XmlElement(name = "ScaleSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> scaleSimpleExtensionGroup;
    @XmlElement(name = "ScaleObjectExtensionGroup")
    protected List<AbstractObjectType> scaleObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété x.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX() {
        return x;
    }

    /**
     * Définit la valeur de la propriété x.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX(Double value) {
        this.x = value;
    }

    /**
     * Obtient la valeur de la propriété y.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getY() {
        return y;
    }

    /**
     * Définit la valeur de la propriété y.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setY(Double value) {
        this.y = value;
    }

    /**
     * Obtient la valeur de la propriété z.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getZ() {
        return z;
    }

    /**
     * Définit la valeur de la propriété z.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZ(Double value) {
        this.z = value;
    }

    /**
     * Gets the value of the scaleSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scaleSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScaleSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getScaleSimpleExtensionGroup() {
        if (scaleSimpleExtensionGroup == null) {
            scaleSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.scaleSimpleExtensionGroup;
    }

    /**
     * Gets the value of the scaleObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scaleObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScaleObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getScaleObjectExtensionGroup() {
        if (scaleObjectExtensionGroup == null) {
            scaleObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.scaleObjectExtensionGroup;
    }

}
