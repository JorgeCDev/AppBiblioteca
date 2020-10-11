
package appbiblioteca.negocio;

import appbiblioteca.vistas.DlgAcerca;
import appbiblioteca.vistas.DlgAltaUsuarios;
import appbiblioteca.vistas.VistaBiblioteca;
import appbiblioteca.vistas.DlgReporteUsuarios;
import appbiblioteca.persistencia.ManejaTablaH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Jorge
 */
public class ManejaEventos implements ActionListener{
    VistaBiblioteca tVista;
    ManejaTablaH manejaT;
    

    public ManejaEventos(VistaBiblioteca vista, ManejaTablaH mt) {
        tVista = vista;
        manejaT = mt;
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String evento = e.getActionCommand();
       
        switch(evento){
            
             case "Salir":
//                 dispose();
                 System.exit(0);
                break;
                
            case "Altas Usuario":
                DlgAltaUsuarios dau = new DlgAltaUsuarios(tVista, evento, true, manejaT);
                dau.setVisible(true);
                
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
                DlgReporteUsuarios dru = new DlgReporteUsuarios(tVista, evento, true, manejaT);
                dru.setVisible(true);
                        
//              vista.getReporteUsuarios().setVisible(true);
                break;
                
            case "Acerca":
//                vista.getAcerca().setVisible(true);
                break; 
        }
            
        
    }
    
    
    
}
