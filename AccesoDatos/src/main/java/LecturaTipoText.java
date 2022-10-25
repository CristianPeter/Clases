
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dev
 */
public class LecturaTipoText {

    public static void main(String[] args) {

        if (args.length > 0) {

            File f = new File(args[0]);

            try (FileReader fr = new FileReader(f);
                    BufferedReader br = new BufferedReader(fr)) {

              String linea;
              
              while((linea=br.readLine())!=null){
                  System.out.println(linea);
              }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(LecturaTipoText.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(LecturaTipoText.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else{
            System.out.println("Se necesita introducir algun argumento al programa");
        }
    }
}
