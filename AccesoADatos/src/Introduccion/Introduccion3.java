/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduccion;

import GestionControladorFicherosBinarios.MiObjectOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class Introduccion3 {
    public static void main(String[] args) {
        // Para escribir objetos en un fichero
        
        File f=new File("./objetos.txt");
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        
        //Para continuar el fichero
        if(f.exists()){
            try {
                fos=new FileOutputStream(f);
                oos= new ObjectOutputStream(fos);
            } catch (FileNotFoundException ex) {
               ex.printStackTrace();
            }catch(IOException io){
                io.printStackTrace();
            }
            
        }else{
            try {
                fos=new FileOutputStream(f);
                  oos= new MiObjectOutputStream(fos);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Introduccion3.class.getName()).log(Level.SEVERE, null, ex);
            }catch(IOException e){
                e.printStackTrace();
            }
          
        }
        
        List lista= new LinkedList();
        Persona p1 = new Persona("Cristian");
        lista.add(3);
        lista.add('a');
        lista.add(2.5);
        Persona p2= new Persona("Cristian2");
        
        try{
            
          oos.writeObject(lista);
          oos.writeObject(p1);
          oos.writeObject(p2);
            
        } catch (Exception e) {
        }finally{
            try {
                fos.close();
                oos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
        }
        
        //Para leer objetos de un fichero
        
        try (FileInputStream fos1 =new FileInputStream(f);
                ObjectInputStream ois=new ObjectInputStream(fos1);){
            
                List lista2=(List) ois.readObject();
                System.out.println(lista2);
                Persona p=(Persona) ois.readObject();
                System.out.println(p.toString());
                
                Persona p3=(Persona) ois.readObject();
                System.out.println(p3.toString());
                
        } catch (Exception e) {
        }
        
        
        
        
        
    }
}
