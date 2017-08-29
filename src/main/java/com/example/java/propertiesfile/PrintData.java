package com.example.java.propertiesfile;

import java.io.IOException;

/**
 * Created by maiq on 29/08/17.
 */
public class PrintData {

    ReadPropertiesFile readPropertiesFile = new ReadPropertiesFile();

    public PrintData() throws IOException {
    }

    public void printData(){

        System.out.println(readPropertiesFile.getName());
        System.out.println(readPropertiesFile.getCompany());
        System.out.println(readPropertiesFile.getDesignation());
        System.out.println(readPropertiesFile.getLocation());
        System.out.println(readPropertiesFile.getState());
        System.out.println(readPropertiesFile.getPin());
        System.out.println(readPropertiesFile.getCountry());
    }

    public static void main(String[] args) throws IOException {

        PrintData printData = new PrintData();

        printData.printData();
    }
}
