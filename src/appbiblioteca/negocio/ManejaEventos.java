
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Jorge
 */
public class ManejaEventos implements ActionListener{
    
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
                dialogAltaUsuario.setVisible(true);
                break;
                
            case "Alta Libros":
                dialogAltaLibros = new DlgAltaLibros(vista, evento, true, manejaT);
                dialogAltaLibros.setVisible(true);
                break;
                
                
            case "Aumentar Existencia":
                dialogAumentarExistencia = new DlgAumentarExist(vista, evento, true, manejaT);
                dialogAumentarExistencia.setVisible(true);
                break;
                
                
            case "Prestamo Libros":
                
                prestamos = new DlgPrestamos(vista, "Prestamos", true, manejaT);   
                prestamos.setVisible(true);
                
                break; 
                
            case "Devolucion de Libros":
//                vista.getDevoluciones().setVisible(true);
                break;     
                
            case "Busqueda":
                dialogBusqueda = new DlgBusqueda(vista, evento, true, manejaT);
                dialogBusqueda.setVisible(true);
                break;
                
            case "Reporte Usuarios":
                DlgReporteUsuarios dru = new DlgReporteUsuarios(vista, evento, true, manejaT);
                dru.setVisible(true);
                        
//              vista.getReporteUsuarios().setVisible(true);
                break;
                
            case "Acerca":
                dialogAcerca = new DlgAcerca(vista, evento, true);
                dialogAcerca.setVisible(true);
                break; 
                
            case "Inventario":
                this.dialogInventario = new DlgInventario(vista, evento, true, manejaT);
                this.dialogInventario.setVisible(true);
                break;
                
            case "Morosos":
                this.dialogMorosos = new DlgMorosos(vista, evento, true, manejaT, lista);
                this.dialogMorosos.setVisible(true);
                break;
                
        }
            
        
    }
    
    
    
}
