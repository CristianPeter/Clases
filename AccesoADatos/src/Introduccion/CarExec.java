/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduccion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author dev
 */
public class CarExec {
public static void main(String[] args) {
Car car = new Car("Shubham", 1995);
Car newcar = null;
// Serialize car
try {
FileOutputStream fo
= new FileOutputStream("gfg.txt");
ObjectOutputStream so
= new ObjectOutputStream(fo);
so.writeObject(car);
so.flush();
}
catch (Exception e) {
System.out.println(e);
}
// Deserializa car
try {
FileInputStream fi
= new FileInputStream("gfg.txt");
ObjectInputStream si
= new ObjectInputStream(fi);
newcar = (Car)si.readObject();
}
catch (Exception e) {
System.out.println(e);
}
System.out.println("The original car is:\n" + car);
System.out.println("The new car is:\n" + newcar);
}
}
