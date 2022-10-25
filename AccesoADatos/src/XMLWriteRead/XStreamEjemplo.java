/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XMLWriteRead;

import com.thoughtworks.xstream.XStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class XStreamEjemplo {
    
    public static void main(String[] args) {
        XStream xstream = new XStream();
        ListaPersonas lista = new ListaPersonas();
        File f = new File ("./FichPersona.dat");
       
        FileInputStream inp;
        try {
            
            inp = new FileInputStream(f);
            ObjectInputStream oin = new ObjectInputStream(inp);
            
            while(true){
                lista.add((Persona) oin.readObject());
            }
          
        } catch (EOFException eofe){
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XStreamEjemplo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XStreamEjemplo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XStreamEjemplo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            xstream.alias("Persona", Persona.class);
            xstream.aliasField("Anyos", Persona.class, "edad");
            xstream.toXML(lista,new FileOutputStream ("Personas.XML"));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XStreamEjemplo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}


