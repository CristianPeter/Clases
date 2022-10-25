/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psp.ut01.actividades;

/**
 *
 * @author enrique
 */
public class LeerNombre {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Ha ocurrido un error");
            System.exit(1);
        } else {
            System.out.println(args[0]);
            System.exit(0);
        }
    }

}
