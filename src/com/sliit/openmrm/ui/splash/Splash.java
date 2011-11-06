package com.sliit.openmrm.ui.splash;

import com.sliit.openmrm.db.DBConnect;
import com.sliit.openmrm.db.PropertyLoader;
import com.sliit.openmrm.ui.Login;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Splash extends javax.swing.JFrame {
    private static DBConnect dbConnect;
    private static Connection con;
    private static Statement stm;
    private static int i = 0;

    public Splash() throws InterruptedException {
        try {
            PropertyLoader propertyLoader = new PropertyLoader();
            setUndecorated(true);
            initComponents();
            Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
            Dimension windowSize = new Dimension(getPreferredSize());
            int wdwLeft = 50 + screenSize.width / 2 - windowSize.width / 2;
            int wdwTop = screenSize.height / 2 - windowSize.height / 2;
            setLocation(wdwLeft, wdwTop);
        } catch (Exception ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sliit/openmrm/ui/splash/splash.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static boolean checkDBConnection() throws SQLException {
        try {
            dbConnect = new DBConnect();
            con = dbConnect.connect();
            stm = con.createStatement();
            String sql1 = "select * from Login";
            ResultSet results = stm.executeQuery(sql1);
            return true;
        } catch (Exception ee) {
            return false;
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    Splash splash = new Splash();
                    splash.setVisible(true);
                    Thread.sleep(500);
                    if (!checkDBConnection()) {
                        int more = JOptionPane.YES_OPTION;
                        more = JOptionPane.showConfirmDialog(null, "Error Connecting to the Database! Do you like to Configure DB properties now?", "Open MRM System", JOptionPane.YES_NO_OPTION);
                        if (more == JOptionPane.YES_OPTION) {
                            String response = JOptionPane.showInputDialog(null, "Please type DB Name, user, pass Space by Space Accordingly..\neg: DB_FuelMart universl pass123","Open MRM System", JOptionPane.QUESTION_MESSAGE);
                            String parts[] = response.split(" ");
                            PropertyLoader.setDbProperties(parts[0], parts[1], parts[2]);
                            JOptionPane.showMessageDialog(null, "Thanks your Records Saved, Please Restart the System!", "Open MRM System", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        } else {
                            System.exit(0);
                        }
                    }
                    splash.setVisible(false);
                    Login login = new Login();
                    login.setVisible(true);
          
                } catch (Exception ex) {
                    Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
