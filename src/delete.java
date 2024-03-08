import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class delete extends javax.swing.JFrame {


    public delete() {
        initComponents();
        
        Connect();
        Fetch();
        //FetchMainFrame();
        LoadNames();
        
        this.setTitle("Expense Tracker App |  COM221");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lbl3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblrecords = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cbxName = new javax.swing.JComboBox<>();
        btnsearch = new javax.swing.JButton();
        txtdate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lbl3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 32)); // NOI18N
        lbl3.setForeground(new java.awt.Color(52, 64, 116));
        lbl3.setText("spendee");

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel8.setText("| delete");

        jSeparator1.setForeground(new java.awt.Color(229, 229, 229));

        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 64, 114), 2));

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("name");

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("date");

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("amount");

        txtAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 64, 114), 2));
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel7.setText("© j-archives");

        btnDelete.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(51, 64, 114));
        btnDelete.setText("DELETE");
        btnDelete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(51, 64, 114));
        btnBack.setText("BACK\n\n");
        btnBack.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblIcon.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/folder.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("<html>*note: search your transaction on the search field<br> first.</html>");

        tblrecords.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        tblrecords.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tblrecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "name", "date", "amount", "category"
            }
        ));
        tblrecords.setSelectionBackground(new java.awt.Color(222, 68, 139));
        tblrecords.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblrecords);

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Name:");

        cbxName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxName.setBorder(null);

        btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(41, 89, 220));
        btnsearch.setText("SEARCH");
        btnsearch.setBorder(null);
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        txtdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 64, 114), 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblIcon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel7)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addGap(4, 4, 4)
                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public String currentUser;
    
    
    public void Fetch() {
        try {
            int q;
            
            pst = con.prepareStatement("SELECT * FROM transaction_history");
            rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            
            q = rss.getColumnCount();
            
            DefaultTableModel model = (DefaultTableModel)tblrecords.getModel();
            model.setRowCount(0);
            
            DefaultTableModel modelMain = (DefaultTableModel)Tracker.tblrecords.getModel();
            modelMain.setRowCount(0);
            
            while (rs.next()){
                Vector v2 = new Vector();
                
                for (int a = 1; a <= q; a++) {
                    //v2.add(rs.getString("username"));
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("date"));
                    v2.add(rs.getString("amount"));
                    v2.add(rs.getString("category"));
                }
                model.addRow(v2);
                
                Vector v3 = new Vector();
                
                for (int a = 1; a <= q; a++) {
                    //v2.add(rs.getString("username"));
                    v3.add(rs.getString("name"));
                    v3.add(rs.getString("date"));
                    v3.add(rs.getString("amount"));
                    v3.add(rs.getString("category"));
                }

                modelMain.addRow(v3);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Tracker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/walletdb","admin","0000");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(income.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(income.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void LoadNames(){
        try {
            pst = con.prepareStatement("SELECT NAME FROM transaction_history");
            rs = pst.executeQuery();
            cbxName.removeAllItems();
            
            while (rs.next()) {
                cbxName.addItem(rs.getString("NAME"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        int reply = JOptionPane.showConfirmDialog(this, "Are you sure you want to Delete this Transaction?", "Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (reply == JOptionPane.YES_OPTION) {
        
            if (txtName.getText().equals("") || txtdate.getText().equals("")|| txtAmount.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Please fill the required field", "ERROR",JOptionPane.WARNING_MESSAGE);

            }
            else {
                try {
                    String cbxname = cbxName.getSelectedItem().toString();
                    currentUser = rs.getString("USERNAME");
                    String namee = txtName.getText();
                    String datee = txtdate.getText();
                    String amountt = txtAmount.getText();
                    
                    
                    pst = con.prepareStatement("DELETE FROM transaction_history WHERE NAME=?");



                    pst.setString(1, cbxname);

                    int k = pst.executeUpdate();

                    if (k == 1) {
                        JOptionPane.showMessageDialog(this,"Record has been Successfully Deleted!");
                        txtName.setText("");
                        txtdate.setText("");
                        txtAmount.setText("");
                        txtName.requestFocus();
                        Fetch();
                        //FetchMainFrame();
                        LoadNames();
                        
                        receipt receiptFrame = new receipt();
                        receiptFrame.lblTransaction.setText("transaction #004 FOR");
                        receiptFrame.lblUsername.setText(currentUser);
                        receiptFrame.lblDate.setText(datee);
                        receiptFrame.lblName.setText(namee);
                        receiptFrame.lblAmount.setText(amountt + ".00");
                        receiptFrame.lblTotal.setText(amountt + ".00");
                        receiptFrame.setVisible(true);

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Row Unsuccessfully Deleted.");
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Tracker tracker = new Tracker();
        
        tracker.lblwelcome.setText(currentUser + "");
        
        tracker.setVisible(true);
        
        dispose();

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        try {
            String selectedNum = cbxName.getSelectedItem().toString();

            pst = con.prepareStatement("SELECT * FROM transaction_history WHERE NAME=?");
            pst.setString(1, selectedNum);
            rs = pst.executeQuery();

            //DATE

            Date date;
            //Date dateFinal;
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");

            //ASSIGN NEW VALUE
            if (rs.next()== true) {
                currentUser = rs.getString("USERNAME");
                txtName.setText(rs.getString("NAME"));
                txtdate.setText(rs.getString("DATE"));
                //datechooser.setDate(rs.getDate("DATE"));
                //date = rs.getDate("DATE");
                //String dateFinal = dateFormat.format(date);
                //String datePlaceholder = dateFormat.format(date);

                //datechooser.setDate(date);
                //datePlaceholder = rs.getDate("DATE"));
                txtAmount.setText(rs.getString("AMOUNT"));

        }

        else {
            JOptionPane.showMessageDialog(this,"No Record Found");
        }

        } catch (SQLException ex) {
            Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsearchActionPerformed

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
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox<String> cbxName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lblIcon;
    public static javax.swing.JTable tblrecords;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtdate;
    // End of variables declaration//GEN-END:variables
}
