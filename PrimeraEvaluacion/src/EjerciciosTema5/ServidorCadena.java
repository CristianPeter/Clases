/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class ServidorCadena {

    public static void main(String[] args) {

        DataInputStream inp = null;
        DataOutputStream out = null;
        Socket cliente1;
        Socket cliente2;
        int port = 6002;
        try (ServerSocket servidor = new ServerSocket(6002);) {
            System.out.println("Iniciando Servidor, Puerto del servidor: " + servidor.getLocalPort());

            System.out.println("Esperando al cliente 1");
            cliente1 = servidor.accept();
            System.out.print("Cliente 1 :\n port: " + cliente1.getPort() + "\n localport: " + cliente1.getLocalPort());

            inp = new DataInputStream(cliente1.getInputStream());
            String cadena = cadena = inp.readUTF().toUpperCase();

            out = new DataOutputStream(cliente1.getOutputStream());
            out.writeUTF(cadena);

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
