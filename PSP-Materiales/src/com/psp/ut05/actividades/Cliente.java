/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psp.ut05.actividades;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author enogal
 */
public class Cliente {

    public static void main(String[] args) {
        String host = "localhost";
        int puerto = 6000;//puerto remoto
        System.out.println("PROGRAMA CLIENTE INICIADO....");
        Socket cliente = null;
        try {
            cliente = new Socket(host, puerto);
            System.out.println("Puerto local: " + cliente.getLocalPort());
            System.out.println("Puerto remoto: " + cliente.getPort());
            System.out.println("Nombre host/ip: " + cliente.getInetAddress());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cliente != null) {
                try {
                    cliente.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
