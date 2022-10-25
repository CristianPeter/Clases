/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionControladorGenericoFicherosBinarios;

import java.io.Serializable;

/**
 *
 * @author dev
 */
public class Empleado extends Objeto implements Serializable{
    
    private String nombre;
    private String apellido;
    private int edad;
    private String cargo;

    public Empleado(int id, String nombre, String apellido, int edad, String cargo) {
        super.setId(id);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cargo = cargo;
    }

    public Empleado(String nombre, String apellido, int edad, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cargo = cargo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +"ID " +super.getId()+ "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", cargo=" + cargo + '}';
    }
    
    
}
