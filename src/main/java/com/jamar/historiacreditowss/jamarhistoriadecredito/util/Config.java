/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamar.historiacreditowss.jamarhistoriadecredito.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ruthford Jay Archbold
 * @since 2020-10-19
 * @version 3.0
 */
public final class Config {

    private String user;
    private String password;
    private String endPoint;
    private Boolean useTestFile;
    private String testFile;

    public Config() {
        try {
            setConfigValues();
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setConfigValues() throws IOException {
        InputStream inputStream = null;
        try {
            Properties prop = new Properties();
            String propFileName = "config.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
            // get the property value and print it out
            user = prop.getProperty("datacredito.webservice.user");
            password = prop.getProperty("datacredito.webservice.pswd");
            endPoint = prop.getProperty("datacredito.webservice.endpoint");
            useTestFile = Converter.convertStringToBoolean(prop.getProperty("datacredito.webservice.used.test.file"));
            testFile = prop.getProperty("datacredito.webservice.test.file");
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public Boolean getUseTestFile() {
        return useTestFile;
    }

    public void setUseTestFile(Boolean useTestFile) {
        this.useTestFile = useTestFile;
    }

    public String getTestFile() {
        return testFile;
    }

    public void setTestFile(String testFile) {
        this.testFile = testFile;
    }

}
