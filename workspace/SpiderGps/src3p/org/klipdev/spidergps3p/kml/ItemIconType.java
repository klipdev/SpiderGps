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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ItemIconType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ItemIconType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}state" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}href" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}ItemIconSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}ItemIconObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemIconType", propOrder = {
    "state",
    "href",
    "itemIconSimpleExtensionGroup",
    "itemIconObjectExtensionGroup"
})
public class ItemIconType
    extends AbstractObjectType
{

    @XmlList
    @XmlSchemaType(name = "anySimpleType")
    protected List<ItemIconStateEnumType> state;
    protected String href;
    @XmlElement(name = "ItemIconSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> itemIconSimpleExtensionGroup;
    @XmlElement(name = "ItemIconObjectExtensionGroup")
    protected List<AbstractObjectType> itemIconObjectExtensionGroup;

    /**
     * Gets the value of the state property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the state property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemIconStateEnumType }
     * 
     * 
     */
    public List<ItemIconStateEnumType> getState() {
        if (state == null) {
            state = new ArrayList<ItemIconStateEnumType>();
        }
        return this.state;
    }

    /**
     * Obtient la valeur de la propriété href.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Définit la valeur de la propriété href.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the itemIconSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemIconSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemIconSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getItemIconSimpleExtensionGroup() {
        if (itemIconSimpleExtensionGroup == null) {
            itemIconSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.itemIconSimpleExtensionGroup;
    }

    /**
     * Gets the value of the itemIconObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemIconObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemIconObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getItemIconObjectExtensionGroup() {
        if (itemIconObjectExtensionGroup == null) {
            itemIconObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.itemIconObjectExtensionGroup;
    }

}
