package com.example.java.serialversionuid;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by maiq on 29/01/18.
 */
public class Deserialization {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("src/main/resources/employee.obj");
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);
        Employee employee = (Employee) ois.readObject();
        ois.close();
        System.out.println(employee);
    }
}
