package com.example.java.propertiesfile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by maiq on 29/08/17.
 */

public class WritePropertiesFile {

    private static Properties properties = new Properties();

    public static void writeToFile() throws IOException {

        //FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf(WritePropertiesFile.class.getClassLoader().getResourceAsStream("configTwo.properties")));
        properties.setProperty("name", "Mohammad");
        properties.setProperty("company", "Sprinklr");
        properties.setProperty("location", "Gurgaon");
        properties.setProperty("pin", String.valueOf(122004));
        properties.setProperty("country", "India");

        //String filePath = String.valueOf(WritePropertiesFile.class.getClassLoader().getResourceAsStream("configTwo.properties"));

        try {
            properties.store(new FileOutputStream("src/main/resources/configTwo.properties"), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        try {
            WritePropertiesFile.writeToFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
