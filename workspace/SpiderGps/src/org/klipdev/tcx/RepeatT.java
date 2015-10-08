//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.08 à 10:48:22 PM CEST 
//


package org.klipdev.tcx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Repeat_t complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Repeat_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}AbstractStep_t">
 *       &lt;sequence>
 *         &lt;element name="Repetitions" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Repetitions_t"/>
 *         &lt;element name="Child" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}AbstractStep_t" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Repeat_t", propOrder = {
    "repetitions",
    "child"
})
public class RepeatT
    extends AbstractStepT
{

    @XmlElement(name = "Repetitions")
    @XmlSchemaType(name = "positiveInteger")
    protected int repetitions;
    @XmlElement(name = "Child", required = true)
    protected List<AbstractStepT> child;

    /**
     * Obtient la valeur de la propriété repetitions.
     * 
     */
    public int getRepetitions() {
        return repetitions;
    }

    /**
     * Définit la valeur de la propriété repetitions.
     * 
     */
    public void setRepetitions(int value) {
        this.repetitions = value;
    }

    /**
     * Gets the value of the child property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the child property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChild().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractStepT }
     * 
     * 
     */
    public List<AbstractStepT> getChild() {
        if (child == null) {
            child = new ArrayList<AbstractStepT>();
        }
        return this.child;
    }

}
