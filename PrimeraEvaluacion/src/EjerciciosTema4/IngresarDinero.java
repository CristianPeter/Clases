/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema4;

/**
 *
 * @author dev
 */
public class IngresarDinero extends Thread{
   
    private Cuenta ct;
    private int dinero;
    public IngresarDinero(Cuenta ct){
        this.ct=ct;
    }
    public void IngresarDinero(int dinero){
        this.dinero=dinero;
    }

    @Override
    public void run() {
       for (int x = 1; x <= 4; x++) {
           ct.IngresarDinero(dinero);
           System.out.println("Dinero ingresado, Saldo actual: "+ ct.getSaldo()+ " Propietario: "+ct.getPropietario());
       }
        System.out.println("Saldo despues de los ingresos :"+ct.getSaldo());
        
    }
    
    
    
}
