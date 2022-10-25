/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psp.ut05.actividades;

import java.net.*;

/**
 *
 * @author enogal
 */
public class Servidor {

    public static void main(String[] args) {
        int puerto = 6000;// Puerto
        ServerSocket servidor = null;
        Socket cliente1 = null;
        Socket cliente2 = null;
        try {
            servidor = new ServerSocket(puerto);
            System.out.println("Escuchando en " + servidor.getLocalPort());
            
            cliente1 = servidor.accept();//esperando a un cliente
            //realizar acciones con cliente1
            System.out.println("Puerto remoto: " + cliente1.getPort());
            System.out.println("Puerto local: " + cliente1.getLocalPort());
            
            cliente2 = servidor.accept();//esperando a otro cliente
            //realizar acciones con cliente2
            System.out.println("Puerto remoto: " + cliente2.getPort());
            System.out.println("Puerto local: " + cliente2.getLocalPort());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (cliente1 != null) {
                    cliente1.close();
                }
                if (cliente2 != null) {
                    cliente2.close();
                }
                if (servidor != null) {
                    servidor.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
