package com.psp.ut06.actividades;

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

public class UDPEjemploReceptorMulticast { 
  public static void main(String args[]) throws Exception { 
    System.setProperty("java.net.preferIPv4Stack", "true");//esto lo hago para MacOS - seguramente no haga falta en otros OS

    //Se crea el socket multicast 
    int puerto = 12345;//Puerto multicast
    MulticastSocket ms = new MulticastSocket(puerto);  
   
    InetAddress grupo = InetAddress.getByName("225.0.0.1");//Grupo

    //Nos unimos al grupo
    ms.joinGroup(grupo);

    String msg="";
    
    //
    while(!msg.trim().equals("*")) {  
      byte[] buf = new byte[1024];
      //Recibe el paquete del servidor multicast      
      DatagramPacket paquete = new DatagramPacket(buf, buf.length);
      ms.receive(paquete);
      msg = new String(paquete.getData());
      System.out.println ("Recibo: " + msg.trim());	
    }
    ms.leaveGroup (grupo); //abandonamos grupo
    ms.close (); //cierra socket
    System.out.println ("Socket cerrado...");
  } 
} 

