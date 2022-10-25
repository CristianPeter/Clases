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

/**
 *
 * @author dev
 */
public class Cliente5_1_3 {

    public static void main(String[] args) {

        DataOutputStream out = null;
        DataInputStream inp = null;
        Socket cliente=null;
        Scanner sc = null;
        String ip = "localhost";
        int port = 6002; //PUERTO REMOTO
        
        try {
            for(int i = 0; i<3;i++){
                cliente = new Socket(ip, port);
            sc = new Scanner(System.in);
            System.out.println("port: " + cliente.getPort());
            System.out.println("localport: " + cliente.getLocalPort());

            inp = new DataInputStream(cliente.getInputStream());;
            System.out.println(inp.readUTF());
            }       
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if(inp!=null){
                    inp.close();
                }
                
                if (sc != null) {
                    sc.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

    }
}
