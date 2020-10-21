/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.persistencia;

import appbiblioteca.modelo.Usuario;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;

/**
 *
 * @author Jorge
 */
public class ManejaUsuario {
    
    Hashtable<Integer, Usuario> tablaUsuario = new Hashtable<Integer,Usuario>();

    public ManejaUsuario() {
    }
     
    
   
      public void AgregaUsuario(Usuario usuario){
        tablaUsuario.put(tablaUsuario.size()+1, usuario); 
    }
    
    public String[][] ObtenerTablaUsuario()
    {
        String[][] datos = new String[ tablaUsuario.size() ][ 6 ];
        Enumeration<Integer> e = tablaUsuario.keys();
        
        int cont=0;
        while(e.hasMoreElements())
        {
            int clave = e.nextElement();
            Usuario u = tablaUsuario.get(clave);
            datos[cont][0] = Integer.toString(clave);
            datos[cont][1] = u.getNombreUsuario();
            datos[cont][2] = u.getApePatUsuario();
            datos[cont][3] = u.getApeMatUsuario();
            datos[cont][4] = u.getCiudadResidencia();
            datos[cont][5] = tipoUsuario( u.getTipoUsuario() );
            cont++;            
        }        
        return datos;
    }
    
    public String tipoUsuario(char tipo){
        String retorno = "";
        
        if(tipo == 'A')
            retorno = "ALUMNO";
        if(tipo == 'E')
            retorno = "EXTERNO";
        if(tipo == 'M')
            retorno = "MAESTRO";
        
        return retorno;
    }
    
         public String[]getNamesCombos(){
        
        
      String[] llaves=new String[tablaUsuario.size()+1];
       llaves[0]=""; 
      Enumeration<Integer> e = tablaUsuario.keys();
     
      
      int cont=1;
      
      while (e.hasMoreElements()){
          int elemt= e.nextElement();
          llaves[cont]= tablaUsuario.get(elemt).getNombreUsuario()+" "+
                  tablaUsuario.get(elemt).getApePatUsuario()+" "+
                  tablaUsuario.get(elemt).getApeMatUsuario();
          cont++;        
          
        }
        return llaves;
    }
      
        public String[]getKeysCombos(){
        
        
      String[] llaves=new String[tablaUsuario.size()+1];
       llaves[0]=" "; 
      Enumeration<Integer> e = tablaUsuario.keys();
     
      
      int cont=1;
      
      while (e.hasMoreElements()){
  
          llaves[cont]=e.nextElement().toString();
          cont++;        
          
        }
        return llaves;
    }
        
    public LinkedList<Usuario> getAllUsuarios(){
        
        LinkedList<Usuario>lista = new LinkedList<>();
    
        Enumeration<Integer> e = tablaUsuario.keys();
          
        while(e.hasMoreElements()){
            
            lista.add(tablaUsuario.get(e.nextElement()));
            
        }        
        return lista;
    }  
    
    public int sizeUsuario(){
        
        return tablaUsuario.size();
    }
    
        public Usuario buscarUsuario(String nombre, String apellPat, String apellMat){
        Enumeration<Integer> e = tablaUsuario.keys();
        Usuario user = null;
        
        while(e.hasMoreElements()){
            int llave = e.nextElement();
                        
            if( tablaUsuario.get(llave).getNombreUsuario().equals(nombre) &&
                    tablaUsuario.get(llave).getApePatUsuario().equals(apellPat) &&
                    tablaUsuario.get(llave).getApeMatUsuario().equals(apellMat) )
            {
                String domicilio = tablaUsuario.get(llave).getDomicilioUsuario();
                String ciudad = tablaUsuario.get(llave).getCiudadResidencia();
                char tipo = tablaUsuario.get(llave).getTipoUsuario();
                
                user = new Usuario(nombre, apellPat, apellMat, domicilio, ciudad, tipo);
            }   
            tablaUsuario.get(llave).setMoroso(false);            
        }
        return user;
    }

    public Hashtable<Integer, Usuario> getTablaUsuario() {
        return tablaUsuario;
    }
        
        
        
        
    
}
