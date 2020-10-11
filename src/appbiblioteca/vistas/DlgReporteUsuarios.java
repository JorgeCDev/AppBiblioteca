package appbiblioteca.vistas;

import appbiblioteca.persistencia.ManejaTablaH;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;

 public class DlgReporteUsuarios extends JDialog{
    
    ManejaTablaH manejaT;   
    
    public DlgReporteUsuarios(Frame f, String t, boolean modal, ManejaTablaH mt){
        super(f,t, modal);
        setLocationRelativeTo(null);
        String[] nombreColumnas = {
            "Clave",
            "Nombre",
            "Marca",
            "Marca"
//            "Marca"
        };
        String[][] data = mt.ObtenerTablaUsuario();
        System.out.println("datos: "+data);
        JTable jt_info = new JTable(data, nombreColumnas);
        jt_info.setPreferredScrollableViewportSize(new Dimension (600, 180));

        JScrollPane sp = new JScrollPane(jt_info);
        getContentPane().add(sp, BorderLayout.CENTER);
        setSize(370,200);
    }
    
    

    
}
