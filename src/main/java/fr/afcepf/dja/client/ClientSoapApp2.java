package fr.afcepf.dja.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import fr.afcepf.dja.data.ResCalculTva;
import fr.afcepf.dja.ws.IServiceDevise;

public class ClientSoapApp2 {

	public static void main(String[] args) {
		//code d'appel du WS SOAP qui ne s'appuie pas sur wsimport mais simplement sur 
		//l'interface java avec @WebService , ...
		try {
			//adresse ip 192.168.102.116 à déterminer via ipconfig ou ...
			//String urlAsString="http://" + "192.168.102.116"
			//                   + ":8080/serverSoap/ws/devise?wsdl";
			String urlAsString="http://" + "localhost"
	                   + ":8080/serverSoap/ws/devise?wsdl";
			
			URL wsdlURL = new URL(urlAsString);
			
			QName SERVICE_NAME = new QName("http://ws.dja.afcepf.fr/","ServiceDeviseImplService");
			Service service = Service.create(wsdlURL, SERVICE_NAME);
			QName PORT_NAME = new QName("http://ws.dja.afcepf.fr/","ServiceDeviseImplPort");
			IServiceDevise wsDevise = (IServiceDevise) service.getPort(PORT_NAME, IServiceDevise.class);

			
			double resConv  = wsDevise.convertir(50.0, "EUR","USD");
			System.out.println("resConversion devise ="+resConv);
		} catch (MalformedURLException e) {
				e.printStackTrace();
		}
	}
	
}
