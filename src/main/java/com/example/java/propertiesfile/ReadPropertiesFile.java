package com.example.java.propertiesfile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by maiq on 29/08/17.
 */

public class ReadPropertiesFile {

    private Properties properties = null;
    private InputStream inputStream = null;

    public ReadPropertiesFile() throws IOException {

        properties = new Properties();
        inputStream = ReadPropertiesFile.class.getClassLoader().getResourceAsStream("configOne.properties");

        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getName(){

        return properties.getProperty("name");
    }

    public String getCompany(){

        return properties.getProperty("company");
    }

    public String getDesignation(){

        return properties.getProperty("designation");
    }

    public String getLocation(){

        return properties.getProperty("location");
    }

    public String getState(){

        return properties.getProperty("state");
    }

    public String getPin(){

        return properties.getProperty("pin");
    }

    public String getCountry(){

        return properties.getProperty("country");
    }

}
