/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduccion;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class Introduccion2 {

    public static void main(String[] args) {

        //For para buscar en subcarpetas
        /*File f = new File("./..");
        
        for (File fil : f.listFiles()) {
            System.out.println(fil.getName());  
            if(fil.isDirectory()){
                for (File e : fil.listFiles()) {
                    System.out.println("\t"+e.getName());
                    
                }
                System.out.println("----------------");
            }
        }*/
        //Metodo Recursivo
        
        int ntab=0;
       String Dir="./..";
        MetodoRecurrente(Dir);
        //Crear directorias y archivos
        Scanner sc = new Scanner(System.in);
        String ruta;
        String opcion;
        do {
            System.out.println("1-Crear carpetas y ficheros");
            System.out.println("2-Borrar fichero o directorio");
            System.out.println("3-Renombrar fichero o archivo");
            opcion = sc.nextLine();

            if (opcion.equals("1")) {

                System.out.println("Introduzca la ruta");
                ruta = sc.nextLine();
                if (!opcion.equalsIgnoreCase("fin")) {

                    File dirActual = new File(ruta);
                    if (!dirActual.exists()) {
                        boolean exito = dirActual.mkdirs();
                        if (exito) {
                            System.out.println("exito");
                        } else {
                            System.out.println("error al crear carpeta");
                        }
                        if (exito) {
                            System.out.println("Introduzca el nombre del fichero que quiere crear");
                            String nombre = sc.nextLine();
                            File f1 = new File(dirActual.getAbsolutePath() + "/" + nombre);
                            try {
                                if (f1.createNewFile()) {
                                    System.out.println("Exito");
                                } else {
                                    System.out.println("error");
                                }
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                        }

                    }
                }
            } else if (opcion.equals("2")) {
                System.out.println("Introduzca ruta");
                ruta = sc.nextLine();
                File f = new File(ruta);
                if (f.exists()) {
                    if (f.isDirectory() && f.listFiles().length!=0) {
                        

                            System.out.println("Primero tiene que borrar los archivos que contiene, QUiere hacerlo?");
                            String respuesta = sc.nextLine();
                            if (respuesta.equalsIgnoreCase("s")) {
                                System.out.println("Introduzca el nombre del fichero");
                                String nombre = sc.nextLine();
                                File arc = new File(ruta + "/" + nombre);
                                boolean exito=arc.delete();
                                if(exito){
                                    System.out.println("Exito");
                                }else{
                                    System.out.println("Error");
                                }
                            }
                        
                    } else {
                        boolean exito = f.delete();
                        if (exito) {
                            System.out.println("Exito");
                        } else {
                            System.out.println("Error");
                        }
                    }

                }
            } else if (opcion.equals("3")) {
                System.out.println("Introduce la ruta");
                ruta = sc.nextLine();
                File f = new File(ruta);
                if (f.exists()) {
                    System.out.println("Introduce el nombre o la ruta donde desea moverse");
                    String ruta2 = sc.nextLine();
                    boolean exito = f.renameTo(new File(ruta2));
                    if (exito) {
                        System.out.println("Exito");
                    } else {
                        System.out.println("Error");
                    }
                }
            }

        } while (!opcion.equalsIgnoreCase("fin"));

    }

    public static void MetodoRecurrente(String direc) {

        File f = new File(direc);
        if (f.exists()) {

            for (File archivo : f.listFiles()) {

                if (archivo.isDirectory()) {

                    System.out.println("Es un directorio :" + archivo.getName());
                    MetodoRecurrente(archivo.getPath());
                } else {
                    System.out.println("Es un archivo :" + archivo.getName());

                }
            }
        }
    }
}
