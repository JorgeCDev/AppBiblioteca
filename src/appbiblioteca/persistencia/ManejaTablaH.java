package appbiblioteca.persistencia;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;


public class ManejaTablaH 
{
    Hashtable<Integer, Usuario> tablaUsuario = new Hashtable<Integer,Usuario>();
    Hashtable<Integer, Libro> tablaLibro = new Hashtable<Integer,Libro>();
    
    public void AgregaUsuario(String nombre, String apePat, String ApeMat,String domicilio, String ciudad, char tipo)
    {
        
        Usuario user = new Usuario(nombre, apePat, ApeMat, domicilio, ciudad, tipo);
        
        
        
        tablaUsuario.put(tablaUsuario.size()+1, user);
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
            datos[cont][0] = Integer.toString(clave+1);
            datos[cont][1] = u.getNombreUsuario();
            datos[cont][2] = u.getApePatUsuario();
            datos[cont][3] = u.getApeMatUsuario();
            datos[cont][4] = u.getCiudadResidencia();
            datos[cont][5] = String.valueOf( u.getTipoUsuario() );
            cont++;            
        }        
        return datos;
    }
    
    public void AgregaLibro(String libNom, String autor, String descripcion, String editorial, int existencia){
        Libro libro = new Libro(libNom, autor, descripcion, editorial, existencia);
        tablaLibro.put(tablaLibro.size()+1, libro);
    }
    
    public String[][] ObtenerTablaLibro(){
        String[][] datos = new String[ tablaLibro.size() ][ 6 ];
        Enumeration<Integer> e = tablaLibro.keys();
        
        int cont=0;
        while(e.hasMoreElements())
        {
            int clave = e.nextElement();
            Libro l = tablaLibro.get(clave);
            datos[cont][0] = Integer.toString(clave+1);
            datos[cont][1] = l.getNombreLibro();
            datos[cont][2] = l.getAutor();
            datos[cont][3] = l.getDescripcion();
            datos[cont][4] = l.getEditorial();
            datos[cont][5] = Integer.toString(l.getExistencia());
            cont++;            
        }        
        return datos;
    }
    
    public LinkedList<Libro> getAllLibros(){
        
        LinkedList<Libro>lista = new LinkedList<>();
    
          Enumeration<Integer> e = tablaLibro.keys();
          
        while(e.hasMoreElements())
        {
            lista.add(tablaLibro.get(e.nextElement()));
        }        
          
        return lista;
    }
    
    public String[] getAllNames() {
      String []names =new String[tablaLibro.size()];
      

      Enumeration<Integer> e= tablaLibro.keys();
      int cont=0;
      while (e.hasMoreElements()){

          names[cont++]=tablaLibro.get(e.nextElement())
                  .getNombreLibro();
        }

      return names;
    }
    
    public String[]getAllKeys(){
        
        
      String[] llaves=new String[tablaLibro.size()];
        
      Enumeration<Integer> e = tablaLibro.keys();
        System.out.println();
      
      int cont=0;
      
      while (e.hasMoreElements()){
  
       
          llaves[cont++]=e.nextElement().toString();
                  
        }
        return llaves;
    }
       
       
    public Libro getLibro(int llave){
        
        return tablaLibro.get(llave);
        
    }
    
    public int size(){
        
        return tablaLibro.size();
    }
    
}
