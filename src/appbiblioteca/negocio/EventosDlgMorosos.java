package appbiblioteca.negocio;

import appbiblioteca.persistencia.ManejaLista;
import appbiblioteca.persistencia.ManejaTablaH;
import appbiblioteca.persistencia.Usuario;
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
                
                
                String usuario = morosos.getCmbUsuario().getSelectedItem().toString();
                String[] user = usuario.split(" ");
                String nombre = user[0];
                String apellPat = user[1];
                String apellMat = user[2];
                
                Usuario moroso = tablaH.buscarUsuario(nombre, apellPat, apellMat);
                
                if( lista.usuarioExiste(moroso) ){
                    JOptionPane.showMessageDialog(morosos, 
                            "Usuario Removido de Morosos Correctamente", "", JOptionPane.INFORMATION_MESSAGE);
                    lista.eliminarMoroso(moroso);
                }else
                    JOptionPane.showMessageDialog(morosos, 
                            "Usuario No Existe en Morosos", "", JOptionPane.WARNING_MESSAGE);
                this.morosos.generarTabla(lista);
                break;
        }

    }
}
