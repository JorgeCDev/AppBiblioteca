package appbiblioteca.persistencia;

import java.util.ArrayList;
import java.util.Enumeration;

public class ManejaLista 
{
    public ArrayList<Usuario> morosos = new ArrayList<Usuario>();
    
    private ManejaTablaH tablaH;
    
    public ManejaLista(ManejaTablaH tablaH){
        this.tablaH = tablaH;
    }
    
    public void agregaMoroso(){
               
        Enumeration<Integer> e = tablaH.tablaUsuario.keys();
        
        while(e.hasMoreElements()){
            int llave = e.nextElement();
            
            if( tablaH.tablaUsuario.get(llave).isMoroso() ){
                String nombre = tablaH.tablaUsuario.get(llave).getNombreUsuario();
                String apellidoPaterno = tablaH.tablaUsuario.get(llave).getApePatUsuario();
                String apellidoMaterno = tablaH.tablaUsuario.get(llave).getApeMatUsuario();
                String domicilio = tablaH.tablaUsuario.get(llave).getDomicilioUsuario();
                String ciudad = tablaH.tablaUsuario.get(llave).getCiudadResidencia();
                char tipo = tablaH.tablaUsuario.get(llave).getTipoUsuario();

                Usuario user = new Usuario(nombre, apellidoPaterno, apellidoMaterno, domicilio, ciudad, tipo);

                if( !morosos.contains(user) )
                    morosos.add(user);                
            }            
        }
    }
    
    public void eliminarMoroso(Usuario usuario){
        morosos.remove(usuario);
    }
    
    public boolean usuarioExiste(Usuario usuario){
        return morosos.contains(usuario);
    }
    
    public ArrayList<Usuario> getListaMorosos(){
        return morosos;
    }
}
