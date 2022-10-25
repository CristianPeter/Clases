package com.psp.ut12;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
import java.security.*;

public class ObtenerHash {

    public static void main(String[] args) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
            //md = MessageDigest.getInstance("SHA-512");
            //md = MessageDigest.getInstance("MD5");
            String texto = "Esto es un texto plano.";
            String clave = "Esta es la clave";
            byte dataBytes[] = texto.getBytes();
            byte claveBytes[] = clave.getBytes();

            md.update(dataBytes);// SE INTRODUCE TEXTO A RESUMIR
            byte resumen[] = md.digest(); // SE CALCULA EL RESUMEN sin clave
            //byte resumen[] = md.digest(claveBytes); // SE CALCULA EL RESUMEN con clave

            System.out.println("Mensaje original: " + texto);
            System.out.println("Número de bytes: " + md.getDigestLength());
            System.out.println("Algoritmo: " + md.getAlgorithm());
            System.out.println("Mensaje resumen: " + new String(resumen));
            System.out.println("Mensaje en Hexadecimal: " + Hexadecimal(resumen));
            Provider proveedor = md.getProvider();
            System.out.println("Proveedor: " + proveedor.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }// main
    // CONVIERTE UN ARRAY DE BYTES A HEXADECIMAL

    static String Hexadecimal(byte[] resumen) {
        String hex = "";
        for (int i = 0; i < resumen.length; i++) {
            String h = Integer.toHexString(resumen[i] & 0xFF);
            if (h.length() == 1) {
                hex += "0";
            }
            hex += h;
        }
        return hex.toUpperCase();
    }// Hexadecimal
}
