package com.sliit.openmrm.db;

import org.apache.log4j.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader {
    private static Logger logger = Logger.getLogger(PropertyLoader.class);
    public static Properties properties = new Properties();
    public static String dbName = null;
    public static String dbUser = null;
    public static String dbPass = null;

    public PropertyLoader() {
        try {
            InputStream inputStream = PropertyLoader.class.getResourceAsStream("/resources/props/mrm.properties");
            properties.load(inputStream);
            getDbProperties();
        } catch (IOException e) {
            logger.error("Error occurred while reading the properties file");
        }
    }

    private static void getDbProperties() {
        try {
            dbUser = properties.getProperty("db.user");
            dbPass = properties.getProperty("db.pass");
            dbName = properties.getProperty("db.name");
        } catch (Exception e) {
        }
    }

    public static void setDbProperties(String name, String user, String pass) {
        try {
            properties.setProperty("db.name", name);
            properties.setProperty("db.user", user);
            properties.setProperty("db.pass", pass);
//            properties.store(new FileOutputStream("/resources/props/fuel.properties"), null);
        } catch (Exception e) {
        }
    }
}
