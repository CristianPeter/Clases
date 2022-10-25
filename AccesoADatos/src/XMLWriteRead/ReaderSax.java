/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XMLWriteRead;

import com.thoughtworks.xstream.XStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 *
 * @author dev
 */
public class ReaderSax {
    
    public static void main(String[] args) {
        
        try {
             GestionContenido gestor = new GestionContenido();
            //Creamos un SAXParserFactory para crear un SAXParser
            SAXParserFactory procesador = SAXParserFactory.newInstance();
            SAXParser parser = procesador.newSAXParser();
            //Con el SAXParser creamos un XMLReader
            XMLReader reader = parser.getXMLReader();            
            //Al XMLReader asignamos el default handler
           
            
            reader.setContentHandler(gestor);
            InputSource fileXML = new InputSource("Personas2.dat");
           reader.parse(fileXML);
            
           
           /* XMLReader procesadorXML = XMLReaderFactory.createXMLReader();
            GestionContenido gestor = new GestionContenido();
            procesadorXML.setContentHandler(gestor);*/
            
            //procesadorXML.parse(fileXML);
            
             
            
            
        } catch (SAXException ex) {
            Logger.getLogger(ReaderSax.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ReaderSax.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReaderSax.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

class GestionContenido extends DefaultHandler{
    
    
    public GestionContenido(){
        super();
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Inicio del Documento");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Final del documento");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes); 
        System.out.println("Principio Elemento: "+localName);
        
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        System.out.println("Final Elemento: " +localName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length); 
        String atributo = new String(ch, start, length);
        
        atributo= atributo.replaceAll("[\t\n]", atributo);
        System.out.println(atributo);
    }
    
    
    
   
    
    
    
    
    
}
