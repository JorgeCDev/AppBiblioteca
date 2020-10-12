/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.negocio;

import appbiblioteca.persistencia.ManejaTablaH;
import appbiblioteca.vistas.DlgAumentarExist;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jorge
 */
public class EventosDlgAumentarExistencia implements ActionListener{
    private ManejaTablaH tablaH;
    private DlgAumentarExist existencia;

    public EventosDlgAumentarExistencia(ManejaTablaH tablaH, DlgAumentarExist exitencia) {
        this.tablaH = tablaH;
        this.existencia = exitencia;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String evento= e.getActionCommand();
        
        switch(evento){
            
            case"cmbClave":
                
               int selec =existencia.getCmbAumExstClaveLibro().getSelectedIndex();
               existencia.getCmbAmtExstNombreLibro().setSelectedIndex(selec);
                    
                break;
            case"cmbLibro":    
             
               int select =existencia.getCmbAmtExstNombreLibro().getSelectedIndex();
               existencia.getCmbAumExstClaveLibro().setSelectedIndex(select);
               break;
        }
        
        
    }
}
