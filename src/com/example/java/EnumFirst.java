package com.example.java;

/**
 * Created by maiq on 01/08/17.
 */
public enum  EnumFirst {

    CAT("LeoTrait"), DOG("Jhabra"), GOAT("Boghati"), COW("Mata Rani"), ELEPHANT("Big one");

    private String name;

    EnumFirst(String name){

        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "This is the right format to show the name: " + name;
    }
}
