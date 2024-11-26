/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dominio.Activo;
import dominio.Mantenimiento;
import negocio.FachadaNegocio;
import interfaces.INegocio;
import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author IVAN
 */
public class FrmAsignarMantenimiento extends javax.swing.JFrame {

    INegocio negocio;

    public FrmAsignarMantenimiento(Activo activo) {
        negocio = new FachadaNegocio();
        initComponents();
        fldId.setText(String.valueOf(activo.getId()));

        // Configura el JSpinner para la selección de hora con la hora predeterminada a las 00:00
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);  // Establece la hora en 00
        calendar.set(Calendar.MINUTE, 0);       // Establece los minutos en 00
        calendar.set(Calendar.SECOND, 0);       // Establece los segundos en 00
        calendar.set(Calendar.MILLISECOND, 0);  // Establece los milisegundos en 0

        // Configuramos el SpinnerDateModel con el valor predeterminado
        SpinnerDateModel dateModel = new SpinnerDateModel(calendar.getTime(), null, null, Calendar.HOUR_OF_DAY);
        horajsp.setModel(dateModel);

        // Usamos un editor de SpinnerDateEditor con el formato de hora "HH:mm"
        horajsp.setEditor(new JSpinner.DateEditor(horajsp, "HH:mm"));

    }

    private FrmAsignarMantenimiento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void agregarMantenimiento() {
        // Llamamos al método de validación
        if (!validarCampos()) {
            return;  // Si alguna validación falla, se detiene el proceso.
        }

        // Obtener valores de los campos
        String tipo = (String) cmbTipo.getSelectedItem();
        Date fechaSeleccionada = date.getDate();

        // Generar un ID aleatorio (long corto)
        long id = generarIdAleatorio();

        // Crear el objeto Mantenimiento
        String idText = fldId.getText();
        long idActivo = Long.parseLong(idText); // Convierte el texto a un número de tipo long

        // Busca el activo en una lista o base de datos
        Activo activo = negocio.buscarActivoId(idActivo); // Define el método `obtenerActivoPorId` que devuelve un Activo

        // Tomar la hora seleccionada del JSpinner
        Date horaSeleccionada = (Date) horajsp.getValue();

        // Usar Calendar para manipular la fecha y hora
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaSeleccionada); // Establecer la fecha seleccionada
        calendar.set(Calendar.HOUR_OF_DAY, horaSeleccionada.getHours()); // Establecer la hora
        calendar.set(Calendar.MINUTE, horaSeleccionada.getMinutes()); // Establecer los minutos

        // El objeto Mantenimiento ahora recibe un Calendar en lugar de un Date
        Mantenimiento mantenimiento = new Mantenimiento(id, calendar, tipo, activo);

        // Registrar el mantenimiento utilizando el método de negocio
        if (negocio.registrarMantenimiento(mantenimiento)) {
            JOptionPane.showMessageDialog(null, "Mantenimiento programado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            FrmMenu frmMenu = new FrmMenu();
            frmMenu.setVisible(true);

            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Error al programar el Mantenimiento.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

// Método para validar los campos
    private boolean validarCampos() {
        String tipo = (String) cmbTipo.getSelectedItem();

        Date fechaSeleccionada = date.getDate();

        // Verificar que se haya seleccionado una fecha
        if (fechaSeleccionada == null) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fecha válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaIngresada = fechaSeleccionada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        if (fechaIngresada.isBefore(fechaActual)) {
            JOptionPane.showMessageDialog(null, "La fecha no puede ser menor a la fecha actual.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validación de formato: se asegura que la fecha ingresada tenga el formato correcto
        try {
            // Comprobamos que la fecha seleccionada sea válida
            fechaSeleccionada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida. Intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;  // Si todas las validaciones pasan, retornamos true.
    }

// Método para generar un ID aleatorio tipo long
    private long generarIdAleatorio() {
        Random random = new Random();
        // Generamos un número aleatorio entre 1 y 9999 (corto pero tipo long)
        return 1L + random.nextLong(9999);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fldId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        btnGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        horajsp = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Nombre:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setBackground(new java.awt.Color(0, 153, 204));
        btnVolver.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 240, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setForeground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel1.setText("Asignar Mantenimiento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        fldId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fldId.setText("0");
        jPanel1.add(fldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Tipo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preventivo", "Correctivo", "Otro" }));
        jPanel1.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 260, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Hora de mantenimiento:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 20));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 260, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 153, 204));
        btnGuardar.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 240, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("ID:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));
        jPanel1.add(horajsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Fecha de mantenimiento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FrmMenuControlarRegistro frmRegistrarActivos = new FrmMenuControlarRegistro();

        frmRegistrarActivos.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        agregarMantenimiento();


    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAsignarMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAsignarMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAsignarMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAsignarMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAsignarMantenimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbTipo;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel fldId;
    private javax.swing.JSpinner horajsp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtNombre1;
    // End of variables declaration//GEN-END:variables
}
