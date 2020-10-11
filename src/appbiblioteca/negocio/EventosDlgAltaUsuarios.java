package appbiblioteca.negocio;

import appbiblioteca.persistencia.ManejaTablaH;
import appbiblioteca.vistas.DlgAltaUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class EventosDlgAltaUsuarios implements ActionListener
{
    DlgAltaUsuarios usuario;
    ManejaTablaH tablaH;

    public EventosDlgAltaUsuarios(DlgAltaUsuarios aThis, ManejaTablaH tablaH) 
    {
        this.usuario = aThis;
        this.tablaH = tablaH;        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String evento= e.getActionCommand();
       
        switch(evento){
            case "Agregar":
                String nombre = usuario.getUsuarioNombre();
                String apePaterno = usuario.getUsuarioApePat();
                String apeMaterno = usuario.getUsuarioApeMat();
                String domicilio = usuario.getUsuarioDomicilio();
                String residencia = usuario.getUsuarioCiudad();
                //char tipo = usuario.getUsuarioTipo();
                
                if( nombre.equals("") || apePaterno.equals("") || apeMaterno.equals("") || domicilio.equals("") || residencia.equals("") )
                    JOptionPane.showMessageDialog(usuario,"Porfavor llenar los campos Vacios","", JOptionPane.WARNING_MESSAGE);
                else{
                    tablaH.AgregaUsuario(nombre, domicilio, residencia);
                    JOptionPane.showMessageDialog(usuario,"Usuario Agregado Correctamente","", JOptionPane.INFORMATION_MESSAGE);
                    usuario.limpiarTxt();
                }
                break;
                
            case "Salir":
                usuario.dispose();
                break;
             
        }
            
        
        
    }

}
