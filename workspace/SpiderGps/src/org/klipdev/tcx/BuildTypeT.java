//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.08 à 10:48:22 PM CEST 
//


package org.klipdev.tcx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour BuildType_t.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BuildType_t">
 *   &lt;restriction base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Token_t">
 *     &lt;enumeration value="Internal"/>
 *     &lt;enumeration value="Alpha"/>
 *     &lt;enumeration value="Beta"/>
 *     &lt;enumeration value="Release"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuildType_t")
@XmlEnum
public enum BuildTypeT {

    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("Alpha")
    ALPHA("Alpha"),
    @XmlEnumValue("Beta")
    BETA("Beta"),
    @XmlEnumValue("Release")
    RELEASE("Release");
    private final String value;

    BuildTypeT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuildTypeT fromValue(String v) {
        for (BuildTypeT c: BuildTypeT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
