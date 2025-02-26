/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.vistas;

import appbiblioteca.negocio.EventosDlgPrestamoLibros;
import appbiblioteca.persistencia.ManejaTablaH;
import java.awt.Color;
import material.FiltraComboBox;
import java.awt.Font;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
/**
 *
 * @author Jorge
 */
public class DlgPrestamos extends javax.swing.JDialog {
    
    private final Font fuenteH= new Font("Helvetica",Font.PLAIN,12);
    private final Font fuenteT= new Font("Helvetica",Font.BOLD,20);
    private final Font fuenteB= new Font("Helvetica",Font.BOLD,13);
    private final Color COLOR_MEDIO = new Color(0, 176, 255);
    private final Color COLOR_LIGHT = new Color(105, 226, 255);
    private final Color COLOR_DARK = new Color(0, 129, 203);
    private ManejaTablaH tablaH;
    private EventosDlgPrestamoLibros control;

    /**
     * Creates new form DlgPrestamos
     */
    public DlgPrestamos(java.awt.Frame parent,String title, boolean modal, ManejaTablaH tablaH) {
        super(parent,title, modal);
        this.tablaH=tablaH;
        initComponents();
        creaEscuchadores();
    }
    public void creaEscuchadores(){
        
        control = new EventosDlgPrestamoLibros(tablaH, this);
        btnPresLibPrestar.addActionListener(control);
        cmbPrestLibClave.addActionListener(control);
        cmbPrestLibUsuario.addActionListener(control);   
        
    }

    public JTextField getTxtPresLibNombreUs() {
        return txtPresLibNomLibro;
    }

    public JButton getBtnPresLibPrestar() {
        return btnPresLibPrestar;
    }

    public JComboBox<String> getCmbPrestLibClave() {
        return cmbPrestLibClave;
    }

    public JComboBox<String> getCmbPrestLibUsuario() {
        return cmbPrestLibUsuario;
    }

    public JTextField getTxtPresLibExistencia() {
        return txtPresLibExistencia;
    }
    
    public JTextField getTxtPresLibMorosidad() {
        return txtPresLibMorosidad;
    }

    public JTextField getTxtPresLibPrestamos() {
        return txtPresLibPrestamos;
    }

    public JTextField getTxtPresLibTipo() {
        return txtPresLibTipo;
    }

    public JTextField getTxtPresLibNomLibro() {
        return txtPresLibNomLibro;
    }

    public JTextField getTxtPresLibNombreUs1() {
        return txtPresLibNombreUs1;
    }
    
    public void limpiarTxt(){
        
        cmbPrestLibUsuario.setSelectedIndex(-1);
        cmbPrestLibClave.setSelectedIndex(-1);
        txtPresLibExistencia.setText("");
        txtPresLibMorosidad.setText("");
        txtPresLibNomLibro.setText("");
        txtPresLibNombreUs1.setText("");
        txtPresLibPrestamos.setText("");
        txtPresLibTipo.setText("");
        
    }
    
    public void limpiarUsuario(){
        
        txtPresLibMorosidad.setText("");   
        txtPresLibNombreUs1.setText("");
        txtPresLibPrestamos.setText("");
        txtPresLibTipo.setText("");
        
    }
    
    public void limpiarLibro(){
        
        txtPresLibNomLibro.setText("");
        txtPresLibExistencia.setText("");
        
    }
    
    public boolean isEmpty(){
        
        if(cmbPrestLibUsuario.getSelectedItem().equals("")||
        cmbPrestLibClave.getSelectedItem().equals(""))
            return true;
        
        return false;
        
    }
   
    
    
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPresLibExistencia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPresLibMorosidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnPresLibPrestar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPresLibTipo = new javax.swing.JTextField();
        txtPresLibPrestamos = new javax.swing.JTextField();
        String[]names= tablaH.getTablaUsuario().getKeysCombos();
        cmbPrestLibUsuario = new FiltraComboBox(Arrays.asList(names));
        String[]llaves= tablaH.getTablaLibro().getKeysLibrosCombos();
        cmbPrestLibClave = new FiltraComboBox(Arrays.asList(llaves));
        txtPresLibNomLibro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPresLibNombreUs1 = new JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Prestamo de Libros");
        setLocationByPlatform(true);
        setModal(true);
        setResizable(false);

