package com.psp.ut07.ejemplo03;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorAdivina {

    public static void main(String args[]) throws IOException {

        ServerSocket servidor = new ServerSocket(6001);
        System.out.println("Servidor iniciado...");

        // Numero a adivinar entre 1 y 25
        int numero = (int) (1 + 25 * Math.random());
        System.out.println("NÚMERO A ADIVINAR=> " + numero);

        ObjetoCompartido objeto = new ObjetoCompartido(numero);
        int id = 0;
        while (true) {
            Socket cliente = new Socket();
            cliente = servidor.accept(); //esperando cliente	
            id++;
            HiloServidorAdivina hilo = new HiloServidorAdivina(cliente, objeto, id);
            hilo.start();
        }
    }
}
