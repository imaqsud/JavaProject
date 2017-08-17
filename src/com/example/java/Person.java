package com.example.java;

import java.io.Serializable;

/**
 * Created by maiq on 02/08/17.
 */

public class Person implements Serializable{

    private int id;
    private String name;

    Person(int id, String name){

        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
