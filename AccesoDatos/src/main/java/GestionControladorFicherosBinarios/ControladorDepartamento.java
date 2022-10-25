/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionControladorFicherosBinarios;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class ControladorDepartamento {
    
    File f;
    
    public ControladorDepartamento(File f){
        this.f=f;
    }
    
    public void alta(Departamento d){
        d.setId(this.leerUltimoId()+1);
        if(f.exists()){
          try (FileOutputStream fos = new FileOutputStream(f,true);
                MiObjectOutputStream dos = new MiObjectOutputStream(fos);) {

            dos.writeObject(d);
            
        } catch (IOException e) {
            e.printStackTrace();
            
        }
        }else{           
          try (FileOutputStream fos = new FileOutputStream(f,true);
                ObjectOutputStream dos = new ObjectOutputStream(fos);) {

            dos.writeObject(d);
            
        } catch (IOException e) {
            e.printStackTrace();
            
        }
         
        }
        
       
          
          
          
     
    }
    
    public void consultarTodos(){
        
        try (   FileInputStream fin = new FileInputStream(f);
                ObjectInputStream inp = new ObjectInputStream(fin)){
            Departamento d;
            Departamento aux;
            int ultimo_id=0;
            while((aux=(Departamento)inp.readObject())!=null){
                System.out.println(aux);
            }
                
        } catch (IOException e) {
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    public void consultarDepartamentoById(int id){
         
        try (   FileInputStream fin = new FileInputStream(f);
                ObjectInputStream inp = new ObjectInputStream(fin)){
            Departamento d;
            Departamento aux;
            int ultimo_id=0;
            while((aux=(Departamento)inp.readObject())!=null){
                if(aux.getId()==id){
                    System.out.println(aux);
                }
            }
                
        } catch (IOException e) {
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    
    public void eliminarDepartamentoById(int id){
        
        File faux = new File("dep.dat");
        try (   FileInputStream fin = new FileInputStream(f);
                FileOutputStream fout = new FileOutputStream(faux);//El append no se si hace falta, hacer pruebas
                ObjectInputStream inp = new ObjectInputStream(fin);
                ObjectOutputStream out = new ObjectOutputStream(fout);){
            Departamento aux;
            int ultimo_id=0;
            while((aux=(Departamento)inp.readObject())!=null){
                if(aux.getId()==id){
                    
                }else{
                    out.writeObject(aux);
                }
            }
                
        } catch (IOException e) {
            
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
          faux.renameTo(f);
    }
    
    public void modificarDepartamento(Departamento d){
        
         File faux = new File("dep.dat");
        try (   FileInputStream fin = new FileInputStream(f);
                FileOutputStream fout = new FileOutputStream(faux);
                ObjectInputStream inp = new ObjectInputStream(fin);
                ObjectOutputStream out = new ObjectOutputStream(fout);){
            Departamento aux;
            int ultimo_id=0;
            while((aux=(Departamento)inp.readObject())!=null){
                if(aux.getId()==d.getId()){
                    out.writeObject(d);
                }else{
                    out.writeObject(aux);
                }
            }
                
        } catch (IOException e) {
            
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
          faux.renameTo(f);
    }
    
    
    public int leerUltimoId() {
        
        try (FileInputStream fin = new FileInputStream(f);
                ObjectInputStream inp = new ObjectInputStream(fin);){
            Departamento dep=null;
            Departamento aux=null;
            int ultimo_id=0;
            try {
                 while(true){
                dep= (Departamento)inp.readObject();
                aux = dep;
            }
            } catch (Exception e) {
            }
           
            return aux.getId();
           
            
        } catch (Exception e) {
         
        }
         return 0;
}
    
    
    
    
}
