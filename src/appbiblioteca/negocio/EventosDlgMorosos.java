package appbiblioteca.negocio;

import appbiblioteca.persistencia.ManejaLista;
import appbiblioteca.persistencia.ManejaTablaH;
import appbiblioteca.modelo.Usuario;
import appbiblioteca.vistas.DlgMorosos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class EventosDlgMorosos implements ActionListener
{ 
    private DlgMorosos morosos;
    private ManejaTablaH tablaH;
    private ManejaLista lista;
    
    public EventosDlgMorosos(DlgMorosos morosos, ManejaTablaH tablaH, ManejaLista lista) {
        this.morosos = morosos;
        this.tablaH = tablaH;
        this.lista = lista;
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        String evento= e.getActionCommand();
        
        switch(evento){
            case "Eliminar":
                //lista.eliminarMoroso();
                
            
                if (morosos.getCmbUsuario().getSelectedIndex()!=-1) {
                String usuario = morosos.getCmbUsuario().getSelectedItem().toString();
                String[] user = usuario.split(" ");
                String nombre = user[0];
                String apellPat = user[1];
                String apellMat = user[2];
                Usuario moroso = tablaH.getTablaUsuario().buscarUsuario(nombre, apellPat, apellMat);
                   if( lista.usuarioExiste(moroso) ){
                    JOptionPane.showMessageDialog(morosos, 
                            "Usuario Removido", "", JOptionPane.INFORMATION_MESSAGE);
                    lista.eliminarMoroso(moroso);
                    morosos.llenarCombo(lista);
                }else
                    JOptionPane.showMessageDialog(morosos, 
                            "Usuario No Encontrado", "", JOptionPane.WARNING_MESSAGE);
                    morosos.generarTabla(lista);
                }
               
                
                
                
             
                break;
        }

    }
}
