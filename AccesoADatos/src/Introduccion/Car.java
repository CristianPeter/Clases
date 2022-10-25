/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduccion;

import java.io.*;
class Car implements Externalizable {
static int age;
String name;
int year;
public Car() {
System.out.println("Default Constructor called");
}
Car(String n, int y) {
this.name = n;
this.year = y;
age = 10;
}
public void writeExternal(ObjectOutput out)
throws IOException {
out.writeUTF(name)
;out.writeInt(age);
out.writeInt(year);
}
public void readExternal(ObjectInput in)
throws IOException, ClassNotFoundException {
name = in.readUTF();
year = in.readInt();
age = in.readInt();

}
public String toString() {
return ("Name: " + name + "\n"
+ "Year: " + year + "\n"
+ "Age: " + age);
}
}
