/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import javax.swing.UIManager;

/**
 *
 * @author User
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        try {
            // Set Look and Feel ke Nimbus
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
        this.setLocationRelativeTo(null);
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
        btnData1 = new javax.swing.JButton();
        btnData2 = new javax.swing.JButton();
        btnData3 = new javax.swing.JButton();
        btnData4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Halaman Utama Aplikasi");

        btnData1.setText("Data 1");
        btnData1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnData1ActionPerformed(evt);
            }
        });

        btnData2.setText("Data 2");
        btnData2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnData2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnData2ActionPerformed(evt);
            }
        });

        btnData3.setText("Nota");
        btnData3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnData3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnData3ActionPerformed(evt);
            }
        });

        btnData4.setText("Bayar");
        btnData4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnData4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnData4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnData3)
                            .addGap(18, 18, 18)
                            .addComponent(btnData4))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnData1)
                            .addGap(18, 18, 18)
                            .addComponent(btnData2))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnData2)
                    .addComponent(btnData1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnData3)
                    .addComponent(btnData4))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnData1ActionPerformed
        // TODO add your handling code here:
        new data1().setVisible(true);
    }//GEN-LAST:event_btnData1ActionPerformed

    private void btnData2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnData2ActionPerformed
        // TODO add your handling code here:
        new data2().setVisible(true);
    }//GEN-LAST:event_btnData2ActionPerformed

    private void btnData3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnData3ActionPerformed
        // TODO add your handling code here:
        new nota().setVisible(true);
    }//GEN-LAST:event_btnData3ActionPerformed

    private void btnData4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnData4ActionPerformed
        // TODO add your handling code here:
        new bayar().setVisible(true);
    }//GEN-LAST:event_btnData4ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnData1;
    private javax.swing.JButton btnData2;
    private javax.swing.JButton btnData3;
    private javax.swing.JButton btnData4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
