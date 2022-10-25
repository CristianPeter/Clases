/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionControladorGenericoFicherosBinarios;

import GestionControladorFicherosBinarios.*;
import GestionControladorFicheroTexto.ControladorDepartamentos;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class PrincipalEmpleado {

    public static void main(String[] args) {
       
        

        File f = new File("Empleados.dat");//suelen ser .dat o .bin
       /* try (FileOutputStream fos = new FileOutputStream(f,true);
                ObjectOutputStream dos = new ObjectOutputStream(fos);) {

            dos.writeObject(dep);
            
        } catch (IOException e) {
            e.printStackTrace();
        }*/
      
      
      ControladorGenericoBinario ce =new ControladorGenericoBinario(f);

      Menu(ce);
       
   
      
    }
    
        public static void Menu(ControladorGenericoBinario ce) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("1-Alta nuevo Empleado \n2-Eliminar un Empleado \n3-Modificar Empleado \n4-Consultar todos los Empleados"
                    + " \n5-Consultar un Empleado \n6- * Para Salir"
            );
            opcion = sc.nextLine();
            if (!opcion.equals("*")) {

                if (opcion.equals("1")) {

                    System.out.println("Introduzca el nombre del Empleado");
                    String nombre = sc.nextLine();
                    System.out.println("Dame el apellido");
                    String apellido = sc.nextLine();
                    System.out.println("Introduzca la edad");
                    int edad = Integer.parseInt(sc.nextLine());
                    System.out.println("Dane el responsable");
                    String responsable = sc.nextLine();
                    ce.alta(new Empleado(nombre, apellido, edad, responsable));
                } else if (opcion.equals("2")) {
                    System.out.println("Introduzca el id del Empleado a borrar");
                    int id = Integer.parseInt(sc.nextLine());
                    ce.eliminarDepartamentoById(id);

                } else if (opcion.equals("3")) { //Modificado hasta aqui nada mas

                    System.out.println("Introduzca el id del Empleado a modificar");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Los datos actuales del Empleado son ");
                    ce.consultarDepartamentoById(id);
                    System.out.println("Introduzca el nuevo nombre del Empleado");
                    String nombre = sc.nextLine();

                    System.out.println("Introduzca el nuevo apellido del Empleado");
                    String apellido = sc.nextLine();

                    System.out.println("Introduzca la edad del empleado");
                    int edad = Integer.parseInt(sc.nextLine());
                    System.out.println("Dame el responsable");
                    String responsable = sc.nextLine();

                    ce.modificarDepartamento(new Empleado(id, nombre, apellido, edad, responsable));

                } else if (opcion.equals("4")) {
                    ce.consultarTodos();
                } else if (opcion.equals("5")) {
                    System.out.println("Introduzca el id del departamento a consultar");
                    int id = Integer.parseInt(sc.nextLine());
                    ce.consultarEmpleadoById(id);
                }

            }
        } while (!opcion.equals("*"));
        System.out.println("Adios...");

    }
    
    
}
