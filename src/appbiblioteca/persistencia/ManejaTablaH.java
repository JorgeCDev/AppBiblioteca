package appbiblioteca.persistencia;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;

public class ManejaTablaH 
{
    Hashtable<Integer, Usuario> tablaUsuario = new Hashtable<Integer,Usuario>();
    Hashtable<Integer, Libro> tablaLibro = new Hashtable<Integer,Libro>();
    
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
            datos[cont][5] = String.valueOf( u.getTipoUsuario() );
            cont++;            
        }        
        return datos;
    }
    
    public void AgregaLibro(Libro libro){
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
    
    public String[] getUsuarios(){
        String[] usuarios = new String[tablaUsuario.size()];
        Enumeration<Integer> e = tablaUsuario.keys();
        int cont=0;
        while(e.hasMoreElements()){
            int llave = e.nextElement();
            String nombre = tablaUsuario.get(llave).getNombreUsuario();
            String apellidoPaterno = tablaUsuario.get(llave).getApePatUsuario();
            String apellidoMaterno = tablaUsuario.get(llave).getApeMatUsuario();
            usuarios[cont++] = nombre + " " + apellidoPaterno + " " + apellidoMaterno;
        }
        
        return usuarios;        
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
     
    //Llena con nombres de usuario y añade un espacio no borrar
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
    
    public Libro getLibro(int llave){
        return tablaLibro.get(llave);
    }
    
    public LinkedList<Usuario> getAllUsuarios(){
        LinkedList<Usuario>lista = new LinkedList<>();
        Enumeration<Integer> e = tablaUsuario.keys();
        while(e.hasMoreElements()){
            lista.add(tablaUsuario.get(e.nextElement()));
        }        
        return lista;
    }
    
     
    public int sizeLibro(){
        return tablaLibro.size();
    }
    public int sizeUsuario(){
        return tablaUsuario.size();
    }

    public Hashtable<Integer, Usuario> getTablaUsuario() {
        return tablaUsuario;
    }

    public Hashtable<Integer, Libro> getTablaLibro() {
        return tablaLibro;
    }
    
    // Busca al usuario Moroso en la Tabla Usuarios 
    // y cambia el atributo moroso a false
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
    
    
}
