/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XMLWriteRead;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dev
 */
public class ListaPersonas {
    
    
    
    private List<Persona> lista = new ArrayList();
    
    public void add (Persona p){
        lista.add(p);
    }
    public List getLista (){
        return this.lista;
    }
}
