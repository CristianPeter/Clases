/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class Cuenta {
    private int saldo;
    private String propietario;
    public Cuenta(int saldo,String propietario){
        this.saldo=saldo;
        this.propietario=propietario;
    }

    public String getPropietario() {
        return propietario;
    }

    public synchronized int getSaldo() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return saldo;
    }

    public synchronized void consultarSaldo(int saldo) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.saldo = saldo;
    }
    
    public synchronized void  retirarDinero(int dinero){
        
        if(getSaldo()>=0){
                  
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }   
            this.saldo=this.saldo-dinero;
        }else{
            System.out.println("No hay saldo suficiente, El saldo actual es:" +getSaldo());
        }
        if(saldo<0){
            System.out.println("Saldo negativo: "+getSaldo());          
        }
        
        
    }
    public synchronized  void IngresarDinero(int saldo){ 
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.saldo=this.saldo+saldo;
    }
    
    
}
