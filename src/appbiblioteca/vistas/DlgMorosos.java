package appbiblioteca.vistas;                    

import recursos.MaterialBtn;
import appbiblioteca.negocio.EventosDlgMorosos;
import appbiblioteca.persistencia.ManejaLista;
import appbiblioteca.persistencia.ManejaTablaH;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class DlgMorosos extends javax.swing.JDialog {

    
    /**
     * Creates new form DlgAltaMorosos
     */
    public DlgMorosos(java.awt.Frame frame,String title, boolean modal, ManejaTablaH tablaH, ManejaLista lista) {
        super(frame,title, modal);
        initComponents();
        
        crearEscuchadores(tablaH, lista);
        
        lista.agregaMoroso();
        generarTabla(lista);
        llenarCombo(lista);
    }
    
    private void crearEscuchadores(ManejaTablaH tablaH, ManejaLista lista){
        EventosDlgMorosos morosos = new EventosDlgMorosos(this, tablaH, lista);
        
        this.btnEliminar.addActionListener(morosos);
    }
    
    public void llenarCombo(ManejaLista lista){
        
        String[] morosos = new String[lista.morosos.size()];
        
        for (int i = 0; i < lista.morosos.size(); i++) {
            morosos[i] = lista.morosos.get(i).getNombreCompleto();
        }
        
        this.cmbUsuario.setModel(new DefaultComboBoxModel<>(morosos));
    }
    
    
    public JComboBox<String> getCmbUsuario() {
        return this.cmbUsuario;
    }
    
    public void generarTabla(ManejaLista lista){
        DefaultTableModel modelo = (DefaultTableModel) this.jTbMorosos.getModel();

        modelo.setRowCount(0);

        Object matrix[] = new Object[4];

        for (int i = 0; i < lista.morosos.size(); i++) {
            matrix[0] = lista.morosos.get(i).getNombreUsuario();
            matrix[1] = lista.morosos.get(i).getApePatUsuario();
            matrix[2] = lista.morosos.get(i).getApeMatUsuario();
            matrix[3] = lista.morosos.get(i).getCiudadResidencia();

            modelo.addRow(matrix);
        }

        this.jTbMorosos.setModel(modelo);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        cmbUsuario = new JComboBox<String>();
        btnEliminar = new MaterialBtn("Eliminar");
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbMorosos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);

        lblUsuario.setText("Usuario");

        cmbUsuario.setBorder(null);

        jTbMorosos.setBorder(new javax.swing.border.MatteBorder(null));
        jTbMorosos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido Paterno", "Apellido Materno", "Ciudad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbMorosos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTbMorosos.setDoubleBuffered(true);
        jScrollPane1.setViewportView(jTbMorosos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cmbUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTbMorosos;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
