/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduccion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CarExec2{
public static void main(String[] args) {
Car car = new Car("Shubham", 1995);
Car car1= new Car("Toyota",1994);
Car newcar = new Car();
Car newcar1 = new Car();
// Serialize car
try {
FileOutputStream fo
= new FileOutputStream("gfg2.txt");
ObjectOutputStream so
= new ObjectOutputStream(fo);
car.writeExternal(so);
car1.writeExternal(so);
so.flush();
}
catch (Exception e) {
System.out.println(e);
}
// Deserializa car
try {
FileInputStream fi
= new FileInputStream("gfg2.txt");
ObjectInputStream si
= new ObjectInputStream(fi);
newcar.readExternal(si);
newcar1.readExternal(si);
}
catch (Exception e) {
System.out.println(e);
}
System.out.println("The original car is:\n" + car);
System.out.println("The new car is:\n" + newcar);
    System.out.println("Nuevo coche "+ newcar1);
}
}


