/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psp.ut04.filosofos.v1;

/**
 *
 * @author enrique
 */
public class Tenedor {
    private int id;
    private boolean enUso;
    private int quienUsa;
    
    public Tenedor(int id) {
        this.id = id;
        this.enUso = false;
        this.quienUsa = -1;
    }
    
    public void usar(int idUsuario) {
        this.enUso = true;
        this.quienUsa = idUsuario;
        System.out.println("Tenedor " + this.id + ": me está usando el filósofo " + this.quienUsa);
    }
    
    public void soltar() {
        this.enUso = false;
        System.out.println("Tenedor " + this.id + ": me está soltando el filosofo " + this.quienUsa);
        this.quienUsa = -1;
    }
    
    public int quienUsa() {
        return this.quienUsa;
    }
    
    public boolean estaEnUso() {
        return this.enUso;
    }
}
