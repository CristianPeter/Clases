/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionControladorFicheroTexto;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Principal {

    public static void main(String[] args) {
        ControladorDepartamentos cd = new ControladorDepartamentos(new File("departamentos.txt")); //Podria ser args[0]

        Menu(cd);

    }

    public static void Menu(ControladorDepartamentos cd) {
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
                    cd.borrarDepatarmento(id);

                } else if (opcion.equals("3")) {

                    System.out.println("Introduzca el id del departamento a modificar");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Los datos actuales del departamento son ");
                    cd.consultarDepartamento(id);
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
                    cd.consultarTodosLosDepartamentos();
                } else if (opcion.equals("5")) {
                    System.out.println("Introduzca el id del departamento a consultar");
                    int id = Integer.parseInt(sc.nextLine());
                    cd.consultarDepartamento(id);
                }

            }
        } while (!opcion.equals("*"));
        System.out.println("Adios...");

    }
}
