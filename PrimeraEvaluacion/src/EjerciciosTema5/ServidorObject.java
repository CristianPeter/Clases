/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema5;

import java.io.EOFException;
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
public class ServidorObject {
    
    public static void main(String[] args) {
        ObjectOutputStream out=null;
        ObjectInputStream inp = null;
        Persona p =null;
        
        Socket cliente=null;
        int port=6001;
        try(ServerSocket servidor= new ServerSocket(port);) {
            System.out.println("Iniciando servidor...\n Puerto: "+ servidor.getLocalPort());
            
            System.out.println("Esperando al cliente...");
            cliente = servidor.accept();
            
            inp = new ObjectInputStream(cliente.getInputStream());
            
            p=(Persona) inp.readObject();
            
            out = new ObjectOutputStream(cliente.getOutputStream());
            
            out.writeObject(p);
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServidorObject.class.getName()).log(Level.SEVERE, null, ex);
        }                  
        finally{
            try {
                out.close();
                inp.close();
            } catch (IOException ex) {
                Logger.getLogger(ServidorObject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
}
