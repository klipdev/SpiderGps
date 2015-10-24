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
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour BalloonStyleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BalloonStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractSubStyleType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/kml/2.2}color" minOccurs="0"/>
 *           &lt;element ref="{http://www.opengis.net/kml/2.2}bgColor" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}textColor" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}text" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}displayMode" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}BalloonStyleSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}BalloonStyleObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalloonStyleType", propOrder = {
    "color",
    "bgColor",
    "textColor",
    "text",
    "displayMode",
    "balloonStyleSimpleExtensionGroup",
    "balloonStyleObjectExtensionGroup"
})
public class BalloonStyleType
    extends AbstractSubStyleType
{

    @XmlElement(type = String.class, defaultValue = "ffffffff")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] color;
    @XmlElement(type = String.class, defaultValue = "ffffffff")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] bgColor;
    @XmlElement(type = String.class, defaultValue = "ff000000")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] textColor;
    protected String text;
    @XmlElement(defaultValue = "default")
    @XmlSchemaType(name = "string")
    protected DisplayModeEnumType displayMode;
    @XmlElement(name = "BalloonStyleSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> balloonStyleSimpleExtensionGroup;
    @XmlElement(name = "BalloonStyleObjectExtensionGroup")
    protected List<AbstractObjectType> balloonStyleObjectExtensionGroup;

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
     * Obtient la valeur de la propriété bgColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getBgColor() {
        return bgColor;
    }

    /**
     * Définit la valeur de la propriété bgColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgColor(byte[] value) {
        this.bgColor = value;
    }

    /**
     * Obtient la valeur de la propriété textColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getTextColor() {
        return textColor;
    }

    /**
     * Définit la valeur de la propriété textColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextColor(byte[] value) {
        this.textColor = value;
    }

    /**
     * Obtient la valeur de la propriété text.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Définit la valeur de la propriété text.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Obtient la valeur de la propriété displayMode.
     * 
     * @return
     *     possible object is
     *     {@link DisplayModeEnumType }
     *     
     */
    public DisplayModeEnumType getDisplayMode() {
        return displayMode;
    }

    /**
     * Définit la valeur de la propriété displayMode.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayModeEnumType }
     *     
     */
    public void setDisplayMode(DisplayModeEnumType value) {
        this.displayMode = value;
    }

    /**
     * Gets the value of the balloonStyleSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balloonStyleSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalloonStyleSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getBalloonStyleSimpleExtensionGroup() {
        if (balloonStyleSimpleExtensionGroup == null) {
            balloonStyleSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.balloonStyleSimpleExtensionGroup;
    }

    /**
     * Gets the value of the balloonStyleObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balloonStyleObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalloonStyleObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getBalloonStyleObjectExtensionGroup() {
        if (balloonStyleObjectExtensionGroup == null) {
            balloonStyleObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.balloonStyleObjectExtensionGroup;
    }

}
