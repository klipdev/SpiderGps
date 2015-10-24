//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.08 à 11:14:04 PM CEST 
//


package org.klipdev.spidergps3p.kml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.klipdev.spidergps3p.atom.AtomPersonConstruct;
import org.klipdev.spidergps3p.atom.Link;
import org.klipdev.spidergps3p.xal.AddressDetails;


/**
 * <p>Classe Java pour AbstractFeatureType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractFeatureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}name" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}visibility" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}open" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}author" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}link" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}address" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xsdschema:xAL:2.0}AddressDetails" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}phoneNumber" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/kml/2.2}Snippet" minOccurs="0"/>
 *           &lt;element ref="{http://www.opengis.net/kml/2.2}snippet" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}description" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractViewGroup" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractTimePrimitiveGroup" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}styleUrl" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractStyleSelectorGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}Region" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/kml/2.2}Metadata" minOccurs="0"/>
 *           &lt;element ref="{http://www.opengis.net/kml/2.2}ExtendedData" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractFeatureSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractFeatureObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFeatureType", propOrder = {
    "rest"
})
@XmlSeeAlso({
    PlacemarkType.class,
    NetworkLinkType.class,
    AbstractContainerType.class,
    AbstractOverlayType.class
})
public abstract class AbstractFeatureType
    extends AbstractObjectType
{

    @XmlElementRefs({
        @XmlElementRef(name = "Metadata", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AbstractTimePrimitiveGroup", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "link", namespace = "http://www.w3.org/2005/Atom", type = Link.class, required = false),
        @XmlElementRef(name = "description", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "visibility", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "snippet", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ExtendedData", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AbstractFeatureObjectExtensionGroup", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "name", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "styleUrl", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AbstractFeatureSimpleExtensionGroup", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "phoneNumber", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "author", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Snippet", namespace = "http://www.opengis.net/kml/2.2", type = SnippetDeprecated.class, required = false),
        @XmlElementRef(name = "AbstractViewGroup", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Region", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AddressDetails", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AbstractStyleSelectorGroup", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "open", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false)
    })
    protected List<Object> rest;

    /**
     * Obtient le reste du modèle de contenu. 
     * 
     * <p>
     * Vous obtenez la propriété "catch-all" pour la raison suivante : 
     * Le nom de champ "Snippet" est utilisé par deux parties différentes d'un schéma. Reportez-vous à : 
     * ligne 321 sur file:/Users/Christophe/Documents/Dev/SpiderGps/workspace/SpiderGps/src/ogckml22.xsd
     * ligne 320 sur file:/Users/Christophe/Documents/Dev/SpiderGps/workspace/SpiderGps/src/ogckml22.xsd
     * <p>
     * Pour vous débarrasser de cette propriété, appliquez une personnalisation de propriété à l'une 
     * des deux déclarations suivantes afin de modifier leurs noms : 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MetadataType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link StyleType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link CameraType }{@code >}
     * {@link JAXBElement }{@code <}{@link StyleMapType }{@code >}
     * {@link JAXBElement }{@code <}{@link AtomPersonConstruct }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeSpanType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractViewType }{@code >}
     * {@link JAXBElement }{@code <}{@link AddressDetails }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractStyleSelectorType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimePrimitiveType }{@code >}
     * {@link Link }
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link ExtendedDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link LookAtType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeStampType }{@code >}
     * {@link SnippetDeprecated }
     * {@link JAXBElement }{@code <}{@link RegionType }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * 
     */
    public List<Object> getRest() {
        if (rest == null) {
            rest = new ArrayList<Object>();
        }
        return this.rest;
    }

}
