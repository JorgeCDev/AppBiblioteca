package appbiblioteca.negocio;

import appbiblioteca.persistencia.ManejaTablaH;
import appbiblioteca.vistas.DlgAltaLibros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
        
    }

}
