/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionControladorFicherosBinarios;

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
public class Principal {

    public static void main(String[] args) {
        Departamento dep = new Departamento(1,"IT","Pepe",45,2);
        

        File f = new File("departamentos.dat");//suelen ser .dat o .bin
       /* try (FileOutputStream fos = new FileOutputStream(f,true);
                ObjectOutputStream dos = new ObjectOutputStream(fos);) {

            dos.writeObject(dep);
            
        } catch (IOException e) {
            e.printStackTrace();
        }*/
      
      
      ControladorDepartamento cd =new ControladorDepartamento(f);
      
      Menu(cd);
        
   
      
    }
    
        public static void Menu(ControladorDepartamento cd) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("1-Alta nuevo departamento \n2-Eliminar un Departamento \n3-Modificar Departamento \n4-Consultar todos los departamentos"
                    + " \n5-Consultar un Departamento \n6- * Para Salir"
            );
            opcion = sc.nextLine();
            if (!opcion.equals("*")) {

                if (opcion.equals("1")) {

                    System.out.println("Introduzca el nombre del departamento");
                    String nombre = sc.nextLine();
                    System.out.println("Introduzca el responsable del departamento");
                    String responsable = sc.nextLine();
                    System.out.println("Introduzca el numero de empleados");
                    int numeroEmpleados = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduzca el numero de planta");
                    int numeroPlanta = Integer.parseInt(sc.nextLine());
                    cd.alta(new Departamento(nombre, responsable, numeroEmpleados, numeroPlanta));
                } else if (opcion.equals("2")) {
                    System.out.println("Introduzca el id del departamento a borrar");
                    int id = Integer.parseInt(sc.nextLine());
                    cd.eliminarDepartamentoById(id);

                } else if (opcion.equals("3")) {

                    System.out.println("Introduzca el id del departamento a modificar");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Los datos actuales del departamento son ");
                    cd.consultarDepartamentoById(id);
                    System.out.println("Introduzca el nuevo nombre del departamento");
                    String nombre = sc.nextLine();

                    System.out.println("Introduzca el nuevo responsable del departamento");
                    String responsable = sc.nextLine();

                    System.out.println("Introduzca el nuevo numero de empleados");
                    int numeroEmpleados = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduzca el numero de planta");
                    int numeroPlanta = Integer.parseInt(sc.nextLine());

                    cd.modificarDepartamento(new Departamento(id, nombre, responsable, numeroEmpleados, numeroPlanta));

                } else if (opcion.equals("4")) {
                    cd.consultarTodos();
                } else if (opcion.equals("5")) {
                    System.out.println("Introduzca el id del departamento a consultar");
                    int id = Integer.parseInt(sc.nextLine());
                    cd.consultarDepartamentoById(id);
                }

            }
        } while (!opcion.equals("*"));
        System.out.println("Adios...");

    }
    
    
}
