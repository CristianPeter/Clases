/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduccion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static java.util.Map.entry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class ComprobarDNI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File f = new File("./dni.bin");
        FileWriter fw = null;
        Map<Integer, String> ls = Map.ofEntries(
                entry(0, "T"),
                entry(1, "R"),
                entry(2, "W"),
                entry(3, "A"),
                entry(4, "G"),
                entry(5, "M"),
                entry(6, "Y"),
                entry(7, "F"),
                entry(8, "P"),
                entry(9, "D"),
                entry(10, "X"),
                entry(11, "B"),
                entry(12, "N"),
                entry(13, "J"),
                entry(14, "Z"),
                entry(15, "S"),
                entry(16, "Q"),
                entry(17, "V"),
                entry(18, "H"),
                entry(19, "L"),
                entry(20, "C"),
                entry(21, "K"),
                entry(22, "E"));

        System.out.println("Introduzca su DNI");
        String dni = sc.nextLine();
        try {
            int numeroDni = Integer.parseInt(dni.substring(0, 8));
            int r = numeroDni % 23;
            if (ls.get(r).equalsIgnoreCase(dni.substring(dni.length() - 1))) {
                System.out.println("DNI valido e introducido en el fichero");
                fw = new FileWriter(f, true);
                fw.write(dni+System.getProperty("line.separator"));
            } else {
                System.out.println("DNI Invalido");
            }
            System.out.println("FIN DEL PROGRAMA");
        } catch (IOException io) {
            io.printStackTrace();
        } catch (StringIndexOutOfBoundsException ne) {
            System.out.println("Error de formato");
        } finally {
            if(fw!=null){
                  try {
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
             
            }
         
        }

    }
}
