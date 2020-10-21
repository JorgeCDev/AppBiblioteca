package appbiblioteca.persistencia;


import appbiblioteca.modelo.Usuario;
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
               
        Enumeration<Integer> e = tablaH.getTablaUsuario().tablaUsuario.keys();
        
        while(e.hasMoreElements()){
            int llave = e.nextElement();
            
            if( tablaH.getTablaUsuario().tablaUsuario.get(llave).isMoroso() ){
                String nombre = tablaH.getTablaUsuario().tablaUsuario.get(llave).getNombreUsuario();
                String apellidoPaterno = tablaH.getTablaUsuario().tablaUsuario.get(llave).getApePatUsuario();
                String apellidoMaterno = tablaH.getTablaUsuario().tablaUsuario.get(llave).getApeMatUsuario();
                String domicilio = tablaH.getTablaUsuario().tablaUsuario.get(llave).getDomicilioUsuario();
                String ciudad = tablaH.getTablaUsuario().tablaUsuario.get(llave).getCiudadResidencia();
                char tipo = tablaH.getTablaUsuario().tablaUsuario.get(llave).getTipoUsuario();

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
