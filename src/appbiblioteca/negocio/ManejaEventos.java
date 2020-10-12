
package appbiblioteca.negocio;

import appbiblioteca.vistas.DlgAltaUsuarios;
import appbiblioteca.vistas.VistaBiblioteca;
import appbiblioteca.vistas.DlgReporteUsuarios;
import appbiblioteca.persistencia.ManejaTablaH;
import appbiblioteca.vistas.DlgAltaLibros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Jorge
 */
public class ManejaEventos implements ActionListener{
    
    private VistaBiblioteca vista;
    private ManejaTablaH manejaT;
    private DlgAltaUsuarios dialogAltaUsuario;
    private DlgAltaLibros dialogAltaLibros;

    public ManejaEventos(VistaBiblioteca vista, ManejaTablaH mt) {
        this.vista = vista;
        manejaT = mt;
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
                
//                vista.getAltaUsuarios().setVisible(true);
                break;
                
            case "Alta Libros":
//                vista.getAltaLibros().setVisible(true);
                break;
                
                
            case "Aumentar Existencia":
//                vista.getAumentarExistencia().setVisible(true);
                break;
                
                
            case "Prestamo Libros":
//                vista.getPrestamos().setVisible(true);
                break; 
                
            case "Devolucion de Libros":
//                vista.getDevoluciones().setVisible(true);
                break;     
                
            case "Busqueda":
//                vista.getBusqueda().setVisible(true);
                break;
                
            case "Reporte Usuarios":
                DlgReporteUsuarios dru = new DlgReporteUsuarios(vista, evento, true, manejaT);
                dru.setVisible(true);
                        
//              vista.getReporteUsuarios().setVisible(true);
                break;
                
            case "Acerca":
//                vista.getAcerca().setVisible(true);
                break; 
        }
            
        
    }
    
    
    
}
