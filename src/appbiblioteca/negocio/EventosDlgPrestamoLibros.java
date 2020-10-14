/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.negocio;

import appbiblioteca.persistencia.ManejaTablaH;
import appbiblioteca.persistencia.Prestamo;
import appbiblioteca.persistencia.Usuario;
import appbiblioteca.vistas.DlgPrestamos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;


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
                
                
                if(!tablaH.getTablaPrestamos().containsKey(
                        tablaH.getTablaUsuario().get(llave)))
                    
                        prest.getTxtPresLibPrestamos().setText("0");
                else{
                    
                    prest.getTxtPresLibPrestamos().setText(
                            ""+tablaH.librosPrestados(
                                    tablaH.getTablaUsuario().get(llave)));
                    
                }
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
                 
             case "Prestar" :
                 
                   
                    if(prest.isEmpty()){
                        
                        JOptionPane.showMessageDialog(prest,"No puede haber valores vacios");
                       
                        return;
                    }
                    
                    int existencia= Integer.parseInt(prest.
                            getTxtPresLibExistencia().getText());
                    if(existencia==0){
                         JOptionPane.showMessageDialog(prest,"Libro Sin Existencia"); 
                    }else
                    if(prest.getTxtPresLibMorosidad().getText().equals("Moroso")){
                        JOptionPane.showMessageDialog(prest,"Usuario Moroso");
                        prest.limpiarTxt();
                    }else {
                        
                        int llaveUsuario = Integer.parseInt(prest.getCmbPrestLibUsuario()
                          .getSelectedItem().toString());
                        
                          int llaveLibro = Integer.parseInt(prest.getCmbPrestLibClave()
                          .getSelectedItem().toString());
                        
                      tablaH.getLibro(llaveLibro).cambiarExistencia(-1);
                      String libroPrestado=prest.getTxtPresLibNomLibro().getText();
                      Usuario user=tablaH.getTablaUsuario().get(llaveUsuario);
                      
                        Date date = Calendar.getInstance().getTime();
                        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
                        String strDate = dateFormat.format(date);
                      
                      
                      Prestamo prestamo= new Prestamo(
                              user.getNombreCompleto(),libroPrestado,strDate);
                      
                      tablaH.addPrestamo(user, prestamo);
                      
                              
                      JOptionPane.showMessageDialog(prest,"Prestamo Exitoso");  
                      prest.dispose();
                    }
                    
                       
                 prest.limpiarTxt();
                 break;
                 
                 
           
       }
    }
    
    
    
}
