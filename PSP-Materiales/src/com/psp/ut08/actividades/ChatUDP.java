package com.psp.ut08.actividades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class ChatUDP {

    private final int puerto = 12345;
    private final String address = "225.0.0.1";
    private final String separador = ";-;//";
    private final String salir = "*";

    void run() {
        Scanner sc = new Scanner(System.in);
        MulticastSocket destino = null;
        InetAddress grupo = null;
        DatagramPacket paquete;

        String message = "";
        String out;
        String nick = separador;
        while (nick.contains(separador)) {
            System.out.print("Introduzca su nick: ");
            nick = sc.nextLine();
            if (nick.contains(separador)) {
                System.out.println("Nick no válido, contiene una seecuencia ilegal");
            }
        }
        System.out.println("Elija su color: RED/GREEN/YELLOW/BLUE/PURPLE/CYAN");
        String color = sc.nextLine().toUpperCase();
        HiloReceptor receptor = new HiloReceptor(nick, puerto, address, separador, salir);
        receptor.start();
        try {
            destino = new MulticastSocket();
            grupo = InetAddress.getByName(address);
            while (!message.trim().equals(salir)) {
                message = sc.nextLine();
                out = nick + separador + color + separador + message;
                paquete = new DatagramPacket(out.getBytes(), out.length(), grupo, puerto);
                destino.send(paquete);
            }
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (destino != null) {
                destino.close();
            }
        }
    }

    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");//esto lo hago para MacOS - seguramente no haga falta en otros OS
        new ChatUDP().run();
    }
}
