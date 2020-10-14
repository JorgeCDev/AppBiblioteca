/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.negocio;

import appbiblioteca.persistencia.ManejaTablaH;
import appbiblioteca.vistas.DlgPrestamos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Jorge
 */
public class EventosDlgPrestamoLibros implements ActionListener{
    private ManejaTablaH tablaH;
    private DlgPrestamos prest;

    public EventosDlgPrestamoLibros(ManejaTablaH tablaH, DlgPrestamos dlgPrestamos) {
        this.tablaH = tablaH;
        this.prest = dlgPrestamos;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       String eventos = e.getActionCommand();
       
       switch(eventos){
           
           case"cmbUsuario":
              
              if (prest.getCmbPrestLibUsuario().getSelectedIndex()!=-1){
                  
                  if(!prest.getCmbPrestLibUsuario()
                          .getSelectedItem().toString().equals("")){
                      
                  int llave = Integer.parseInt(prest.getCmbPrestLibUsuario()
                          .getSelectedItem().toString());
                  
                 
                prest.getTxtPresLibNombreUs1().setText(
                          tablaH.getTablaUsuario().get(llave).getNombreCompleto()); 
                
                prest.getTxtPresLibTipo().setText(
                          tablaH.getTablaUsuario().get(llave).getTypeAsString()); 
                
                prest.getTxtPresLibMorosidad().setText(
                        tablaH.getTablaUsuario().get(llave).getMorosidadTxt());
                  } 
              

              }

               break;
               
               
             case"cmbClave":
                 
                 if (prest.getCmbPrestLibClave().getSelectedIndex()!=-1){
                  
                  if(!prest.getCmbPrestLibClave()
                          .getSelectedItem().toString().equals("")){
                      
                  int llave = Integer.parseInt(prest.getCmbPrestLibClave()
                          .getSelectedItem().toString());
                  
                 
                prest.getTxtPresLibNomLibro().setText(
                          tablaH.getTablaLibro().get(llave).getNombreLibro()); 
                
                prest.getTxtPresLibExistencia().setText(
                          ""+tablaH.getTablaLibro().get(llave).getExistencia()); 
               
                  } 
              

              }
                 
                 
                 break;
           
       }
    }
    
    
    
}
