/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class Actividad1_3 {

    public static void main(String[] args) {

        int num1, num2;
        String prueba;
        Scanner sc=new Scanner(System.in);
        
        try {
            System.out.println("Introduce prueba");
            prueba=sc.nextLine();
            System.out.println("Introduce el primer numero");
            num1 = Integer.parseInt(sc.nextLine());
            System.out.println("Introduce el segundo numero");
            num2 = Integer.parseInt(sc.nextLine());
            System.out.println(suma(num1,num2));      
        }catch(NumberFormatException nf){
            System.out.println("No es un numero");
        }

    }
    public static int suma(int num1,int num2){
        return num1+num2;
    }
}
