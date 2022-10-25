/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduccion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class Introduccion1 {

    public static void main(String args[]) {
        /* System.out.println("La carpeta de mi usuario es: "+System.getProperty("user.home"));
        System.out.println("El caracter separador es : "+System.getProperty( "file.separator"));
        System.out.println("La direccion del proyecto es: "+System.getProperty("user.dir"));
        System.out.println("El separador para las rutas es: "+System.getProperty("path.separator"));*/

        //Clase FIle
//        File f = new File("./../");
//
//        for (File e : f.listFiles()) {
//            System.out.println(e.getName());
//            System.out.println("Es directorio: " + e.isDirectory());
//            System.out.println("Es archivo: " + e.isFile());
//            System.out.println("Archivo padre: " + e.getParent());
//            System.out.println("Ejecucion: " + e.canExecute());
//            System.out.println("Lectura: " + e.canRead());
//            System.out.println("Escritura: " + e.canWrite());
//        }
//
//        //FileWriter and PrintWriter
//        try (FileWriter fichero = new FileWriter("fichero.txt", false);//True mantiene el archivo y lo añade al final
//                PrintWriter escritor = new PrintWriter(fichero);) {
//            escritor.println("Esto es una");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //BufferedReader //Buscar leer archivos con BufferedReader;
        //Los datos leidos se cargan en un buffer intermedio, que es como un archivo intermedio que se genera
        //Lo que permite que una vez que este cargado poder leer direcamente del buffer sin acceder al archivo
        //En un servidor por ejemplo no hace falta tener conexion para poder leer.
//        File fichero=null;
//        FileReader lector=null;
//        BufferedReader buffer=null;
//        
//        try {
//            buffer = new BufferedReader(new FileReader(new File("archivo.txt")));
//            String linea=null;
//            while((linea=buffer.readLine())!=null){
//                System.out.println(linea);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally{
//            try {
//                buffer.close();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
//        
        //Generar un Fichero de Configuracion
        //Para escribir un documento se utiliza la funcion store que pide un escriitor y el nombre del fichero de configuracion
        //Para escribir se utiliza la clase OutputStream, en este caso la subclase que hereda de esta que es FIleOutputStream
        //El constructor de FileOutputStream recibe el nombre del fichero.
        
        /*Properties configuracion = new Properties();
        configuracion.setProperty("user", "miUsuario");
        configuracion.setProperty("password", "miContraseña");
        configuracion.setProperty("server", "elServidor");
        configuracion.setProperty("port", "elPuerto");

        try {
            configuracion.store(new FileOutputStream("configuracion.props"), "Fichero de configuracion");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        }*/
        
        //Leer fichero de configuracion
        
        Properties configuracion1=new Properties();
        try {
            configuracion1.load(new FileInputStream("configuracion.props"));
            String usuario=configuracion1.getProperty("user");
            String password=configuracion1.getProperty("password");
            String servidor=configuracion1.getProperty("server");
            String puerto=configuracion1.getProperty("port");
            
            
        } catch (FileNotFoundException fnfe) {
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        

        //Para crear un objeto de la clase abstracta Path se utiliza Paths que es una subclase
        /*Path path = Paths.get("/home/dev/NetBeansProjects/");

        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0, 2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());
        System.out.println(path.isAbsolute());
        System.out.println(path.toUri());
        File f = path.toFile();*/

    }
}
