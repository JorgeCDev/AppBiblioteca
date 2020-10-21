package appbiblioteca.negocio;

import appbiblioteca.persistencia.ManejaTablaH;
import appbiblioteca.modelo.Usuario;
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
                String nombre = usuario.getUsuarioNombre().toUpperCase();
                String apePaterno = usuario.getUsuarioApePat().toUpperCase();
                String apeMaterno = usuario.getUsuarioApeMat().toUpperCase();
                String domicilio = usuario.getUsuarioDomicilio().toUpperCase();
                String residencia = usuario.getUsuarioCiudad().toUpperCase();
                char tipo = usuario.getUsuarioTipo();
                Usuario user= new Usuario(nombre, apePaterno, apeMaterno, domicilio, residencia, tipo);
                
                
                if( nombre.equals("") || apePaterno.equals("") || apeMaterno.equals("") || domicilio.equals("") || residencia.equals("") )
                    JOptionPane.showMessageDialog(usuario,"Porfavor llenar los campos Vacios","", JOptionPane.WARNING_MESSAGE);
                if(tipo == 'S' )
                    JOptionPane.showMessageDialog(usuario,"Porfavor Seleccionar Tipo de Usuario","", JOptionPane.WARNING_MESSAGE);
                else
                    if(tablaH.getTablaUsuario().getTablaUsuario().contains(user))
                        JOptionPane.showMessageDialog(usuario,"Usuario duplicado","", JOptionPane.WARNING_MESSAGE);
                    else{
                        tablaH.getTablaUsuario().AgregaUsuario(user);
                        JOptionPane.showMessageDialog(usuario,"Usuario "+nombre+" Agregado Correctamente","", JOptionPane.INFORMATION_MESSAGE);
                        usuario.limpiarTxt();
                    }
                break;
                
            case "Salir":
                usuario.dispose();
                break;
             
        }
            
        
        
    }

}
