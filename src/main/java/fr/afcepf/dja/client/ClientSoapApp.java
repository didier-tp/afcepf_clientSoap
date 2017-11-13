package fr.afcepf.dja.client;

import fr.afcepf.dja.ws.ServiceTva;
import fr.afcepf.dja.ws.ServiceTvaImplService;

public class ClientSoapApp {

	public static void main(String[] args) {
		//code d'appel du WS SOAP qui s'appuie sur 
		//le code généré par wsimport
		ServiceTva wsTva = (new ServiceTvaImplService())
				                      .getServiceTvaImplPort();
        // (new ....Service).get...Port()
		double resTva = wsTva.tva(200.0,20.0);
		System.out.println("tva="+resTva);
		String auteur = wsTva.getAuteur();
		System.out.println("auteur="+auteur);
	}
}
