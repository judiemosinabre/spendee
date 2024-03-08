
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author judie
 */
public class Tracker extends javax.swing.JFrame {


    public Tracker() {
        initComponents();
        Connect();
        Fetch();
        //userDataDisplayOnly();
        totalIncomeGetterToDB();
        totalExpenseGetterToDB();
        balanceTotal();
  
        //amountGetterToDB();
        
        this.setTitle("Expense Tracker App |  COM221");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        
     
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelWhite = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnIncome = new javax.swing.JButton();
        btnExpense = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblrecords = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblBalance = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        lblwelcome = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lbltotalinc = new javax.swing.JLabel();
        lbltotalexp = new javax.swing.JLabel();
        lblHi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelWhite.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(229, 229, 229));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel7.setText("© j-archives");

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel8.setText("| Transactions");

        btnIncome.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnIncome.setForeground(new java.awt.Color(51, 64, 114));
        btnIncome.setText("INCOME");
        btnIncome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnIncome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncomeActionPerformed(evt);
            }
        });

        btnExpense.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnExpense.setForeground(new java.awt.Color(51, 64, 114));
        btnExpense.setText("EXPENSE");
        btnExpense.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnExpense.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpenseActionPerformed(evt);
            }
        });

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

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("new transaction |");

        lbl3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 32)); // NOI18N
        lbl3.setForeground(new java.awt.Color(52, 64, 116));
        lbl3.setText("spendee");

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/moving_card (1).gif"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("transaction history |");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblBalance.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 28)); // NOI18N
        lblBalance.setForeground(new java.awt.Color(216, 147, 179));
        lblBalance.setText("BALANCE:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        lbl1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        lbl1.setForeground(new java.awt.Color(51, 51, 51));
        lbl1.setText("income:");

        lbl2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        lbl2.setForeground(new java.awt.Color(51, 51, 51));
        lbl2.setText("expenses:");

        lblIcon.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/folder.jpg"))); // NOI18N

        lblwelcome.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        lblwelcome.setForeground(new java.awt.Color(52, 64, 116));
        lblwelcome.setText("username! ");

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bin.jpg"))); // NOI18N
        btnDelete.setText("\n");
        btnDelete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(51, 64, 114));
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lbltotalinc.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        lbltotalinc.setForeground(new java.awt.Color(51, 51, 51));
        lbltotalinc.setText("000");

        lbltotalexp.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        lbltotalexp.setForeground(new java.awt.Color(51, 51, 51));
        lbltotalexp.setText("000");

        lblHi.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        lblHi.setForeground(new java.awt.Color(52, 64, 116));
        lblHi.setText("Hi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblIcon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))
                        .addGap(33, 44, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblHi)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblwelcome))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbltotalinc)
                                        .addGap(88, 88, 88)
                                        .addComponent(lbl2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbltotalexp))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnDelete)
                        .addGap(3, 3, 3)))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(443, 443, 443))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblwelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl1)
                            .addComponent(lbl2)
                            .addComponent(lbltotalinc)
                            .addComponent(lbltotalexp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout panelWhiteLayout = new javax.swing.GroupLayout(panelWhite);
        panelWhite.setLayout(panelWhiteLayout);
        panelWhiteLayout.setHorizontalGroup(
            panelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWhiteLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelWhiteLayout.setVerticalGroup(
            panelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelWhite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelWhite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    public String lbluserwelcome, currentUser;  
    int balance, totalSumOfExpense, totalSumOfIncome;
    
    
    //public DefaultTableModel model = (DefaultTableModel)tblrecords.getModel();
    
    
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
    
    
    public void Fetch() {
        try {
            int q;
            
            pst = con.prepareStatement("SELECT * FROM transaction_history");
            rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            
            q = rss.getColumnCount();
            
            DefaultTableModel model = (DefaultTableModel)tblrecords.getModel();
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
    
    
    
    /*public void userDataDisplayOnly(){

        //currentUser;
        System.out.println(currentUser);
        
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/walletdb","admin","0000")) {
            
            DefaultTableModel model = (DefaultTableModel)tblrecords.getModel();
            model.setRowCount(0);
            
            // Prepare SQL statement
            String sql = "SELECT * FROM transaction_history WHERE NAME = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                // Set parameter for the NAME column
                preparedStatement.setString(1, currentUser);

                // Execute the query
                ResultSet resultSet = preparedStatement.executeQuery();

                // Iterate through the result set
                while (resultSet.next()) {
                    // Retrieve values from the result set
                    
                    String name = resultSet.getString("name");
                    String date = resultSet.getString("date");
                    String amount = resultSet.getString("amount");
                    String category = resultSet.getString("category");
                    // Retrieve more columns as needed

                    // Add a new row to the model
                    model.addRow(new Object[]{name, date, amount, category});
                    // Add more columns as needed
                }
         

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/
    
    public void forFetching(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel)tblrecords.getModel();
        model.addRow(dataRow);
    }
    
    public void totalIncomeGetterToDB() {
        
        String selectQuery = "SELECT AMOUNT FROM transaction_history WHERE category = 'INCOME'";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/walletdb","admin","0000");
             PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            
            //int totalSumOfIncome = 0;

            while (resultSet.next()) {
                // Retrieve the integer value from the "AMOUNT" column
                int amount = resultSet.getInt("AMOUNT");
                
                totalSumOfIncome += amount;
                
                
            }

            System.out.println("Total Income Amount: " + totalSumOfIncome);
            
            lbltotalinc.setText(Integer.toString(totalSumOfIncome));
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void totalExpenseGetterToDB() {
        String selectQuery = "SELECT AMOUNT FROM transaction_history WHERE category = 'EXPENSE'";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/walletdb","admin","0000");
             PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            //int totalSumOfExpense = 0;

            while (resultSet.next()) {
                // Retrieve the integer value from the "AMOUNT" column
                int amount = resultSet.getInt("AMOUNT");
                totalSumOfExpense += amount;
            }

            System.out.println("Total Expense Amount: " + totalSumOfExpense);
            
            lbltotalexp.setText(Integer.toString(totalSumOfExpense));
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    private void balanceTotal(){
        String exp = lbltotalexp.getText();
        String inc = lbltotalinc.getText();
        
        int exp_balance = Integer.valueOf(exp);
        int inc_balance = Integer.valueOf(inc);
        
        balance = inc_balance - exp_balance;
        
        //balance = totalSumOfIncome - totalSumOfIncome;
        
        lblBalance.setText("BALANCE: " + balance);
        
        System.out.println(balance);
        
    }
   
    private void btnIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncomeActionPerformed
        income inc = new income();
        inc.username = currentUser;
        inc.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnIncomeActionPerformed

    private void btnExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpenseActionPerformed
        expenses exp = new expenses();
        exp.username = currentUser;
        exp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnExpenseActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        update upd = new update();
        upd.currentUser = currentUser;
        upd.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        delete del = new delete();
        JOptionPane.showMessageDialog(this, "Make sure to double check your transaction.\n Deleted data"
                + " can not be recovered.", "ERROR",JOptionPane.WARNING_MESSAGE);
        
        
        del.currentUser = currentUser;
        del.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tracker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExpense;
    private javax.swing.JButton btnIncome;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lblBalance;
    public javax.swing.JLabel lblHi;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lbltotalexp;
    private javax.swing.JLabel lbltotalinc;
    public javax.swing.JLabel lblwelcome;
    private javax.swing.JPanel panelWhite;
    public static javax.swing.JTable tblrecords;
    // End of variables declaration//GEN-END:variables
}
