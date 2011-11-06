package com.sliit.openmrm.ui.tables;

import com.sliit.openmrm.db.DBConnect;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import java.util.*;
import java.sql.Connection;

public class TableOPD extends javax.swing.JFrame {

    private Vector<String> header;
    private DBConnect dbConnect;
    private Connection con;
    private Vector data;

    public TableOPD() {
        try {
            dbConnect = new DBConnect();
            con = dbConnect.connect();
            data = getAbbr();
            header = new Vector<String>();
            header.add("regId");
            header.add("enterBy");
            header.add("issuedate");
            header.add("patientName");
            header.add("guardian");
            header.add("address");
            header.add("tpno");
            header.add("doctName");
            initComponents();
            setIconImage(Toolkit.getDefaultToolkit().getImage(TableOPD.class.getResource("/resources/logo.png")));

            setResizable(false);
            Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
            Dimension windowSize = new Dimension(getPreferredSize());
            int wdwLeft = 50 + screenSize.width / 2 - windowSize.width / 2;
            int wdwTop = screenSize.height / 2 - windowSize.height / 2;
            pack();
            setLocation(wdwLeft, wdwTop);
            setTitle("Table of OPD Transactions");
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }
    }

    public Vector getAbbr() throws Exception {
        Vector<Vector<String>> AbbrVector = new Vector<Vector<String>>();
        PreparedStatement pre = con.prepareStatement("select * from OPDReg");
        ResultSet rs = pre.executeQuery();
        while (rs.next()) {
            Vector<String> Abbr = new Vector<String>();
            Abbr.add(rs.getString(1));
            Abbr.add(rs.getString(2));
            Abbr.add(rs.getString(3));
            Abbr.add(rs.getString(4));
            Abbr.add(rs.getString(5));
            Abbr.add(rs.getString(6));
            Abbr.add(rs.getString(7));
            Abbr.add(rs.getString(8));
            AbbrVector.add(Abbr);
        }
        return AbbrVector;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(data,header));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TableOPD().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
