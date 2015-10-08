//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.08 à 11:14:04 PM CEST 
//


package org.klipdev.kml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AbstractStyleSelectorType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractStyleSelectorType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractStyleSelectorSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractStyleSelectorObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractStyleSelectorType", propOrder = {
    "abstractStyleSelectorSimpleExtensionGroup",
    "abstractStyleSelectorObjectExtensionGroup"
})
@XmlSeeAlso({
    StyleMapType.class,
    StyleType.class
})
public abstract class AbstractStyleSelectorType
    extends AbstractObjectType
{

    @XmlElement(name = "AbstractStyleSelectorSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> abstractStyleSelectorSimpleExtensionGroup;
    @XmlElement(name = "AbstractStyleSelectorObjectExtensionGroup")
    protected List<AbstractObjectType> abstractStyleSelectorObjectExtensionGroup;

    /**
     * Gets the value of the abstractStyleSelectorSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractStyleSelectorSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractStyleSelectorSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAbstractStyleSelectorSimpleExtensionGroup() {
        if (abstractStyleSelectorSimpleExtensionGroup == null) {
            abstractStyleSelectorSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.abstractStyleSelectorSimpleExtensionGroup;
    }

    /**
     * Gets the value of the abstractStyleSelectorObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractStyleSelectorObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractStyleSelectorObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getAbstractStyleSelectorObjectExtensionGroup() {
        if (abstractStyleSelectorObjectExtensionGroup == null) {
            abstractStyleSelectorObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.abstractStyleSelectorObjectExtensionGroup;
    }

}
