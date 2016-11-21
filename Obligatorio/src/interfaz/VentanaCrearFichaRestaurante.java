/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Sistema;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Guillermo
 */
public class VentanaCrearFichaRestaurante extends javax.swing.JFrame {

    private JFrame padre;
    private Sistema sistema;

    //Constructor 
    public VentanaCrearFichaRestaurante(VentanaPrincipal ventanaPrincipal, Sistema sistema) {
        initComponents();
        this.padre = ventanaPrincipal;
        this.sistema = sistema;
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
        txtFldNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtFldDireccion = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtFldHorarioApertura = new javax.swing.JTextField();
        lblHorarioApertura = new javax.swing.JLabel();
        txtFldHorarioCierre = new javax.swing.JTextField();
        lblHorarioCierre = new javax.swing.JLabel();
        txtFldTipoComida = new javax.swing.JTextField();
        lblTipoComida = new javax.swing.JLabel();
        btnCrearFicha = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();

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
        lblTitulo.setText("CREAR FICHA RESTAURANTE");

        txtFldNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtFldNombre.setText("Ej: McDonalds");
        txtFldNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFldNombreFocusGained(evt);
            }
        });

        lblNombre.setText("Nombre:");

        txtFldDireccion.setForeground(new java.awt.Color(153, 153, 153));
        txtFldDireccion.setText("Ej: Cuareim 1414");
        txtFldDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFldDireccionFocusGained(evt);
            }
        });
        txtFldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldDireccionActionPerformed(evt);
            }
        });

        lblDireccion.setText("Direccion:");

        txtFldHorarioApertura.setForeground(new java.awt.Color(153, 153, 153));
        txtFldHorarioApertura.setText("Ej: 10:30");
        txtFldHorarioApertura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFldHorarioAperturaFocusGained(evt);
            }
        });

        lblHorarioApertura.setText("Horario Apertura:");

        txtFldHorarioCierre.setForeground(new java.awt.Color(153, 153, 153));
        txtFldHorarioCierre.setText("Ej: 22:00");
        txtFldHorarioCierre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFldHorarioCierreFocusGained(evt);
            }
        });
        txtFldHorarioCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldHorarioCierreActionPerformed(evt);
            }
        });

        lblHorarioCierre.setText("Horario Cierre:");

        txtFldTipoComida.setForeground(new java.awt.Color(153, 153, 153));
        txtFldTipoComida.setText("Ej: Parrillada");
        txtFldTipoComida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFldTipoComidaFocusGained(evt);
            }
        });

        lblTipoComida.setText("Tipo de Comida:");

        btnCrearFicha.setText("CREAR FICHA");
        btnCrearFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearFichaActionPerformed(evt);
            }
        });

        lblInfo.setText("Ingrese informacion para ingresar restaurante al sistema");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(txtFldTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblTipoComida)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblHorarioCierre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFldHorarioCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblHorarioApertura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFldHorarioApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblInfo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btnCrearFicha)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFldHorarioApertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHorarioApertura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFldHorarioCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHorarioCierre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFldTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoComida))
                .addGap(18, 18, 18)
                .addComponent(btnCrearFicha)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFichaActionPerformed
        //Se verifica la informacion ingresada, se crea y se guarda ficha del nuevo restaurante
        if (verificarCampos()) {
            if (this.sistema.agregarRestaurante(txtFldNombre.getText(), txtFldDireccion.getText(), txtFldHorarioApertura.getText(), txtFldHorarioCierre.getText(), txtFldTipoComida.getText())) {
                JOptionPane.showMessageDialog(null, "Ficha de Restaurante Creada Existosamente");
                this.dispose();
                this.padre.setEnabled(true);
                this.padre.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Ya se encuentra creado el restaurante");
            }
        }
    }//GEN-LAST:event_btnCrearFichaActionPerformed

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

    private void txtFldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldDireccionActionPerformed

    }//GEN-LAST:event_txtFldDireccionActionPerformed

    private void txtFldHorarioCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldHorarioCierreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldHorarioCierreActionPerformed

    private void txtFldNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFldNombreFocusGained
        // TODO add your handling code here:
        if (txtFldNombre.getText().equals("Ej: McDonalds")) {
            txtFldNombre.setText("");
            txtFldNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtFldNombreFocusGained

    private void txtFldDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFldDireccionFocusGained
        if (txtFldDireccion.getText().equals("Ej: Cuareim 1414")) {
            txtFldDireccion.setText("");
            txtFldDireccion.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtFldDireccionFocusGained

    private void txtFldHorarioAperturaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFldHorarioAperturaFocusGained
        if (txtFldHorarioApertura.getText().equals("Ej: 10:30")) {
            txtFldHorarioApertura.setText("");
            txtFldHorarioApertura.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtFldHorarioAperturaFocusGained

    private void txtFldHorarioCierreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFldHorarioCierreFocusGained
        if (txtFldHorarioCierre.getText().equals("Ej: 22:00")) {
            txtFldHorarioCierre.setText("");
            txtFldHorarioCierre.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtFldHorarioCierreFocusGained

    private void txtFldTipoComidaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFldTipoComidaFocusGained
        if (txtFldTipoComida.getText().equals("Ej: Parrillada")) {
            txtFldTipoComida.setText("");
            txtFldTipoComida.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtFldTipoComidaFocusGained

    private boolean verificarCampos() {
        boolean retorno = true;
        if (txtFldNombre.getText().isEmpty() || txtFldDireccion.getText().isEmpty() || txtFldHorarioApertura.getText().isEmpty() || txtFldHorarioCierre.getText().isEmpty() || txtFldTipoComida.getText().isEmpty()) {
            retorno = false;
            JOptionPane.showMessageDialog(null, "Faltan campos a completar");
        }
        return retorno;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearFicha;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblHorarioApertura;
    private javax.swing.JLabel lblHorarioCierre;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTipoComida;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtFldDireccion;
    private javax.swing.JTextField txtFldHorarioApertura;
    private javax.swing.JTextField txtFldHorarioCierre;
    private javax.swing.JTextField txtFldNombre;
    private javax.swing.JTextField txtFldTipoComida;
    // End of variables declaration//GEN-END:variables
}
