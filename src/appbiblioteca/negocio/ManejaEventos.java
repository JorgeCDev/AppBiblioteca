
package appbiblioteca.negocio;

import appbiblioteca.persistencia.ManejaLista;
import appbiblioteca.vistas.DlgAltaUsuarios;
import appbiblioteca.vistas.VistaBiblioteca;
import appbiblioteca.vistas.DlgReporteUsuarios;
import appbiblioteca.persistencia.ManejaTablaH;
import appbiblioteca.vistas.DlgAcerca;
import appbiblioteca.vistas.DlgAltaLibros;
import appbiblioteca.vistas.DlgMorosos;
import appbiblioteca.vistas.DlgAumentarExist;
import appbiblioteca.vistas.DlgBusqueda;
import appbiblioteca.vistas.DlgInventario;
import appbiblioteca.vistas.DlgPrestamos;
import appbiblioteca.vistas.DlgDevolverLibros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;


/**
 *
 * @author Jorge
 */
public class ManejaEventos implements ActionListener,MouseListener{
    
    private VistaBiblioteca vista;
    private ManejaTablaH manejaT;
    private ManejaLista lista;
    private DlgAltaUsuarios dialogAltaUsuario;
    private DlgAltaLibros dialogAltaLibros;
    private DlgInventario dialogInventario;
    private DlgAumentarExist dialogAumentarExistencia;
    private DlgBusqueda dialogBusqueda;
    private DlgAcerca dialogAcerca;
    private DlgMorosos dialogMorosos;
    private DlgDevolverLibros ddl;
    private DlgPrestamos prestamos;

    public ManejaEventos(VistaBiblioteca vista, ManejaTablaH mt, ManejaLista lista) {
        this.vista = vista;
        manejaT = mt;
        this.lista = lista;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String evento = e.getActionCommand();
       
        switch(evento){
            
             case "Salir":
                System.exit(0);
                break;
                
            case "Altas Usuario":
                dialogAltaUsuario = new DlgAltaUsuarios(vista, evento, true, manejaT);
                dialogAltaUsuario.setLocationRelativeTo(vista);
                dialogAltaUsuario.setVisible(true);
                break;
                
            case "Alta Libros":
                dialogAltaLibros = new DlgAltaLibros(vista, evento, true, manejaT);
                dialogAltaLibros.setLocationRelativeTo(vista);
                dialogAltaLibros.setVisible(true);
                break;
                
                
            case "Aumentar Existencia":
                dialogAumentarExistencia = new DlgAumentarExist(vista, evento, true, manejaT);
                dialogAumentarExistencia.setLocationRelativeTo(vista);
                dialogAumentarExistencia.setVisible(true);
                break;
                
                
            case "Prestamo Libros":
                
                prestamos = new DlgPrestamos(vista, "Prestamos", true, manejaT);
                prestamos.setLocationRelativeTo(vista);
                prestamos.setVisible(true);
                
                break; 
                
            case "Devolucion de Libros":
                ddl = new DlgDevolverLibros(vista, evento, true, manejaT);
                ddl.setLocationRelativeTo(vista);
                ddl.setVisible(true);
                break;     
                
            case "Busqueda":
                dialogBusqueda = new DlgBusqueda(vista, evento, true, manejaT);
                dialogBusqueda.setLocationRelativeTo(vista);
                dialogBusqueda.setVisible(true);
                break;
                
            case "Reporte Usuarios":
                DlgReporteUsuarios dru = new DlgReporteUsuarios(vista, evento, true, manejaT);
                dru.setLocationRelativeTo(vista);
                dru.setVisible(true);
                        

                break;
                
            case "Acerca":
                dialogAcerca = new DlgAcerca(vista, evento, true);
                dialogAcerca.setLocationRelativeTo(vista);
                dialogAcerca.setVisible(true);
                break; 
                
            case "Inventario":
                dialogInventario = new DlgInventario(vista, evento, true, manejaT);
                dialogInventario.setLocationRelativeTo(vista);
                dialogInventario.setVisible(true);
                break;
                
            case "Morosos":
                dialogMorosos = new DlgMorosos(vista, evento, true, manejaT, lista);
                dialogMorosos.setLocationRelativeTo(vista);
                dialogMorosos.setVisible(true);
                break;
                
        }
            
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
            JLabel eventL= (JLabel)e.getSource();
           
           switch(eventL.getName()){
                
           case"Inventario":    
           dialogInventario = new DlgInventario(vista,"Inventario", true, manejaT);
                dialogInventario.setLocationRelativeTo(vista);
                dialogInventario.setVisible(true);
            break;
            
            case"Usuarios":
           DlgReporteUsuarios dru = new DlgReporteUsuarios(vista,"Usuarios", true, manejaT);
           dru.setLocationRelativeTo(vista);
           dru.setVisible(true);
                break;
            
            case"Morosos":
                dialogMorosos = new DlgMorosos(vista, "Morosos", true, manejaT, lista);
                dialogMorosos.setLocationRelativeTo(vista);
                dialogMorosos.setVisible(true);
                break;
                
            case"Prestamos":
                
                
                break;
                    
            
            }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    
    
}
