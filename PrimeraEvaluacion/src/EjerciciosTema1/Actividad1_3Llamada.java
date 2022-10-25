/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class Actividad1_3Llamada {

    public static void main(String[] args) {
        DataOutputStream out = null;
        InputStream is=null;
        try {
            File f = new File("./build/classes");
            Process p = new ProcessBuilder("java", "EjerciciosTema1.Actividad1_3").directory(f).start();

            out = new DataOutputStream(p.getOutputStream());
            
            out.flush();
            
             is = p.getInputStream();
            int c;
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }

            is.close();
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if(out!=null){
                try { 
                    out.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            try {
                is.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
        }

    }
}
