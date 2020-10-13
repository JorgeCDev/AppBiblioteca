/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.vistas;

import appbiblioteca.persistencia.ManejaTablaH;
import java.awt.Color;
import recursos.FiltraComboBox;
import java.awt.Font;
import java.util.Arrays;

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
    private FiltraComboBox cmbPresLibUsuario, cmbPrestLibLibro;

    /**
     * Creates new form DlgPrestamos
     */
    public DlgPrestamos(java.awt.Frame parent,String title, boolean modal, ManejaTablaH tablaH) {
        super(parent,title, modal);
        this.tablaH=tablaH;
        initComponents();
        creaCombos();
    }
    
    
    public void creaCombos(){
        
        cmbPresLibUsuario= new FiltraComboBox(Arrays.asList(tablaH.getNamesCombos()));
        cmbPresLibUsuario.setBounds(10, 70, 420, 30);
        add(cmbPresLibUsuario);
        
         cmbPrestLibLibro=new FiltraComboBox(Arrays.asList(tablaH.getKeysLibrosCombos()));
         cmbPrestLibLibro.setBounds(10, 130, 420, 30);
         add(cmbPrestLibLibro);
        
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
        txtPresLibExistencia1 = new javax.swing.JTextField();
        txtPresLibMorosidad1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Prestamo de Libros");
        setLocationByPlatform(true);
        setModal(true);
        setResizable(false);

        jLabel1.setFont(fuenteT);
        jLabel1.setText("Prestamo de Libros");

        jLabel3.setFont(fuenteH);
        jLabel3.setText("Nombre Libro");

        txtPresLibExistencia.setEditable(false);
        txtPresLibExistencia.setFont(fuenteB);
        txtPresLibExistencia.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.lightGray));

        jLabel4.setFont(fuenteH);
        jLabel4.setText("Existencia");

        txtPresLibMorosidad.setEditable(false);
        txtPresLibMorosidad.setFont(fuenteH);
        txtPresLibMorosidad.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.lightGray));

        jLabel5.setFont(fuenteH);
        jLabel5.setText("Morosidad");

        btnPresLibPrestar.setBackground(COLOR_MEDIO);
        btnPresLibPrestar.setFont(fuenteB);
        btnPresLibPrestar.setText("Prestar");
        btnPresLibPrestar.setBorderPainted(false);
        btnPresLibPrestar.setFocusPainted(false);
        btnPresLibPrestar.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel6.setFont(fuenteH);
        jLabel6.setText("Usuario");

        jLabel7.setText("Prestamos");

        jLabel8.setText("Tipo");

        txtPresLibExistencia1.setEditable(false);
        txtPresLibExistencia1.setFont(fuenteB);
        txtPresLibExistencia1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.lightGray));

        txtPresLibMorosidad1.setEditable(false);
        txtPresLibMorosidad1.setFont(fuenteH);
        txtPresLibMorosidad1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.lightGray));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPresLibPrestar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPresLibMorosidad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtPresLibMorosidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPresLibExistencia1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addGap(0, 158, Short.MAX_VALUE))
                            .addComponent(txtPresLibExistencia)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
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
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPresLibExistencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPresLibMorosidad1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPresLibMorosidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPresLibExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnPresLibPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPresLibPrestar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtPresLibExistencia;
    private javax.swing.JTextField txtPresLibExistencia1;
    private javax.swing.JTextField txtPresLibMorosidad;
    private javax.swing.JTextField txtPresLibMorosidad1;
    // End of variables declaration//GEN-END:variables
}
