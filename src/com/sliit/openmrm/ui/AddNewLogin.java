package com.sliit.openmrm.ui;

import com.sliit.openmrm.db.DBConnect;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddNewLogin extends javax.swing.JFrame {

    private DBConnect dbConnect;
    private Connection con;
    private Statement stm;

    public AddNewLogin() throws SQLException {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(AddNewLogin.class.getResource("/resources/logo.png")));

        setResizable(false);
        Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        Dimension windowSize = new Dimension(getPreferredSize());
        int wdwLeft = 50 + screenSize.width / 2 - windowSize.width / 2;
        int wdwTop = screenSize.height / 2 - windowSize.height / 2;
        pack();
        setLocation(wdwLeft, wdwTop);
        setTitle("Add New Login User");
//      setPreferredSize(new Dimension(340, 285));

        dbConnect = new DBConnect();
        con = dbConnect.connect();
        stm = con.createStatement();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtUser2 = new javax.swing.JTextField();
        txtPass2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        butAdduser = new javax.swing.JButton();
        butLClear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPass2Con = new javax.swing.JPasswordField();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Add New User"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("User Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        jPanel2.add(txtUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 130, -1));
        jPanel2.add(txtPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 130, -1));

        jLabel5.setText("Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        butAdduser.setText("Add");
        butAdduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAdduserActionPerformed(evt);
            }
        });
        jPanel2.add(butAdduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, 30));

        butLClear.setText("Clear");
        butLClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLClearActionPerformed(evt);
            }
        });
        jPanel2.add(butLClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 110, 30));

        jLabel6.setText("Confirm Password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        jPanel2.add(txtPass2Con, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 130, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butAdduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAdduserActionPerformed
        try {
            if (txtUser2.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Enter the Username!", "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtPass2.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Enter the Password!", "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtPass2Con.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Enter the Confirm Password!", "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!txtPass2.getText().equals(txtPass2Con.getText())) {
                JOptionPane.showMessageDialog(this, "Please Confirm the Password Properly!", "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            ResultSet results = stm.executeQuery("select * from Login where strUser='" + txtUser2.getText() + "'");
            if (results.next()) {
                JOptionPane.showMessageDialog(this, "Sorry this Username already Exist!", "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql1 = "insert into Login (strUser, strPass) values ('" + txtUser2.getText() + "','" + txtPass2.getText() + "')";
            stm.executeUpdate(sql1);
            JOptionPane.showMessageDialog(this, "Thanks new User added!", "Open MRM System", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            clear();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error Occured!", "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Patients.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butAdduserActionPerformed

    private void butLClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLClearActionPerformed
         clear();
    }//GEN-LAST:event_butLClearActionPerformed

    public void clear(){
        txtUser2.setText("");
        txtPass2.setText("");
        txtPass2Con.setText("");
        txtUser2.setFocusable(true);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new AddNewLogin().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AddNewLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAdduser;
    private javax.swing.JButton butLClear;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPass2;
    private javax.swing.JPasswordField txtPass2Con;
    private javax.swing.JTextField txtUser2;
    // End of variables declaration//GEN-END:variables
}
