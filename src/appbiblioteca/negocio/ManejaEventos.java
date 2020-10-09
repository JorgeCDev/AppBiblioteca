/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.negocio;

import appbiblioteca.vistas.VistaBiblioteca;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        System.out.println(e.getActionCommand());
        switch(evento){
            case "Altas Usuario":
                vista.getAltaUsuarios().setVisible(true);
                break;
                
            case "Alta Libros":
                vista.getAltaLibros().setVisible(true);
                break;
                
        }
            
        
    }
    
    
    
}
