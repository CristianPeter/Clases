/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema5;


import java.io.EOFException;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class ClienteObject {

    public static void main(String[] args) {
        ObjectOutputStream out = null;
        ObjectInputStream inp = null;
        ArrayList<Persona> list = new ArrayList();
        try {
            String host = "localhost";
            int port = 6001;
            
            System.out.println("Iniciando cliente...");
            Socket cliente = new Socket(host, port);
            System.out.println("Puerto :"+cliente.getPort());
            System.out.println("Puerto local :"+cliente.getLocalPort());
            int contador=0;
           // do{
            out = new ObjectOutputStream(cliente.getOutputStream());               
            out.writeObject(new Persona(25));
            contador++;
             // }while(contador<=3);
            
            
            inp = new ObjectInputStream(cliente.getInputStream());
           while(true){
                list.add((Persona) inp.readObject());
                
            }
            
        }catch(EOFException ex){          
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteObject.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                if(out!=null && inp != null){
                out.close();
                inp.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(ClienteObject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         for (Persona persona : list) {
                System.out.println(persona.toString());
                System.out.println("Cuadrado: "+Math.pow(persona.getEdad(), 2));
            }
    }

}

class Persona implements Serializable{

    public Persona(int edad){
        this.edad=edad;
    }
    private int edad;

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + '}';
    }

    /*
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
         out.writeUTF(String.valueOf(this.edad));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
       this.edad=Integer.parseInt(in.readLine());
    }*/

    public int getEdad() {
        return edad;
    }

    
}
