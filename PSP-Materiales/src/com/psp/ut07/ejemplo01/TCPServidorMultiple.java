package com.psp.ut07.ejemplo01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
import java.io.*;
import java.net.*;

public class TCPServidorMultiple {

    public static void main(String args[]) throws IOException {
        ServerSocket servidor;
        servidor = new ServerSocket(6000);
        System.out.println("Servidor iniciado...");

        while (true) {
            Socket cliente = new Socket();
            cliente = servidor.accept();//esperando cliente

            TCPHiloServidor hilo = new TCPHiloServidor(cliente);
            hilo.start();
        }
    }
}
