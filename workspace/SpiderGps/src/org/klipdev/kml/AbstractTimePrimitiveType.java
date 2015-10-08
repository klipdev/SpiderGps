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
 * <p>Classe Java pour AbstractTimePrimitiveType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractTimePrimitiveType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractTimePrimitiveSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractTimePrimitiveObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTimePrimitiveType", propOrder = {
    "abstractTimePrimitiveSimpleExtensionGroup",
    "abstractTimePrimitiveObjectExtensionGroup"
})
@XmlSeeAlso({
    TimeStampType.class,
    TimeSpanType.class
})
public abstract class AbstractTimePrimitiveType
    extends AbstractObjectType
{

    @XmlElement(name = "AbstractTimePrimitiveSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> abstractTimePrimitiveSimpleExtensionGroup;
    @XmlElement(name = "AbstractTimePrimitiveObjectExtensionGroup")
    protected List<AbstractObjectType> abstractTimePrimitiveObjectExtensionGroup;

    /**
     * Gets the value of the abstractTimePrimitiveSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractTimePrimitiveSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractTimePrimitiveSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAbstractTimePrimitiveSimpleExtensionGroup() {
        if (abstractTimePrimitiveSimpleExtensionGroup == null) {
            abstractTimePrimitiveSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.abstractTimePrimitiveSimpleExtensionGroup;
    }

    /**
     * Gets the value of the abstractTimePrimitiveObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractTimePrimitiveObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractTimePrimitiveObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getAbstractTimePrimitiveObjectExtensionGroup() {
        if (abstractTimePrimitiveObjectExtensionGroup == null) {
            abstractTimePrimitiveObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.abstractTimePrimitiveObjectExtensionGroup;
    }

}
