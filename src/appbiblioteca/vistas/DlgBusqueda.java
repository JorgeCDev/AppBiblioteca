/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.vistas;

import appbiblioteca.negocio.EventosDlgBusqueda;
import appbiblioteca.modelo.Libro;
import appbiblioteca.persistencia.ManejaTablaH;
import java.awt.Color;
import java.awt.Font;
import java.util.Hashtable;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge
 */
public class DlgBusqueda extends javax.swing.JDialog {
    private final Font fuenteH= new Font("Helvetica",Font.PLAIN,12);
    private final Font fuenteT= new Font("Helvetica",Font.BOLD,20);
    private final Font fuenteB= new Font("Helvetica",Font.BOLD,13);
    private final Color COLOR_MEDIO = new Color(0, 176, 255);
    private final Color COLOR_LIGHT = new Color(105, 226, 255);
    private final Color COLOR_DARK = new Color(0, 129, 203);  
    private EventosDlgBusqueda busqueda;
    
    /**
     * Creates new form DlgBusqueda
     */
    public DlgBusqueda(java.awt.Frame parent,String title, boolean modal, ManejaTablaH tablaH) {
        super(parent,title, modal);
        busqueda= new EventosDlgBusqueda(tablaH,this);
        initComponents();
        creaEscuchadores();
        generarTabla(tablaH);
    }
    
    private void creaEscuchadores(){
        btnSrcBuscar.addActionListener(busqueda);
    }
    
    private void generarTabla(ManejaTablaH tablaH){
                
        LinkedList<Libro> lista = tablaH.getAllLibros();
        DefaultTableModel modelo = (DefaultTableModel) this.tblSrcResultados.getModel();

        modelo.setRowCount(0);

        Object matrix[] = new Object[5];

        for (int i = 0; i < lista.size(); i++) {
            matrix[0] = lista.get(i).getAutor();
            matrix[1] = lista.get(i).getNombreLibro();
            matrix[2] = lista.get(i).getDescripcion();
            matrix[3] = lista.get(i).getEditorial();
            matrix[4] = lista.get(i).getExistencia();

            modelo.addRow(matrix);

        }

        this.tblSrcResultados.setModel(modelo);        
    }

    public JButton getBtnSrcBuscar() {
        return btnSrcBuscar;
    }

    public JRadioButton getrBtnSrcAutor() {
        return rBtnSrcAutor;
    }

    public JRadioButton getrBtnSrcEditorial() {
        return rBtnSrcEditorial;
    }

    public JTable getTblSrcResultados() {
        return tblSrcResultados;
    }

    public JTextField getTxtSrcBusqueda() {
        return txtSrcBusqueda;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpSrchGrupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtSrcBusqueda = new javax.swing.JTextField();
        rBtnSrcAutor = new javax.swing.JRadioButton();
        rBtnSrcEditorial = new javax.swing.JRadioButton();
        btnSrcBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSrcResultados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setResizable(false);

        jLabel1.setFont(fuenteT);
        jLabel1.setText("Busqueda");

        txtSrcBusqueda.setFont(fuenteH);
        txtSrcBusqueda.setBorder(null);

        btnGrpSrchGrupo.add(rBtnSrcAutor);
        rBtnSrcAutor.setFont(fuenteH);
        rBtnSrcAutor.setText("Autor");

        btnGrpSrchGrupo.add(rBtnSrcEditorial);
        rBtnSrcEditorial.setFont(fuenteH);
        rBtnSrcEditorial.setText("Editorial");

        btnSrcBuscar.setBackground(COLOR_MEDIO);
        btnSrcBuscar.setFont(fuenteB);
        btnSrcBuscar.setText("Buscar");
        btnSrcBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.DARK_GRAY));
        btnSrcBuscar.setBorderPainted(false);
        btnSrcBuscar.setFocusPainted(false);
        btnSrcBuscar.setPreferredSize(new java.awt.Dimension(100, 30));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.DARK_GRAY));

        tblSrcResultados.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.lightGray));
        tblSrcResultados.setFont(fuenteH);
        tblSrcResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Autor", "Nombre Libro", "Descripcion", "Editorial", "Existencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSrcResultados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblSrcResultados.setDoubleBuffered(true);
        tblSrcResultados.setFillsViewportHeight(true);
        tblSrcResultados.setGridColor(Color.lightGray);
        tblSrcResultados.setSelectionBackground(COLOR_LIGHT);
        jScrollPane1.setViewportView(tblSrcResultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSrcBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSrcBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rBtnSrcAutor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rBtnSrcEditorial)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSrcBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSrcBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBtnSrcAutor)
                    .addComponent(rBtnSrcEditorial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrpSrchGrupo;
    private javax.swing.JButton btnSrcBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rBtnSrcAutor;
    private javax.swing.JRadioButton rBtnSrcEditorial;
    private javax.swing.JTable tblSrcResultados;
    private javax.swing.JTextField txtSrcBusqueda;
    // End of variables declaration//GEN-END:variables
}
