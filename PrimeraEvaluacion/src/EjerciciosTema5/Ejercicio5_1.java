/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class Ejercicio5_1 {
    
    public static void main(String[] args) {
        
        //Creando socket servidor
           int puerto=6001;  
        try (ServerSocket servidor = new ServerSocket(puerto);){            
                System.out.println(servidor.getLocalPort());
            //Socket cliente1
            Socket cliente1 = servidor.accept();
            System.out.println(cliente1.getLocalAddress());
            System.out.println(cliente1.getPort());
            //Socket cliente2
            Socket cliente2 = servidor.accept();
            System.out.println(cliente2.getLocalAddress());
            System.out.println(cliente2.getPort());
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
}
