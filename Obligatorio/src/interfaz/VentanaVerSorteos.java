/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Restaurante;
import dominio.Sistema;
import dominio.Sorteo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guillermo
 */
public class VentanaVerSorteos extends javax.swing.JFrame {

    private JFrame padre;
    private Sistema sistema;

    //Constructor 
    public VentanaVerSorteos(VentanaPrincipal ventanaPrincipal, Sistema sistema) {
        initComponents();
        this.padre = ventanaPrincipal;
        this.sistema = sistema;
        Restaurante[] restaurantes = new Restaurante[this.sistema.getRestaurantes().size()];
        for (int i = 0; i < restaurantes.length; i++) {
            restaurantes[i] = this.sistema.getRestaurantes().get(i);
        }
        cmbBxRestaurantes.setModel(new DefaultComboBoxModel(restaurantes));
        Restaurante restaurante = this.sistema.getRestaurantes().get(0);
        updateTabla(restaurante);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSorteos = new javax.swing.JTable();
        cmbBxRestaurantes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTitulo.setText("VER SORTEOS");

        tblSorteos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Inicio", "Fin", "Premios", "Realizado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSorteos);

        cmbBxRestaurantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbBxRestaurantes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbBxRestaurantesFocusLost(evt);
            }
        });
        cmbBxRestaurantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBxRestaurantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbBxRestaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBxRestaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        /*this.padre.setEnabled(true);
         this.padre.setVisible(true);*/
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        this.padre.setEnabled(true);
        this.padre.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void cmbBxRestaurantesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbBxRestaurantesFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBxRestaurantesFocusLost

    private void cmbBxRestaurantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBxRestaurantesActionPerformed
        // TODO add your handling code here:
        Restaurante restaurante = (Restaurante) cmbBxRestaurantes.getSelectedItem();
        updateTabla(restaurante);
    }//GEN-LAST:event_cmbBxRestaurantesActionPerformed

    private void updateTabla(Restaurante restaurante) {
        DefaultTableModel table = (DefaultTableModel) tblSorteos.getModel();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        table.setRowCount(restaurante.getSorteos().size());
        for (int j = 0; j < restaurante.getSorteos().size(); j++) {
            Sorteo elSorteo = (Sorteo) restaurante.getSorteos().get(j);
            tblSorteos.setValueAt(elSorteo.getNombre(), j, 0);
            tblSorteos.setValueAt(df.format(elSorteo.getFechaInicio()), j, 1);
            tblSorteos.setValueAt(df.format(elSorteo.getFechaFin()), j, 2);
            tblSorteos.setValueAt(elSorteo.getCantidadGanadores(), j, 3);
            String realizado = "NO";
            if (elSorteo.isRealizado()) {
                realizado = "SI";
            }
            tblSorteos.setValueAt(realizado, j, 4);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbBxRestaurantes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblSorteos;
    // End of variables declaration//GEN-END:variables
}
