package com.psp.ut13.ejemplo02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class GenerarClaves implements Serializable {

    private PrivateKey privateKey;
    private PublicKey publicKey;

    public PrivateKey getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(PrivateKey privateKey) {
        this.privateKey = privateKey;
    }

    public PublicKey getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(PublicKey publicKey) {
        this.publicKey = publicKey;
    }

    public static void main(String[] args) {
        ObjectOutputStream claveObj = null;
        File ficheroPub = null;
        File ficheroPriv = null;
        GenerarClaves keyPrivada = null;
        GenerarClaves keyPublica = null;
        KeyPairGenerator keyGen;
        KeyPair par;

        try {
            keyPrivada = new GenerarClaves();
            keyPublica = new GenerarClaves();

            keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(2048);
            par = keyGen.generateKeyPair();
            keyPrivada.setPrivateKey(par.getPrivate());
            keyPublica.setPublicKey(par.getPublic());
            ficheroPub = new File("miClavePublica.key");
            claveObj = new ObjectOutputStream(new FileOutputStream(ficheroPub));
            claveObj.writeObject(keyPublica);
            System.out.println("Clave generada de tipo publica:" + keyPublica.getPublicKey().getAlgorithm());
            System.out.println("Clave format:" + keyPublica.getPublicKey().getFormat());
            System.out.println("Clave Encoded:" + keyPublica.getPublicKey().getEncoded());
            claveObj.close();
            ficheroPriv = new File("miClavePrivada.key");
            claveObj = new ObjectOutputStream(new FileOutputStream(ficheroPriv));
            claveObj.writeObject(keyPrivada);
            System.out.println("Clave generada de tipo privada:" + keyPublica.getPublicKey().getAlgorithm());
            System.out.println("Clave format:" + keyPublica.getPublicKey().getFormat());
            System.out.println("Clave Encoded:" + keyPublica.getPublicKey().getEncoded());

        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex.getMessage() + "a");
        } catch (IOException ex) {
            System.out.println(ex.getMessage() + "b");
        } finally {
            try {
                if (claveObj != null) {
                    claveObj.close();
                }

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

}
