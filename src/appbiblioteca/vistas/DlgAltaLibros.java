/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.vistas;

import recursos.MaterialBtn;
import recursos.MaterialTxtField;
import appbiblioteca.negocio.EventosDlgAltaLibros;
import appbiblioteca.persistencia.ManejaTablaH;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Jorge
 */
public class DlgAltaLibros extends javax.swing.JDialog {

    
    private final Font fuenteL= new Font("Helvetica",Font.PLAIN,12);
    private final Font fuenteT= new Font("Helvetica",Font.BOLD,20);
    private final Font fuenteB= new Font("Helvetica",Font.BOLD,13);
    private final Color COLOR_MEDIO = new Color(0, 176, 255);
    private final Color COLOR_LIGHT = new Color(105, 226, 255);
    private final Color COLOR_DARK = new Color(0, 129, 203);
    private ManejaTablaH tablaH;
    EventosDlgAltaLibros controladoraLibros;
    
    /**
     * Creates new form DlgAltaLibros
     */
    public DlgAltaLibros(java.awt.Frame frame,String title, boolean modal, ManejaTablaH tablaH) {
        super(frame,title, modal);
        this.tablaH=tablaH;
        initComponents();
        creaAcciones(tablaH);
        txtAltaLibClave.setText(""+(tablaH.sizeLibro()+1));
                
        // Impide que se ingresen letras al JSpinner 
        JFormattedTextField txt = ((JSpinner.NumberEditor) spnAltaLibrosExistencia.getEditor()).getTextField(); 
        ((NumberFormatter) txt.getFormatter()).setAllowsInvalid(false); 
    }
    
    private void creaAcciones(ManejaTablaH tablaH){
        controladoraLibros = new EventosDlgAltaLibros(this, tablaH);
        
        this.btnAltaLibAgregar.addActionListener(controladoraLibros);
        this.btnAltaLibSalir.addActionListener(controladoraLibros);        
    }
    
    public String getNombre(){
        return this.txtAltaLibNombre.getText();
    }
    public String getDescripcion(){
        return this.txtAltaLibDescripcion.getText();
    }
    public String getAutor(){
        return this.txtAltaLibAutor.getText();
    }
    public String getEditorial(){
        return this.txtAltaLibEditorial.getText();
    }
    public int getExistencia(){
        return Integer.parseInt(spnAltaLibrosExistencia.getValue().toString());
    }
    
    public void limpiarTxt(){
        txtAltaLibAutor.setText("");
        txtAltaLibClave.setText(""+(tablaH.sizeLibro()+1));
        txtAltaLibDescripcion.setText("");
        txtAltaLibEditorial.setText("");
        spnAltaLibrosExistencia.setValue(0);
        txtAltaLibNombre.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtAltaLibClave = new MaterialTxtField("Clave");
        txtAltaLibNombre = new MaterialTxtField("Nombre");
        txtAltaLibAutor = new MaterialTxtField("Autor");
        txtAltaLibEditorial = new MaterialTxtField("Editorial");
        btnAltaLibAgregar = new MaterialBtn("Agregar");
        btnAltaLibSalir = new MaterialBtn("Salir");
        spnAltaLibrosExistencia = new javax.swing.JSpinner();
        txtAltaLibDescripcion = new MaterialTxtField("Descripcion");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta de Libros");
        setLocationByPlatform(true);
        setModal(true);
        setName("Altas Libros"); // NOI18N
        setResizable(false);

        jLabel3.setFont(fuenteT);
        jLabel3.setText("Alta de Libros");

        txtAltaLibClave.setEditable(false);
        txtAltaLibClave.setFont(fuenteL);
        txtAltaLibClave.setBorder(null);
        txtAltaLibClave.setPreferredSize(new java.awt.Dimension(30, 40));

        txtAltaLibNombre.setBorder(null);
        txtAltaLibNombre.setPreferredSize(new java.awt.Dimension(100, 40));

        txtAltaLibAutor.setBorder(null);
        txtAltaLibAutor.setPreferredSize(new java.awt.Dimension(100, 40));

        txtAltaLibEditorial.setBorder(null);
        txtAltaLibEditorial.setPreferredSize(new java.awt.Dimension(100, 40));

        btnAltaLibAgregar.setBackground(COLOR_MEDIO);
        btnAltaLibAgregar.setFont(fuenteB);
        btnAltaLibAgregar.setText("Agregar");
        btnAltaLibAgregar.setBorder(null);
        btnAltaLibAgregar.setPreferredSize(new java.awt.Dimension(100, 30));

        btnAltaLibSalir.setBackground(COLOR_MEDIO);
        btnAltaLibSalir.setFont(fuenteB);
        btnAltaLibSalir.setText("Salir");
        btnAltaLibSalir.setBorder(null);
        btnAltaLibSalir.setPreferredSize(new java.awt.Dimension(100, 30));

        spnAltaLibrosExistencia.setFont(fuenteL);
        spnAltaLibrosExistencia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        spnAltaLibrosExistencia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        spnAltaLibrosExistencia.setPreferredSize(new java.awt.Dimension(29, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 4, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtAltaLibClave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAltaLibNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtAltaLibAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAltaLibEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(spnAltaLibrosExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(200, 200, 200)
                                        .addComponent(btnAltaLibAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAltaLibSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtAltaLibDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAltaLibClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltaLibNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtAltaLibDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAltaLibAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltaLibEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnAltaLibrosExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAltaLibSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAltaLibAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaLibAgregar;
    private javax.swing.JButton btnAltaLibSalir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner spnAltaLibrosExistencia;
    private javax.swing.JTextField txtAltaLibAutor;
    private javax.swing.JTextField txtAltaLibClave;
    private javax.swing.JTextField txtAltaLibDescripcion;
    private javax.swing.JTextField txtAltaLibEditorial;
    private javax.swing.JTextField txtAltaLibNombre;
    // End of variables declaration//GEN-END:variables
}
