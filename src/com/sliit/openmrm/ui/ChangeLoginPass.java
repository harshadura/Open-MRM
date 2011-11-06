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

public class ChangeLoginPass extends javax.swing.JFrame {
    private DBConnect dbConnect;
    private Connection con;
    private Statement stm;

    public ChangeLoginPass() throws SQLException {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(ChangeLoginPass.class.getResource("/resources/logo.png")));

        setResizable(false);
        Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        Dimension windowSize = new Dimension(getPreferredSize());
        int wdwLeft = 50 + screenSize.width / 2 - windowSize.width / 2;
        int wdwTop = screenSize.height / 2 - windowSize.height / 2;
        pack();
        setLocation(wdwLeft, wdwTop);
        setTitle("Change Login");
//      setPreferredSize(new Dimension(340, 285));

        dbConnect = new DBConnect();
        con = dbConnect.connect();
        stm = con.createStatement();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        butUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtOldPass = new javax.swing.JPasswordField();
        txtNewPass = new javax.swing.JPasswordField();
        butClear1 = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Update Existing Pass"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butUpdate.setText("Update");
        butUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(butUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 110, 30));

        jLabel3.setText("New Pass");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 50, -1));

        jLabel2.setText("Old Pass");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel1.setText("User Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 130, -1));
        jPanel1.add(txtOldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 130, -1));
        jPanel1.add(txtNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 130, -1));

        butClear1.setText("Clear");
        butClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClear1ActionPerformed(evt);
            }
        });
        jPanel1.add(butClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 110, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butUpdateActionPerformed

        if (txtUser.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter the Username!","Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtOldPass.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter the old Password!", "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtNewPass.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter the new Password!", "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            String sql1 = "select strPass from Login where strUser='" + txtUser.getText() + "'";
            ResultSet results = stm.executeQuery(sql1);
            String Pass = "";
            while (results.next()) {
                Pass = results.getString("strPass");
                if (txtOldPass.getText().equals(Pass)) {
                    try {
                        String sql = "update Login set strPass='" + txtNewPass.getText() + "' where strUser='" + txtUser.getText() + "'";
                        stm.executeUpdate(sql);
                        JOptionPane.showMessageDialog(this, "Password Successfully changed!","Open MRM System", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                            clear();
                        return;
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, "Error Occured!", "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
                        Logger.getLogger(Patients.class.getName()).log(Level.SEVERE, null, ex);
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect old Password");
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "User not Found!");
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }
}//GEN-LAST:event_butUpdateActionPerformed

    private void butClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClear1ActionPerformed
     clear();
    }//GEN-LAST:event_butClear1ActionPerformed

    public void clear(){
           txtUser.setText("");
        txtNewPass.setText("");
        txtOldPass.setText("");
        txtUser.setFocusable(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new ChangeLoginPass().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ChangeLoginPass.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butClear1;
    private javax.swing.JButton butUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtNewPass;
    private javax.swing.JPasswordField txtOldPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
