/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class ActividadHilos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String entrada;
        do{
            System.out.println("Quiere ejecutar un hilo?");
             entrada=sc.nextLine();
            if(entrada.equalsIgnoreCase("s")){
                Hilo runner = new Hilo();
                Thread hilo= new Thread(runner);
                hilo.start();
                
            
           
         for(int i=65;i<91;i++){
             System.out.println("\nDentro del hilo :"+(char)i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
         }
         }
        }while(!entrada.equalsIgnoreCase("FIN"));
        
    }
}
