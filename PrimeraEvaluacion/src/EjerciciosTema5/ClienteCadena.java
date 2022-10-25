/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class ClienteCadena {

    public static void main(String[] args) {
        DataOutputStream out = null;
        DataInputStream inp = null;
        Scanner sc = null;
        String ip = "localhost";
        int port = 6002; //PUERTO REMOTO
        try (Socket cliente = new Socket(ip, port);) {
            sc = new Scanner(System.in);
            System.out.println("port: " + cliente.getPort());
            System.out.println("localport: " + cliente.getLocalPort());

            out = new DataOutputStream(cliente.getOutputStream());

            System.out.println("Introduce la cadena a enviar: ");
            String texto = sc.nextLine();
            out.writeUTF(texto);

            inp = new DataInputStream(cliente.getInputStream());
            String txt = inp.readUTF();
            System.out.println("La cadena devuelta en Mayuscula :\n" + txt);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                out.close();
                inp.close();
                if (sc != null) {
                    sc.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

    }
}
