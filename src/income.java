import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author judie
 */
public class income extends javax.swing.JFrame {


    public income() {
        initComponents();
        Connect();
        Fetch();
        
        
        
        this.setTitle("Expense Tracker App |  COM221");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblIcon = new javax.swing.JLabel();
        datechooser = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lbl3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 26)); // NOI18N
        lbl3.setForeground(new java.awt.Color(52, 64, 116));
        lbl3.setText("spendee");

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel8.setText("| income");

        jSeparator1.setForeground(new java.awt.Color(229, 229, 229));

        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 147, 180), 2));

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("name");

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("date");

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("amount");

        txtAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 147, 180), 2));
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel7.setText("© j-archives");

        btnSave.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(51, 64, 114));
        btnSave.setText("SAVE\n");
        btnSave.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
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

        datechooser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 147, 179), 2));
        datechooser.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("*note: amount must be written using numbers only.");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("ex. 2500");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblIcon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(datechooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel7)))
                .addContainerGap(41, Short.MAX_VALUE))
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
                .addGap(45, 45, 45)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(datechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public String username, namecon, category, amountString, date;
    public int amount;
    Connection con;
    
    PreparedStatement pst;
    ResultSet rs;
    
    
    
    public void Fetch() {
        try {
            int q;
            
            pst = con.prepareStatement("SELECT * FROM transaction_history");
            rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            
            q = rss.getColumnCount();
            
            
            DefaultTableModel model = (DefaultTableModel)Tracker.tblrecords.getModel();
            model.setRowCount(0);
            
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
    
    
    //TO AVOID INTEGRITY DUPLICATE ERROR ONLY
    public boolean usernameDuplicate(String username){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/walletdb","admin","0000");

            String query = "SELECT * FROM transaction_history WHERE username = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);

                ResultSet resultSet = preparedStatement.executeQuery();

                return resultSet.next();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
        return false;
        
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        //username = txtName.getText();
        
        if (txtName.getText().equals("") || datechooser.getDate().equals("")|| txtAmount.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please fill the required field", "ERROR",JOptionPane.WARNING_MESSAGE);

        }
        
        else {
            //duplicate action 
            if (usernameDuplicate(username)) {
                try {
                    namecon = txtName.getText();
                    amountString = txtAmount.getText();
                    amount = Integer.parseInt(amountString);

                    //DATE
                    SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
                    date = dateFormat.format(datechooser.getDate());

                    category = "INCOME";

                    pst = con.prepareStatement("INSERT INTO transaction_history (username,name,date,amount,category)VALUES(?,?,?,?,?)");
                    pst.setString(1, username);
                    pst.setString(2, namecon);
                    pst.setString(3, date);
                    pst.setInt(4, amount);
                    pst.setString(5, category);

                    int k = pst.executeUpdate();

                    if (k == 1){
                        JOptionPane.showMessageDialog(this, "Successfully stored the data.");
                        
                        txtName.setText("");
                        datechooser.setCalendar(null);
                        txtAmount.setText("");
                        Fetch();
                        
                        receipt receiptFrame = new receipt();
                        receiptFrame.lblTransaction.setText("transaction #001 FOR");
                        receiptFrame.lblUsername.setText(username);
                        receiptFrame.lblDate.setText(date);
                        receiptFrame.lblName.setText(namecon);
                        receiptFrame.lblAmount.setText(amountString + ".00");
                        receiptFrame.lblTotal.setText(amountString + ".00");
                        receiptFrame.setVisible(true);
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "There was an Error. Please Try Again.");
                    }   
                } catch (SQLException ex) {
                    Logger.getLogger(income.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    namecon = txtName.getText();
                    amountString = txtAmount.getText();
                    amount = Integer.parseInt(amountString);

                    //DATE
                    SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
                    date = dateFormat.format(datechooser.getDate());

                    category = "INCOME";

                    pst = con.prepareStatement("INSERT INTO transaction_history (username,name,date,amount,category)VALUES(?,?,?,?,?)");
                    pst.setString(1, username);
                    pst.setString(2, namecon);
                    pst.setString(3, date);
                    pst.setInt(4, amount);
                    pst.setString(5, category);

                    int k = pst.executeUpdate();

                    if (k == 1){
                        JOptionPane.showMessageDialog(this, "Successfully stored the data.");
                        txtName.setText("");
                        datechooser.setCalendar(null);
                        txtAmount.setText("");
                        Fetch();
                        
                        
                        receipt receiptFrame = new receipt();
                        receiptFrame.lblTransaction.setText("transaction #001 FOR");
                        receiptFrame.lblUsername.setText(username);
                        receiptFrame.lblDate.setText(date);
                        receiptFrame.lblName.setText(namecon);
                        receiptFrame.lblAmount.setText(amountString + ".00");
                        receiptFrame.lblTotal.setText(amountString + ".00");
                        receiptFrame.setVisible(true);
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "There was an Error. Please Try Again.");
                    }   
                } catch (SQLException ex) {
                    Logger.getLogger(income.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        Tracker trackerFrame = new Tracker();
        trackerFrame.currentUser = username;
        trackerFrame.lblwelcome.setText(username);
        trackerFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

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
            java.util.logging.Logger.getLogger(income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new income().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private com.toedter.calendar.JDateChooser datechooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
