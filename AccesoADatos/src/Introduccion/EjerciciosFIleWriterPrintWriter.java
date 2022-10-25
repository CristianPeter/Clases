/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduccion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class EjerciciosFIleWriterPrintWriter {

    public static void main(String[] args) {
        
        //Contar vocales
        int array[] = new int[5];
        File f = new File("./ContarVocales");
        String texto = "";
        try {
            FileReader fr = new FileReader(f);
            int Finalizar=fr.read();
            while (Finalizar != -1) {
                texto = texto + (char)Finalizar;
                Finalizar=fr.read();
            }
            texto = texto.toLowerCase();
            System.out.println(texto);

            for (int i = 0; i < texto.length(); i++) {
                if (texto.charAt(i) == 'a') {
                    array[0] += 1;
                } else if (texto.charAt(i) == 'e') {
                    array[1] += 1;
                } else if (texto.charAt(i) == 'i') {
                    array[2] += 1;
                } else if (texto.charAt(i) == 'o') {
                    array[3] += 1;
                } else if (texto.charAt(i) == 'u') {
                    array[4] += 1;
                }
            }

            System.out.println("A: "+array[0]+" E: "+array[1]+" I: "+array[2]+" O: "+array[3]+" U: "+array[4]);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        //Contar palabras
        
        File fich = new File("./ContarPalabras");
        String texto2="";
        int contador=0;
        try {
            FileReader fr= new FileReader(fich);
            int finalizar = fr.read();
            while(finalizar!=-1){
                  texto2=texto2+(char)finalizar;
                  finalizar=fr.read();
            }
              for(int i=0;i<texto2.length();i++){
                if(texto2.charAt(i)==' '){
                    contador+=1;
                }
            }
              System.out.println(texto2);
           
            System.out.println("Numero de palabras: "+contador);
           
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
           ex.printStackTrace();
        }

    }

}
