package com.example.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by maiq on 02/08/17.
 */

public class WriteObjectSerializable {

    public static void main(String[] args) {


        Person person = new Person(101, "Maiq");
        Person personOne = new Person(102, "Yash");

        try (FileOutputStream fileOutputStream = new FileOutputStream("Person.bin")) {

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(person);
            objectOutputStream.writeObject(personOne);

            objectOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
