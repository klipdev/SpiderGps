//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.08 à 11:14:04 PM CEST 
//


package org.klipdev.kml.atom;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.klipdev.kml.atom package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Author_QNAME = new QName("http://www.w3.org/2005/Atom", "author");
    private final static QName _Uri_QNAME = new QName("http://www.w3.org/2005/Atom", "uri");
    private final static QName _Name_QNAME = new QName("http://www.w3.org/2005/Atom", "name");
    private final static QName _Email_QNAME = new QName("http://www.w3.org/2005/Atom", "email");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.klipdev.kml.atom
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AtomPersonConstruct }
     * 
     */
    public AtomPersonConstruct createAtomPersonConstruct() {
        return new AtomPersonConstruct();
    }

    /**
     * Create an instance of {@link Link }
     * 
     */
    public Link createLink() {
        return new Link();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtomPersonConstruct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/Atom", name = "author")
    public JAXBElement<AtomPersonConstruct> createAuthor(AtomPersonConstruct value) {
        return new JAXBElement<AtomPersonConstruct>(_Author_QNAME, AtomPersonConstruct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/Atom", name = "uri")
    public JAXBElement<String> createUri(String value) {
        return new JAXBElement<String>(_Uri_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/Atom", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/Atom", name = "email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

}
