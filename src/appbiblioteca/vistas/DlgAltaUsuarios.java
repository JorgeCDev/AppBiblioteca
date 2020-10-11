package appbiblioteca.vistas;

import appbiblioteca.negocio.EventosDlgAltaUsuarios;
import appbiblioteca.persistencia.ManejaTablaH;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Jorge
 */
public class DlgAltaUsuarios extends javax.swing.JDialog {

    private final Font fuenteH= new Font("Helvetica",Font.BOLD,20);
    private final Font fuenteT= new Font("Helvetica",Font.PLAIN,12);
    private final Font fuenteB= new Font("Helvetica",Font.BOLD,13);
    private final Color COLOR_MEDIO = new Color(0, 176, 255);
    private final Color COLOR_LIGHT = new Color(105, 226, 255);
    private final Color COLOR_DARK = new Color(0, 129, 203);
    
    EventosDlgAltaUsuarios controladoraUsuarios;
    ManejaTablaH tablaH;
        
    
  
    public DlgAltaUsuarios(java.awt.Frame frame, String title ,boolean modal, ManejaTablaH tablaH) {
        super(frame,title, modal);
        initComponents();
        creaAcciones(tablaH);
        
    }
    
    private void creaAcciones(ManejaTablaH tablaH){
        controladoraUsuarios = new EventosDlgAltaUsuarios(this, tablaH);
        
        btnAltaUsuarioAgregar.addActionListener(controladoraUsuarios);
        btnAltaUsuarioSalir.addActionListener(controladoraUsuarios);        
    }
    
    public void limpiarTxt(){
        txtAltaUsuarioNombre.setText("");
        txtAltaUsuarioApeMat.setText("");
        txtAltaUsuarioApePat.setText("");
        txtAltaUsuarioCiudad.setText("");
        txtAltaUsuarioDomicilio.setText("");
    }
    
    
    public String getUsuarioNombre(){
        return txtAltaUsuarioNombre.getText();
    }
    public String getUsuarioApeMat(){
        return txtAltaUsuarioApeMat.getText();
    }
    public String getUsuarioApePat(){
        return txtAltaUsuarioApePat.getText();
    }
    public String getUsuarioCiudad(){
        return txtAltaUsuarioCiudad.getText();
    }
    public String getUsuarioDomicilio(){
        return txtAltaUsuarioDomicilio.getText();
    }
    public Object getUsuarioTipo(){
        return cmbTipo.getSelectedItem();
    }   
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        txtAltaUsuarioApeMat = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        txtAltaUsuarioCiudad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAltaUsuarioDomicilio = new javax.swing.JTextArea();
        btnAltaUsuarioAgregar = new javax.swing.JButton();
        btnAltaUsuarioSalir = new javax.swing.JButton();
        txtAltaUsuarioApePat = new javax.swing.JTextField();
        txtAltaUsuarioNombre = new javax.swing.JTextField();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta de Usuarios");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setModal(true);
        setResizable(false);

        jLabel1.setFont(fuenteT);
        jLabel1.setText("Nombre");

        jLabel2.setFont(fuenteT);
        jLabel2.setText("Domicilio");

        jLabel5.setFont(fuenteT);
        jLabel5.setText("Ciudad de Residencia");

        txtAltaUsuarioApeMat.setFont(fuenteT);
        txtAltaUsuarioApeMat.setBorder(null);
        txtAltaUsuarioApeMat.setMinimumSize(new java.awt.Dimension(0, 20));

        cmbTipo.setBackground(Color.WHITE);
        cmbTipo.setFont(fuenteT);
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Alumno", "Maestro", "Externo" }));
        cmbTipo.setBorder(null);
        cmbTipo.setPreferredSize(new java.awt.Dimension(0, 25));
        cmbTipo.getComponent(0).setBackground(new Color(224, 224, 224, 255));

        txtAltaUsuarioCiudad.setFont(fuenteT);
        txtAltaUsuarioCiudad.setBorder(null);
        txtAltaUsuarioCiudad.setPreferredSize(new java.awt.Dimension(0, 25));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtAltaUsuarioDomicilio.setColumns(20);
        txtAltaUsuarioDomicilio.setFont(fuenteT);
        txtAltaUsuarioDomicilio.setRows(2);
        txtAltaUsuarioDomicilio.setBorder(null);
        jScrollPane1.setViewportView(txtAltaUsuarioDomicilio);

        btnAltaUsuarioAgregar.setBackground(COLOR_MEDIO);
        btnAltaUsuarioAgregar.setFont(fuenteB);
        btnAltaUsuarioAgregar.setForeground(Color.BLACK);
        btnAltaUsuarioAgregar.setText("Agregar");
        btnAltaUsuarioAgregar.setBorder(null);
        btnAltaUsuarioAgregar.setFocusPainted(false);
        btnAltaUsuarioAgregar.setPreferredSize(new java.awt.Dimension(100, 30));

        btnAltaUsuarioSalir.setBackground(COLOR_MEDIO);
        btnAltaUsuarioSalir.setFont(fuenteB);
        btnAltaUsuarioSalir.setForeground(Color.BLACK);
        btnAltaUsuarioSalir.setText("Salir");
        btnAltaUsuarioSalir.setBorder(null);
        btnAltaUsuarioSalir.setFocusPainted(false);
        btnAltaUsuarioSalir.setPreferredSize(new java.awt.Dimension(100, 30));

        txtAltaUsuarioApePat.setFont(fuenteT);
        txtAltaUsuarioApePat.setBorder(null);
        txtAltaUsuarioApePat.setMinimumSize(new java.awt.Dimension(0, 20));

        txtAltaUsuarioNombre.setFont(fuenteT);
        txtAltaUsuarioNombre.setBorder(null);
        txtAltaUsuarioNombre.setMinimumSize(new java.awt.Dimension(0, 20));
        txtAltaUsuarioNombre.setPreferredSize(new java.awt.Dimension(0, 25));

        jLabel6.setFont(fuenteT);
        jLabel6.setText("Tipo");

        jLabel3.setFont(fuenteT);
        jLabel3.setText("Apellido Paterno");

        jLabel7.setFont(fuenteT);
        jLabel7.setText("Apellido Materno");

        jLabel8.setFont(fuenteH);
        jLabel8.setText("Alta de Usuarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAltaUsuarioCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAltaUsuarioNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtAltaUsuarioApePat, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtAltaUsuarioApeMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAltaUsuarioAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAltaUsuarioSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAltaUsuarioNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltaUsuarioApePat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltaUsuarioApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAltaUsuarioCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAltaUsuarioAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAltaUsuarioSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaUsuarioAgregar;
    private javax.swing.JButton btnAltaUsuarioSalir;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAltaUsuarioApeMat;
    private javax.swing.JTextField txtAltaUsuarioApePat;
    private javax.swing.JTextField txtAltaUsuarioCiudad;
    private javax.swing.JTextArea txtAltaUsuarioDomicilio;
    private javax.swing.JTextField txtAltaUsuarioNombre;
    // End of variables declaration//GEN-END:variables
}
