package com.psp.ut07.ejemplo03;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class ObjetoCompartido {

    private int numero; // número a adivinar
    private boolean acabo; // true cuando se haya terminado el juego
    private int ganador; // jugador ganador

    public ObjetoCompartido(int numero) {
        this.numero = numero;// numero A ADIVINAR
        this.acabo = false;
    }

    public boolean seAcabo() {
        return acabo;
    }

    public int getGanador() {
        return ganador;
    }

    public synchronized String nuevaJugada(int jugador, int suNumero) {
        String cad = "";

        if (!seAcabo()) { // si el juego ha terminado no se comprueba nada

            if (suNumero > numero) { // demasiado grande
                cad = "Numero demasiado grande";
            }
            if (suNumero < numero) { // demasiado peque
                cad = "Numero demasiado bajo";
            }

            if (suNumero == numero) { // ha acertado
                cad = "Jugador " + jugador + " gana, adivinó el número: " + numero;
                acabo = true;
                ganador = jugador;
            }

        } else {
            cad = "Jugador " + ganador + " adivinó el número: " + numero;
        }

        return cad;

    }// nuevaJugada

}