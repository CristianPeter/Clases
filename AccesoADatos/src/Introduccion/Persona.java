/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduccion;

import java.io.Serializable;

/**
 *
 * @author dev
 */
public class Persona implements Serializable {
    String nombre;
    public Persona(String nombre){
        this.nombre=nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }
    
}
