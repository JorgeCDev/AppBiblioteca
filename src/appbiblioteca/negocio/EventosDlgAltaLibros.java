package appbiblioteca.negocio;

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
                String nombre = dLibros.getNombre();
                String descripcion = dLibros.getDescripcion();
                String autor = dLibros.getAutor();
                String editorial = dLibros.getEditorial();
                
                tablaH.AgregaLibro(nombre, autor, descripcion, editorial, 0);
                JOptionPane.showMessageDialog(dLibros,"Libro "+nombre+" Agregado Correctamente","", JOptionPane.INFORMATION_MESSAGE);
                dLibros.limpiarTxt();
                
                break;
                
            case "Salir":
                dLibros.dispose();
                break;
        }
    }
}
