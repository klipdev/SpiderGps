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


/**
 * <p>Classe Java pour AbstractSubStyleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractSubStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractSubStyleSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractSubStyleObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSubStyleType", propOrder = {
    "abstractSubStyleSimpleExtensionGroup",
    "abstractSubStyleObjectExtensionGroup"
})
@XmlSeeAlso({
    ListStyleType.class,
    AbstractColorStyleType.class,
    BalloonStyleType.class
})
public abstract class AbstractSubStyleType
    extends AbstractObjectType
{

    @XmlElement(name = "AbstractSubStyleSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> abstractSubStyleSimpleExtensionGroup;
    @XmlElement(name = "AbstractSubStyleObjectExtensionGroup")
    protected List<AbstractObjectType> abstractSubStyleObjectExtensionGroup;

    /**
     * Gets the value of the abstractSubStyleSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractSubStyleSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractSubStyleSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAbstractSubStyleSimpleExtensionGroup() {
        if (abstractSubStyleSimpleExtensionGroup == null) {
            abstractSubStyleSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.abstractSubStyleSimpleExtensionGroup;
    }

    /**
     * Gets the value of the abstractSubStyleObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractSubStyleObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractSubStyleObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getAbstractSubStyleObjectExtensionGroup() {
        if (abstractSubStyleObjectExtensionGroup == null) {
            abstractSubStyleObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.abstractSubStyleObjectExtensionGroup;
    }

}
