package appbiblioteca.persistencia;

import java.util.ArrayList;
import java.util.LinkedList;


public class ManejaLista 
{
    LinkedList<Usuario> morosos = new LinkedList<Usuario>();
    
    public void agregaMoroso(Usuario usuario){
        morosos.add(usuario);
    }
    public LinkedList<Usuario> getListaMorosos(){
        return morosos;
    }
    
}
