package com.example.java;

/**
 * Created by maiq on 25/07/17.
 */
public class RunInterfaceFirst {

    public static void main(String[] args) {

        InterfaceFirst interfaceFirst = new InterfaceFirstSubclass();

        interfaceFirst.getName("Mohammed");

        interfaceFirst.getId(101);

        interfaceFirst.getAddress("Whitefield");

        //InterfaceFirstSubclass interfaceFirstSubclass = new InterfaceFirstSubclass();

        interfaceFirst.showData();
    }
}
