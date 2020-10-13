/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.persistencia;

import java.util.Objects;

/**
 *
 * @author Jorge
 */
public class Prestamo {
    
    
    private String nombreUsuario, libroPrestado,diaPrestamo;

    public Prestamo(String nombreUsuario, String libroPrestado, String diaPrestamo) {
        this.nombreUsuario = nombreUsuario;
        this.libroPrestado = libroPrestado;
        this.diaPrestamo = diaPrestamo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(String libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    public String getDiaPrestamo() {
        return diaPrestamo;
    }

    public void setDiaPrestamo(String diaPrestamo) {
        this.diaPrestamo = diaPrestamo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nombreUsuario);
        hash = 37 * hash + Objects.hashCode(this.libroPrestado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Prestamo other = (Prestamo) obj;
        if (!Objects.equals(this.nombreUsuario, other.nombreUsuario)) {
            return false;
        }
        if (!Objects.equals(this.libroPrestado, other.libroPrestado)) {
            return false;
        }
        return true;
    }


    
    
   
   
    
    
}
