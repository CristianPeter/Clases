/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionControladorFicheroTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class ControladorDepartamentos {

    File f;

    public ControladorDepartamentos(File f) {
        this.f = f;
    }

    public void alta(Departamento dep) {
        int identificador = leerUltimoId()+1;
        
        try (FileWriter fw = new FileWriter(f, true);
                BufferedWriter bw = new BufferedWriter(fw);) {

            bw.write(identificador + ";" + dep.getNombre() + ";" + dep.getResponsable() + ";" + dep.getEmpleados()  +";" +dep.getnPlanta()+"\n");//formato csv

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public int leerUltimoId() {
        
        try (FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);) {
                String linea;
                String aux=null;
                while((linea=br.readLine())!=null){                 
                    aux=linea;
                }
                String [] registros=aux.split(";");
                
                return Integer.parseInt(registros[0]);
                              
        } catch (IOException ex) {
           
        }
        return 0;
  
    }
    
    public void consultarTodosLosDepartamentos() {
        
        try (FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);) {
                String linea;
                while((linea=br.readLine())!=null){                 
                   String registro[]=linea.split(";");
                    System.out.println("Id : " +registro[0]+ " Nombre: "+ registro[1] + " Responsable: " +registro[2]+" Empleados: " + registro[3]+" nPlanta: " + registro[4]);
                }           
        } catch (IOException ex) {
           
        }

    }
    
    
     public void consultarDepartamento(int id) {
        
        try (FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);) {
                String linea;
                
                while((linea=br.readLine())!=null){                 
                   String registro[]=linea.split(";");
                   if(Integer.parseInt(registro[0])==id){
                       System.out.println("Id : " +registro[0]+ " Nombre: "+ registro[1] + " Responsable: " +registro[2]+" Empleados: " + registro[3]+" nPlanta: " + registro[4]);
                       break;
                   }
                    
                }           
        } catch (IOException ex) {
           
        }

    }
     
     public void borrarDepatarmento(int id){
          
         File faux =  new File("DepartamentosAux.txt");
        try (FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(faux);
                BufferedWriter bw = new BufferedWriter(fw);) {
                String linea;
                String aux=null;
                while((linea=br.readLine())!=null){     
                    aux=linea;
                   String registro[]=linea.split(";");
                   if(Integer.parseInt(registro[0])==id){
                       
                   }else{
                      bw.write(aux+"\n");
                   }
                    
                }   
                
        } catch (IOException ex) {
           
        }
        faux.renameTo(this.f);
         
     }
     
     public boolean consultaExisteId(int id){
                 
         try (FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);) {
                String linea;
                String aux=null;
                String registros[];
                while((linea=br.readLine())!=null){                 
                    registros=linea.split(";");
                    
                    if(Integer.parseInt(registros[0])==id){
                        return true;
                    }
                }
                
                              
        } catch (IOException ex) {
           
        }
       return false;
     }
     
          public void modificarDepartamento(Departamento dep){
          
         File faux =  new File("DepartamentosAux.txt");
        try (FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(faux);
                BufferedWriter bw = new BufferedWriter(fw);) {
                String linea;
                String aux=null;
                while((linea=br.readLine())!=null){     
                    aux=linea;
                   String registro[]=linea.split(";");
                   if(Integer.parseInt(registro[0])==dep.getId()){
                       bw.write(dep.getId() + ";" + dep.getNombre() + ";" + dep.getResponsable() + ";" + dep.getEmpleados() + ";"+dep.getnPlanta()+"\n");
                   }else{
                      bw.write(aux+"\n");
                   }
                    
                }   
                
        } catch (IOException ex) {
           
        }
        faux.renameTo(this.f);
         
     }

}
