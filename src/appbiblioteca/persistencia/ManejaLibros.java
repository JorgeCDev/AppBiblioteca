/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.persistencia;

import appbiblioteca.modelo.Libro;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;

/**
 *
 * @author Jorge
 */
public class ManejaLibros {
    Hashtable<Integer, Libro> tablaLibro;

    public ManejaLibros() {
     tablaLibro = new Hashtable<Integer,Libro>();
    }
    
    
    
    
    public String[][] ObtenerTablaLibro(){
        String[][] datos = new String[ tablaLibro.size() ][ 6 ];
        Enumeration<Integer> e = tablaLibro.keys();
        
        int cont=0;
        while(e.hasMoreElements())
        {
            int clave = e.nextElement();
            Libro l = tablaLibro.get(clave);
            datos[cont][0] = Integer.toString(clave);
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
          
        while(e.hasMoreElements()){
            lista.add(tablaLibro.get(e.nextElement()));
        }        
        return lista;
    }
    
    public String[] getAllNamesLibros() {
      String []names =new String[tablaLibro.size()];
      

      Enumeration<Integer> e= tablaLibro.keys();
      int cont=0;
      while (e.hasMoreElements()){

          names[cont++]=tablaLibro.get(e.nextElement())
                  .getNombreLibro();
        }

      return names;
    }
    
    public String[]getAllKeysLibros(){
        
        
      String[] llaves=new String[tablaLibro.size()];
        
      Enumeration<Integer> e = tablaLibro.keys();
     
      
      int cont=0;
      
      while (e.hasMoreElements()){
  
       
          llaves[cont++]=e.nextElement().toString();
                  
        }
        return llaves;
    }
    
    //llena el combo de llaves y añade un espacio no borrar
     public String[]getKeysLibrosCombos(){
        
        
      String[] llaves=new String[tablaLibro.size()+1];
       llaves[0]=""; 
      Enumeration<Integer> e = tablaLibro.keys();
     
      
      int cont=1;
      
      while (e.hasMoreElements()){
  
          llaves[cont]=e.nextElement().toString();
          cont++;        
          
        }
        return llaves;
    }
     
     public Libro getLibro(int llave){
        
        return tablaLibro.get(llave);
        
    }
     
    public Libro getLibroByName(String libro){
        
     
      Enumeration<Integer> e = tablaLibro.keys();
 
      Libro temp = null;
      
      while (e.hasMoreElements()){
  
          temp=tablaLibro.get(e.nextElement());
          
          if(temp.getNombreLibro().equals(libro))
           break;
          
        }
          return temp;
    } 
     
     public int sizeLibro(){
        
        return tablaLibro.size();
    }
     
     public void AgregaLibro(Libro libro){
        tablaLibro.put(tablaLibro.size()+1, libro);
    }

    public Hashtable<Integer, Libro> getTablaLibro() {
        return tablaLibro;
    }
     
     
    
    
    
}
