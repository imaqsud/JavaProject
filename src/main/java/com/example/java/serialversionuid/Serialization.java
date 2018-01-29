package com.example.java.serialversionuid;

import java.io.*;

/**
 * Created by maiq on 29/01/18.
 */
public class Serialization {


    public static void main(String[] args) throws IOException {

        Employee employee = new Employee();
        employee.setId(101L);
        employee.setName("Maiq");
        employee.setAddress("Gurgaon");

        FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/employee.obj");
        ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
        os.writeObject(employee);
        os.close();
    }
}
