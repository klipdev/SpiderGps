//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.08 à 11:14:04 PM CEST 
//


package org.klipdev.kml;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ScaleScalar
    extends JAXBElement<Double>
{

    protected final static QName NAME = new QName("http://www.opengis.net/kml/2.2", "scale");

    public ScaleScalar(Double value) {
        super(NAME, ((Class) Double.class), null, value);
    }

    public ScaleScalar() {
        super(NAME, ((Class) Double.class), null, null);
    }

}
