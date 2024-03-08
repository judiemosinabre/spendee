import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author judie
 */
public class Signup extends javax.swing.JFrame {

    
    public Signup() {
        initComponents();
        Connect();
                
        this.setTitle("Expense Tracker App |  COM221");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBackground = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnLogIn = new javax.swing.JButton();
        lbl7 = new javax.swing.JLabel();
        btnSignUp1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signup.png"))); // NOI18N
        lblBackground.setInheritsPopupMenu(false);

        lbl3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 28)); // NOI18N
        lbl3.setForeground(new java.awt.Color(52, 64, 116));
        lbl3.setText("SIGN UP ");

        lbl4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        lbl4.setForeground(new java.awt.Color(52, 64, 116));
        lbl4.setText("Full Name");

        lbl5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        lbl5.setForeground(new java.awt.Color(52, 64, 116));
        lbl5.setText("Username");

        lbl6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        lbl6.setForeground(new java.awt.Color(52, 64, 116));
        lbl6.setText("Password");

        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 147, 180), 2));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 147, 180), 2));

        txtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 147, 180), 2));

        btnLogIn.setBackground(new java.awt.Color(219, 147, 180));
        btnLogIn.setFont(new java.awt.Font("Berlin Sans FB", 0, 10)); // NOI18N
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

        lbl7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lbl7.setForeground(new java.awt.Color(219, 147, 180));
        lbl7.setText("I have an account");

        btnSignUp1.setBackground(new java.awt.Color(52, 64, 116));
        btnSignUp1.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        btnSignUp1.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp1.setText("Sign Up");
        btnSignUp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSignUp1.setInheritsPopupMenu(true);
        btnSignUp1.setMargin(new java.awt.Insets(2, 14, 2, 14));
        btnSignUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUp1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnSignUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 222, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(738, 738, 738)
                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(108, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(665, 665, 665)
                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(250, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(664, 664, 664)
                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(246, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(662, 662, 662)
                    .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(254, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(660, 660, 660)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(47, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(661, 661, 661)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(661, 661, 661)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(46, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(823, 823, 823)
                    .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(69, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(662, 662, 662)
                    .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(190, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSignUp1)
                .addGap(82, 82, 82))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblBackground)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(377, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addComponent(lbl4)
                    .addContainerGap(339, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(185, 185, 185)
                    .addComponent(lbl5)
                    .addContainerGap(259, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(267, 267, 267)
                    .addComponent(lbl6)
                    .addContainerGap(177, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(135, 135, 135)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(289, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(217, 217, 217)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(207, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(293, 293, 293)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(132, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(410, 410, 410)
                    .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(411, 411, 411)
                    .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String username, password, fullName, passCheck;
    boolean checkUsernameAvailability;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    public void Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/walletdb","admin","0000");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean isUsernameTaken(String username){
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish a connection to the database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/walletdb","admin","0000");

            // Create a PreparedStatement to execute the SQL query
            String query = "SELECT * FROM accounts WHERE username = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                // Set the parameters in the query
                preparedStatement.setString(1, username);

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
    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogInActionPerformed
    
    private void btnSignUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUp1ActionPerformed
        username = txtUsername.getText();
        
        if (txtName.getText().equals("") || txtUsername.getText().equals("")|| txtPass.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please fill the required field", "ERROR",JOptionPane.WARNING_MESSAGE);

        }
        
        else {
            if (isUsernameTaken(username)) {
                JOptionPane.showMessageDialog(this, "Username Exist.", "ERROR",JOptionPane.WARNING_MESSAGE);
            } 
            
            else {
                try {
                    username = txtUsername.getText();
                    password = txtPass.getText();

                    pst = con.prepareStatement("INSERT INTO accounts (username,password)VALUES(?,?)");
                    pst.setString(1,username);
                    pst.setString(2,password);

                    int k = pst.executeUpdate();

                    if (k == 1){
                        JOptionPane.showMessageDialog(this, "Successfully Created an Account!");
                        txtUsername.setText("");
                        txtPass.setText("");
                        txtName.setText("");


                        //OPEN LOGIN
                        Login login = new Login();
                        login.setVisible(true);
                        dispose();
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "There was an Error. Please Try Again.");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
                }
             }
        }
        
        
//        if (isUsernameTaken(username)) {
//            JOptionPane.showMessageDialog(this, "Username Exist.", "ERROR",JOptionPane.WARNING_MESSAGE);
//        } else {
//            try {
//                username = txtUsername.getText();
//                password = txtPass.getText();
//
//                pst = con.prepareStatement("INSERT INTO accounts (username,password)VALUES(?,?)");
//                pst.setString(1,username);
//                pst.setString(2,password);
//
//                int k = pst.executeUpdate();
//
//                if (k == 1){
//                    JOptionPane.showMessageDialog(this, "Successfully Created an Account!");
//                    txtUsername.setText("");
//                    txtPass.setText("");
//                    txtName.setText("");
//                    
//                    
//                    //OPEN LOGIN
//                    Login login = new Login();
//                    login.setVisible(true);
//                    dispose();
//                }
//                else {
//                    JOptionPane.showMessageDialog(this, "There was an Error. Please Try Again.");
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
        
        
//        try {
//            username = txtUsername.getText();
//            password = txtPass.getText();
//            
//            pst = con.prepareStatement("INSERT INTO accounts (username,password)VALUES(?,?)");
//            pst.setString(1,username);
//            pst.setString(2,password);
//            
//            int k = pst.executeUpdate();
//            
//            if (k == 1){
//                JOptionPane.showMessageDialog(this, "Successfully Created an Account!");
//                txtUsername.setText("");
//                txtPass.setText("");
//                txtName.setText("");
//            }
//            else {
//                JOptionPane.showMessageDialog(this, "There was an Error. Please Try Again.");
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnSignUp1ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed


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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnSignUp1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
