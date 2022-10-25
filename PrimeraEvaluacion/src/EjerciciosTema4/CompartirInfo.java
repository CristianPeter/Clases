/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema4;

/**
 *
 * @author dev
 */
public class CompartirInfo {

    public static void main(String[] args) {
        Cuenta ct = new Cuenta(500, "Pedro");
        Cuenta ct1 = new Cuenta(300, "Ana");

        IngresarDinero id = new IngresarDinero(ct);
        sacarDinero sd = new sacarDinero(ct);
        sd.SacarDinero(60);
        id.IngresarDinero(40);
        id.run();
        sd.run();
        
            System.out.println("-------------------------------");
        IngresarDinero id1 = new IngresarDinero(ct1);
        sacarDinero sd1 = new sacarDinero(ct1);
        sd1.SacarDinero(100);
        id1.IngresarDinero(50);

        id1.run();
        sd1.run();
    }
}
