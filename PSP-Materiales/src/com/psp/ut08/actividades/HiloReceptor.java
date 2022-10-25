package com.psp.ut08.actividades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.*;
import java.io.*;

/*
 * @author ThePoisoned1
 */
public class HiloReceptor extends Thread {

    private final String nick;
    private final int puerto;
    private final String address;
    private final String separador;
    private final String salir;
    private boolean running = true;
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";
    public static final String PURPLE = "\033[0;35m";
    public static final String CYAN = "\033[0;36m";
    public static final String RESET = "\033[0m";

    public HiloReceptor(String nick, int puerto, String address, String separador, String salir) {
        this.nick = nick;
        this.puerto = puerto;
        this.address = address;
        this.separador = separador;
        this.salir = salir;
    }

    public void run() {
        MulticastSocket destino = null;
        String message;
        DatagramPacket paquete;
        String[] output;
        try {
            destino = new MulticastSocket(puerto);
            destino.joinGroup(InetAddress.getByName(address));
            while (running) {
                byte[] buf = new byte[1024];
                paquete = new DatagramPacket(buf, buf.length);
                destino.receive(paquete);
                message = new String(paquete.getData());
                output = message.split(separador, 3);
                System.out.print(imprimirMensaje(output) + RESET);
            }
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (destino != null) {
                try {
                    destino.leaveGroup(InetAddress.getByName(address));
                    destino.close();
                } catch (UnknownHostException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public String imprimirMensaje(String[] x) {
        String color = checkColor(x[1]);
        if (x[2].trim().equals(this.salir.trim())) {
            if (x[0].equals(this.nick)) {
                this.running = false;
                return color + "Has abandonado el grupo" + "\n";
            } else {
                return color + x[0] + " ha abandonado el grupo" + "\n";
            }
        } else {
            if (x[0].equals(this.nick)) {
                return "";
            }
        }
        return color + x[0] + ": " + x[2] + "\n";
    }

    public String checkColor(String x) {
        switch (x) {
            case "RED":
                return RED;
            case "GREEN":
                return GREEN;
            case "YELLOW":
                return YELLOW;
            case "BLUE":
                return BLUE;
            case "PURPLE":
                return PURPLE;
            case "CYAN":
                return CYAN;
        }
        return "RESET";
    }
}
