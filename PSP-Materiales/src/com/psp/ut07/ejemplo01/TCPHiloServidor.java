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

public class TCPHiloServidor extends Thread {

    BufferedReader fentrada;
    PrintWriter fsalida;
    Socket socket = null;

    public TCPHiloServidor(Socket s) throws IOException {// CONSTRUCTOR
        socket = s;
        // se crean flujos de entrada y salida
        fsalida = new PrintWriter(socket.getOutputStream(), true);
        fentrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    public void run() {// tarea a realizar con el cliente
        String cadena = "";

        System.out.println("COMUNICO CON: " + socket.toString());

        while (!cadena.trim().equals("*")) {
            try {
                cadena = fentrada.readLine();
                System.out.println("Recibido: " + cadena);
            } catch (IOException e) {
                e.printStackTrace();
            } // obtener cadena
            fsalida.println(cadena.trim().toUpperCase());// enviar mayúscula
        } // fin while

        System.out.println("FIN CON: " + socket.toString());

        fsalida.close();
        try {
            fentrada.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
