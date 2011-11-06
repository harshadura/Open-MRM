package com.sliit.openmrm.ui;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.sliit.openmrm.db.DBConnect;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class OPDRegistrationsUpdate extends javax.swing.JFrame {

    private DBConnect dbConnect;
    private Connection con;
    private Statement stm;
    private List<String> autoCompany = new ArrayList<String>();
    private boolean strictMatching = false;

    public OPDRegistrationsUpdate() throws SQLException {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(OPDRegistrationsUpdate.class.getResource("/resources/logo.png")));
        setResizable(false);
        Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        Dimension windowSize = new Dimension(getPreferredSize());
        int wdwLeft = 50 + screenSize.width / 2 - windowSize.width / 2;
        int wdwTop = screenSize.height / 2 - windowSize.height / 2;
        pack();
        setLocation(wdwLeft, wdwTop);
        setTitle("Update/Delete OPD Registrations");
        dbConnect = new DBConnect();
        con = dbConnect.connect();
        stm = con.createStatement();
        AutoCompleteDecorator.decorate(txtPatientNameSeek, addPatientNameSeek(), strictMatching);
    }

    private List<String> addPatientNameSeek() {
        try {
            ResultSet rst = stm.executeQuery("select patientName from OPDReg");
            while (rst.next()) {
                autoCompany.add(rst.getString("patientName"));
            }
            rst.close();
            return autoCompany;
        } catch (Exception e) {
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtRegID = new javax.swing.JTextField();
        butSearch = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtPatientNameSeek = new javax.swing.JTextField();
        butAutoProduct = new javax.swing.JButton();
        txtTime = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEnter = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtDoctor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtGuardian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtTp = new javax.swing.JTextField();
        butUpdate = new javax.swing.JButton();
        butDelete = new javax.swing.JButton();
        butClear = new javax.swing.JButton();

        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Search By"));

        jLabel9.setText("Patient Name");

        txtRegID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegIDActionPerformed(evt);
            }
        });
        txtRegID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRegIDKeyPressed(evt);
            }
        });

        butSearch.setText(">>");
        butSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSearchActionPerformed(evt);
            }
        });

        jLabel10.setText("OPD Reg.ID");

        txtPatientNameSeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameSeekActionPerformed(evt);
            }
        });
        txtPatientNameSeek.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPatientNameSeekKeyPressed(evt);
            }
        });

        butAutoProduct.setText(">>");
        butAutoProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAutoProductActionPerformed(evt);
            }
        });

        txtTime.setText("DATE");

        jLabel6.setText("Cashier/Enter By : ");

        txtEnter.setText("USER");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtPatientNameSeek, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(txtRegID, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butSearch)
                    .addComponent(butAutoProduct))
                .addGap(23, 23, 23)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(txtEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(txtTime)
                        .addGap(20, 20, 20)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtEnter))
                        .addGap(18, 18, 18))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(butAutoProduct)
                            .addComponent(txtPatientNameSeek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butSearch)
                                .addGap(26, 26, 26))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRegID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addContainerGap())))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel5.setText("Doctor's Name");

        jLabel1.setText("Patient Name");

        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        jLabel13.setText("Telephone No");

        jLabel12.setText("Address");

        jLabel11.setText("Guardian");

        txtGuardian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardianActionPerformed(evt);
            }
        });

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        txtTp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(txtGuardian, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(txtTp, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtGuardian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtTp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        butUpdate.setText("Update");
        butUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butUpdateActionPerformed(evt);
            }
        });

        butDelete.setText("Delete");
        butDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeleteActionPerformed(evt);
            }
        });

        butClear.setText("Clear");
        butClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butClear, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(butDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(butUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(butUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butClear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butUpdateActionPerformed
        try {
            String sql2 = "select * from OPDReg where regId='" + txtRegID.getText() + "'";
            ResultSet rst = stm.executeQuery(sql2);

            if (rst.next()) {
                String sql = "update OPDReg set enterBy='" + Login.user + "', issuedate='" + txtTime.getText() + "', patientName='" + txtPatientName.getText() + "',"
                        + " guardian='" + txtGuardian.getText() + "', address='" + txtAddress.getText() + "', "
                        + "tpno='" + txtTp.getText() + "', doctName='" + txtDoctor.getText() + "' where regId='" + txtRegID.getText() + "'";

                stm.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Your record Updated!", "Open MRM System", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                clear();
                AutoCompleteDecorator.decorate(txtPatientNameSeek, addPatientNameSeek(), strictMatching);
            } else {
                JOptionPane.showMessageDialog(this, "No Record to Update!", "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error Occured!", "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            Logger.getLogger(OPDRegistrationsUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butUpdateActionPerformed

    private void butDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeleteActionPerformed
        try {
            String sql2 = "select * from OPDReg where regId='" + txtRegID.getText() + "'";
            ResultSet rst = stm.executeQuery(sql2);

            if (rst.next()) {
                String sql = "delete from OPDReg where regId='" + txtRegID.getText() + "'";
                stm.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Record Deleted!", "Open MRM System", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                clear();
                AutoCompleteDecorator.decorate(txtPatientNameSeek, addPatientNameSeek(), strictMatching);
            } else {
                JOptionPane.showMessageDialog(this, "Nothing to Delete!", "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error Occured!", "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            Logger.getLogger(OPDRegistrationsUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butDeleteActionPerformed

    private void butClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClearActionPerformed
        clear();
    }//GEN-LAST:event_butClearActionPerformed

    public void clear() {
        txtRegID.setFocusable(true);
        txtAddress.setText("");
        txtDoctor.setText("");
        txtPatientName.setText("");
        txtAddress.setText("");
        txtTp.setText("");
        txtGuardian.setText("");
        txtAddress.setText("");
    }
    private void butSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSearchActionPerformed
        try {
            clear();
            String sql2 = "select * from OPDReg where regId='" + txtRegID.getText() + "'";
            ResultSet rst = stm.executeQuery(sql2);

            if (rst.next() == false) {
                JOptionPane.showMessageDialog(this, "No Record Found!", "Open MRM System", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                txtEnter.setText(rst.getString("enterBy"));
                txtTime.setText(rst.getString("issuedate"));
                txtPatientName.setText(rst.getString("patientName"));
                txtGuardian.setText(rst.getString("guardian"));
                txtAddress.setText(rst.getString("address"));
                txtTp.setText(rst.getString("tpno"));
                txtDoctor.setText(rst.getString("doctName"));
            }
            rst.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error Occured!", "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butSearchActionPerformed

    private void txtRegIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegIDActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtRegIDActionPerformed

    private void txtRegIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegIDKeyPressed
        // TODO add your handling code here:
}//GEN-LAST:event_txtRegIDKeyPressed

    private void butAutoProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAutoProductActionPerformed
        try {
            clear();
            String sql2 = "select * from OPDReg where patientName='" + txtPatientNameSeek.getText() + "'";
            ResultSet rst = stm.executeQuery(sql2);

            if (rst.next() == false) {
                JOptionPane.showMessageDialog(this, "No Record Found!","Open MRM System", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                txtRegID.setText(rst.getString("regId"));
                txtEnter.setText(rst.getString("enterBy"));
                txtTime.setText(rst.getString("issuedate"));
                txtPatientName.setText(rst.getString("patientName"));
                txtGuardian.setText(rst.getString("guardian"));
                txtAddress.setText(rst.getString("address"));
                txtTp.setText(rst.getString("tpno"));
                txtDoctor.setText(rst.getString("doctName"));
            }
            rst.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Occured!","Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
}//GEN-LAST:event_butAutoProductActionPerformed

    private void txtPatientNameSeekKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientNameSeekKeyPressed

}//GEN-LAST:event_txtPatientNameSeekKeyPressed

    private void txtPatientNameSeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameSeekActionPerformed

}//GEN-LAST:event_txtPatientNameSeekActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed

}//GEN-LAST:event_txtPatientNameActionPerformed

    private void txtGuardianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardianActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtGuardianActionPerformed

    private void txtTpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTpActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtTpActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new OPDRegistrationsUpdate().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(OPDRegistrationsUpdate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAutoProduct;
    private javax.swing.JButton butClear;
    private javax.swing.JButton butDelete;
    private javax.swing.JButton butSearch;
    private javax.swing.JButton butUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JLabel txtEnter;
    private javax.swing.JTextField txtGuardian;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPatientNameSeek;
    private javax.swing.JTextField txtRegID;
    private javax.swing.JLabel txtTime;
    private javax.swing.JTextField txtTp;
    // End of variables declaration//GEN-END:variables
}
