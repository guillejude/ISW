/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Restaurante;
import dominio.Sistema;
import java.awt.Color;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author Guillermo
 */
public class VentanaRealizarEvaluacion extends javax.swing.JFrame {

    private JFrame padre;
    private Sistema sistema;
    private int puntuacion;

    //Constructor
    public VentanaRealizarEvaluacion(VentanaPrincipal ventanaPrincipal, Sistema sistema) {
        initComponents();
        this.padre = ventanaPrincipal;
        this.sistema = sistema;
        Restaurante[] restaurantes = new Restaurante[this.sistema.getRestaurantes().size()];
        for (int i = 0; i < restaurantes.length; i++) {
            restaurantes[i] = this.sistema.getRestaurantes().get(i);
        }
        cmbBxRestaurantes.setModel(new DefaultComboBoxModel(restaurantes));
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        rbtnStar1.setSelected(true);
        puntuacion = 1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbBxRestaurantes = new javax.swing.JComboBox<String>();
        rbtnStar1 = new javax.swing.JRadioButton();
        rbtnStar2 = new javax.swing.JRadioButton();
        rbtnStar3 = new javax.swing.JRadioButton();
        rbtnStar4 = new javax.swing.JRadioButton();
        rbtnStar5 = new javax.swing.JRadioButton();
        lblStarRating = new javax.swing.JLabel();
        txtFldNombre = new javax.swing.JTextField();
        txtFldEmail = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReseña = new javax.swing.JTextArea();
        lblReseña = new javax.swing.JLabel();
        lblElejirRestaurante = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        lblRealizarEvaluacion = new javax.swing.JLabel();
        lblInfoSorteo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        cmbBxRestaurantes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        rbtnStar1.setText("1");
        rbtnStar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbtnStar1MouseReleased(evt);
            }
        });

        rbtnStar2.setText("2");
        rbtnStar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbtnStar2MouseReleased(evt);
            }
        });

        rbtnStar3.setText("3");
        rbtnStar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbtnStar3MouseReleased(evt);
            }
        });
        rbtnStar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnStar3ActionPerformed(evt);
            }
        });

        rbtnStar4.setText("4");
        rbtnStar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbtnStar4MouseReleased(evt);
            }
        });
        rbtnStar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnStar4ActionPerformed(evt);
            }
        });

        rbtnStar5.setText("5");
        rbtnStar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbtnStar5MouseReleased(evt);
            }
        });
        rbtnStar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnStar5ActionPerformed(evt);
            }
        });

        lblStarRating.setText("Ingrese su Puntaje:");

        txtFldNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtFldNombre.setText("Ej: Juan");
        txtFldNombre.setToolTipText("Ej.: Juan Perez");
        txtFldNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFldNombreFocusGained(evt);
            }
        });

        txtFldEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtFldEmail.setText("Ej: juan@gmail.com");
        txtFldEmail.setToolTipText("Ej.: Juan Perez");
        txtFldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFldEmailFocusGained(evt);
            }
        });

        lblNombre.setText("Ingrese su Nombre:");

        lblEmail.setText("Ingrese su Email:");

        txtReseña.setColumns(20);
        txtReseña.setForeground(new java.awt.Color(153, 153, 153));
        txtReseña.setRows(5);
        txtReseña.setText("Ej: Me gusto mucho");
        txtReseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtReseñaFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(txtReseña);

        lblReseña.setText("Escriba aquí su reseña:");

        lblElejirRestaurante.setText("Elija el Restaurante a Evaluar:");

        btnConfirmar.setText("EVALUAR");
        btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseReleased(evt);
            }
        });

        lblRealizarEvaluacion.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblRealizarEvaluacion.setText("REALIZAR EVALUACIÓN");

        lblInfoSorteo.setText("Si desea participar de sorteos debe ingresar nombre, email y reseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblElejirRestaurante)
                    .addComponent(cmbBxRestaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre)
                    .addComponent(txtFldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReseña)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtnStar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStarRating)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnStar2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnStar3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnStar4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnStar5)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRealizarEvaluacion)
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnConfirmar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInfoSorteo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRealizarEvaluacion)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblElejirRestaurante)
                        .addGap(14, 14, 14)
                        .addComponent(cmbBxRestaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStarRating)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnStar1)
                            .addComponent(rbtnStar2)
                            .addComponent(rbtnStar3)
                            .addComponent(rbtnStar4)
                            .addComponent(rbtnStar5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblReseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(lblInfoSorteo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbBxRestaurantesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbBxRestaurantesFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbBxRestaurantesFocusLost

    private void cmbBxRestaurantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBxRestaurantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBxRestaurantesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        this.padre.setEnabled(true);
        this.padre.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void rbtnStar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnStar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnStar3ActionPerformed

    private void rbtnStar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnStar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnStar4ActionPerformed

    private void rbtnStar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnStar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnStar5ActionPerformed

    private void rbtnStar2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnStar2MouseReleased
        // TODO add your handling code here:
        rbtnStar2.setSelected(true);
        rbtnStar3.setSelected(false);
        rbtnStar4.setSelected(false);
        rbtnStar5.setSelected(false);
        puntuacion = 2;
    }//GEN-LAST:event_rbtnStar2MouseReleased

    private void rbtnStar3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnStar3MouseReleased
        // TODO add your handling code here:+
        rbtnStar2.setSelected(true);
        rbtnStar3.setSelected(true);
        rbtnStar4.setSelected(false);
        rbtnStar5.setSelected(false);
        puntuacion = 3;
    }//GEN-LAST:event_rbtnStar3MouseReleased

    private void rbtnStar4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnStar4MouseReleased
        // TODO add your handling code here:
        rbtnStar2.setSelected(true);
        rbtnStar3.setSelected(true);
        rbtnStar4.setSelected(true);
        rbtnStar5.setSelected(false);
        puntuacion = 4;
    }//GEN-LAST:event_rbtnStar4MouseReleased

    private void rbtnStar5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnStar5MouseReleased
        // TODO add your handling code here:
        rbtnStar2.setSelected(true);
        rbtnStar3.setSelected(true);
        rbtnStar4.setSelected(true);
        rbtnStar5.setSelected(true);
        puntuacion = 5;
    }//GEN-LAST:event_rbtnStar5MouseReleased

    private void btnConfirmarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseReleased
        // TODO add your handling code here:
        //realizo la evaluacion
        if (validarCampos()) {
            Restaurante aEvaluar = (Restaurante) cmbBxRestaurantes.getSelectedItem();
            aEvaluar.agregarEvaluacion(txtFldNombre.getText(), txtFldEmail.getText(), puntuacion, txtReseña.getText());
            if (txtFldNombre.getText().isEmpty() || txtFldEmail.getText().isEmpty() || txtReseña.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Evaluación Anonima agregada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Evaluación agregada con éxito");
            }
            this.dispose();
            this.padre.setEnabled(true);
            this.padre.setVisible(true);
        }


    }//GEN-LAST:event_btnConfirmarMouseReleased

    private void rbtnStar1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnStar1MouseReleased
        // TODO add your handling code here:
        rbtnStar1.setSelected(true);
        rbtnStar2.setSelected(false);
        rbtnStar3.setSelected(false);
        rbtnStar4.setSelected(false);
        rbtnStar5.setSelected(false);
        puntuacion = 1;
    }//GEN-LAST:event_rbtnStar1MouseReleased

    private void txtFldNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFldNombreFocusGained
        // TODO add your handling code here:
        if (txtFldNombre.getText().equals("Ej: Juan")) {
            txtFldNombre.setText("");
            txtFldNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtFldNombreFocusGained

    private void txtFldEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFldEmailFocusGained
        // TODO add your handling code here:
        if (txtFldEmail.getText().equals("Ej: juan@gmail.com")) {
            txtFldEmail.setText("");
            txtFldEmail.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtFldEmailFocusGained

    private void txtReseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReseñaFocusGained
        // TODO add your handling code here:
        if (txtReseña.getText().equals("Ej: Me gusto mucho")) {
            txtReseña.setText("");
            txtReseña.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtReseñaFocusGained

    public boolean validarCampos() {
        //Si la informacion que esta en los campos es la default de ejemplos, la borro
        if (txtFldNombre.getText().equals("Ej: Juan")) {
            txtFldNombre.setText("");
        }
        if (txtFldEmail.getText().equals("Ej: juan@gmail.com")) {
            txtFldEmail.setText("");
        }
        if (txtReseña.getText().equals("Ej: Me gusto mucho")) {
            txtReseña.setText("");
        }
        //Si escribio algun tipo de mail, lo verfico
        if (!txtFldEmail.getText().isEmpty()) {
            try {
                InternetAddress address = new InternetAddress(txtFldEmail.getText());
                if (!txtFldEmail.getText().isEmpty()) {
                    address.validate();
                }
                return true;
            } catch (AddressException e) {
                JOptionPane.showMessageDialog(null, "Email no valido");
                return false;
            }
        }else{
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> cmbBxRestaurantes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblElejirRestaurante;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblInfoSorteo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRealizarEvaluacion;
    private javax.swing.JLabel lblReseña;
    private javax.swing.JLabel lblStarRating;
    private javax.swing.JRadioButton rbtnStar1;
    private javax.swing.JRadioButton rbtnStar2;
    private javax.swing.JRadioButton rbtnStar3;
    private javax.swing.JRadioButton rbtnStar4;
    private javax.swing.JRadioButton rbtnStar5;
    private javax.swing.JTextField txtFldEmail;
    private javax.swing.JTextField txtFldNombre;
    private javax.swing.JTextArea txtReseña;
    // End of variables declaration//GEN-END:variables
}
