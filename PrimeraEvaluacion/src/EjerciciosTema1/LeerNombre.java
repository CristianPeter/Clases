/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema1;

/**
 *
 * @author dev
 */
public class LeerNombre {

    public static void main(String args[]) {
        
        if (args.length >= 1) {
            System.out.println("Todo ha ido correctamente");
            System.exit(0);
        } else {
            System.out.println("Ha habido problemas");
            System.exit(10);
        }
    }
}
