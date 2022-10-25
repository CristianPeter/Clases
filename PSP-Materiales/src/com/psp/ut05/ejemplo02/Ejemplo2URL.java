package com.psp.ut05.ejemplo02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
import java.net.*;
import java.io.*;

public class Ejemplo2URL {

    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("https://problemastenemostodos.com/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        BufferedReader in;
        try {
            InputStream inputStream = url.openStream();
            in = new BufferedReader(new InputStreamReader(inputStream));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }//
}//Ejemplo2URL
