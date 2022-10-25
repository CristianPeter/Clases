package com.psp.ut14;

import javax.security.auth.*;
import javax.security.auth.login.*;

import java.security.*;

public class EjemploJAAS extends Object {

    public static void main(String[] args)
            throws Exception {
        if (args.length != 2) {
            System.err.println("Uso: java EjemploJAAS usuario password");
            System.exit(1);
        }

        // 1. LoginContext
        String usuario = args[0];
        char[] password = args[1].toCharArray();
        LoginContext loginContext = new LoginContext(
                "Ejemplo", new UserPasswordCallbackHandler(usuario, password));

        // 2. login()
        loginContext.login();

        // Si llegamos hasta aqu� es que el login tuvo �xito.
        // Ahora podemos obtener el sujeto actual
        // 3. getSubject() e imprimir
        Subject subject = loginContext.getSubject();
        System.out.println(subject);
    }
}
