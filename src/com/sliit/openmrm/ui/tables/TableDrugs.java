package com.sliit.openmrm.ui.tables;

import com.sliit.openmrm.db.DBConnect;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import java.util.*;
import java.sql.Connection;

public class TableDrugs extends javax.swing.JFrame {

    private Vector<String> header;
    private DBConnect dbConnect;
    private Connection con;
    private Vector data;

    public TableDrugs() {
        try {
            dbConnect = new DBConnect();
            con = dbConnect.connect();
            data = getAbbr();
            header = new Vector<String>();
            header.add("drugId");
            header.add("drug");
            header.add("unit");
            header.add("rate");
            header.add("lastChanged");
            initComponents();
            setIconImage(Toolkit.getDefaultToolkit().getImage(TableDrugs.class.getResource("/resources/logo.png")));

            setResizable(false);
            Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
            Dimension windowSize = new Dimension(getPreferredSize());
            int wdwLeft = 50 + screenSize.width / 2 - windowSize.width / 2;
            int wdwTop = screenSize.height / 2 - windowSize.height / 2;
            pack();
            setLocation(wdwLeft, wdwTop);
            setTitle("Listing of All Drugs");
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }
    }

    public Vector getAbbr() throws Exception {
        Vector<Vector<String>> AbbrVector = new Vector<Vector<String>>();
        PreparedStatement pre = con.prepareStatement("select * from drugs");
        ResultSet rs = pre.executeQuery();
        while (rs.next()) {
            Vector<String> Abbr = new Vector<String>();
            Abbr.add(rs.getString(1));
            Abbr.add(rs.getString(2));
            Abbr.add(rs.getString(3));
            Abbr.add(rs.getString(4));
            Abbr.add(rs.getString(5));
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TableDrugs().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
