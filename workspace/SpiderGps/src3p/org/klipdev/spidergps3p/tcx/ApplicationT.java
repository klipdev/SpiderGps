//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.08 à 10:48:22 PM CEST 
//


package org.klipdev.spidergps3p.tcx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Identifies a PC software application.
 * 
 * <p>Classe Java pour Application_t complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Application_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}AbstractSource_t">
 *       &lt;sequence>
 *         &lt;element name="Build" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Build_t"/>
 *         &lt;element name="LangID" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}LangID_t"/>
 *         &lt;element name="PartNumber" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}PartNumber_t"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Application_t", propOrder = {
    "build",
    "langID",
    "partNumber"
})
public class ApplicationT
    extends AbstractSourceT
{

    @XmlElement(name = "Build", required = true)
    protected BuildT build;
    @XmlElement(name = "LangID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String langID;
    @XmlElement(name = "PartNumber", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String partNumber;

    /**
     * Obtient la valeur de la propriété build.
     * 
     * @return
     *     possible object is
     *     {@link BuildT }
     *     
     */
    public BuildT getBuild() {
        return build;
    }

    /**
     * Définit la valeur de la propriété build.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildT }
     *     
     */
    public void setBuild(BuildT value) {
        this.build = value;
    }

    /**
     * Obtient la valeur de la propriété langID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangID() {
        return langID;
    }

    /**
     * Définit la valeur de la propriété langID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangID(String value) {
        this.langID = value;
    }

    /**
     * Obtient la valeur de la propriété partNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Définit la valeur de la propriété partNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

}
