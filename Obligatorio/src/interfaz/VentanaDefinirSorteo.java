/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.DateLabelFormatter;
import dominio.Restaurante;
import dominio.Sistema;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jdatepicker.DateModel;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/*import java.util.Date; 
 import javax.swing.JLabel;
 import org.jdatepicker.impl.JDatePanelImpl;
 import org.jdatepicker.impl.JDatePickerImpl;
 import org.jdatepicker.impl.UtilDateModel;*/
/**
 *
 * @author Guillermo
 */
public class VentanaDefinirSorteo extends javax.swing.JFrame {

    private JFrame padre;
    private Sistema sistema;
    // datepicker  y sus metodos fueron obtenidos de http://www.codejava.net/java-se/swing/how-to-use-jdatepicker-to-display-calendar-component
    private JDatePickerImpl datePickerStart;
    private JDatePickerImpl datePickerEnd;
    private Date date;

    //Constructor
    public VentanaDefinirSorteo(VentanaPrincipal ventanaPrincipal, Sistema sistema) {
        initComponents();
        date = new Date();
        this.padre = ventanaPrincipal;
        this.sistema = sistema;
        Restaurante[] restaurantes = new Restaurante[this.sistema.getRestaurantes().size()];
        for (int i = 0; i < restaurantes.length; i++) {
            restaurantes[i] = this.sistema.getRestaurantes().get(i);
        }
        cmbBxRestaurantes.setModel(new DefaultComboBoxModel(restaurantes));

        UtilDateModel modelStart = new UtilDateModel();
        Properties pStart = new Properties();
        pStart.put("text.today", "Today");
        pStart.put("text.month", "Month");
        pStart.put("text.year", "Year");
        JDatePanelImpl datePanelStart = new JDatePanelImpl(modelStart, pStart);
        datePickerStart = new JDatePickerImpl(datePanelStart, new DateLabelFormatter());

        this.add(datePickerStart);
        datePickerStart.setSize(200, 32);
        datePickerStart.setLocation(220, 300);

        UtilDateModel modelEnd = new UtilDateModel();
        Properties pEnd = new Properties();
        pEnd.put("text.today", "Dia");
        pEnd.put("text.month", "Mes");
        pEnd.put("text.year", "Año");
        JDatePanelImpl datePanelEnd = new JDatePanelImpl(modelEnd, pEnd);
        datePickerEnd = new JDatePickerImpl(datePanelEnd, new DateLabelFormatter());

        this.add(datePickerEnd);
        datePickerEnd.setSize(200, 32);
        datePickerEnd.setLocation(220, 360);
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
        btnDefinirSorteo = new javax.swing.JButton();
        txtFldCantGanadores = new javax.swing.JTextField();
        lblCantGanadores = new javax.swing.JLabel();
        cmbBxRestaurantes = new javax.swing.JComboBox<String>();
        lblDescripcionPremio = new javax.swing.JLabel();
        lblElegirRestaurante = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescripcionPremio = new javax.swing.JTextArea();
        lblNombreSorteo = new javax.swing.JLabel();
        txtFldNombreSorteo = new javax.swing.JTextField();
        lblFechaFin = new javax.swing.JLabel();
        lblFechaInicio1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTitulo.setText("DEFINIR SORTEO");

        btnDefinirSorteo.setText("DEFINIR SORTEO");
        btnDefinirSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefinirSorteoActionPerformed(evt);
            }
        });

        txtFldCantGanadores.setForeground(new java.awt.Color(153, 153, 153));
        txtFldCantGanadores.setText("Ej: 3");
        txtFldCantGanadores.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFldCantGanadoresFocusGained(evt);
            }
        });
        txtFldCantGanadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldCantGanadoresActionPerformed(evt);
            }
        });
        txtFldCantGanadores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFldCantGanadoresKeyPressed(evt);
            }
        });

        lblCantGanadores.setText("Defina la cantidad de ganadores:");

        cmbBxRestaurantes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbBxRestaurantes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbBxRestaurantesFocusLost(evt);
            }
        });

        lblDescripcionPremio.setText("Describa el premio a sortear:");

        lblElegirRestaurante.setText("Elegir que restaurante realiza el sorteo:");

        txtAreaDescripcionPremio.setColumns(20);
        txtAreaDescripcionPremio.setForeground(new java.awt.Color(153, 153, 153));
        txtAreaDescripcionPremio.setRows(5);
        txtAreaDescripcionPremio.setText("Ej: Una cena para dos");
        txtAreaDescripcionPremio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAreaDescripcionPremioFocusGained(evt);
            }
        });
        txtAreaDescripcionPremio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAreaDescripcionPremioKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtAreaDescripcionPremio);

        lblNombreSorteo.setText("Defina el nombre del sorteo:");

        txtFldNombreSorteo.setForeground(new java.awt.Color(153, 153, 153));
        txtFldNombreSorteo.setText("Ej: Sorteo viaje Europa");
        txtFldNombreSorteo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFldNombreSorteoFocusGained(evt);
            }
        });
        txtFldNombreSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldNombreSorteoActionPerformed(evt);
            }
        });
        txtFldNombreSorteo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFldNombreSorteoKeyPressed(evt);
            }
        });

        lblFechaFin.setText("Elija la fecha de finalización:");

        lblFechaInicio1.setText("Elija la fecha de inicio:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnDefinirSorteo)
                                .addGap(129, 129, 129))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTitulo)
                                .addGap(128, 128, 128))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCantGanadores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFldCantGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDescripcionPremio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblElegirRestaurante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbBxRestaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombreSorteo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFldNombreSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblFechaFin)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(lblFechaInicio1)
                    .addContainerGap(283, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblElegirRestaurante)
                    .addComponent(cmbBxRestaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreSorteo)
                    .addComponent(txtFldNombreSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantGanadores)
                    .addComponent(txtFldCantGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcionPremio)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(lblFechaFin)
                .addGap(18, 18, 18)
                .addComponent(btnDefinirSorteo)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(307, Short.MAX_VALUE)
                    .addComponent(lblFechaInicio1)
                    .addGap(107, 107, 107)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDefinirSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefinirSorteoActionPerformed
        //Se verifica la informacion ingresada y se guarda la informacion del nuevo sorteo, si ya existe uno anteriormente, se sobreescribe
        if (verificarCampos()) {
            Restaurante restaurante = (Restaurante) cmbBxRestaurantes.getSelectedItem();
            restaurante.definirSorteo(txtFldNombreSorteo.getText(), Integer.parseInt(txtFldCantGanadores.getText()), txtAreaDescripcionPremio.getText(), (Date) datePickerStart.getModel().getValue(), (Date) datePickerEnd.getModel().getValue());
            JOptionPane.showMessageDialog(null, "Se definio exitosamente el sorteo");
            this.dispose();
            this.padre.setEnabled(true);
            this.padre.setVisible(true);
        }
    }//GEN-LAST:event_btnDefinirSorteoActionPerformed

    private void cmbBxRestaurantesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbBxRestaurantesFocusLost

    }//GEN-LAST:event_cmbBxRestaurantesFocusLost

    private boolean verificarCampos() {
        boolean retorno = false;
        if (txtFldCantGanadores.getText().isEmpty() || txtAreaDescripcionPremio.getText().isEmpty() || txtAreaDescripcionPremio.getText().equals("Ej: Una cena para dos") || txtFldCantGanadores.getText().equals("Ej: 3") || (Date) datePickerStart.getModel().getValue() == null || (Date) datePickerEnd.getModel().getValue() == null) {
            JOptionPane.showMessageDialog(null, "Faltan campos a completar");
        } else {
            try {
                int numero = Integer.parseInt(txtFldCantGanadores.getText());
                if (numero > 0) {
                    retorno = true;
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad de ganadores debe ser positivo");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "La cantidad de ganadores debe ser un numero");
            }
            if (((Date) datePickerEnd.getModel().getValue()).before((Date) datePickerStart.getModel().getValue())) {
                JOptionPane.showMessageDialog(null, "La fecha de inicio debe ser menor a la de finalización");
                retorno = false;
            }

            if (((Date) datePickerStart.getModel().getValue()).before(date)) {
                JOptionPane.showMessageDialog(null, "La fecha de inicio no puede ser previas a la creación del sorteo");
                retorno = false;
            }
            Date fecha = new Date();
            if (((Date) datePickerEnd.getModel().getValue()).before(fecha)) {
                JOptionPane.showMessageDialog(null, "La fecha de fin debe de ser en un futuro (mañana en adelante)");
                retorno = false;
            }
        }
        return retorno;
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        this.padre.setEnabled(true);
        this.padre.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void txtAreaDescripcionPremioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaDescripcionPremioKeyPressed

    }//GEN-LAST:event_txtAreaDescripcionPremioKeyPressed

    private void txtFldCantGanadoresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFldCantGanadoresKeyPressed

    }//GEN-LAST:event_txtFldCantGanadoresKeyPressed

    private void txtFldCantGanadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldCantGanadoresActionPerformed

    }//GEN-LAST:event_txtFldCantGanadoresActionPerformed

    private void txtAreaDescripcionPremioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAreaDescripcionPremioFocusGained
        // TODO add your handling code here:
        if (txtAreaDescripcionPremio.getText().equals("Ej: Una cena para dos")) {
            txtAreaDescripcionPremio.setText("");
            txtAreaDescripcionPremio.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtAreaDescripcionPremioFocusGained

    private void txtFldCantGanadoresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFldCantGanadoresFocusGained
        // TODO add your handling code here:
        if (txtFldCantGanadores.getText().equals("Ej: 3")) {
            txtFldCantGanadores.setText("");
            txtFldCantGanadores.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtFldCantGanadoresFocusGained

    private void txtFldNombreSorteoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFldNombreSorteoFocusGained
        // TODO add your handling code here:
        if (txtFldNombreSorteo.getText().equals("Ej: Sorteo viaje Europa")) {
            txtFldNombreSorteo.setText("");
            txtFldNombreSorteo.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtFldNombreSorteoFocusGained

    private void txtFldNombreSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldNombreSorteoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldNombreSorteoActionPerformed

    private void txtFldNombreSorteoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFldNombreSorteoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldNombreSorteoKeyPressed

//private JDatePickerImpl datePicker;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDefinirSorteo;
    private javax.swing.JComboBox<String> cmbBxRestaurantes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantGanadores;
    private javax.swing.JLabel lblDescripcionPremio;
    private javax.swing.JLabel lblElegirRestaurante;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaInicio1;
    private javax.swing.JLabel lblNombreSorteo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtAreaDescripcionPremio;
    private javax.swing.JTextField txtFldCantGanadores;
    private javax.swing.JTextField txtFldNombreSorteo;
    // End of variables declaration//GEN-END:variables
}
