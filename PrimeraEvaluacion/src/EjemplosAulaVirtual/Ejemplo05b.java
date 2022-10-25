package EjemplosAulaVirtual;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
import java.io.*;

public class Ejemplo05b {

    public static void main(String[] args) throws IOException {
        //creamos objeto File al directorio donde está Ejemplo5
        File d = new File(".\\build\\classes");
        //proceso a ejecutar es Ejemplo5
        ProcessBuilder pb = new ProcessBuilder("java", "Ejemplo05");
        //establecemos el directorio donde está el ejecutable
        pb.directory(d);
        //ejecutar proceso
        Process p = pb.start();
        //escritura - se envía a la entrada que espera Ejemplo5
        OutputStream os = p.getOutputStream();
        os.write("Hola majo...\n".getBytes());
        os.flush();
        //lectura
        try {
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //comprobación de error - 0 bien - 1 mal
        int exitVal;
        try {
            exitVal = p.waitFor();
            System.out.println("Valor de salida: " + exitVal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
