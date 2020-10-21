/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.negocio;

import appbiblioteca.modelo.Libro;
import appbiblioteca.persistencia.ManejaTablaH;
import appbiblioteca.vistas.DlgBusqueda;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge
 */
public class EventosDlgBusqueda implements ActionListener{
    
    private ManejaTablaH tablaH;
    private DlgBusqueda busqueda;

    public EventosDlgBusqueda(ManejaTablaH tablaH, DlgBusqueda busqueda) {
        this.tablaH = tablaH;
        this.busqueda = busqueda;
    }

 

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
        String evento=e.getActionCommand();
        
        switch(evento){
            
            case "Buscar":
                
                LinkedList<Libro> lista= new LinkedList<>();
                                   
                if (busqueda.getrBtnSrcAutor().isSelected())
                   
                   lista = buscarLibros("Autor",busqueda.
                           getTxtSrcBusqueda().getText());
                
                    
                else if(busqueda.getrBtnSrcEditorial().isSelected())
                   
                    lista = buscarLibros("",busqueda.
                            getTxtSrcBusqueda().getText());
                
                
                if(lista.size()>0){
                 DefaultTableModel modelo =
                        (DefaultTableModel) busqueda
                                .getTblSrcResultados().getModel();

               
                modelo.setRowCount(0);

                Object matrix[] = new Object[5];

                for (int i = 0; i < lista.size(); i++) {
               
                    matrix[0] = lista.get(i).getAutor();
                    matrix[1] = lista.get(i).getNombreLibro();
                    matrix[2] = lista.get(i).getDescripcion();
                    matrix[3] = lista.get(i).getEditorial();
                    matrix[4] = lista.get(i).getExistencia();
                    
                    modelo.addRow(matrix);

                }

                busqueda.getTblSrcResultados().setModel(modelo);

                }    
                    
                break;
            
            
        }
        
        
    }
    
    
    
    public LinkedList<Libro> buscarLibros(String busquedaTipo, String keyword){
        
        LinkedList<Libro> lista = tablaH.getTablaLibro().getAllLibros();
        LinkedList<Libro> resultado = new LinkedList<>();
        
        if(busquedaTipo.equals("Autor")){
            
            for (int i = 0; i < lista.size(); i++) {
            
                if(lista.get(i).getAutor().contains(keyword.toUpperCase()))
                    resultado.add(lista.get(i));
                
            }
        }else{
            
              for (int i = 0; i < lista.size(); i++) {
                  
                if(lista.get(i).getEditorial().contains(keyword.toUpperCase()))
                    resultado.add(lista.get(i));
                
            }
            
            
        }
         
        return resultado;
    }
    
    
    
}
