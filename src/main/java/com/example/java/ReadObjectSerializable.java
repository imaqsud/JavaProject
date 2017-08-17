package com.example.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by maiq on 02/08/17.
 */
public class ReadObjectSerializable {

    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream("Person.bin")) {

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person person = (Person) objectInputStream.readObject();
            Person person1 = (Person) objectInputStream.readObject();

            objectInputStream.close();


            System.out.println(person);
            System.out.println(person1);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
