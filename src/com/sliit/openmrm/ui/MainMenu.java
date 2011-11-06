package com.sliit.openmrm.ui;

import com.sliit.openmrm.mobile.ConfigModem;
import com.sliit.openmrm.mobile.EChannelling;
import com.sliit.openmrm.ui.reports.ReportsCenter;
import com.sliit.openmrm.ui.tables.TableDrugs;
import com.sliit.openmrm.ui.tables.TableDoctors;
import com.sliit.openmrm.ui.tables.TableChanneling;
import com.sliit.openmrm.ui.tables.TableOPD;
import com.sliit.openmrm.ui.tables.TablePatients;
import com.sliit.openmrm.ui.tables.TablePharmacy;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
        txtUser.setText(Login.user);
        setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenu.class.getResource("/resources/logo.png")));
        setExtendedState(MainMenu.MAXIMIZED_BOTH);
        setTitle("Open MRM - Medical Record Management System - SLIIT - ITP/2011/019");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JLabel();
        menuPharmacy = new javax.swing.JButton();
        menuExit = new javax.swing.JButton();
        menuReportGen = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        menuEChannel = new javax.swing.JButton();
        menuDrugsAndProducts = new javax.swing.JButton();
        menuLockScreen = new javax.swing.JButton();
        menuOPD = new javax.swing.JButton();
        menuChannelling = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        tabAddNewChannel = new javax.swing.JMenuItem();
        tabUpdateChannel = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        tabCreditCard111 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        tabOPD = new javax.swing.JMenuItem();
        tabUpdateOPD = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        tabPharmacy = new javax.swing.JMenuItem();
        tabPharmacyUpdate = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenu6 = new javax.swing.JMenu();
        tabAddDoctor_Save = new javax.swing.JMenuItem();
        tabAddDoctor_Edit = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenu7 = new javax.swing.JMenu();
        tabProducts_Save = new javax.swing.JMenuItem();
        tabProducts_Edit = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jMenu11 = new javax.swing.JMenu();
        tabPatients_Save = new javax.swing.JMenuItem();
        tabPatients_Edit = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        tabExit = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        tabDrugsProductsTable = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        tabPatientsTable = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        tabDoctorsTable = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        tabChannelingTable = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        tabPharmacyTable = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        tabOPDTable = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenu10 = new javax.swing.JMenu();
        tabGenerateReport = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        tabChangePass = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        tabNewUser = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        tabEChannel = new javax.swing.JMenuItem();
        tabConfigModem = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        tabHelp = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        tabAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Logged as : ");

        txtUser.setFont(new java.awt.Font("Tahoma", 1, 12));
        txtUser.setForeground(new java.awt.Color(0, 0, 255));
        txtUser.setText("NAME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuPharmacy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/malindapix/Pharmacy_logo.jpeg"))); // NOI18N
        menuPharmacy.setToolTipText("Update Prices of Products");
        menuPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPharmacyActionPerformed(evt);
            }
        });

        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/22d.png"))); // NOI18N
        menuExit.setToolTipText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });

        menuReportGen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/malindapix/listproducts_98547.jpg"))); // NOI18N
        menuReportGen.setToolTipText("List All Products");
        menuReportGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportGenActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/table.png"))); // NOI18N

        menuEChannel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/malindapix/medical_invoice_information_94445.jpg"))); // NOI18N
        menuEChannel.setToolTipText("Generate/Print Reports");
        menuEChannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEChannelActionPerformed(evt);
            }
        });

        menuDrugsAndProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/malindapix/Drugs.jpeg"))); // NOI18N
        menuDrugsAndProducts.setToolTipText("Update Details of Customers");
        menuDrugsAndProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDrugsAndProductsActionPerformed(evt);
            }
        });

        menuLockScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/3332.png"))); // NOI18N
        menuLockScreen.setToolTipText("Lock Screen");
        menuLockScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLockScreenActionPerformed(evt);
            }
        });

        menuOPD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/malindapix/OPD Billing.jpeg"))); // NOI18N
        menuOPD.setToolTipText("Add New Credit Card Order");
        menuOPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOPDActionPerformed(evt);
            }
        });

        menuChannelling.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/malindapix/E_Channeling.jpeg"))); // NOI18N
        menuChannelling.setToolTipText("Add New Credit Slip Order");
        menuChannelling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuChannellingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuChannelling, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuOPD, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuDrugsAndProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menuReportGen, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuEChannel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuLockScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPharmacy)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(menuDrugsAndProducts, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(menuReportGen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(menuEChannel, 0, 0, Short.MAX_VALUE))
                                .addComponent(menuLockScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(menuExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(menuOPD)
                    .addComponent(menuChannelling)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(33, 33, 33))
        );

        jMenu1.setText("File");

        jMenu3.setText("Channeling");

        tabAddNewChannel.setText("New Channel");
        tabAddNewChannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabAddNewChannelActionPerformed(evt);
            }
        });
        jMenu3.add(tabAddNewChannel);

        tabUpdateChannel.setText("Update/Delete Channel");
        tabUpdateChannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabUpdateChannelActionPerformed(evt);
            }
        });
        jMenu3.add(tabUpdateChannel);

        jMenu1.add(jMenu3);
        jMenu1.add(jSeparator2);

        tabCreditCard111.setText("OPD Registrations");
        tabCreditCard111.add(jSeparator1);

        tabOPD.setText("New Registration");
        tabOPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabOPDActionPerformed(evt);
            }
        });
        tabCreditCard111.add(tabOPD);

        tabUpdateOPD.setText("Update/Delete Registration");
        tabUpdateOPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabUpdateOPDActionPerformed(evt);
            }
        });
        tabCreditCard111.add(tabUpdateOPD);

        jMenu1.add(tabCreditCard111);
        jMenu1.add(jSeparator4);

        jMenu4.setText("Pharmacy");

        tabPharmacy.setText("New Transaction");
        tabPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabPharmacyActionPerformed(evt);
            }
        });
        jMenu4.add(tabPharmacy);

        tabPharmacyUpdate.setText("Update/Delete Transaction");
        tabPharmacyUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabPharmacyUpdateActionPerformed(evt);
            }
        });
        jMenu4.add(tabPharmacyUpdate);

        jMenu1.add(jMenu4);
        jMenu1.add(jSeparator5);

        jMenu6.setText("Doctors");

        tabAddDoctor_Save.setText("Add New Doctor");
        tabAddDoctor_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabAddDoctor_SaveActionPerformed(evt);
            }
        });
        jMenu6.add(tabAddDoctor_Save);

        tabAddDoctor_Edit.setText("Edit Existing Doctor");
        tabAddDoctor_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabAddDoctor_EditActionPerformed(evt);
            }
        });
        jMenu6.add(tabAddDoctor_Edit);

        jMenu1.add(jMenu6);
        jMenu1.add(jSeparator6);

        jMenu7.setText("Drugs and Products");

        tabProducts_Save.setText("Add New Product");
        tabProducts_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabProducts_SaveActionPerformed(evt);
            }
        });
        jMenu7.add(tabProducts_Save);

        tabProducts_Edit.setText("Edit Products/Change Prices");
        tabProducts_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabProducts_EditActionPerformed(evt);
            }
        });
        jMenu7.add(tabProducts_Edit);

        jMenu1.add(jMenu7);
        jMenu1.add(jSeparator12);

        jMenu11.setText("Patients");

        tabPatients_Save.setText("Add New Patient");
        tabPatients_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabPatients_SaveActionPerformed(evt);
            }
        });
        jMenu11.add(tabPatients_Save);

        tabPatients_Edit.setText("Edit Existing Patient");
        tabPatients_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabPatients_EditActionPerformed(evt);
            }
        });
        jMenu11.add(tabPatients_Edit);

        jMenu1.add(jMenu11);
        jMenu1.add(jSeparator14);

        tabExit.setText("Exit");
        tabExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabExitActionPerformed(evt);
            }
        });
        jMenu1.add(tabExit);

        jMenuBar1.add(jMenu1);

        jMenu8.setText("View");

        jMenu9.setText("Information Tables");

        tabDrugsProductsTable.setText("Drugs/Products Table");
        tabDrugsProductsTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabDrugsProductsTableActionPerformed(evt);
            }
        });
        jMenu9.add(tabDrugsProductsTable);
        jMenu9.add(jSeparator7);

        tabPatientsTable.setText("Patients Table");
        tabPatientsTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabPatientsTableActionPerformed(evt);
            }
        });
        jMenu9.add(tabPatientsTable);
        jMenu9.add(jSeparator8);

        tabDoctorsTable.setText("Doctors Table");
        tabDoctorsTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabDoctorsTableActionPerformed(evt);
            }
        });
        jMenu9.add(tabDoctorsTable);
        jMenu9.add(jSeparator10);

        tabChannelingTable.setText("Channeling History");
        tabChannelingTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabChannelingTableActionPerformed1(evt);
            }
        });
        jMenu9.add(tabChannelingTable);
        jMenu9.add(jSeparator13);

        tabPharmacyTable.setText("Pharmacy History");
        tabPharmacyTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabPharmacyTableActionPerformed(evt);
            }
        });
        jMenu9.add(tabPharmacyTable);
        jMenu9.add(jSeparator15);

        tabOPDTable.setText("OPD Registrations History");
        tabOPDTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabOPDTableActionPerformed(evt);
            }
        });
        jMenu9.add(tabOPDTable);

        jMenu8.add(jMenu9);
        jMenu8.add(jSeparator9);

        jMenu10.setText("Reports");

        tabGenerateReport.setText("Generate Report/Print");
        tabGenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabGenerateReportActionPerformed(evt);
            }
        });
        jMenu10.add(tabGenerateReport);

        jMenu8.add(jMenu10);

        jMenuBar1.add(jMenu8);

        jMenu2.setText("Tools");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        tabChangePass.setText("Change Password");
        tabChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabChangePassActionPerformed(evt);
            }
        });
        jMenu2.add(tabChangePass);
        jMenu2.add(jSeparator11);

        tabNewUser.setText("Add New User");
        tabNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabNewUserActionPerformed(evt);
            }
        });
        jMenu2.add(tabNewUser);
        jMenu2.add(jSeparator16);

        tabEChannel.setText("eChannelling");
        tabEChannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabEChannelActionPerformed(evt);
            }
        });
        jMenu2.add(tabEChannel);

        tabConfigModem.setText("Configure Modem");
        tabConfigModem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabConfigModemActionPerformed(evt);
            }
        });
        jMenu2.add(tabConfigModem);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Help");

        tabHelp.setText("Help");
        tabHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabHelpActionPerformed(evt);
            }
        });
        jMenu5.add(tabHelp);
        jMenu5.add(jSeparator3);

        tabAbout.setText("About");
        tabAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabAboutActionPerformed(evt);
            }
        });
        jMenu5.add(tabAbout);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabChangePassActionPerformed
        try {
            ChangeLoginPass changeLoginPass = new ChangeLoginPass();
            changeLoginPass.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_tabChangePassActionPerformed

    private void tabAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabAboutActionPerformed

        About about = new About();
        about.setVisible(true);

    }//GEN-LAST:event_tabAboutActionPerformed

    private void tabHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabHelpActionPerformed
        JOptionPane.showMessageDialog(this, "Open MRM System is a Project of Durapix.org.\nIf you have any problem/troubleshoot/to get clarify with this software component,\nplease contact Durapix Support Team or visit www.durapix.org/openmrm", "Open MRM System", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_tabHelpActionPerformed

    private void tabExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabExitActionPerformed
        int more = JOptionPane.YES_OPTION;
        more = JOptionPane.showConfirmDialog(null, "Are you sure want to Exit?", "Open MRM System", JOptionPane.YES_NO_OPTION);
        if (more == JOptionPane.YES_OPTION) {
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_tabExitActionPerformed

    private void tabAddNewChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabAddNewChannelActionPerformed
        try {
            ChannelOperations channelOperations = new ChannelOperations();
            channelOperations.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabAddNewChannelActionPerformed

    private void tabProducts_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabProducts_SaveActionPerformed
        try {
            Drug drug = new Drug();
            drug.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabProducts_SaveActionPerformed

    private void tabUpdateChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabUpdateChannelActionPerformed
        try {
            ChannelOperationsUpdate channelOperationsUpdate = new ChannelOperationsUpdate();
            channelOperationsUpdate.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tabUpdateChannelActionPerformed

    private void tabAddDoctor_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabAddDoctor_SaveActionPerformed
        try {
            Doctors doctors = new Doctors();
            doctors.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabAddDoctor_SaveActionPerformed

    private void tabAddDoctor_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabAddDoctor_EditActionPerformed
        try {
            DoctorsEdit doctorsEdit = new DoctorsEdit();
            doctorsEdit.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tabAddDoctor_EditActionPerformed

    private void tabProducts_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabProducts_EditActionPerformed
        try {
            DrugEdit drugEdit = new DrugEdit();
            drugEdit.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tabProducts_EditActionPerformed

    private void tabDrugsProductsTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabDrugsProductsTableActionPerformed
        TableDrugs tableDrugs = new TableDrugs();
        tableDrugs.setVisible(true);
    }//GEN-LAST:event_tabDrugsProductsTableActionPerformed

    private void tabPatientsTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabPatientsTableActionPerformed
        TablePatients tablePatients = new TablePatients();
        tablePatients.setVisible(true);
    }//GEN-LAST:event_tabPatientsTableActionPerformed

    private void tabChannelingTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabChannelingTableActionPerformed
        TableChanneling tableChanneling = new TableChanneling();
        tableChanneling.setVisible(true);
    }//GEN-LAST:event_tabChannelingTableActionPerformed

    private void tabOPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabOPDActionPerformed
        try {
            OPDRegistrations oPDRegistrations = new OPDRegistrations();
            oPDRegistrations.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabOPDActionPerformed

    private void tabUpdateOPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabUpdateOPDActionPerformed
        try {
            OPDRegistrationsUpdate oPDRegistrationsUpdate = new OPDRegistrationsUpdate();
            oPDRegistrationsUpdate.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabUpdateOPDActionPerformed

    private void tabPharmacyTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabPharmacyTableActionPerformed
        try {
            TablePharmacy pharmacy = new TablePharmacy();
            pharmacy.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabPharmacyTableActionPerformed

    private void tabNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabNewUserActionPerformed
        try {
            AddNewLogin addNewLogin = new AddNewLogin();
            addNewLogin.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabNewUserActionPerformed

    private void tabGenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabGenerateReportActionPerformed

        ReportsCenter reportsCenter = new ReportsCenter();
        reportsCenter.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_tabGenerateReportActionPerformed

    private void menuOPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOPDActionPerformed
        try {
            OPDRegistrations oPDRegistrations = new OPDRegistrations();
            oPDRegistrations.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuOPDActionPerformed

    private void menuChannellingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuChannellingActionPerformed
        try {
            ChannelOperations channelOperations = new ChannelOperations();
            channelOperations.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_menuChannellingActionPerformed

    private void menuPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPharmacyActionPerformed
        try {
            PharmacyTransactions pharmacyTransactions = new PharmacyTransactions();
            pharmacyTransactions.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }            // TODO add your handling code here:
    }//GEN-LAST:event_menuPharmacyActionPerformed

    private void menuDrugsAndProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDrugsAndProductsActionPerformed
        try {
            Drug drug = new Drug();
            drug.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }                // TODO add your handling code here:
    }//GEN-LAST:event_menuDrugsAndProductsActionPerformed

    private void menuReportGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportGenActionPerformed
        ReportsCenter reportsCenter = new ReportsCenter();
        reportsCenter.setVisible(true);
    }//GEN-LAST:event_menuReportGenActionPerformed

    private void menuEChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEChannelActionPerformed
        EChannelling eChannelling = new EChannelling();
        eChannelling.setVisible(true);
    }//GEN-LAST:event_menuEChannelActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        int more = JOptionPane.YES_OPTION;
        more = JOptionPane.showConfirmDialog(null, "Are you sure want to Exit?", "Open MRM System", JOptionPane.YES_NO_OPTION);
        if (more == JOptionPane.YES_OPTION) {
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuLockScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLockScreenActionPerformed
        try {
            JOptionPane.showMessageDialog(this, "System Locked! Press OK to Release", "Open MRM System", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            dispose();
            Login login = new Login();
            login.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuLockScreenActionPerformed

    private void tabPatients_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabPatients_SaveActionPerformed
        try {
            Patients patients = new Patients();
            patients.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabPatients_SaveActionPerformed

    private void tabPatients_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabPatients_EditActionPerformed
        try {
            PatientsEdit patientsEdit = new PatientsEdit();
            patientsEdit.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tabPatients_EditActionPerformed

    private void tabDoctorsTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabDoctorsTableActionPerformed
        TableDoctors tableDoctors = new TableDoctors();
        tableDoctors.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_tabDoctorsTableActionPerformed

    private void tabPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabPharmacyActionPerformed
        try {
            PharmacyTransactions pharmacyTransactions = new PharmacyTransactions();
            pharmacyTransactions.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabPharmacyActionPerformed

    private void tabPharmacyUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabPharmacyUpdateActionPerformed
        try {
            PharmacyTransactionsUpdate pharmacyTransactionsUpdate = new PharmacyTransactionsUpdate();
            pharmacyTransactionsUpdate.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabPharmacyUpdateActionPerformed

    private void tabChannelingTableActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabChannelingTableActionPerformed1
        try {
            TableChanneling tableChanneling = new TableChanneling();
            tableChanneling.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tabChannelingTableActionPerformed1

    private void tabOPDTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabOPDTableActionPerformed
        try {
            TableOPD tableOPD = new TableOPD();
            tableOPD.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tabOPDTableActionPerformed

    private void tabEChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabEChannelActionPerformed
        EChannelling eChannelling = new EChannelling();
        eChannelling.setVisible(true);
    }//GEN-LAST:event_tabEChannelActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void tabConfigModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabConfigModemActionPerformed
        ConfigModem configModem = new ConfigModem();
        configModem.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_tabConfigModemActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JButton menuChannelling;
    private javax.swing.JButton menuDrugsAndProducts;
    private javax.swing.JButton menuEChannel;
    private javax.swing.JButton menuExit;
    private javax.swing.JButton menuLockScreen;
    private javax.swing.JButton menuOPD;
    private javax.swing.JButton menuPharmacy;
    private javax.swing.JButton menuReportGen;
    private javax.swing.JMenuItem tabAbout;
    private javax.swing.JMenuItem tabAddDoctor_Edit;
    private javax.swing.JMenuItem tabAddDoctor_Save;
    private javax.swing.JMenuItem tabAddNewChannel;
    private javax.swing.JMenuItem tabChangePass;
    private javax.swing.JMenuItem tabChannelingTable;
    private javax.swing.JMenuItem tabConfigModem;
    private javax.swing.JMenu tabCreditCard111;
    private javax.swing.JMenuItem tabDoctorsTable;
    private javax.swing.JMenuItem tabDrugsProductsTable;
    private javax.swing.JMenuItem tabEChannel;
    private javax.swing.JMenuItem tabExit;
    private javax.swing.JMenuItem tabGenerateReport;
    private javax.swing.JMenuItem tabHelp;
    private javax.swing.JMenuItem tabNewUser;
    private javax.swing.JMenuItem tabOPD;
    private javax.swing.JMenuItem tabOPDTable;
    private javax.swing.JMenuItem tabPatientsTable;
    private javax.swing.JMenuItem tabPatients_Edit;
    private javax.swing.JMenuItem tabPatients_Save;
    private javax.swing.JMenuItem tabPharmacy;
    private javax.swing.JMenuItem tabPharmacyTable;
    private javax.swing.JMenuItem tabPharmacyUpdate;
    private javax.swing.JMenuItem tabProducts_Edit;
    private javax.swing.JMenuItem tabProducts_Save;
    private javax.swing.JMenuItem tabUpdateChannel;
    private javax.swing.JMenuItem tabUpdateOPD;
    private javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
}
