/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.negocio;

import appbiblioteca.persistencia.ManejaTablaH;
import appbiblioteca.modelo.Prestamo;
import appbiblioteca.modelo.Usuario;
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
           
           case "cmbUsuario":
              
              if (prest.getCmbPrestLibUsuario().getSelectedIndex()!=-1)
              {
                  
                if(!prest.getCmbPrestLibUsuario()
                        .getSelectedItem().toString().equals(" "))
                {
                      
                      int llave = Integer.parseInt(prest.getCmbPrestLibUsuario()
                                .getSelectedItem().toString());


                      prest.getTxtPresLibNombreUs1().setText(
                                tablaH.getTablaUsuario().getTablaUsuario().
                                        get(llave).getNombreCompleto()); 

                      prest.getTxtPresLibTipo().setText(
                                tablaH.getTablaUsuario().getTablaUsuario().
                                        get(llave).getTypeAsString()); 

                      prest.getTxtPresLibMorosidad().setText(
                              tablaH.getTablaUsuario().getTablaUsuario().
                                      get(llave).getMorosidadTxt());
                
                
                if(!tablaH.getTablaPrestamos().getTablaPrestamos().containsKey(
                        tablaH.getTablaUsuario().getTablaUsuario().get(llave)))
                {
                    
                        prest.getTxtPresLibPrestamos().setText("0");
                }        
                else
                {
                    
                    prest.getTxtPresLibPrestamos().setText(
                            ""+tablaH.getTablaPrestamos().librosPrestados(
                                    tablaH.getTablaUsuario().getTablaUsuario().
                                            get(llave)));
                    
                }
                
                } 
                
              }else{
                  prest.limpiarUsuario();
              }

               break;
               
               
             case"cmbClave":
                 
                 if (prest.getCmbPrestLibClave().getSelectedIndex()!=-1)
                 {
                  
                  if(!prest.getCmbPrestLibClave()
                          .getSelectedItem().toString().equals(""))
                  {
                      
                  int llave = Integer.parseInt(prest.getCmbPrestLibClave()
                          .getSelectedItem().toString());
                  
                 
                prest.getTxtPresLibNomLibro().setText(
                          tablaH.getTablaLibro().getTablaLibro().get(llave).getNombreLibro()); 
                
                prest.getTxtPresLibExistencia().setText(
                          ""+tablaH.getTablaLibro().getTablaLibro().get(llave).getExistencia()); 
               
                  }else{
                     prest.limpiarLibro(); 
                  }
              

                   }
                   else
                   {
                    prest.limpiarLibro();
                   }

                 
                 
                 break;
                 
             case "Prestar" :
                 
                   
                    if(prest.isEmpty()){
                        
                        JOptionPane.showMessageDialog(prest,"No puede haber valores vacios");
                       
                        return;
                    }
                    
                    int existencia= Integer.parseInt(prest.
                            getTxtPresLibExistencia().getText());
                    int prestamos=Integer.parseInt(prest.getTxtPresLibPrestamos().getText());
                    char tipo =prest.getTxtPresLibTipo().getText().charAt(0);
                    if(existencia==0)
                    {
                         JOptionPane.showMessageDialog(prest,"Libro Sin Existencia"); 
                    }
                    
                    if(prest.getTxtPresLibMorosidad().getText().equals("Moroso")){
                        JOptionPane.showMessageDialog(prest,"Usuario Moroso");
                        prest.limpiarTxt();
                    }
                    
                    else if(prestamos==2&tipo=='A'|prestamos==2&tipo=='E'|prestamos==3&tipo=='M')
                    {
                         JOptionPane.showMessageDialog(prest,"Limite de Prestamos Alcanzado");
                        prest.limpiarTxt();
                    }
                    else 
                    {
                        
                    int llaveUsuario = Integer.parseInt(prest.getCmbPrestLibUsuario()
                      .getSelectedItem().toString());

                    int llaveLibro = Integer.parseInt(prest.getCmbPrestLibClave()
                    .getSelectedItem().toString());

                    tablaH.getTablaLibro().getLibro(llaveLibro).cambiarExistencia(-1);
                    String libroPrestado=prest.getTxtPresLibNomLibro().getText();
                    Usuario user=tablaH.getTablaUsuario().getTablaUsuario().get(llaveUsuario);
               
                    
                    String strDate = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
                    
                      
                    Prestamo prestamo= new Prestamo(
                              user.getNombreCompleto(),libroPrestado,strDate);
                      if(!tablaH.getTablaPrestamos().isPrestamoDuplicated(user, prestamo)){
                      tablaH.getTablaPrestamos().addPrestamo(user, prestamo);
                      JOptionPane.showMessageDialog(prest,"Prestamo Exitoso");  
                      prest.dispose();
                      }else{
                          JOptionPane.showMessageDialog(prest,"Prestamo Existente");
                          return;
                      }
                      
                    }
                    
                       
                 prest.limpiarTxt();
                 break;
                 
           
                 
                 
                 
           
       }
    }
    
    
    
}
