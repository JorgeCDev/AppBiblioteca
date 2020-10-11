package appbiblioteca.persistencia;

import java.util.Enumeration;
import java.util.Hashtable;


public class ManejaTablaH 
{
    Hashtable<Integer, Usuario> tablaUsuario = new Hashtable<Integer,Usuario>();
    
    public void AgregaUsuario(String nombre, String domicilio, String ciudad)
    {
        Usuario user = new Usuario(nombre, domicilio, ciudad);
        tablaUsuario.put(tablaUsuario.size(), user);
    }
    
    public String[][] ObtenerTablaUsuario()
    {
        String[][] datos = new String[tablaUsuario.size()][5];
        Enumeration<Integer> e = tablaUsuario.keys();
        
        int cont=0;
        while(e.hasMoreElements())
        {
            int clave = e.nextElement();
            Usuario u = tablaUsuario.get(clave);
            datos[cont][0] = Integer.toString(clave);
            datos[cont][1] = u.getNombreUsuario();
            datos[cont][2] = u.getDomicilioUsuario();
            datos[cont][3] = u.getCiudadResidencia();
            datos[cont][4] = String.valueOf( u.getTipoUsuario() );
            cont++;            
        }
        
        return datos;
    }
    
    
    /*
    public String[][] obtenerArticulo(String articulo)
    {
        String[][] datos = new String[tablaUsuario.size()][5];
        Enumeration<Integer> e = tablaUsuario.keys();
        
        int cont=0;
        while(e.hasMoreElements())
        {
            int clave = e.nextElement();
            Usuario u = tablaUsuario.get(clave);
            
            if( a.getDescripcion().equals(articulo) )
            {
                datos[cont][0] = Integer.toString(clave);
                datos[cont][1] = a.getDescripcion();
                datos[cont][2] = a.getMarca();
                cont++;
            }   
        }
        
        return datos;
    }*/
}
