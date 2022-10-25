/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class LlamadaLeerNombre {

    public static void main(String[] args) throws IOException {
        //Cambiar directorio de trabajo
        File f = new File("./build/classes");
        
      
        ProcessBuilder pb = new ProcessBuilder("java", "EjerciciosTema1.LeerNombre","hola");

        pb.directory(f);

        try {
            Process p = pb.start();
         
            
            InputStream is =p.getErrorStream();
            int c;
            while((c=is.read())!=-1){
                System.out.print((char)c);
            }
            System.out.println( p.waitFor());
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }
}
