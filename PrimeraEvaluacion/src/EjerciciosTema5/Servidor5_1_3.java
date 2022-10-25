/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class Servidor5_1_3 {
    
    public static void main(String[] args) {
        
        DataInputStream inp = null;
        DataOutputStream out = null;
        Socket cliente1;
        int port = 6002;
        try (ServerSocket servidor = new ServerSocket(6002);) {
            System.out.println("Iniciando Servidor, Puerto del servidor: " + servidor.getLocalPort());
            int contador=0;
            while(true){
                System.out.println("Esperando al cliente 1");
            cliente1 = servidor.accept();           
            System.out.print("Cliente 1 :\n port: " + cliente1.getPort() + "\n localport: " + cliente1.getLocalPort());
            
            //Lectura
           // inp = new DataInputStream(cliente1.getInputStream()); 
            //String cadena = inp.readUTF().toUpperCase();
            contador++;
            //Escritura
            out = new DataOutputStream(cliente1.getOutputStream());
            out.writeUTF("Eres el cliente: "+contador);
            }
            

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                inp.close();
                out.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
        
        
    }
}
