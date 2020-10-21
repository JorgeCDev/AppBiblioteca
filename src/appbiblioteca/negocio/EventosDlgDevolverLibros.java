/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.negocio;


import appbiblioteca.modelo.Prestamo;
import appbiblioteca.modelo.Usuario;
import appbiblioteca.persistencia.ManejaTablaH;
import appbiblioteca.vistas.DlgDevolverLibros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge
 */
public class EventosDlgDevolverLibros implements ActionListener{
    
    private ManejaTablaH tablaH;
    private DlgDevolverLibros devolucion;

    public EventosDlgDevolverLibros(ManejaTablaH tablaH, DlgDevolverLibros devolucion) {
        this.tablaH = tablaH;
        this.devolucion = devolucion;
    }
    
 
    @Override
    public void actionPerformed(ActionEvent e) {
        String eventos = e.getActionCommand();
               
        switch(eventos){
            
            case "comboBoxChanged":
                
                
                listarPrestamos();
           
                break;
            
            case "Devolver":
                
                DefaultTableModel model= (DefaultTableModel) devolucion.
                        getTblDevLibTablaLibrosPrestados().getModel();
                
              if( devolucion.getTblDevLibTablaLibrosPrestados().getSelectedRow()>-1)
              {
               model.getDataVector().elementAt(devolucion.
                       getTblDevLibTablaLibrosPrestados().getSelectedRow());
               
               tablaH.getTablaLibro().getLibroByName(
                       (String) model.getValueAt(0,1)).cambiarExistencia(1);
               
               int llave= Integer.parseInt(devolucion.getCmbUsuario().
                       getSelectedItem().toString());
              
               
               Usuario user = tablaH.getTablaUsuario().getTablaUsuario().get(llave);
               
               tablaH.getTablaPrestamos().removePrestamo(user,(String) model.getValueAt(0,1));
               if(devolucion.getChkDevLibMoroso().isSelected())
                   user.setMoroso(true);
               
               limpiarModelo();
                }
              else
              {
                  JOptionPane.showMessageDialog(devolucion, 
                            "Seleccione un Prestamo", "", JOptionPane.WARNING_MESSAGE);
              }
               
                
                break;
                 
        }
      
        
    }
    
    
    
    
    private void listarPrestamos()
    {
        
        
        System.out.println(devolucion.getCmbUsuario().getSelectedIndex());
        if(devolucion.getCmbUsuario().getSelectedIndex()>-1)
        {
                int numero =Integer.parseInt(devolucion.getCmbUsuario().getSelectedItem().toString());
                Usuario user= tablaH.getTablaUsuario().getTablaUsuario().get(numero);
                
            if (tablaH.getTablaPrestamos().getTablaPrestamos().containsKey(user)) 
            {
            
                Prestamo[] prestamos= tablaH.getTablaPrestamos().getPrestamos(user);

                DefaultTableModel modelo = (DefaultTableModel) 
                        devolucion.getTblDevLibTablaLibrosPrestados().getModel();

                modelo.setRowCount(0);
               
                Object matrix[] = new Object[3];

                for (int i = 0; i < prestamos.length; i++) 
                {
                    if (!Objects.isNull(prestamos[i])) {
                        
                    matrix[0] = prestamos[i].getNombreUsuario();
                    matrix[1] = prestamos[i].getLibroPrestado();
                    matrix[2] = prestamos[i].getDiaPrestamo();
                    modelo.addRow(matrix);
                        
                    }
                   

                }

                devolucion.getTblDevLibTablaLibrosPrestados().setModel(modelo);  

            }
            else
            {
                  limpiarModelo();
            }
             
        }
        
        else
        {
                  limpiarModelo();
        }
         
       
        
    
        
    }
    
    public void limpiarModelo(){
    DefaultTableModel modelo = (DefaultTableModel) 
                   devolucion.getTblDevLibTablaLibrosPrestados().getModel();

    modelo.setRowCount(0);
    modelo.setRowCount(4);
    devolucion.getTblDevLibTablaLibrosPrestados().setModel(modelo);

    }
    
}
    
    
    
    
    
    
    
    
    
    
    
    

