package com.sliit.openmrm.ui.splash;

import com.sliit.openmrm.ui.Login;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.SplashScreen;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import com.sliit.openmrm.db.DBConnect;
import com.sliit.openmrm.db.PropertyLoader;
import javax.swing.JOptionPane;

public class Main {
    private static DBConnect dbConnect;
    private static Connection con;
    private static Statement stm;
    static SplashScreen mySplash;

    static Graphics2D splashGraphics;
    static Rectangle2D.Double splashTextArea;
    static Rectangle2D.Double splashProgressArea;
    static Font font;

    public static void main(String[] args) throws SQLException, UnsupportedLookAndFeelException, ParseException, ClassNotFoundException, InstantiationException, IllegalAccessException, MalformedURLException {
        try {
            splashInit();
            appInit();
            if (mySplash != null) {
                mySplash.close();
                Login login = new Login();
                login.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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

    private static void appInit() throws SQLException {
        for (int i = 1; i <= 5; i++) {
            int pctDone = i * 20;
            splashText("System Starting..");
            splashProgress(pctDone);

            if (i == 3) {
                splashText("Checking DB Connection..");
                if (!checkDBConnection()) {
                    int more = JOptionPane.YES_OPTION;
                    more = JOptionPane.showConfirmDialog(null, "Error Connecting to the Database! Do you like to Configure DB properties now?", "Lanka Fuel Mart CRM", JOptionPane.YES_NO_OPTION);
                    if (more == JOptionPane.YES_OPTION) {
                        String response = JOptionPane.showInputDialog(null, "Please type DB Name, user, pass Space by Space Accordingly..\neg: DB_FuelMart universl pass123", "Lanka Fuel Mart CRM" , JOptionPane.QUESTION_MESSAGE);
                        String parts[] = response.split(" ");
                        PropertyLoader.setDbProperties(parts[0], parts[1], parts[2]);
                        JOptionPane.showMessageDialog(null, "Thanks your Records Saved, Please Restart the System!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        System.exit(0);
                    }
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                break;
            }
        }
    }

    private static void splashInit() {
        mySplash = SplashScreen.getSplashScreen();
        if (mySplash != null) {
            Dimension ssDim = mySplash.getSize();
            int height = ssDim.height;
            int width = ssDim.width;
            splashTextArea = new Rectangle2D.Double(15., height * 0.88, width * .45, 32.);
            splashProgressArea = new Rectangle2D.Double(width * .55, height * .92, width * .4, 12);
            splashGraphics = mySplash.createGraphics();
            font = new Font("Dialog", Font.PLAIN, 14);
            splashGraphics.setFont(font);
            splashText("Starting");
            splashProgress(0);
        }
    }

    public static void splashText(String str) {
        if (mySplash != null && mySplash.isVisible()) {
            splashGraphics.setPaint(Color.LIGHT_GRAY);
            splashGraphics.fill(splashTextArea);
            splashGraphics.setPaint(Color.BLACK);
            splashGraphics.drawString(str, (int) (splashTextArea.getX() + 10), (int) (splashTextArea.getY() + 15));
            mySplash.update();
        }
    }

    public static void splashProgress(int pct) {
        if (mySplash != null && mySplash.isVisible()) {
            splashGraphics.setPaint(Color.LIGHT_GRAY);
            splashGraphics.fill(splashProgressArea);
            splashGraphics.setPaint(Color.BLUE);
            splashGraphics.draw(splashProgressArea);
            int x = (int) splashProgressArea.getMinX();
            int y = (int) splashProgressArea.getMinY();
            int wid = (int) splashProgressArea.getWidth();
            int hgt = (int) splashProgressArea.getHeight();
            int doneWidth = Math.round(pct * wid / 100.f);
            doneWidth = Math.max(0, Math.min(doneWidth, wid - 1));  // limit 0-width
            splashGraphics.setPaint(Color.GREEN);
            splashGraphics.fillRect(x, y + 1, doneWidth, hgt - 1);
            mySplash.update();
        }
    }
}
