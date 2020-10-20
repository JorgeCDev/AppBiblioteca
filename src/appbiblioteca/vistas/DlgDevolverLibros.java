/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca.vistas;

import recursos.FiltraComboBox;
import recursos.MaterialBtn;
import appbiblioteca.persistencia.ManejaTablaH;
import java.awt.Color;
import java.awt.Font;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import recursos.FiltraComboBox;

/**
 *
 * @author Jorge
 */
public class DlgDevolverLibros extends javax.swing.JDialog {
    
    private final Font fuenteH= new Font("Helvetica",Font.PLAIN,12);
    private final Font fuenteT= new Font("Helvetica",Font.BOLD,20);
    private final Font fuenteB= new Font("Helvetica",Font.BOLD,13);
    private final Color COLOR_MEDIO = new Color(0, 176, 255);
    private final Color COLOR_LIGHT = new Color(105, 226, 255);
    private final Color COLOR_DARK = new Color(0, 129, 203);   
    private ManejaTablaH tablaH;
    /**
     * Creates new form DlgDevolverLibros
     */
    public DlgDevolverLibros(java.awt.Frame parent, String title,boolean modal, ManejaTablaH tablaH) {
        super(parent,title, modal);
        this.tablaH=tablaH; 
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        btnDevLibBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDevLibTablaLibrosPrestados = new javax.swing.JTable();
        chkDevLibMoroso = new javax.swing.JCheckBox();
        btnDevLibDevolver = new MaterialBtn("Devolver");
        String[]names= tablaH.getKeysCombos();
        cmbUsuario = new FiltraComboBox(Arrays.asList(names));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Devolucion de Libros");
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setFont(fuenteT);
        jLabel1.setText("Devolucion de Libros");

        jLabel2.setText("Usuario");

        btnDevLibBuscar.setBackground(COLOR_LIGHT);
        btnDevLibBuscar.setFont(fuenteB);
        btnDevLibBuscar.setText("Buscar");
        btnDevLibBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.DARK_GRAY));
        btnDevLibBuscar.setFocusPainted(false);
        btnDevLibBuscar.setOpaque(false);
        btnDevLibBuscar.setPreferredSize(new java.awt.Dimension(100, 30));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.DARK_GRAY));
        jScrollPane1.setDoubleBuffered(true);

        tblDevLibTablaLibrosPrestados.setFont(fuenteH);
        tblDevLibTablaLibrosPrestados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre Usuario", "Nombre Libro", "Fecha Prestamo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDevLibTablaLibrosPrestados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblDevLibTablaLibrosPrestados.setDoubleBuffered(true);
        tblDevLibTablaLibrosPrestados.setFillsViewportHeight(true);
        tblDevLibTablaLibrosPrestados.setGridColor(Color.lightGray);
        tblDevLibTablaLibrosPrestados.setSelectionBackground(COLOR_LIGHT);
        tblDevLibTablaLibrosPrestados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(tblDevLibTablaLibrosPrestados);
        if (tblDevLibTablaLibrosPrestados.getColumnModel().getColumnCount() > 0) {
            tblDevLibTablaLibrosPrestados.getColumnModel().getColumn(0).setResizable(false);
            tblDevLibTablaLibrosPrestados.getColumnModel().getColumn(1).setResizable(false);
            tblDevLibTablaLibrosPrestados.getColumnModel().getColumn(2).setResizable(false);
        }

        chkDevLibMoroso.setText("Moroso");

        btnDevLibDevolver.setBackground(COLOR_MEDIO);
        btnDevLibDevolver.setFont(fuenteB);
        btnDevLibDevolver.setText("Devolver");
        btnDevLibDevolver.setBorder(null);
        btnDevLibDevolver.setFocusPainted(false);
        btnDevLibDevolver.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDevLibBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkDevLibMoroso)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDevLibDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDevLibBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbUsuario))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(chkDevLibMoroso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDevLibDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevLibBuscar;
    private javax.swing.JButton btnDevLibDevolver;
    private javax.swing.JCheckBox chkDevLibMoroso;
    private javax.swing.JComboBox<String> cmbUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDevLibTablaLibrosPrestados;
    // End of variables declaration//GEN-END:variables
}
