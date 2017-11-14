package fr.afcepf.dja.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import fr.afcepf.dja.ws.ServiceTva;

public class ClientSoapApp {

	public static void main(String[] args) {
		//code d'appel du WS SOAP qui ne s'appuie pas sur wsimport mais simplement sur 
		//l'interface java avec @WebService , ...
		try {
			//adresse ip 192.168.102.116 à déterminer via ipconfig ou ...
			//String urlAsString="http://" + "192.168.102.116"
			//                   + ":8080/serverSoap/ws/tva?wsdl";
			String urlAsString="http://" + "localhost"
	                   + ":8080/serverSoap/ws/tva?wsdl";
			URL wsdlURL = new URL(urlAsString);
			
			QName SERVICE_NAME = new QName("http://ws.dja.afcepf.fr/","ServiceTvaImplService");
			Service service = Service.create(wsdlURL, SERVICE_NAME);
			QName PORT_NAME = new QName("http://ws.dja.afcepf.fr/","ServiceTvaImplPort");
			ServiceTva wsTva = (ServiceTva) service.getPort(PORT_NAME, ServiceTva.class);

			double resTva = wsTva.tva(200.0,20.0);
			System.out.println("*tva="+resTva);
			String auteur = wsTva.getAuteur();
			System.out.println("*auteur="+auteur);
		} catch (MalformedURLException e) {
				e.printStackTrace();
		}
	}
	/*
	public static void main_avec_swimport(String[] args) {
		//code d'appel du WS SOAP qui s'appuie sur 
		//le code généré par wsimport
		try {
			//adresse ip 192.168.102.116 à déterminer via ipconfig ou ...
			//String urlAsString="http://" + "192.168.102.116"
			//                   + ":8080/serverSoap/ws/tva?wsdl";
			String urlAsString="http://" + "localhost"
	                   + ":8080/serverSoap/ws/tva?wsdl";
			URL wsdlURL = new URL(urlAsString);
			ServiceTva wsTva = (new ServiceTvaImplService(wsdlURL))
					                      .getServiceTvaImplPort();
			// (new ....Service).get...Port()
			double resTva = wsTva.tva(200.0,20.0);
			System.out.println("tva="+resTva);
			String auteur = wsTva.getAuteur();
			System.out.println("auteur="+auteur);
		} catch (MalformedURLException e) {
				e.printStackTrace();
		}
	}*/
}
