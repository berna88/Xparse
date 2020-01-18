package com.consistent.main;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import com.consistent.models.Rates;
//import com.liferay.portal.kernel.util.ParamUtil;
//import com.liferay.portal.kernel.util.WebKeys;
//import com.liferay.portal.theme.ThemeDisplay;

public class Main {
	
	public static void main(String args[]){
		String path = "/92698/92722/92805/92933/";
		String [] diag = path.split("/");
		System.out.println("Tamaño: "+ diag.length);
	}
	public static final void getRate() throws IOException
	 {
		 Rates rates = new Rates();
		 List<Rates> rate = rates.getListRates();
		 
			try {
				 StringWriter stringWriter = new StringWriter();
		         XMLOutputFactory xMLOutputFactory = XMLOutputFactory.newInstance();
		         XMLStreamWriter xMLStreamWriter = xMLOutputFactory.createXMLStreamWriter(stringWriter);
		         
		         xMLStreamWriter.writeStartDocument();
		         
				for (Rates promocion: rate) {
					xMLStreamWriter.writeStartElement("rate");
						xMLStreamWriter.writeStartElement("guid");
						xMLStreamWriter.writeCharacters(promocion.getGuid());
						xMLStreamWriter.writeEndElement();
						
						xMLStreamWriter.writeStartElement("code");
						xMLStreamWriter.writeCharacters(promocion.getCode());
						xMLStreamWriter.writeEndElement();
						
						xMLStreamWriter.writeStartElement("name");
						xMLStreamWriter.writeCharacters(promocion.getName());
						xMLStreamWriter.writeEndElement();
						
						xMLStreamWriter.writeStartElement("title");
						xMLStreamWriter.writeCharacters(promocion.getTitle());
						xMLStreamWriter.writeEndElement();
						
						xMLStreamWriter.writeStartElement("language");
						xMLStreamWriter.writeCharacters(promocion.getLanguage());
						xMLStreamWriter.writeEndElement();
						
						xMLStreamWriter.writeStartElement("keyword");
						xMLStreamWriter.writeCharacters(promocion.getKeyword());
						xMLStreamWriter.writeEndElement();
						
						xMLStreamWriter.writeStartElement("channel");
						xMLStreamWriter.writeCharacters(promocion.getChannel());
						xMLStreamWriter.writeEndElement();
						
						xMLStreamWriter.writeStartElement("shortDescription");
						xMLStreamWriter.writeCharacters(promocion.getShortDescription());
						xMLStreamWriter.writeEndElement();
						
						xMLStreamWriter.writeStartElement("description");
						xMLStreamWriter.writeCharacters(promocion.getDescription());
						xMLStreamWriter.writeEndElement();
						
						xMLStreamWriter.writeStartElement("order");
						xMLStreamWriter.writeCharacters(promocion.getOrder());
						xMLStreamWriter.writeEndElement();
						
						xMLStreamWriter.writeStartElement("benefits");
						xMLStreamWriter.writeCharacters(promocion.getBenefits());
						xMLStreamWriter.writeEndElement();
						
						xMLStreamWriter.writeStartElement("restrictions");
						xMLStreamWriter.writeCharacters(promocion.getRestrictions());
						xMLStreamWriter.writeEndElement();
						
						xMLStreamWriter.writeStartElement("enddate");
						xMLStreamWriter.writeCharacters(promocion.getEnddate());
						xMLStreamWriter.writeEndElement();
						
						xMLStreamWriter.writeStartElement("currency");
						xMLStreamWriter.writeCharacters(promocion.getCurrency());
						xMLStreamWriter.writeEndElement();
					xMLStreamWriter.writeEndElement();
				 }
				
					xMLStreamWriter.flush();
					xMLStreamWriter.close();

		         String xmlString = stringWriter.getBuffer().toString();

		         stringWriter.close();

		         System.out.println(xmlString);
				
					
			} catch (XMLStreamException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	 }
	
	public void parse() {
 try {
			 
			 Rates rates = new Rates();
			 List<Rates> rate = rates.getListRates();
			 
	         StringWriter stringWriter = new StringWriter();

	         XMLOutputFactory xMLOutputFactory = XMLOutputFactory.newInstance();
	         XMLStreamWriter xMLStreamWriter = xMLOutputFactory.createXMLStreamWriter(stringWriter);
	   
	         xMLStreamWriter.writeStartDocument();
	         
	         xMLStreamWriter.writeStartElement("contents");
	         	xMLStreamWriter.writeStartElement("content");
	         		xMLStreamWriter.writeStartElement("brand");
	         		
	         			xMLStreamWriter.writeStartElement("guid");
	         			xMLStreamWriter.writeCharacters("12324");
	         			xMLStreamWriter.writeEndElement();//fin de guid
	         			
	         			xMLStreamWriter.writeStartElement("code");
	         			xMLStreamWriter.writeCharacters("FA");
	         			xMLStreamWriter.writeEndElement();//fin de code
	         			
	         			xMLStreamWriter.writeStartElement("name");
	         			xMLStreamWriter.writeCharacters("Fiesta Americana");
	         			xMLStreamWriter.writeEndElement();//fin de name
	         			
	         			xMLStreamWriter.writeStartElement("title");
	         			xMLStreamWriter.writeCharacters("12324");
	         			xMLStreamWriter.writeEndElement();//fin de title
	         			
	         			xMLStreamWriter.writeStartElement("language");
	         			xMLStreamWriter.writeCharacters("spanish");
	         			xMLStreamWriter.writeEndElement();//fin de language
	         			
	         			xMLStreamWriter.writeStartElement("keyword");
	         			xMLStreamWriter.writeCharacters("");
	         			xMLStreamWriter.writeEndElement();//fin de keyword
	         			
	         			xMLStreamWriter.writeStartElement("order");
	         			xMLStreamWriter.writeCharacters("0");
	         			xMLStreamWriter.writeEndElement();//fin de order
	         			
	         			xMLStreamWriter.writeStartElement("channel");
	         			xMLStreamWriter.writeCharacters("www");
	         			xMLStreamWriter.writeEndElement();//fin de channel
	         			
	         			xMLStreamWriter.writeStartElement("rates");
	         			
	         			for (Rates promocion: rate) {
	    					xMLStreamWriter.writeStartElement("rate");
	    						xMLStreamWriter.writeStartElement("guid");
	    						xMLStreamWriter.writeCharacters(promocion.getGuid());
	    						xMLStreamWriter.writeEndElement();
	    						
	    						xMLStreamWriter.writeStartElement("code");
	    						xMLStreamWriter.writeCharacters(promocion.getCode());
	    						xMLStreamWriter.writeEndElement();
	    						
	    						xMLStreamWriter.writeStartElement("name");
	    						xMLStreamWriter.writeCharacters(promocion.getName());
	    						xMLStreamWriter.writeEndElement();
	    						
	    						xMLStreamWriter.writeStartElement("title");
	    						xMLStreamWriter.writeCharacters(promocion.getTitle());
	    						xMLStreamWriter.writeEndElement();
	    						
	    						xMLStreamWriter.writeStartElement("language");
	    						xMLStreamWriter.writeCharacters(promocion.getLanguage());
	    						xMLStreamWriter.writeEndElement();
	    						
	    						xMLStreamWriter.writeStartElement("keyword");
	    						xMLStreamWriter.writeCharacters(promocion.getKeyword());
	    						xMLStreamWriter.writeEndElement();
	    						
	    						xMLStreamWriter.writeStartElement("channel");
	    						xMLStreamWriter.writeCharacters(promocion.getChannel());
	    						xMLStreamWriter.writeEndElement();
	    						
	    						xMLStreamWriter.writeStartElement("shortDescription");
	    						xMLStreamWriter.writeCharacters(promocion.getShortDescription());
	    						xMLStreamWriter.writeEndElement();
	    						
	    						xMLStreamWriter.writeStartElement("description");
	    						xMLStreamWriter.writeCharacters(promocion.getDescription());
	    						xMLStreamWriter.writeEndElement();
	    						
	    						xMLStreamWriter.writeStartElement("order");
	    						xMLStreamWriter.writeCharacters(promocion.getOrder());
	    						xMLStreamWriter.writeEndElement();
	    						
	    						xMLStreamWriter.writeStartElement("benefits");
	    						xMLStreamWriter.writeCharacters(promocion.getBenefits());
	    						xMLStreamWriter.writeEndElement();
	    						
	    						xMLStreamWriter.writeStartElement("restrictions");
	    						xMLStreamWriter.writeCharacters(promocion.getRestrictions());
	    						xMLStreamWriter.writeEndElement();
	    						
	    						xMLStreamWriter.writeStartElement("enddate");
	    						xMLStreamWriter.writeCharacters(promocion.getEnddate());
	    						xMLStreamWriter.writeEndElement();
	    						
	    						xMLStreamWriter.writeStartElement("currency");
	    						xMLStreamWriter.writeCharacters(promocion.getCurrency());
	    						xMLStreamWriter.writeEndElement();
	    					xMLStreamWriter.writeEndElement();
	    				 }
	         				
	         			xMLStreamWriter.writeEndElement();//fin de rates
	         			
	         			xMLStreamWriter.writeStartElement("hotel");
	         			
	         				xMLStreamWriter.writeStartElement("guid");
	         				xMLStreamWriter.writeCharacters("2683022");
	         				xMLStreamWriter.writeEndElement();//fin de guid
	         				
	         				xMLStreamWriter.writeStartElement("code");
	         				xMLStreamWriter.writeCharacters("FCC");
	         				xMLStreamWriter.writeEndElement();//fin de code
	         				
	         				xMLStreamWriter.writeStartElement("name");
	         				xMLStreamWriter.writeCharacters("Fiesta Americana Condesa Cancún All Inclusive");
	         				xMLStreamWriter.writeEndElement();//fin de name
	         				
	         				xMLStreamWriter.writeStartElement("title");
	         				xMLStreamWriter.writeCharacters("Fiesta Americana Condesa Cancún All Inclusive");
	         				xMLStreamWriter.writeEndElement();//fin de title
	         				
	         				xMLStreamWriter.writeStartElement("language");
	         				xMLStreamWriter.writeCharacters("spanish");
	         				xMLStreamWriter.writeEndElement();//fin de language
	         				
	         				xMLStreamWriter.writeStartElement("keyword");
	         				xMLStreamWriter.writeCharacters("[meetings, conventions, business, vacation, active, family, fiestaamericana, beach, weddings, romance, spa, cancun, 5, allinclusive, eco, fiestaamericanacondesacancun]");
	         				xMLStreamWriter.writeEndElement();//fin de keyword
	         				
	         				xMLStreamWriter.writeStartElement("shortDescription");
	         				xMLStreamWriter.writeCharacters("shortDescription");
	         				xMLStreamWriter.writeEndElement();//fin de shortDescription
	         				
	         				xMLStreamWriter.writeStartElement("description");
	         				xMLStreamWriter.writeCharacters("description");
	         				xMLStreamWriter.writeEndElement();//fin de description
	         				
	         				xMLStreamWriter.writeStartElement("order");
	         				xMLStreamWriter.writeCharacters("0");
	         				xMLStreamWriter.writeEndElement();//fin de order
	         				
	         				xMLStreamWriter.writeStartElement("channel");
	         				xMLStreamWriter.writeCharacters("www");
	         				xMLStreamWriter.writeEndElement();//fin de channel
	         				
	         				xMLStreamWriter.writeStartElement("medialinks");
	         				//medialink
	         				xMLStreamWriter.writeEndElement();//fin de medialinks
	         				
	         				xMLStreamWriter.writeStartElement("locations");
	         				
	         					xMLStreamWriter.writeStartElement("address");
	         					xMLStreamWriter.writeCharacters("Blvd.Kukulkán km 16.5 Zona Hotelera");
	         					xMLStreamWriter.writeEndElement();//fin de address
	         					
	         					xMLStreamWriter.writeStartElement("city");
	         					xMLStreamWriter.writeCharacters("Cancún");
	         					xMLStreamWriter.writeEndElement();//fin de city
	         					
	         					xMLStreamWriter.writeStartElement("country");
	         					xMLStreamWriter.writeCharacters("México");
	         					xMLStreamWriter.writeEndElement();//fin de country
	         					
	         					xMLStreamWriter.writeStartElement("directions");
	         					xMLStreamWriter.writeCharacters("En el centro de la zona hotelera, a 15 km del aeropuerto internacional y a unos min.de los mejores lugares turísticos de Cancún: Plaza Caracol, Plaza Kukulcán, La Isla, Wet¿n Wild, Centro de Convenciones y el mercado de artesanías, entre otros.| Fiesta Americana Condesa Cancún se encuentra a tan sólo 20 minutos del aeropuerto de la ciudad  y a 30 minutos de la central de autobuses.");
	         					xMLStreamWriter.writeEndElement();//fin de directions
	         					
	         					xMLStreamWriter.writeStartElement("latitude");
	         					xMLStreamWriter.writeCharacters("21.081098");
	         					xMLStreamWriter.writeEndElement();//fin de latitude
	         					
	         					xMLStreamWriter.writeStartElement("longitude");
	         					xMLStreamWriter.writeCharacters("-86.773696");
	         					xMLStreamWriter.writeEndElement();//fin de longitude
	         					
	         					xMLStreamWriter.writeStartElement("references");
	         					xMLStreamWriter.writeCharacters("-El hotel se localiza en el corazón de la Zona Hotelera, sobre el Blvd. Kukulcán, avenida principal de Cancún; muy cerca de restaurantes, parques temáticos, discotecas, centros de diversión, tiendas y boutiques.| - Xcaret - Xel-Ha - Chichen-Itza - Tulum - Isla Mujeres");
	         					xMLStreamWriter.writeEndElement();//fin de references
	         					
	         					xMLStreamWriter.writeStartElement("state");
	         					xMLStreamWriter.writeCharacters("Quintana Roo");
	         					xMLStreamWriter.writeEndElement();//fin de state
	         					
	         					xMLStreamWriter.writeStartElement("zip");
	         					xMLStreamWriter.writeCharacters("77500");
	         					xMLStreamWriter.writeEndElement();//fin de zip

	         				xMLStreamWriter.writeEndElement();//fin de locations
	         				
	         				xMLStreamWriter.writeStartElement("telephones");
     							xMLStreamWriter.writeStartElement("telephone");
     						
     								xMLStreamWriter.writeStartElement("number");
     								xMLStreamWriter.writeEndElement();//fin de number
     							
     								xMLStreamWriter.writeStartElement("type");
     								xMLStreamWriter.writeEndElement();//fin de type
     							
     							xMLStreamWriter.writeEndElement();//fin de telephone
     						xMLStreamWriter.writeEndElement();//fin de telephones
     						
     						xMLStreamWriter.writeStartElement("rooms");
 								xMLStreamWriter.writeStartElement("room");
 						
 									xMLStreamWriter.writeStartElement("guid");
 									xMLStreamWriter.writeCharacters("1521898");
 									xMLStreamWriter.writeEndElement();//fin de guid room
 							
 									xMLStreamWriter.writeStartElement("code");
 									xMLStreamWriter.writeCharacters("DDP");
 									xMLStreamWriter.writeEndElement();//fin de code room
 									
 									xMLStreamWriter.writeStartElement("name");
 									xMLStreamWriter.writeCharacters("Accesible Room");
 									xMLStreamWriter.writeEndElement();//fin de name room
 									
 									xMLStreamWriter.writeStartElement("title");
 									xMLStreamWriter.writeCharacters("Accesible Room - FCC");
 									xMLStreamWriter.writeEndElement();//fin de name title
 									
 									xMLStreamWriter.writeStartElement("language");
 									xMLStreamWriter.writeCharacters("spanish");
 									xMLStreamWriter.writeEndElement();//fin de language room
 									
 									xMLStreamWriter.writeStartElement("keyword");
 									xMLStreamWriter.writeCharacters("rooms, fa, fiesta americana, playa, beach, standard, cancun, cancún");
 									xMLStreamWriter.writeEndElement();//fin de keyword room
 									
 									xMLStreamWriter.writeStartElement("shortDescription");
 									xMLStreamWriter.writeCharacters("");
 									xMLStreamWriter.writeEndElement();//fin de shortDescription room
 									
 									xMLStreamWriter.writeStartElement("description");
 									xMLStreamWriter.writeCharacters("");
 									xMLStreamWriter.writeEndElement();//fin de description room
 									
 									xMLStreamWriter.writeStartElement("order");
 									xMLStreamWriter.writeCharacters("0");
 									xMLStreamWriter.writeEndElement();//fin de order room
 									
 									xMLStreamWriter.writeStartElement("channel");
 									xMLStreamWriter.writeCharacters("www");
 									xMLStreamWriter.writeEndElement();//fin de channel room
 									
 									xMLStreamWriter.writeStartElement("medialinks");
 									
	 									xMLStreamWriter.writeStartElement("type");
	 									xMLStreamWriter.writeCharacters("www");
	 									xMLStreamWriter.writeEndElement();//fin de type room
 									
	 									xMLStreamWriter.writeStartElement("keyword");
	 									xMLStreamWriter.writeCharacters("www");
	 									xMLStreamWriter.writeEndElement();//fin de keyword room
	 									
	 									xMLStreamWriter.writeStartElement("multimedia");
	 										
		 									xMLStreamWriter.writeStartElement("url");
		 									xMLStreamWriter.writeCharacters("/documents/1501403/1502155/PKG_280x195.jpg/05f173d5-966d-7f94-1a18-593fac6183b8?t=1544170267559");
		 									xMLStreamWriter.writeEndElement();//fin de url room
	 										
	 									xMLStreamWriter.writeEndElement();//fin de multimedia room
 									
 									xMLStreamWriter.writeEndElement();//fin de medialinks room
 							
 								xMLStreamWriter.writeEndElement();//fin de telephone
 							xMLStreamWriter.writeEndElement();//fin de telephones
	         				
	         			xMLStreamWriter.writeEndElement();//fin de hotel
	         
	         
	         
	         		xMLStreamWriter.writeEndElement();// fin de brand
	         	xMLStreamWriter.writeEndElement();// fin de content
	         xMLStreamWriter.writeEndElement();// fin de contents
	         
	         xMLStreamWriter.flush();
	         xMLStreamWriter.close();

	         String xmlString = stringWriter.getBuffer().toString();

	         stringWriter.close();

	         System.out.println(xmlString);
	         
	         

	      } catch (XMLStreamException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	}
	 
	
}
