//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.08 à 11:14:04 PM CEST 
//


package org.klipdev.spidergps3p.kml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour listItemTypeEnumType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="listItemTypeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="radioFolder"/>
 *     &lt;enumeration value="check"/>
 *     &lt;enumeration value="checkHideChildren"/>
 *     &lt;enumeration value="checkOffOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "listItemTypeEnumType")
@XmlEnum
public enum ListItemTypeEnumType {

    @XmlEnumValue("radioFolder")
    RADIO_FOLDER("radioFolder"),
    @XmlEnumValue("check")
    CHECK("check"),
    @XmlEnumValue("checkHideChildren")
    CHECK_HIDE_CHILDREN("checkHideChildren"),
    @XmlEnumValue("checkOffOnly")
    CHECK_OFF_ONLY("checkOffOnly");
    private final String value;

    ListItemTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListItemTypeEnumType fromValue(String v) {
        for (ListItemTypeEnumType c: ListItemTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
