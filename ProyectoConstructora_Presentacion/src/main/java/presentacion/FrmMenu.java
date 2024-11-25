/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dominio.Activo;
import dominio.Alerta;
import interfaces.INegocio;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import negocio.FachadaNegocio;

/**
 *
 * @author IVAN
 */
public class FrmMenu extends javax.swing.JFrame {

    private INegocio negocio;
    private List<Alerta> listaAlertas;

    public FrmMenu() {
        initComponents();
        this.negocio = new FachadaNegocio();
        this.listaAlertas = negocio.recuperarAlertasSinRevisar();

        if (listaAlertas != null && !listaAlertas.isEmpty()) {
            SwingUtilities.invokeLater(this::mostrarMensajeAlertas);
        }
    }

    private void mostrarMensajeAlertas() {
        // Crear un mensaje de advertencia
        String mensaje = "Hay " + listaAlertas.size() + " activos con alertas.\n¿Deseas consultarlas?";

        // Mostrar el JOptionPane con dos opciones
        int opcion = JOptionPane.showOptionDialog(
                this,
                mensaje,
                "Alertas detectadas",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                new Object[]{"Consultar alertas", "Cerrar"},
                "Consultar alertas"
        );

        // Acciones según la opción seleccionada
        if (opcion == JOptionPane.YES_OPTION) {
            // Abrir la ventana de consulta de alertas y cerrar el menú
            FrmConsultarAlertas frmConsultarAlertas = new FrmConsultarAlertas();
            frmConsultarAlertas.setVisible(true);
            this.dispose(); // Cerrar el menú solo si se consulta alertas
        }
        // Si selecciona "Cerrar", no hacemos nada más (el JOptionPane se cierra automáticamente).

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnConsultarAlertas = new javax.swing.JButton();
        btnAsignarActivo = new javax.swing.JButton();
        btnModificarActivo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnConsultarActivo1 = new javax.swing.JButton();
        btnRegistrarActivo1 = new javax.swing.JButton();
        btnEliminarActivo1 = new javax.swing.JButton();
        btnConsultarMantenimiento = new javax.swing.JButton();
        btnMantenimientoActivo = new javax.swing.JButton();
        btnConsultarActivo2 = new javax.swing.JButton();
        btnRegistrarActivo2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsultarAlertas.setBackground(new java.awt.Color(0, 153, 204));
        btnConsultarAlertas.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnConsultarAlertas.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarAlertas.setText("Consultar Alertas");
        btnConsultarAlertas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarAlertasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarAlertasMouseExited(evt);
            }
        });
        btnConsultarAlertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarAlertasActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarAlertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 290, -1));

        btnAsignarActivo.setBackground(new java.awt.Color(0, 153, 204));
        btnAsignarActivo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnAsignarActivo.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignarActivo.setText("Asignar activo");
        btnAsignarActivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAsignarActivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAsignarActivoMouseExited(evt);
            }
        });
        btnAsignarActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActivoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsignarActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 290, -1));

        btnModificarActivo.setBackground(new java.awt.Color(0, 153, 204));
        btnModificarActivo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnModificarActivo.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarActivo.setText("Modificar Activo");
        btnModificarActivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarActivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarActivoMouseExited(evt);
            }
        });
        btnModificarActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActivoActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 290, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setForeground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel1.setText("Administrar Activos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 420, -1));

        btnConsultarActivo1.setBackground(new java.awt.Color(0, 153, 204));
        btnConsultarActivo1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnConsultarActivo1.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarActivo1.setText("Consultar estado del Activo");
        btnConsultarActivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActivo1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarActivo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 290, -1));

        btnRegistrarActivo1.setBackground(new java.awt.Color(0, 153, 204));
        btnRegistrarActivo1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnRegistrarActivo1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarActivo1.setText("Registrar Activo");
        btnRegistrarActivo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarActivo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarActivo1MouseExited(evt);
            }
        });
        btnRegistrarActivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActivo1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarActivo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 290, -1));

        btnEliminarActivo1.setBackground(new java.awt.Color(0, 153, 204));
        btnEliminarActivo1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnEliminarActivo1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarActivo1.setText("Eliminar Activo");
        btnEliminarActivo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarActivo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarActivo1MouseExited(evt);
            }
        });
        btnEliminarActivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActivo1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarActivo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 290, -1));

        btnConsultarMantenimiento.setBackground(new java.awt.Color(0, 153, 204));
        btnConsultarMantenimiento.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnConsultarMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarMantenimiento.setText("Consultar Mantenimientos");
        btnConsultarMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarMantenimientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarMantenimientoMouseExited(evt);
            }
        });
        btnConsultarMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarMantenimientoActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 290, -1));

        btnMantenimientoActivo.setBackground(new java.awt.Color(0, 153, 204));
        btnMantenimientoActivo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnMantenimientoActivo.setForeground(new java.awt.Color(255, 255, 255));
        btnMantenimientoActivo.setText("Programar Mantenimiento");
        btnMantenimientoActivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMantenimientoActivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMantenimientoActivoMouseExited(evt);
            }
        });
        btnMantenimientoActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenimientoActivoActionPerformed(evt);
            }
        });
        jPanel1.add(btnMantenimientoActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 290, -1));

        btnConsultarActivo2.setBackground(new java.awt.Color(0, 153, 204));
        btnConsultarActivo2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnConsultarActivo2.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarActivo2.setText("Ver asignaciones del activo");
        btnConsultarActivo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarActivo2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarActivo2MouseExited(evt);
            }
        });
        btnConsultarActivo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActivo2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarActivo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 290, -1));

        btnRegistrarActivo2.setBackground(new java.awt.Color(0, 153, 204));
        btnRegistrarActivo2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnRegistrarActivo2.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarActivo2.setText("Registrar Activo");
        btnRegistrarActivo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarActivo2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarActivo2MouseExited(evt);
            }
        });
        btnRegistrarActivo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActivo2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarActivo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 290, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarAlertasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarAlertasMouseEntered
        btnConsultarAlertas.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnConsultarAlertasMouseEntered

    private void btnConsultarAlertasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarAlertasMouseExited
        btnConsultarAlertas.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnConsultarAlertasMouseExited

    private void btnConsultarAlertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarAlertasActionPerformed

        FrmConsultarAlertas frmConsultarAlertas = new FrmConsultarAlertas();
        dispose();
        frmConsultarAlertas.setVisible(true);

    }//GEN-LAST:event_btnConsultarAlertasActionPerformed

    private void btnAsignarActivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignarActivoMouseEntered
        btnAsignarActivo.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnAsignarActivoMouseEntered

    private void btnAsignarActivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignarActivoMouseExited
        btnAsignarActivo.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnAsignarActivoMouseExited

    private void btnAsignarActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActivoActionPerformed
        FrmBuscarActivo frmBuscarActivo = new FrmBuscarActivo();
        dispose();
        frmBuscarActivo.setVisible(true);
    }//GEN-LAST:event_btnAsignarActivoActionPerformed

    private void btnModificarActivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarActivoMouseEntered
        btnModificarActivo.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnModificarActivoMouseEntered

    private void btnModificarActivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarActivoMouseExited
        btnModificarActivo.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnModificarActivoMouseExited

    private void btnModificarActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActivoActionPerformed
        FrmModificarActivo frmModificarActivo = new FrmModificarActivo();
        dispose();
        frmModificarActivo.setVisible(true);
    }//GEN-LAST:event_btnModificarActivoActionPerformed

    private void btnConsultarActivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActivo1ActionPerformed
        FrmConsultarEstado frmVerificarEstado = new FrmConsultarEstado();
        dispose();
        frmVerificarEstado.setVisible(true);
    }//GEN-LAST:event_btnConsultarActivo1ActionPerformed


    private void btnRegistrarActivo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarActivo1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActivo1MouseEntered

    private void btnRegistrarActivo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarActivo1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActivo1MouseExited

    private void btnRegistrarActivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActivo1ActionPerformed
        FrmMenuControlarRegistro frmRegistrarActivos = new FrmMenuControlarRegistro();
        dispose();
        frmRegistrarActivos.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActivo1ActionPerformed

    private void btnEliminarActivo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarActivo1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActivo1MouseEntered

    private void btnEliminarActivo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarActivo1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActivo1MouseExited

    private void btnEliminarActivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActivo1ActionPerformed
        FrmEliminarActivo frmEliminarActivos = new FrmEliminarActivo();
        dispose();
        frmEliminarActivos.setVisible(true);
    }//GEN-LAST:event_btnEliminarActivo1ActionPerformed

    private void btnConsultarMantenimientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMantenimientoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarMantenimientoMouseEntered

    private void btnConsultarMantenimientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMantenimientoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarMantenimientoMouseExited

    private void btnConsultarMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarMantenimientoActionPerformed
        FrmConsultarMantenimientos frmConsultarMantenimientos = new FrmConsultarMantenimientos();
        dispose();
        frmConsultarMantenimientos.setVisible(true);
    }//GEN-LAST:event_btnConsultarMantenimientoActionPerformed

    private void btnMantenimientoActivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMantenimientoActivoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMantenimientoActivoMouseEntered

    private void btnMantenimientoActivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMantenimientoActivoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMantenimientoActivoMouseExited

    private void btnMantenimientoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenimientoActivoActionPerformed
        FrmProgramarMantenimiento frmProgramarMantenimiento = new FrmProgramarMantenimiento();
        dispose();
        frmProgramarMantenimiento.setVisible(true);
    }//GEN-LAST:event_btnMantenimientoActivoActionPerformed

    private void btnConsultarActivo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarActivo2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActivo2MouseEntered

    private void btnConsultarActivo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarActivo2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActivo2MouseExited

    private void btnConsultarActivo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActivo2ActionPerformed
        FrmConsultarAsignado frmConsultarAsignado = new FrmConsultarAsignado();
        dispose();
        frmConsultarAsignado.setVisible(true);
    }//GEN-LAST:event_btnConsultarActivo2ActionPerformed

    private void btnRegistrarActivo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarActivo2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActivo2MouseEntered

    private void btnRegistrarActivo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarActivo2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActivo2MouseExited

    private void btnRegistrarActivo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActivo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActivo2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarActivo;
    private javax.swing.JButton btnConsultarActivo1;
    private javax.swing.JButton btnConsultarActivo2;
    private javax.swing.JButton btnConsultarAlertas;
    private javax.swing.JButton btnConsultarMantenimiento;
    private javax.swing.JButton btnEliminarActivo1;
    private javax.swing.JButton btnMantenimientoActivo;
    private javax.swing.JButton btnModificarActivo;
    private javax.swing.JButton btnRegistrarActivo1;
    private javax.swing.JButton btnRegistrarActivo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
