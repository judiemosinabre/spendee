import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author judie
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        
        this.setTitle("Expense Tracker App |  COM221");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lbl5 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnLogIn = new javax.swing.JButton();
        lbl6 = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 28)); // NOI18N
        lbl3.setForeground(new java.awt.Color(219, 147, 180));
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setText("LOG IN");

        lbl4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        lbl4.setForeground(new java.awt.Color(219, 147, 180));
        lbl4.setText("Username");

        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 147, 180), 2));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lbl5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        lbl5.setForeground(new java.awt.Color(219, 147, 180));
        lbl5.setText("Password");

        txtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 147, 180), 2));

        btnLogIn.setBackground(new java.awt.Color(219, 147, 180));
        btnLogIn.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setText("Log In");
        btnLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogIn.setInheritsPopupMenu(true);
        btnLogIn.setMargin(new java.awt.Insets(2, 14, 2, 14));
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        lbl6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lbl6.setForeground(new java.awt.Color(52, 64, 116));
        lbl6.setText("I don’t have an account ");

        btnSignUp.setBackground(new java.awt.Color(52, 64, 116));
        btnSignUp.setFont(new java.awt.Font("Berlin Sans FB", 0, 10)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Sign Up");
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSignUp.setInheritsPopupMenu(true);
        btnSignUp.setMargin(new java.awt.Insets(2, 14, 2, 14));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login3.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnLogIn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSignUp)))
                .addGap(0, 51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnLogIn)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btnSignUp))))
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE))
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
    
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public String username;
    String password;
    
    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed
    
    
    
    
    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        username = txtUsername.getText();
        password = txtPass.getText();

        if (txtUsername.getText().equals("")|| txtPass.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please fill the required field", "ERROR",JOptionPane.WARNING_MESSAGE);

        }

        else {
            if (isUserValid(username, password)) {
                //System.out.println("Login successful!");
                JOptionPane.showMessageDialog(this, "Login successful!");
                
                Tracker trackerFrame = new Tracker();
                trackerFrame.lbluserwelcome = username;
                trackerFrame.lblwelcome.setText(username + "!");
                trackerFrame.currentUser = username;

                trackerFrame.setVisible(true);
                dispose();
            }
            else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.");

            }
        }
        //        if (isUserValid(username, password)) {
            //           //System.out.println("Login successful!");
            //           JOptionPane.showMessageDialog(this, "Login successful!");
            //           Tracker trackerFrame = new Tracker();
            //           trackerFrame.lbluserwelcome = username;
            //           trackerFrame.lblwelcome.setText("Hi "+ username +"!");
            //
            //
            //           trackerFrame.setVisible(true);
            //           dispose();
            //        } else {
            //            JOptionPane.showMessageDialog(this, "Invalid username or password.");
            //           //System.out.println("Invalid username or password.");
            //        }

        /*if (txtUsername.getText().equals("")|| pwfPass.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please fill the required field");
        }
        else{
            Tracker tr = new Tracker();
            tr.setVisible(true);
            dispose();
        }*/
    }//GEN-LAST:event_btnLogInActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        Signup signup = new Signup();
        signup.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSignUpActionPerformed
    
    
    
//    public void Connect(){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/walletdb","admin","0000");
//            
//            
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
    
    private boolean isUserValid(String username, String password) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish a connection to the database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/walletdb","admin","0000");

            // Create a PreparedStatement to execute the SQL query
            String query = "SELECT * FROM accounts WHERE username = ? AND password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                // Set the parameters in the query
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);

                // Execute the query and get the result set
                ResultSet resultSet = preparedStatement.executeQuery();

                // Check if the result set has any rows
                return resultSet.next();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
        return false;
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
