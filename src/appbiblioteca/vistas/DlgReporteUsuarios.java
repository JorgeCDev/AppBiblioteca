package appbiblioteca.vistas;

import appbiblioteca.persistencia.ManejaTablaH;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DlgReporteUsuarios extends javax.swing.JDialog{
    
    public DlgReporteUsuarios(Frame f, String t, boolean modal, ManejaTablaH mt){
        super(f,t, modal);
        String[] nombreColumnas = {
            "Clave",
            "Nombre",
            "Apellido Paterno",
            "Apellido Materno",
            "Ciudad o Residencia",
            "Tipo de Usuario"
        };
        String[][] data = mt.getTablaUsuario().ObtenerTablaUsuario();
        System.out.println( "datos: " + data );
        JTable jt_info = new JTable(data, nombreColumnas);
        jt_info.setPreferredScrollableViewportSize(new Dimension (600, 180));

        JScrollPane sp = new JScrollPane(jt_info);
        getContentPane().add(sp, BorderLayout.CENTER);
        setLocationByPlatform(true);
        setSize(800,500);
    }

}
