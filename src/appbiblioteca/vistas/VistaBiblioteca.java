/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.vistas;


import appbiblioteca.negocio.ManejaEventos;
import appbiblioteca.persistencia.ManejaTablaH;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.Box;

/**
 *
 * @author Jorge
 */
public class VistaBiblioteca extends javax.swing.JFrame {
    
    private final Font fuenteH= new Font("Helvetica",Font.PLAIN,13);
    private final Font fuenteT= new Font("Helvetica",Font.PLAIN,15);
    private final Color COLOR_MEDIO = new Color(0, 176, 255);
    private final Color COLOR_LIGHT = new Color(105, 226, 255);
    private final Color COLOR_DARK = new Color(0, 129, 203);
//    private DlgAltaUsuarios altaUsuarios;
    private DlgAltaLibros altaLibros;
    private DlgAumentarExist aumentarExistencia;
    private DlgPrestamos prestamos;
    private DlgDevolverLibros devoluciones;
    private DlgBusqueda busqueda;
//    DlgReporteUsuarios ReporteUsuarios;
    private DlgAcerca acerca;
//    DlgReporteUsuarios ReporteUsuarios;
//    ManejaEventos controladora;
    
    private ManejaTablaH tablaH;

    public VistaBiblioteca() {
        
        tablaH = new ManejaTablaH();
        initComponents();
        
        tablaH.AgregaUsuario("JOSE", "PEREZ", "LOPEZ", "COL: HIDALGO", "CULIACAN", 'A');
        
        creaAcciones();
    }
    
    private void creaAcciones(){
        
        ManejaEventos controladora = new ManejaEventos(this,tablaH);
        menuItmSalir.addActionListener(controladora);
        mnItmAltasUsuario.addActionListener(controladora);
        mnItmAltaLibros.addActionListener(controladora);
        mnItmExistencia.addActionListener(controladora);
        mnItmPrestamoLibros.addActionListener(controladora);
        mnItmDevolucionLibros.addActionListener(controladora);
        mnItmBusqueda.addActionListener(controladora);
        mnItmReporteUsuarios.addActionListener(controladora);
        mnItmAcerca.addActionListener(controladora);
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mbBarraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuItmSalir = new javax.swing.JMenuItem();
        menuGestion = new javax.swing.JMenu();
        mnItmAltasUsuario = new javax.swing.JMenuItem();
        mnItmAltaLibros = new javax.swing.JMenuItem();
        mnItmExistencia = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        mnItmBusqueda = new javax.swing.JMenuItem();
        mnItmReporteUsuarios = new javax.swing.JMenuItem();
        menuLibros = new javax.swing.JMenu();
        mnItmPrestamoLibros = new javax.swing.JMenuItem();
        mnItmDevolucionLibros = new javax.swing.JMenuItem();
        menuAcerca = new javax.swing.JMenu();
        mnItmAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca");
        setBackground(Color.WHITE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/2x/book-2-24.png")));
        setLocationByPlatform(true);
        setName("VistaBiblioteca"); // NOI18N

        mbBarraMenu.setBackground(COLOR_MEDIO);
        mbBarraMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, COLOR_LIGHT, COLOR_MEDIO, COLOR_DARK, COLOR_MEDIO));

        menuArchivo.setForeground(Color.BLACK);
        menuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/2x/baseline_menuG.png"))); // NOI18N
        menuArchivo.setText("Archivo");
        menuArchivo.setFont(fuenteT);
        menuArchivo.setIconTextGap(10);

        menuItmSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menuItmSalir.setFont(fuenteH);
        menuItmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1x/baseline_close_black_18dp.png"))); // NOI18N
        menuItmSalir.setText("Salir");
        menuArchivo.add(menuItmSalir);

        mbBarraMenu.add(menuArchivo);

        menuGestion.setForeground(Color.BLACK);
        menuGestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/2x/baseline_addG.png"))); // NOI18N
        menuGestion.setText("Gestion");
        menuGestion.setFont(fuenteT);
        menuGestion.setIconTextGap(10);

        mnItmAltasUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnItmAltasUsuario.setFont(fuenteH);
        mnItmAltasUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1x/baseline_person_add_black_18dp.png"))); // NOI18N
        mnItmAltasUsuario.setText("Altas Usuario");
        menuGestion.add(mnItmAltasUsuario);

        mnItmAltaLibros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnItmAltaLibros.setFont(fuenteH);
        mnItmAltaLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1x/baseline_library_add_black_18dp.png"))); // NOI18N
        mnItmAltaLibros.setText("Alta Libros");
        menuGestion.add(mnItmAltaLibros);

        mnItmExistencia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnItmExistencia.setFont(fuenteH);
        mnItmExistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1x/baseline_addchart_black_18dp.png"))); // NOI18N
        mnItmExistencia.setText("Aumentar Existencia");
        menuGestion.add(mnItmExistencia);

        mbBarraMenu.add(menuGestion);

        menuConsultas.setForeground(Color.BLACK);
        menuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/2x/baseline_search_black_18dp.png"))); // NOI18N
        menuConsultas.setText("Consultas");
        menuConsultas.setFont(fuenteT);
        menuConsultas.setIconTextGap(10);

        mnItmBusqueda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnItmBusqueda.setFont(fuenteH);
        mnItmBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1x/baseline_search_black_18dp.png"))); // NOI18N
        mnItmBusqueda.setText("Busqueda");
        menuConsultas.add(mnItmBusqueda);

        mnItmReporteUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1x/baseline_search_black_18dp.png"))); // NOI18N
        mnItmReporteUsuarios.setText("Reporte Usuarios");
        menuConsultas.add(mnItmReporteUsuarios);

        mbBarraMenu.add(menuConsultas);

        menuLibros.setForeground(Color.BLACK);
        menuLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/2x/baseline_menu_bookG.png"))); // NOI18N
        menuLibros.setText("Libros");
        menuLibros.setFont(fuenteT);
        menuLibros.setIconTextGap(10);

        mnItmPrestamoLibros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnItmPrestamoLibros.setFont(fuenteH);
        mnItmPrestamoLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1x/baseline_library_books_black_18dp.png"))); // NOI18N
        mnItmPrestamoLibros.setText("Prestamo Libros");
        menuLibros.add(mnItmPrestamoLibros);

        mnItmDevolucionLibros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnItmDevolucionLibros.setFont(fuenteH);
        mnItmDevolucionLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1x/baseline_assignment_return_black_18dp.png"))); // NOI18N
        mnItmDevolucionLibros.setText("Devolucion de Libros");
        menuLibros.add(mnItmDevolucionLibros);

        mbBarraMenu.add(menuLibros);

        menuAcerca.setForeground(Color.BLACK);
        menuAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/2x/baseline_help_outline_black_18dp.png"))); // NOI18N
        menuAcerca.setFont(fuenteT);
        menuAcerca.setIconTextGap(10);
        menuAcerca.setMargin(new java.awt.Insets(0, 0, 0, 20));

        mnItmAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnItmAcerca.setFont(fuenteH);
        mnItmAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1x/baseline_contact_support_black_18dp.png"))); // NOI18N
        mnItmAcerca.setText("Acerca");
        menuAcerca.add(mnItmAcerca);

        mbBarraMenu.add(Box.createHorizontalGlue());

        mbBarraMenu.add(menuAcerca);

        setJMenuBar(mbBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar mbBarraMenu;
    private javax.swing.JMenu menuAcerca;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenu menuGestion;
    private javax.swing.JMenuItem menuItmSalir;
    private javax.swing.JMenu menuLibros;
    private javax.swing.JMenuItem mnItmAcerca;
    private javax.swing.JMenuItem mnItmAltaLibros;
    private javax.swing.JMenuItem mnItmAltasUsuario;
    private javax.swing.JMenuItem mnItmBusqueda;
    private javax.swing.JMenuItem mnItmDevolucionLibros;
    private javax.swing.JMenuItem mnItmExistencia;
    private javax.swing.JMenuItem mnItmPrestamoLibros;
    private javax.swing.JMenuItem mnItmReporteUsuarios;
    // End of variables declaration//GEN-END:variables
}
