/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment;

/**
 *
 * @author vallerie
 */
public class VendorOrderHistory extends javax.swing.JFrame {

    /**
     * Creates new form VendorOrderHistory
     */
    public VendorOrderHistory() {
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

        jLabel1 = new javax.swing.JLabel();
        btn_Back = new javax.swing.JButton();
        btn_VDaily = new javax.swing.JButton();
        btn_VMonthly = new javax.swing.JButton();
        btn_VQuarterly = new javax.swing.JButton();
        btn_VYearly = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("View Order History");

        btn_Back.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_Back.setText("Back");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });

        btn_VDaily.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_VDaily.setText("Daily History");
        btn_VDaily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VDailyActionPerformed(evt);
            }
        });

        btn_VMonthly.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_VMonthly.setText("Monthly History");
        btn_VMonthly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VMonthlyActionPerformed(evt);
            }
        });

        btn_VQuarterly.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_VQuarterly.setText("Quarterly History");
        btn_VQuarterly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VQuarterlyActionPerformed(evt);
            }
        });

        btn_VYearly.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_VYearly.setText("Yearly History");
        btn_VYearly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VYearlyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_VQuarterly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_VMonthly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_VDaily, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_VYearly, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btn_Back)))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(btn_VDaily)
                .addGap(18, 18, 18)
                .addComponent(btn_VMonthly)
                .addGap(18, 18, 18)
                .addComponent(btn_VQuarterly)
                .addGap(18, 18, 18)
                .addComponent(btn_VYearly)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btn_Back)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        VendorMain af= new VendorMain();
        af.setVisible(true);
    }//GEN-LAST:event_btn_BackActionPerformed

    private void btn_VDailyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VDailyActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        V_DailyOrderHistory af= new V_DailyOrderHistory();
        af.setVisible(true);
    }//GEN-LAST:event_btn_VDailyActionPerformed

    private void btn_VMonthlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VMonthlyActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        V_MonthlyOrderHistory af= new V_MonthlyOrderHistory();
        af.setVisible(true);
    }//GEN-LAST:event_btn_VMonthlyActionPerformed

    private void btn_VQuarterlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VQuarterlyActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        V_QuarterlyOrderHistory af= new V_QuarterlyOrderHistory();
        af.setVisible(true);
    }//GEN-LAST:event_btn_VQuarterlyActionPerformed

    private void btn_VYearlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VYearlyActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        V_YearlyOrderHistory af= new V_YearlyOrderHistory();
        af.setVisible(true);
    }//GEN-LAST:event_btn_VYearlyActionPerformed

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
            java.util.logging.Logger.getLogger(VendorOrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendorOrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendorOrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendorOrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendorOrderHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_VDaily;
    private javax.swing.JButton btn_VMonthly;
    private javax.swing.JButton btn_VQuarterly;
    private javax.swing.JButton btn_VYearly;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}