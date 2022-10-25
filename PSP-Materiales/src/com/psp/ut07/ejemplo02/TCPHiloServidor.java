package com.psp.ut07.ejemplo02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
import com.psp.ut07.ejemplo01.*;
import java.io.*;
import java.net.*;

public class TCPHiloServidor extends Thread {

    BufferedReader fentrada;
    PrintWriter fsalida;
    Socket socket = null;
    Compartido c = null;

    public TCPHiloServidor(Socket s, Compartido c) throws IOException {// CONSTRUCTOR
        this.socket = s;
        this.c = c;
        // se crean flujos de entrada y salida
        this.fsalida = new PrintWriter(socket.getOutputStream(), true);
        this.fentrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    public void run() {// tarea a realizar con el cliente
        String cadena = "";
        int a = 0;
        int r = 0;

        System.out.println("COMUNICO CON: " + socket.toString());

        while (!cadena.trim().equals("*")) {
            try {
                cadena = fentrada.readLine();
                System.out.println("Recibido: " + cadena);
                a = Integer.parseInt(cadena);
                r = this.c.acumular(a);
                System.out.println("Acumulado: " + r);
            } catch (IOException e) {
                e.printStackTrace();
            } // obtener cadena
            fsalida.println(r);// enviar mayúscula
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
