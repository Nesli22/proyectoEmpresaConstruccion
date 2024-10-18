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
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        btnRegistrarActivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnConsultarActivo = new javax.swing.JButton();
        btnModificarActivo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarActivo.setBackground(new java.awt.Color(0, 153, 204));
        btnRegistrarActivo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnRegistrarActivo.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarActivo.setText("Registrar Activo");
        btnRegistrarActivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarActivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarActivoMouseExited(evt);
            }
        });
        btnRegistrarActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActivoActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 240, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel1.setText("Administrar Activos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        btnConsultarActivo.setBackground(new java.awt.Color(0, 153, 204));
        btnConsultarActivo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnConsultarActivo.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarActivo.setText("Consultar estado del Activo");
        btnConsultarActivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarActivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarActivoMouseExited(evt);
            }
        });
        btnConsultarActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActivoActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 240, -1));

        btnModificarActivo.setBackground(new java.awt.Color(0, 153, 204));
        btnModificarActivo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnModificarActivo.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarActivo.setText("Modificar Activo");
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
        jPanel1.add(btnModificarActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 240, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setForeground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 420, -1));

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

    private void btnRegistrarActivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarActivoMouseEntered
        btnRegistrarActivo.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnRegistrarActivoMouseEntered

    private void btnRegistrarActivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarActivoMouseExited
        btnRegistrarActivo.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnRegistrarActivoMouseExited

    private void btnRegistrarActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActivoActionPerformed

        FrmMenuControlarRegistro frmRegistrarActivos = new FrmMenuControlarRegistro();
        dispose();
        frmRegistrarActivos.setVisible(true);

    }//GEN-LAST:event_btnRegistrarActivoActionPerformed

    private void btnConsultarActivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarActivoMouseEntered
        btnConsultarActivo.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnConsultarActivoMouseEntered

    private void btnConsultarActivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarActivoMouseExited
        btnConsultarActivo.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnConsultarActivoMouseExited

    private void btnConsultarActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActivoActionPerformed
        FrmVerificarEstado frmVerificarEstado = new FrmVerificarEstado();
        dispose();
        frmVerificarEstado.setVisible(true);
    }//GEN-LAST:event_btnConsultarActivoActionPerformed

    private void btnModificarActivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarActivoMouseEntered
        btnModificarActivo.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnModificarActivoMouseEntered

    private void btnModificarActivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarActivoMouseExited
        btnModificarActivo.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnModificarActivoMouseExited

    private void btnModificarActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActivoActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnModificarActivoActionPerformed

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
    private javax.swing.JButton btnConsultarActivo;
    private javax.swing.JButton btnModificarActivo;
    private javax.swing.JButton btnRegistrarActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}