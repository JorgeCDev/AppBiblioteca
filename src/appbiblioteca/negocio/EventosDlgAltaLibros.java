package appbiblioteca.negocio;

import appbiblioteca.modelo.Libro;
import appbiblioteca.persistencia.ManejaTablaH;
import appbiblioteca.vistas.DlgAltaLibros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class EventosDlgAltaLibros implements ActionListener
{
    ManejaTablaH tablaH;
    DlgAltaLibros dLibros;
    
    
    public EventosDlgAltaLibros(DlgAltaLibros dLibros, ManejaTablaH tablaH) {
        this.dLibros = dLibros;
        this.tablaH = tablaH;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String evento= e.getActionCommand();
       
        switch(evento){
            case "Agregar":
                String nombre = dLibros.getNombre().toUpperCase();
                String descripcion = dLibros.getDescripcion().toUpperCase();
                String autor = dLibros.getAutor().toUpperCase();
                String editorial = dLibros.getEditorial().toUpperCase();
                int existencia = dLibros.getExistencia();
                
                Libro libro = new Libro(nombre, autor, descripcion, editorial, existencia);
                
                if( nombre.equals("") || descripcion.equals("") || autor.equals("") || editorial.equals("") )
                    JOptionPane.showMessageDialog(dLibros,"Porfavor llenar los campos Vacios","", JOptionPane.WARNING_MESSAGE);
                else
                    if( tablaH.getTablaLibro().contains(libro) )
                        JOptionPane.showMessageDialog(dLibros,"Libro Duplicado","", JOptionPane.WARNING_MESSAGE);
                    else{
                        tablaH.AgregaLibro(libro);
                        //JOptionPane.showMessageDialog(dLibros,"Libro "+nombre+" Agregado Correctamente","", JOptionPane.INFORMATION_MESSAGE);
                        dLibros.limpiarTxt();
                    }
                break;
                
            case "Salir":
                dLibros.dispose();
                break;
        }
    }
}
