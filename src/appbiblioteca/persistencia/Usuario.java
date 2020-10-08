/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.persistencia;

import java.util.Objects;

/**
 *Modelo de datos de Usuario
 * @author Jorge
 */
public class Usuario {
    
    private String nombreUsuario, domicilioUsuario,ciudadResidencia, 
            apePatUsuario,apeMatUsuario;
    private char tipoUsuario;
    private boolean moroso;

    public Usuario(String nombreUsuario, String domicilioUsuario, String ciudadResidencia, char tipoUsuario, boolean moroso) {
        this.nombreUsuario = nombreUsuario;
        this.domicilioUsuario = domicilioUsuario;
        this.ciudadResidencia = ciudadResidencia;
        this.tipoUsuario = tipoUsuario;
        this.moroso = moroso;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getDomicilioUsuario() {
        return domicilioUsuario;
    }

    public void setDomicilioUsuario(String domicilioUsuario) {
        this.domicilioUsuario = domicilioUsuario;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public char getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(char tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public boolean isMoroso() {
        return moroso;
    }

    public void setMoroso(boolean moroso) {
        this.moroso = moroso;
    }

    public String getApePatUsuario() {
        return apePatUsuario;
    }

    public void setApePatUsuario(String apePatUsuario) {
        this.apePatUsuario = apePatUsuario;
    }

    public String getApeMatUsuario() {
        return apeMatUsuario;
    }

    public void setApeMatUsuario(String apeMatUsuario) {
        this.apeMatUsuario = apeMatUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nombreUsuario);
        hash = 89 * hash + Objects.hashCode(this.domicilioUsuario);
        hash = 89 * hash + Objects.hashCode(this.ciudadResidencia);
        hash = 89 * hash + Objects.hashCode(this.apePatUsuario);
        hash = 89 * hash + Objects.hashCode(this.apeMatUsuario);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nombreUsuario, other.nombreUsuario)) {
            return false;
        }
        if (!Objects.equals(this.domicilioUsuario, other.domicilioUsuario)) {
            return false;
        }
        if (!Objects.equals(this.ciudadResidencia, other.ciudadResidencia)) {
            return false;
        }
        if (!Objects.equals(this.apePatUsuario, other.apePatUsuario)) {
            return false;
        }
        if (!Objects.equals(this.apeMatUsuario, other.apeMatUsuario)) {
            return false;
        }
        return true;
    }
    
    

    
    
    
    
    
}
