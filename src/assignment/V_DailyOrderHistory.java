/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author vallerie
 */
public class V_DailyOrderHistory extends javax.swing.JFrame {

    private TableRowSorter<TableModel> sorter;
    /**
     * Creates new form V_DailyOrderHistory
     */
    public V_DailyOrderHistory() {
        initComponents();
        
        String filePath = Config.getFilePath("OrderListPath"); 
        File file = new File(filePath);

        try { 
            BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel vendorTable = (DefaultTableModel) VTable_OrderHistory.getModel();
            String line;

            while ((line = br.readLine()) != null) {
                String[] dataRow = line.split(",");
                if (dataRow.length == 7) { 
                    vendorTable.addRow(dataRow);
                }
            }
            br.close();
            
            sorter = new TableRowSorter<>(vendorTable);
            VTable_OrderHistory.setRowSorter(sorter);
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "File not found: " + filePath);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error reading file: " + ex.getMessage());
        }
        
        DateChooser.addPropertyChangeListener(new PropertyChangeListener() {
        public void propertyChange(PropertyChangeEvent evt) {
            if ("date".equals(evt.getPropertyName())) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); // Use the correct format here
                String formattedDate = sdf.format(DateChooser.getDate());
                filterTable(formattedDate);
            }
        }
    });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DateChooser = new com.toedter.calendar.JDateChooser();
        lbl_VDailyOH = new javax.swing.JLabel();
        lbl_Day = new javax.swing.JLabel();
        btn_Back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        VTable_OrderHistory = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DateChooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DateChooserMouseReleased(evt);
            }
        });

        lbl_VDailyOH.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        lbl_VDailyOH.setText("Vendor Daily Order History");

        lbl_Day.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_Day.setText("Choose a Day : ");

        btn_Back.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_Back.setText("Back");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });

        VTable_OrderHistory.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        VTable_OrderHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "CustomerID", "Date", "VendorID", "FoodID", "Quantity", "Total", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(VTable_OrderHistory);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_Back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_VDailyOH)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Day)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(219, 219, 219))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_VDailyOH)
                    .addComponent(btn_Back))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Day))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        VendorMain af= new VendorMain();
        af.setVisible(true);
    }//GEN-LAST:event_btn_BackActionPerformed

    private void DateChooserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DateChooserMouseReleased
        // TODO add your handling code here:
        /*SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
        String formattedDate = sdf.format(DateChooser.getDate());
        filterTable(formattedDate);*/
    }//GEN-LAST:event_DateChooserMouseReleased

    private void filterTable(String searchText) {
        RowFilter<TableModel, Object> rowFilter = RowFilter.regexFilter(searchText, 2); // Assuming date is in column 2
        sorter.setRowFilter(rowFilter);

        // Save the filtered data back to the text file
        String filePath = Config.getFilePath("OrderListPath");
        File file = new File(filePath);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            DefaultTableModel vendorTable = (DefaultTableModel) VTable_OrderHistory.getModel();
            String line;

            // Clear the existing data in the table model
            vendorTable.setRowCount(0);
            
            while ((line = br.readLine()) != null) {
                String[] dataRow = line.split(",");
                if (dataRow.length == 7) {
                    vendorTable.addRow(dataRow);
                }
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "File not found: " + filePath);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error reading file: " + ex.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(V_DailyOrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_DailyOrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_DailyOrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_DailyOrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_DailyOrderHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JTable VTable_OrderHistory;
    private javax.swing.JButton btn_Back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Day;
    private javax.swing.JLabel lbl_VDailyOH;
    // End of variables declaration//GEN-END:variables
}
