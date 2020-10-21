/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.persistencia;

import appbiblioteca.modelo.Prestamo;
import appbiblioteca.modelo.Usuario;
import java.util.Hashtable;
import java.util.Objects;

/**
 *
 * @author Jorge
 */
public class ManejaPrestamos {
    
    Hashtable<Usuario, Prestamo[]> tablaPrestamos =new Hashtable<>();
    

    public ManejaPrestamos() {
    }
    
    
    
    
    
    public void addPrestamo(Usuario user, Prestamo prestamo){
        
    if(tablaPrestamos.containsKey(user)){
            
        Prestamo[] prestamos =tablaPrestamos.get(user);
        
        for (int i = 0; i < prestamos.length; i++) {
            if(Objects.isNull(prestamos[i])){
                prestamos[i]=prestamo;
                return;
            }
        }
              
                
        
    }else{
        
        int size = user.getTipoUsuario()=='A'|user.getTipoUsuario()=='E'?2:3;
        
        Prestamo[] prestamos =new Prestamo[size];
        
        prestamos[0]=prestamo;
        
        tablaPrestamos.put(user,prestamos);
        
        
    }
         
    }
    
    
    public Prestamo[] getPrestamos(Usuario user){
       
        return tablaPrestamos.get(user);
           
    }

    public int librosPrestados(Usuario user){
        
        int cont =0;
        
        for (Object object : getPrestamos(user)) {
            
            if(!Objects.isNull(object))
                cont++;
            
        }
        
        return cont;
        
    }
    
    public void removePrestamo(Usuario user, String nombreLibro){
        
        Prestamo[] prestamos= tablaPrestamos.get(user);
        
        for (int i = 0; i < prestamos.length; i++) {
            
           if(prestamos[i].getNombreUsuario().equalsIgnoreCase(nombreLibro))
               prestamos[i]=null;
        }    
    }

    public Hashtable<Usuario, Prestamo[]> getTablaPrestamos() {
        return tablaPrestamos;
    }
    
    
    
}
