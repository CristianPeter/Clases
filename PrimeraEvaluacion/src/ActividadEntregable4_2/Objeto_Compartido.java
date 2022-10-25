/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActividadEntregable4_2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class Objeto_Compartido {
   private final File f = new File("./ObjetoCompartido");
    
    public void EscribirFichero(String txt){
              
                 FileWriter fw = null;
                 
                if(f.exists()){
                     try {
                         fw = new FileWriter(f,true);
                         fw.write(txt); 
                     } catch (IOException ex) {
                         Logger.getLogger(Objeto_Compartido.class.getName()).log(Level.SEVERE, null, ex);
                     }                         
            }else{
                     try {
                         fw= new FileWriter (f);
                         fw.write(txt);
                     } catch (IOException ex) {
                        ex.printStackTrace();
                     }
            }
        
        
        try {  
         
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public boolean LeerFichero(){
       
        String txt="";
                try (FileReader fr = new FileReader(f);){
                    int c=fr.read();
                    while(c!=-1){
                       txt+= fr.read();
                       c=fr.read();
                    }
                    System.out.println(txt);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
               
         return false;     
      
    
        
    }
}
