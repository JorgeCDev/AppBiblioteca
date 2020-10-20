package appbiblioteca.persistencia;

import appbiblioteca.modelo.Usuario;
import appbiblioteca.modelo.Prestamo;
import appbiblioteca.modelo.Libro;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Objects;




public class ManejaTablaH 
{
    Hashtable<Integer, Usuario> tablaUsuario = new Hashtable<Integer,Usuario>();
    Hashtable<Integer, Libro> tablaLibro = new Hashtable<Integer,Libro>();
    Hashtable<Usuario, Prestamo[]> tablaPrestamos =new Hashtable<>();
   
    
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
    
  
    
    //metodos Get Set
    
    public Hashtable<Integer, Usuario> getTablaUsuario() {
        return tablaUsuario;
    }

    public Hashtable<Integer, Libro> getTablaLibro() {
        return tablaLibro;
    }

    public Hashtable<Usuario, Prestamo[]> getTablaPrestamos() {
        return tablaPrestamos;
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
