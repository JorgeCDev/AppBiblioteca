/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.vistas;
import material.MaterialBtn;
import appbiblioteca.negocio.EventosDlgAumentarExistencia;
import appbiblioteca.persistencia.ManejaTablaH;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Jorge
 */
public class DlgAumentarExist extends javax.swing.JDialog {
    
    private final Font fuenteH= new Font("Helvetica",Font.PLAIN,12);
    private final Font fuenteT= new Font("Helvetica",Font.BOLD,20);
    private final Font fuenteB= new Font("Helvetica",Font.BOLD,13);
    private final Color COLOR_MEDIO = new Color(0, 176, 255);
    private final Color COLOR_LIGHT = new Color(105, 226, 255);
    private final Color COLOR_DARK = new Color(0, 129, 203);
    private EventosDlgAumentarExistencia existencia;
    /**
     * Creates new form DlgAumentarExist
     */
    public DlgAumentarExist(java.awt.Frame parent,String title ,boolean modal, ManejaTablaH tablaH) {
        super(parent,title, modal);
        initComponents();
        existencia= new EventosDlgAumentarExistencia(tablaH, this);
        crearEscuchadores();
        llenarCombos(tablaH);
        
        JFormattedTextField txt = ((JSpinner.NumberEditor) this.jSpinnerExistencia.getEditor()).getTextField(); 
        ((NumberFormatter) txt.getFormatter()).setAllowsInvalid(false); 
    }
    
    private void crearEscuchadores(){
        btnAumentarExistenciaAgregar.addActionListener(existencia);
        cmbAumExstClaveLibro.addActionListener(existencia);
        cmbAmtExstNombreLibro.addActionListener(existencia); 
    }
    private void llenarCombos(ManejaTablaH tabla){
        cmbAumExstClaveLibro.setModel(new DefaultComboBoxModel<>(tabla.getTablaLibro().getAllKeysLibros()));
        cmbAmtExstNombreLibro.setModel(new DefaultComboBoxModel<>(tabla.getTablaLibro().getAllNamesLibros()));
    }
    
    public void limpiar(){
        this.jSpinnerExistencia.setValue(0);
    }
    public JComboBox<String> getCmbAmtExstNombreLibro() {
        return cmbAmtExstNombreLibro;
    }
    public JComboBox<String> getCmbAumExstClaveLibro() {
        return cmbAumExstClaveLibro;
    }
    public int getExistencia(){
        return Integer.parseInt(this.jSpinnerExistencia.getValue().toString());
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
        cmbAumExstClaveLibro = new javax.swing.JComboBox<>();
        cmbAmtExstNombreLibro = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAumentarExistenciaAgregar = new MaterialBtn();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerExistencia = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aumentar Existencia");
        setLocationByPlatform(true);
        setModal(true);
        setModalityType(java.awt.Dialog.ModalityType.DOCUMENT_MODAL);
        setResizable(false);

        jLabel1.setFont(fuenteT);
        jLabel1.setText("Aumentar Existencias");

        cmbAumExstClaveLibro.setFont(fuenteH);
        cmbAumExstClaveLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cmbAumExstClaveLibro.setActionCommand("cmbClave");
        cmbAumExstClaveLibro.setBorder(null);
        cmbAumExstClaveLibro.setPreferredSize(new java.awt.Dimension(73, 30));
        cmbAumExstClaveLibro.getComponent(0).setBackground(new Color(224, 224, 224, 255));

        cmbAmtExstNombreLibro.setFont(fuenteH);
        cmbAmtExstNombreLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cmbAmtExstNombreLibro.setActionCommand("cmbLibro");
        cmbAmtExstNombreLibro.setBorder(null);
        cmbAmtExstNombreLibro.setPreferredSize(new java.awt.Dimension(73, 30));
        cmbAmtExstNombreLibro.getComponent(0).setBackground(new Color(224, 224, 224, 255));

        jLabel2.setFont(fuenteH);
        jLabel2.setText("Clave");

        jLabel3.setFont(fuenteH);
        jLabel3.setText("Libro");

        btnAumentarExistenciaAgregar.setBackground(COLOR_MEDIO);
        btnAumentarExistenciaAgregar.setFont(fuenteB);
        btnAumentarExistenciaAgregar.setText("Agregar");
        btnAumentarExistenciaAgregar.setBorder(null);
        btnAumentarExistenciaAgregar.setBorderPainted(false);
        btnAumentarExistenciaAgregar.setFocusPainted(false);
        btnAumentarExistenciaAgregar.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel4.setFont(fuenteH);
        jLabel4.setText("Existencia");

        jSpinnerExistencia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinnerExistencia.setPreferredSize(new java.awt.Dimension(39, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAumentarExistenciaAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(cmbAmtExstNombreLibro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(cmbAumExstClaveLibro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbAmtExstNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbAumExstClaveLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinnerExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnAumentarExistenciaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAumentarExistenciaAgregar;
    private javax.swing.JComboBox<String> cmbAmtExstNombreLibro;
    private javax.swing.JComboBox<String> cmbAumExstClaveLibro;
    private volatile javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner jSpinnerExistencia;
    // End of variables declaration//GEN-END:variables
}