        jLabel1.setFont(fuenteT);
        jLabel1.setText("Prestamo de Libros");

        jLabel3.setFont(fuenteB);
        jLabel3.setText("Clave Libro");

        txtPresLibExistencia.setEditable(false);
        txtPresLibExistencia.setFont(fuenteH);
        txtPresLibExistencia.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.lightGray));

        jLabel4.setFont(fuenteB);
        jLabel4.setText("Existencia");

        txtPresLibMorosidad.setEditable(false);
        txtPresLibMorosidad.setFont(fuenteH);
        txtPresLibMorosidad.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.lightGray));

        jLabel5.setFont(fuenteB);
        jLabel5.setText("Morosidad");

        btnPresLibPrestar.setBackground(COLOR_MEDIO);
        btnPresLibPrestar.setFont(fuenteB);
        btnPresLibPrestar.setText("Prestar");
        btnPresLibPrestar.setBorderPainted(false);
        btnPresLibPrestar.setFocusPainted(false);
        btnPresLibPrestar.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel6.setFont(fuenteB);
        jLabel6.setText("Clave Usuario");

        jLabel7.setFont(fuenteB);
        jLabel7.setText("Prestamos");

        jLabel8.setFont(fuenteB);
        jLabel8.setText("Tipo");

        txtPresLibTipo.setEditable(false);
        txtPresLibTipo.setFont(fuenteH);
        txtPresLibTipo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.lightGray));

        txtPresLibPrestamos.setEditable(false);
        txtPresLibPrestamos.setFont(fuenteH);
        txtPresLibPrestamos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.lightGray));

        cmbPrestLibUsuario.setFont(fuenteH);
        cmbPrestLibUsuario.setActionCommand("cmbUsuario");
        cmbPrestLibUsuario.setBorder(null);
        cmbPrestLibUsuario.setPreferredSize(new java.awt.Dimension(28, 30));
        cmbPrestLibUsuario.getComponent(0).setBackground(new Color(224, 224, 224, 255));

        cmbPrestLibClave.setFont(fuenteH);
        cmbPrestLibClave.setActionCommand("cmbClave");
        cmbPrestLibClave.setMinimumSize(new java.awt.Dimension(56, 30));
        cmbPrestLibClave.getComponent(0).setBackground(new Color(224, 224, 224, 255));

        txtPresLibNomLibro.setEditable(false);
        txtPresLibNomLibro.setFont(fuenteH);
        txtPresLibNomLibro.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.lightGray));

        jLabel2.setFont(fuenteB);
        jLabel2.setText("Usuario");

        jLabel9.setFont(fuenteB);
        jLabel9.setText("Nombre Libro");

        txtPresLibNombreUs1.setEditable(false);
        txtPresLibNombreUs1.setFont(fuenteH);
        txtPresLibNombreUs1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.lightGray));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbPrestLibClave, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPresLibPrestar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbPrestLibUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtPresLibPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPresLibTipo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 186, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPresLibMorosidad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 158, Short.MAX_VALUE))
                            .addComponent(txtPresLibExistencia)))
                    .addComponent(txtPresLibNombreUs1)
                    .addComponent(txtPresLibNomLibro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbPrestLibUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbPrestLibClave, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPresLibNombreUs1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPresLibNomLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPresLibTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPresLibPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPresLibMorosidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPresLibExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPresLibPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPresLibPrestar;
    private javax.swing.JComboBox<String> cmbPrestLibClave;
    private javax.swing.JComboBox<String> cmbPrestLibUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtPresLibExistencia;
    private javax.swing.JTextField txtPresLibMorosidad;
    private javax.swing.JTextField txtPresLibNomLibro;
    private javax.swing.JTextField txtPresLibNombreUs1;
    private javax.swing.JTextField txtPresLibPrestamos;
    private javax.swing.JTextField txtPresLibTipo;
    // End of variables declaration//GEN-END:variables
}
