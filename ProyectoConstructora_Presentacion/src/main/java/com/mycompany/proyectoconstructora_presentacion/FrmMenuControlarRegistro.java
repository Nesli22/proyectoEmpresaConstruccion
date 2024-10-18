/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectoconstructora_presentacion;

import java.awt.Color;

/**
 *
 * @author IVAN
 */
public class FrmMenuControlarRegistro extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegistarActivoBasico
     */
    public FrmMenuControlarRegistro() {
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

        btnRegistrarActivoBasico1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnModificarActivo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrarActivoBasico2 = new javax.swing.JButton();
        btnRegistrarActivoBasico3 = new javax.swing.JButton();

        btnRegistrarActivoBasico1.setBackground(new java.awt.Color(0, 153, 204));
        btnRegistrarActivoBasico1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnRegistrarActivoBasico1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarActivoBasico1.setText("Registrar Activo Basico");
        btnRegistrarActivoBasico1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarActivoBasico1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarActivoBasico1MouseExited(evt);
            }
        });
        btnRegistrarActivoBasico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActivoBasico1ActionPerformed(evt);
            }
        });

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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 110, -1));

        btnModificarActivo.setBackground(new java.awt.Color(0, 153, 204));
        btnModificarActivo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnModificarActivo.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarActivo.setText("Registar Activo con Detalles ");
        btnModificarActivo.setEnabled(false);
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
        jPanel1.add(btnModificarActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 240, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setForeground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel1.setText("Registrar Activos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 420, -1));

        btnRegistrarActivoBasico2.setBackground(new java.awt.Color(0, 153, 204));
        btnRegistrarActivoBasico2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnRegistrarActivoBasico2.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarActivoBasico2.setText("Registrar Activo Basico");
        btnRegistrarActivoBasico2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarActivoBasico2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarActivoBasico2MouseExited(evt);
            }
        });
        btnRegistrarActivoBasico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActivoBasico2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarActivoBasico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 240, -1));

        btnRegistrarActivoBasico3.setBackground(new java.awt.Color(0, 153, 204));
        btnRegistrarActivoBasico3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnRegistrarActivoBasico3.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarActivoBasico3.setText("Registrar Activo Basico");
        btnRegistrarActivoBasico3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarActivoBasico3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarActivoBasico3MouseExited(evt);
            }
        });
        btnRegistrarActivoBasico3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActivoBasico3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarActivoBasico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
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
       FrmMenu frmMenu = new FrmMenu();

        frmMenu.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnModificarActivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarActivoMouseEntered
        btnModificarActivo.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnModificarActivoMouseEntered

    private void btnModificarActivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarActivoMouseExited
        btnModificarActivo.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnModificarActivoMouseExited

    private void btnModificarActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActivoActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnModificarActivoActionPerformed

    private void btnRegistrarActivoBasico1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarActivoBasico1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActivoBasico1MouseEntered

    private void btnRegistrarActivoBasico1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarActivoBasico1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActivoBasico1MouseExited

    private void btnRegistrarActivoBasico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActivoBasico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActivoBasico1ActionPerformed

    private void btnRegistrarActivoBasico2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarActivoBasico2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActivoBasico2MouseEntered

    private void btnRegistrarActivoBasico2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarActivoBasico2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActivoBasico2MouseExited

    private void btnRegistrarActivoBasico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActivoBasico2ActionPerformed
     FrmRegistrarActivoBasico frmM= new FrmRegistrarActivoBasico();
     frmM.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_btnRegistrarActivoBasico2ActionPerformed

    private void btnRegistrarActivoBasico3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarActivoBasico3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActivoBasico3MouseEntered

    private void btnRegistrarActivoBasico3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarActivoBasico3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActivoBasico3MouseExited

    private void btnRegistrarActivoBasico3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActivoBasico3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActivoBasico3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuControlarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuControlarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuControlarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuControlarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuControlarRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificarActivo;
    private javax.swing.JButton btnRegistrarActivoBasico1;
    private javax.swing.JButton btnRegistrarActivoBasico2;
    private javax.swing.JButton btnRegistrarActivoBasico3;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
