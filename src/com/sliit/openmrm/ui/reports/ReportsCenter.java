package com.sliit.openmrm.ui.reports;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import java.util.HashMap;
import java.sql.Connection;
import com.sliit.openmrm.db.DBConnect;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ReportsCenter extends javax.swing.JFrame {
    private String DATE_FORMAT_NOW2 = "MMM/dd-E";
    private String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
    private Calendar cal = Calendar.getInstance();
    private SimpleDateFormat sdf2 = new SimpleDateFormat(DATE_FORMAT_NOW2);
    private SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
    private ButtonGroup OrderType = new ButtonGroup();
    private ButtonGroup DateRange = new ButtonGroup();
    private DBConnect dbConnect;
    private Connection con;

    public ReportsCenter() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(ReportsCenter.class.getResource("/resources/logo.png")));

        setResizable(false);
        Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        Dimension windowSize = new Dimension(getPreferredSize());
        int wdwLeft = 50 + screenSize.width / 2 - windowSize.width / 2;
        int wdwTop = screenSize.height / 2 - windowSize.height / 2;
        pack();
        setLocation(wdwLeft, wdwTop);
        setTitle("Generate Reports");
//      setPreferredSize(new Dimension(340, 285));

        dbConnect = new DBConnect();
        con = dbConnect.connect();
        OrderType.add(radioPharmacy);
        OrderType.add(radioChanneling);
        DateRange.add(radioSpecificDate);
        DateRange.add(radioSpecificRange);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        radioChanneling = new javax.swing.JRadioButton();
        radioPharmacy = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        radioSpecificDate = new javax.swing.JRadioButton();
        radioSpecificRange = new javax.swing.JRadioButton();
        panelRange = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pickerSpecificRangeStart = new org.jdesktop.swingx.JXDatePicker();
        pickerSpecificRangeEnd = new org.jdesktop.swingx.JXDatePicker();
        pickerSpecificDate = new org.jdesktop.swingx.JXDatePicker();
        butGenerateReport = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Report Type"));

        radioChanneling.setText("Channeling");

        radioPharmacy.setText("Pharmacy");
        radioPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPharmacyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(radioPharmacy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(radioChanneling)
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioChanneling)
                    .addComponent(radioPharmacy))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Report Period"));

        radioSpecificDate.setText("Specific Date");
        radioSpecificDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSpecificDateActionPerformed(evt);
            }
        });

        radioSpecificRange.setText("Date Range");
        radioSpecificRange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSpecificRangeActionPerformed(evt);
            }
        });

        panelRange.setBorder(javax.swing.BorderFactory.createTitledBorder("Range"));

        jLabel2.setText("End Date");

        jLabel1.setText("Start Date");

        pickerSpecificRangeStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickerSpecificRangeStartActionPerformed(evt);
            }
        });

        pickerSpecificRangeEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickerSpecificRangeEndActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRangeLayout = new javax.swing.GroupLayout(panelRange);
        panelRange.setLayout(panelRangeLayout);
        panelRangeLayout.setHorizontalGroup(
            panelRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRangeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panelRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pickerSpecificRangeEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pickerSpecificRangeStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelRangeLayout.setVerticalGroup(
            panelRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRangeLayout.createSequentialGroup()
                .addGroup(panelRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pickerSpecificRangeStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pickerSpecificRangeEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pickerSpecificDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickerSpecificDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(radioSpecificDate)
                        .addGap(18, 18, 18)
                        .addComponent(pickerSpecificDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(radioSpecificRange)
                        .addGap(18, 18, 18)
                        .addComponent(panelRange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioSpecificDate)
                    .addComponent(pickerSpecificDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioSpecificRange)
                    .addComponent(panelRange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        butGenerateReport.setText("Generate Report");
        butGenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGenerateReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(butGenerateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(butGenerateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Load() throws Throwable {

        final JFrame frame = new JFrame("Open MRM System");
        frame.setResizable(false);

        final JProgressBar progressBar = new JProgressBar();
        progressBar.setIndeterminate(true);
        final JPanel contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(new BorderLayout());
        contentPane.add(new JLabel("Generating Report.."), BorderLayout.NORTH);
        contentPane.add(progressBar, BorderLayout.CENTER);
        frame.setContentPane(contentPane);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        Runnable runnable = new Runnable() {

            public void run() {
                try {
                    System.out.println("Generating Report..");
                    Thread.sleep(1000);
                    doStuff();
                } catch (InterruptedException e) {
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

    private void butGenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGenerateReportActionPerformed
        try {
            Load();
        } catch (Throwable ex) {
            Logger.getLogger(ReportsCenter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butGenerateReportActionPerformed

    public void doStuff() {
        try {
            if (radioPharmacy.isSelected()) {
                if (radioSpecificDate.isSelected()) {
                    Date startDate = pickerSpecificDate.getDate();
                    cal.setTime(pickerSpecificDate.getDate());
                    cal.add(Calendar.DATE, 1);
                    Date endDate = cal.getTime();
                    System.out.println(startDate + " | " + endDate);
                    String title = "Pharmacy Transactions - Report of " + sdf2.format(pickerSpecificDate.getDate());
                    InputStream path = getClass().getResourceAsStream("/resources/jasper/Pharmacy.jrxml");
                    generateReport(startDate, endDate, title, path);
                } else if (radioSpecificRange.isSelected()) {
                    Calendar cal1 = Calendar.getInstance();
                    Calendar cal2 = Calendar.getInstance();
                    cal1.setTime(pickerSpecificRangeStart.getDate());
                    cal2.setTime(pickerSpecificRangeEnd.getDate());
                    if (!cal1.before(cal2)) {
                        JOptionPane.showMessageDialog(this, "Unable to generate Report. Invalid Date Range!", "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    Date startDate = pickerSpecificRangeStart.getDate();
                    Date endDate = pickerSpecificRangeEnd.getDate();
                    System.out.println(startDate + " | " + endDate);
                    String title = "Pharmacy Transactions - Report of " + sdf2.format(pickerSpecificRangeStart.getDate())
                            + " to " + sdf2.format(pickerSpecificRangeEnd.getDate());
                    InputStream path = getClass().getResourceAsStream("/resources/jasper/Pharmacy.jrxml");
                    generateReport(startDate, endDate, title, path);
                }
            }
            if (radioChanneling.isSelected()) {
                if (radioSpecificDate.isSelected()) {
                    Date startDate = pickerSpecificDate.getDate();
                    cal.setTime(pickerSpecificDate.getDate());
                    cal.add(Calendar.DATE, 1);
                    Date endDate = cal.getTime();
                    System.out.println(startDate + " | " + endDate);
                    String title = "Channeling Transactions - Report of " + sdf2.format(pickerSpecificDate.getDate());
                    InputStream path = getClass().getResourceAsStream("/resources/jasper/Channeling.jrxml");
                    generateReport(startDate, endDate, title, path);
                } else if (radioSpecificRange.isSelected()) {
                    Calendar cal1 = Calendar.getInstance();
                    Calendar cal2 = Calendar.getInstance();
                    cal1.setTime(pickerSpecificRangeStart.getDate());
                    cal2.setTime(pickerSpecificRangeEnd.getDate());
                    if (!cal1.before(cal2)) {
                        JOptionPane.showMessageDialog(this, "Unable to generate Report. Invalid Date Range!", "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    Date startDate = pickerSpecificRangeStart.getDate();
                    Date endDate = pickerSpecificRangeEnd.getDate();
                    System.out.println(startDate + " | " + endDate);
                    String title = "Channeling Transactions - Report of " + sdf2.format(pickerSpecificRangeStart.getDate())
                            + " to " + sdf2.format(pickerSpecificRangeEnd.getDate());
                    InputStream path = getClass().getResourceAsStream("/resources/jasper/Channeling.jrxml");
                    generateReport(startDate, endDate, title, path);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error occurred while Generating the Report! Error : " + ex.getMessage(), "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(ReportsCenter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void generateReport(Date startDate, Date endDate, String reportTitle, InputStream path) {
        try {
            HashMap hashMap = new HashMap<String, Object>();
            hashMap.put("ReportTitle", reportTitle);
            hashMap.put("StartReportDate", startDate);
            hashMap.put("EndReportDate", endDate);
            JasperDesign jasperDesign = JRXmlLoader.load(path);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hashMap, con);
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
            jasperViewer.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this, "Error occurred while Generating the Report! Error : " + ex.getMessage(), "Open MRM System", javax.swing.JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(ReportsCenter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void radioPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPharmacyActionPerformed
    }//GEN-LAST:event_radioPharmacyActionPerformed

    private void radioSpecificDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSpecificDateActionPerformed
        pickerSpecificDate.setEnabled(true);
        pickerSpecificRangeStart.setEnabled(false);
        pickerSpecificRangeEnd.setEnabled(false);
    }//GEN-LAST:event_radioSpecificDateActionPerformed

    private void radioSpecificRangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSpecificRangeActionPerformed
        pickerSpecificDate.setEnabled(false);
        pickerSpecificRangeStart.setEnabled(true);
        pickerSpecificRangeEnd.setEnabled(true);
    }//GEN-LAST:event_radioSpecificRangeActionPerformed

    private void pickerSpecificDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickerSpecificDateActionPerformed
        radioSpecificDate.setSelected(true);
    }//GEN-LAST:event_pickerSpecificDateActionPerformed

    private void pickerSpecificRangeStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickerSpecificRangeStartActionPerformed
        radioSpecificRange.setSelected(true);
    }//GEN-LAST:event_pickerSpecificRangeStartActionPerformed

    private void pickerSpecificRangeEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickerSpecificRangeEndActionPerformed
        radioSpecificRange.setSelected(true);
    }//GEN-LAST:event_pickerSpecificRangeEndActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ReportsCenter().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butGenerateReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelRange;
    private org.jdesktop.swingx.JXDatePicker pickerSpecificDate;
    private org.jdesktop.swingx.JXDatePicker pickerSpecificRangeEnd;
    private org.jdesktop.swingx.JXDatePicker pickerSpecificRangeStart;
    private javax.swing.JRadioButton radioChanneling;
    private javax.swing.JRadioButton radioPharmacy;
    private javax.swing.JRadioButton radioSpecificDate;
    private javax.swing.JRadioButton radioSpecificRange;
    // End of variables declaration//GEN-END:variables
}
