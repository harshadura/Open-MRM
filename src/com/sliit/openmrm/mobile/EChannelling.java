package com.sliit.openmrm.mobile;

import com.sliit.openmrm.ui.AddNewLogin;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

public class EChannelling extends javax.swing.JFrame {

    private String patient;
    private String tp;
    private String doctor;

    public EChannelling() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(AddNewLogin.class.getResource("/resources/logo.png")));
        setResizable(false);
        Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        Dimension windowSize = new Dimension(getPreferredSize());
        int wdwLeft = 50 + screenSize.width / 2 - windowSize.width / 2;
        int wdwTop = screenSize.height / 2 - windowSize.height / 2;
        pack();
        setLocation(wdwLeft, wdwTop);
        setTitle("eChanneling");
    }

    public void XMLReader() {
        try {
            URL url = new URL("http://durapix.org/bin/testMRM/openmrmChannels.xml");
            URLConnection urlConn = url.openConnection();
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(urlConn.getInputStream());
            doc.getDocumentElement().normalize();
            System.out.println("Root element of the doc is " + doc.getDocumentElement().getNodeName());
            NodeList listOfPersons = doc.getElementsByTagName("MRMchannel");
            int totalPersons = listOfPersons.getLength();
            System.out.println("Total no of people : " + totalPersons);

            for (int s = 0; s < listOfPersons.getLength(); s++) {
                Node firstPersonNode = listOfPersons.item(s);

                if (firstPersonNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element firstPersonElement = (Element) firstPersonNode;
                    NodeList firstNameList = firstPersonElement.getElementsByTagName("patient");

                    Element firstNameElement = (Element) firstNameList.item(0);
                    NodeList textFNList = firstNameElement.getChildNodes();
                    System.out.println("Patient : " + ((Node) textFNList.item(0)).getNodeValue().trim());
                    patient = ((Node) textFNList.item(0)).getNodeValue().trim();

                    NodeList lastNameList = firstPersonElement.getElementsByTagName("tp");
                    Element lastNameElement = (Element) lastNameList.item(0);
                    NodeList textLNList = lastNameElement.getChildNodes();
                    System.out.println("TP : " + ((Node) textLNList.item(0)).getNodeValue().trim());
                    tp = ((Node) textLNList.item(0)).getNodeValue().trim();

                    NodeList ageList = firstPersonElement.getElementsByTagName("doctor");
                    Element ageElement = (Element) ageList.item(0);
                    NodeList textAgeList = ageElement.getChildNodes();
                    System.out.println("Doctor : " + ((Node) textAgeList.item(0)).getNodeValue().trim());
                    doctor = ((Node) textAgeList.item(0)).getNodeValue().trim();
                }
            }

            txtPatient.setText(patient);
            txtTp.setText(tp);
            txtDoctor.setText(doctor);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPatient = new javax.swing.JTextField();
        txtTp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDoctor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        butRefresh = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReplySMS = new javax.swing.JTextArea();
        butSendSMS = new javax.swing.JButton();
        butConfigModem = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Android Mate"));

        jLabel2.setText("Patient ");

        jLabel4.setText("Telephone");

        jLabel5.setText("Doctor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(txtDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(139, 139, 139))
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPatient, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                .addGap(2, 2, 2))
                            .addComponent(txtTp, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtTp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        butRefresh.setText("Refresh");
        butRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRefreshActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Reply SMS"));

        txtReplySMS.setColumns(20);
        txtReplySMS.setRows(5);
        jScrollPane1.setViewportView(txtReplySMS);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        butSendSMS.setText("Send");
        butSendSMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSendSMSActionPerformed(evt);
            }
        });

        butConfigModem.setText("Configure Modem");
        butConfigModem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butConfigModemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(butRefresh))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butConfigModem))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(butSendSMS, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(butRefresh)
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butSendSMS)
                    .addComponent(butConfigModem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRefreshActionPerformed
        try {
            GrabXMLStuff();
        } catch (Throwable ex) {
            Logger.getLogger(EChannelling.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error : " + ex, "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_butRefreshActionPerformed

    public void SendSMSStuff() throws Throwable {

        final JFrame frame = new JFrame("Open MRM System");
        frame.setResizable(false);

        final JProgressBar progressBar = new JProgressBar();
        progressBar.setIndeterminate(true);
        final JPanel contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(new BorderLayout());
        contentPane.add(new JLabel("Sending SMS.."), BorderLayout.NORTH);
        contentPane.add(progressBar, BorderLayout.CENTER);
        frame.setContentPane(contentPane);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        Runnable runnable = new Runnable() {

            public void run() {
                try {
                    System.out.println("Sending SMS..");
                    Thread.sleep(1000);
                    SendSMS();
                } catch (Exception ex) {
                    Logger.getLogger(EChannelling.class.getName()).log(Level.SEVERE, null, ex);
                }
                SwingUtilities.invokeLater(new Runnable() {

                    public void run() {
                        frame.setVisible(false);
                    }
                });

            }
        };
        new Thread(runnable).start();
    }

    public void GrabXMLStuff() throws Throwable {

        final JFrame frame = new JFrame("Open MRM System");
        frame.setResizable(false);

        final JProgressBar progressBar = new JProgressBar();
        progressBar.setIndeterminate(true);
        final JPanel contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(new BorderLayout());
        contentPane.add(new JLabel("Retrieving Data.."), BorderLayout.NORTH);
        contentPane.add(progressBar, BorderLayout.CENTER);
        frame.setContentPane(contentPane);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        Runnable runnable = new Runnable() {

            public void run() {
                try {
                    System.out.println("Retrieving Data..");
                    Thread.sleep(1000);
                    XMLReader();
                } catch (Exception ex) {
                    Logger.getLogger(EChannelling.class.getName()).log(Level.SEVERE, null, ex);
                }
                SwingUtilities.invokeLater(new Runnable() {

                    public void run() {
                        frame.setVisible(false);
                    }
                });

            }
        };
        new Thread(runnable).start();
    }

    public void SendSMS() throws Exception {
        try {
            if (GsmModem.modem.equals("")) {
                JOptionPane.showMessageDialog(this, "Please configure the Modem First!", "Open MRM System", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            GsmModem gsmModem = new GsmModem();
            gsmModem.Sender(txtTp.getText().toString(), txtReplySMS.getText().toString());
            gsmModem.doIt();
            JOptionPane.showMessageDialog(this, "SMS Sent Successfully!", "Open MRM System", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error : " + e.getMessage(), "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void butSendSMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSendSMSActionPerformed
        try {
            if (txtReplySMS.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Enter Reply!", "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            SendSMSStuff();
        } catch (Throwable ex) {
            JOptionPane.showMessageDialog(this, "Error : " + ex, "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butSendSMSActionPerformed

    private void butConfigModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butConfigModemActionPerformed
        ConfigModem configModem = new ConfigModem();
        configModem.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_butConfigModemActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new EChannelling().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butConfigModem;
    private javax.swing.JButton butRefresh;
    private javax.swing.JButton butSendSMS;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtPatient;
    private javax.swing.JTextArea txtReplySMS;
    private javax.swing.JTextField txtTp;
    // End of variables declaration//GEN-END:variables
}
