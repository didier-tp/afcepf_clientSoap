
package fr.afcepf.dja.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.afcepf.dja.ws package. 
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

    private final static QName _GetAuteurResponse_QNAME = new QName("http://ws.dja.afcepf.fr/", "getAuteurResponse");
    private final static QName _TvaResponse_QNAME = new QName("http://ws.dja.afcepf.fr/", "tvaResponse");
    private final static QName _GetAuteur_QNAME = new QName("http://ws.dja.afcepf.fr/", "getAuteur");
    private final static QName _Tva_QNAME = new QName("http://ws.dja.afcepf.fr/", "tva");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.afcepf.dja.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAuteurResponse }
     * 
     */
    public GetAuteurResponse createGetAuteurResponse() {
        return new GetAuteurResponse();
    }

    /**
     * Create an instance of {@link TvaResponse }
     * 
     */
    public TvaResponse createTvaResponse() {
        return new TvaResponse();
    }

    /**
     * Create an instance of {@link GetAuteur }
     * 
     */
    public GetAuteur createGetAuteur() {
        return new GetAuteur();
    }

    /**
     * Create an instance of {@link Tva }
     * 
     */
    public Tva createTva() {
        return new Tva();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.dja.afcepf.fr/", name = "getAuteurResponse")
    public JAXBElement<GetAuteurResponse> createGetAuteurResponse(GetAuteurResponse value) {
        return new JAXBElement<GetAuteurResponse>(_GetAuteurResponse_QNAME, GetAuteurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TvaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.dja.afcepf.fr/", name = "tvaResponse")
    public JAXBElement<TvaResponse> createTvaResponse(TvaResponse value) {
        return new JAXBElement<TvaResponse>(_TvaResponse_QNAME, TvaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.dja.afcepf.fr/", name = "getAuteur")
    public JAXBElement<GetAuteur> createGetAuteur(GetAuteur value) {
        return new JAXBElement<GetAuteur>(_GetAuteur_QNAME, GetAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.dja.afcepf.fr/", name = "tva")
    public JAXBElement<Tva> createTva(Tva value) {
        return new JAXBElement<Tva>(_Tva_QNAME, Tva.class, null, value);
    }

}
