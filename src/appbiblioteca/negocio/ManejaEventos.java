/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.negocio;

import appbiblioteca.vistas.VistaBiblioteca;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 *
 * @author Jorge
 */
public class ManejaEventos implements ActionListener{
    private VistaBiblioteca vista;

    public ManejaEventos(VistaBiblioteca vista) {
        this.vista = vista;
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String evento= e.getActionCommand();
       
        switch(evento){
            
             case "Salir":
                 vista.dispose();
                 System.exit(0);
                break;
                
            case "Altas Usuario":
                vista.getAltaUsuarios().setVisible(true);
                break;
                
            case "Alta Libros":
                vista.getAltaLibros().setVisible(true);
                break;
                
                
            case "Aumentar Existencia":
                vista.getAumentarExistencia().setVisible(true);
                break;
                
                
            case "Prestamo Libros":
                vista.getPrestamos().setVisible(true);
                break; 
                
            case "Devolucion de Libros":
                vista.getDevoluciones().setVisible(true);
                break;     
                
            case "Busqueda":
                vista.getBusqueda().setVisible(true);
                break;    
        }
            
        
    }
    
    
    
}
