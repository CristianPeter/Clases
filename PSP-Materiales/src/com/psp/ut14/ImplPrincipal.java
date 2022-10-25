package com.psp.ut14;

import java.io.Serializable;
import java.security.Principal;

/**
 * Implementacion de la interfaz Principal.
 */
public class ImplPrincipal implements Principal, Serializable {

    private String mNombre;

    public ImplPrincipal(String nombre) {
        mNombre = nombre;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImplPrincipal)) {
            return false;
        }
        ImplPrincipal otro = (ImplPrincipal) obj;
        if (mNombre.equals(otro.getName())) {
            return true;
        }
        return false;
    }

    public java.lang.String getName() {
        return mNombre;
    }

    public int hashCode() {
        return mNombre.hashCode();
    }

    public java.lang.String toString() {
        return getName();
    }

}
