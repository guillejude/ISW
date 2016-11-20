/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Restaurante;
import dominio.Sistema;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Guillermo
 */
public class VentanaEditarFichaRestaurante extends javax.swing.JFrame {
    private JFrame padre;
    private Sistema sistema;
    
    //Constructor
    public VentanaEditarFichaRestaurante(VentanaPrincipal ventanaPrincipal, Sistema sistema) {
        initComponents();
        this.padre = ventanaPrincipal;
        this.sistema = sistema;
        Restaurante[] restaurantes = new Restaurante[this.sistema.getRestaurantes().size()];
        for(int i = 0; i<restaurantes.length; i++){
            restaurantes[i] = this.sistema.getRestaurantes().get(i);
        }
        cmbBxRestaurantes.setModel(new DefaultComboBoxModel(restaurantes));
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

        txtFldDireccion = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtFldHorarioApertura = new javax.swing.JTextField();
        lblHorarioApertura = new javax.swing.JLabel();
        txtFldHorarioCierre = new javax.swing.JTextField();
        lblHorarioCierre = new javax.swing.JLabel();
        txtFldTipoComida = new javax.swing.JTextField();
        lblTipoComida = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnCrearFicha = new javax.swing.JButton();
        txtFldNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        cmbBxRestaurantes = new javax.swing.JComboBox<String>();
        lblElijaRestaurante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblDireccion.setText("Direccion:");

        lblHorarioApertura.setText("Horario Apertura:");

        lblHorarioCierre.setText("Horario Cierre:");

        lblTipoComida.setText("Tipo de Comida:");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTitulo.setText("EDITAR FICHA RESTAURANTE");

        btnCrearFicha.setText("MODIFICAR FICHA");
        btnCrearFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearFichaActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre:");

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

        lblElijaRestaurante.setText("Elija Restaurante a Editar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                                .addComponent(txtFldTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFldNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblTitulo)
                                        .addGap(83, 83, 83))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblElijaRestaurante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbBxRestaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(btnCrearFicha)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBxRestaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblElijaRestaurante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(26, 26, 26)
                .addComponent(btnCrearFicha)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFichaActionPerformed
        //Se verifica la informacion ingresada, se crea y se guarda ficha del nuevo restaurante
        if(verificarCampos()){
            this.sistema.editarRestaurante((Restaurante) cmbBxRestaurantes.getSelectedItem(), txtFldNombre.getText(), txtFldDireccion.getText(), txtFldHorarioApertura.getText(), txtFldHorarioCierre.getText(), txtFldTipoComida.getText());
            this.dispose();
            this.padre.setEnabled(true);
            this.padre.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Faltan campos a completar");
        }
    }//GEN-LAST:event_btnCrearFichaActionPerformed

    private void cmbBxRestaurantesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbBxRestaurantesFocusLost
        // TODO add your handling code here
    }//GEN-LAST:event_cmbBxRestaurantesFocusLost

    private void cmbBxRestaurantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBxRestaurantesActionPerformed
        // TODO add your handling code here:
        Restaurante aEditar =(Restaurante) cmbBxRestaurantes.getSelectedItem();
        if(aEditar!=null){
            txtFldNombre.setText(aEditar.getNombre());
            txtFldDireccion.setText(aEditar.getDireccion());
            txtFldHorarioApertura.setText(aEditar.getHorarioAbrir());
            txtFldHorarioCierre.setText(aEditar.getHorarioCerrar());
            txtFldTipoComida.setText(aEditar.getTipoComida());
        }
    }//GEN-LAST:event_cmbBxRestaurantesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        this.padre.setEnabled(true);
        this.padre.setVisible(true);    
    }//GEN-LAST:event_formWindowClosing

    private boolean verificarCampos(){
       boolean retorno = true;
       if(txtFldNombre.getText().isEmpty() || txtFldDireccion.getText().isEmpty() || txtFldHorarioApertura.getText().isEmpty() || txtFldHorarioCierre.getText().isEmpty() || txtFldTipoComida.getText().isEmpty()){
           
           retorno = false;
       }
       return retorno;
   }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearFicha;
    private javax.swing.JComboBox<String> cmbBxRestaurantes;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblElijaRestaurante;
    private javax.swing.JLabel lblHorarioApertura;
    private javax.swing.JLabel lblHorarioCierre;
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
