/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XMLWriteRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**
 *
 * @author dev
 */
public class Exec {

    public static void main(String[] args) {

        File f = new File("./FichPersona.dat");
        Persona array[] = {new Persona("Cristian", 25),
            new Persona("Roberto Mateos", 43),
            new Persona("Rocio Sanz", 23),
            new Persona("Abel", 22),
            new Persona("Maria", 18)};

        try (FileOutputStream fout = new FileOutputStream(f);
                ObjectOutputStream out = new ObjectOutputStream(fout);) {
            for (Persona persona : array) {
                out.writeObject(persona);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList<Persona> ls = new ArrayList<Persona>();
        //LeyendoFichero
        try (FileInputStream fin = new FileInputStream(f);
                ObjectInputStream oin = new ObjectInputStream(fin);) {

            try {

                while (true) {
                    ls.add((Persona) oin.readObject());
                }
            } catch (Exception e) {
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Persona l : ls) {
            System.out.println(l.toString());
        }

        //Creando XML
        try {
            DocumentBuilderFactory Factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder Builder = Factory.newDocumentBuilder();
            //Con el DocumentBuilder nos permite obtener la implementacion DOM
            DOMImplementation DOM = Builder.getDOMImplementation();
            //Creamos el documento con la implementacion DOM
            //Al crear el documento se nos requiere el nombre de la raiz del documento xml
            Document document = DOM.createDocument(null, "Personas", null);
            //Primero establecemos la version del XML
            document.setXmlVersion("1.0");
            //Creamos el nodo persona

            Element elemento;

            for (Persona l : ls) {
                //Este elemento es el elemento persona que se va a pegar a la raiz del documento Personas
                elemento = AnyadirNodo(document);
                //Crea los nodos hijos de persona
                AnyadirHijo("Nombre", l.getNombre(), elemento, document);
                AnyadirHijo("Edad", String.valueOf(l.getEdad()), elemento, document);

                Source source = new DOMSource(document);
                Result resultado = new StreamResult("Personas2.dat");
                Transformer transform = TransformerFactory.newInstance().newTransformer();
                transform.transform(source, resultado);
            }

        } catch (ParserConfigurationException e) {
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(Exec.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(Exec.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
        
        
        //Leyendo XML
        try {
            //Creamos instancia de DocumentBuilderFactoy para crear un DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            //Creamos un document con el build y con la funcion parse y el File que queremos leer
            Document document = builder.parse("Personas2.dat");
            //Creamos una lista de nodos de todos elementos Persona
            NodeList personas = document.getElementsByTagName("Persona");
            
            //Recorremos el nodeList
            for(int i = 0; i<personas.getLength();i++){
                //Cogemos cada nodo
                Node persona=personas.item(i);
               // if(persona.getNodeType()==Node.ELEMENT_NODE){ //Si ese nodo es un nodo elemento o no. 
                    Element elemento1 = (Element)persona; //Creamos un Element del nodo anterior 
                    System.out.print(elemento1.getElementsByTagName("Nombre").item(0).getTextContent()+ " "); //De ese Elemento Persona cogemos sus elementos hijos y con item y getTextContent cogemos sus valores
                    System.out.println(elemento1.getElementsByTagName("Edad").item(0).getTextContent());//De ese Elemento Persona cogemos sus elementos hijos y con item y getTextContent cogemos sus valores
                    
                //}
            }
        } catch (ParserConfigurationException e) {

        } catch (IOException ex) {
            Logger.getLogger(Exec.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(Exec.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void AnyadirHijo(String nombreNodo, String valor, Element raiz, Document document) {
        //Crea el nombre del Elemento
        Element elem = document.createElement(nombreNodo);
        //Introduce el valor del nodo
        Text txt = document.createTextNode(valor);
        //Pega el nodo creado ahora mismo al nodo anterior que es Persona;
        //Se pega el nodo nuevo al anterior
        raiz.appendChild(elem);
        //Se establece el valor al nodo nuevo
        elem.appendChild(txt);
    }

    public static Element AnyadirNodo(Document document) {
        //Creas el elemento Persona
        Element raiz = document.createElement("Persona");
        //Lo pegas a la raiz del fichero
        document.getDocumentElement().appendChild(raiz);
        return raiz;
    }

}
