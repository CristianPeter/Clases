package com.psp.ut12;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class ObtenerHashFichero {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {

        File fichero;
        if (args.length > 0) {
            String ficheroRuta = args[0];

            fichero = new File(ficheroRuta);
            getHash("SHA-1", fichero);
            getHash("SHA-224", fichero);
            getHash("SHA-256", fichero);
            getHash("SHA-384", fichero);
            getHash("SHA-512", fichero);
            getHash("MD2", fichero);
            getHash("MD5", fichero);

        } else {
            System.out.println("No se ha recibido fichero a cifrar");
            System.exit(0);
        }

    }

    public static byte[] retornarBytes(File fichero) {
        FileInputStream ficheroIn = null;
        byte[] buff = null;
        try {
            ficheroIn = new FileInputStream(fichero);
            long bytes = fichero.length();
            buff = new byte[(int) bytes];
            int i, j = 0;
            while ((i = ficheroIn.read()) != -1) {
                buff[j] = (byte) i;
                j++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObtenerHashFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ObtenerHashFichero.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ficheroIn.close();
            } catch (IOException ex) {
                Logger.getLogger(ObtenerHashFichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return buff;
    }

    public static String Hexadecimal(byte[] resumen) {
        String hex = "";
        for (int i = 0; i < resumen.length; i++) {
            String h = Integer.toHexString(resumen[i] & 0xFF) + ":";
            if (h.length() == 1) {
                hex += "0";
            }
            hex += h;
        }

        return hex.toUpperCase();
    }// Hexadecimal

    public static void getHash(String algoritmo, File fichero) {
        try {
            MessageDigest md;
            md = MessageDigest.getInstance(algoritmo);
            md.update(retornarBytes(fichero));
            byte resumen[] = md.digest();
            System.out.println("\n\n");
            System.out.println("=======================================================================================");
            System.out.println("Número de bytes: " + md.getDigestLength());
            System.out.println("Algoritmo: " + md.getAlgorithm());
            System.out.println("Mensaje resumen: " + new String(resumen));
            System.out.println("Mensaje en Hexadecimal: " + Hexadecimal(resumen));
            Provider proveedor = md.getProvider();
            System.out.println("Proveedor: " + proveedor.toString());
            System.out.println("=======================================================================================");

        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
