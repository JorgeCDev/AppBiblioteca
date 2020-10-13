package appbiblioteca.negocio;

import appbiblioteca.persistencia.ManejaLista;
import appbiblioteca.persistencia.ManejaTablaH;
import appbiblioteca.vistas.DlgMorosos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosDlgMorosos implements ActionListener
{ 
    private DlgMorosos morosos;
    private ManejaTablaH tablaH;
    private ManejaLista lista;
    
    public EventosDlgMorosos(DlgMorosos morosos, ManejaTablaH tablaH, ManejaLista lista) {
        this.morosos = morosos;
        this.tablaH = tablaH;
        this.lista = lista;
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        String evento= e.getActionCommand();
        
        switch(evento){
            
        }

    }
}
