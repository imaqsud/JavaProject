package com.example.java;

/**
 * Created by maiq on 25/07/17.
 */
public class InterfaceFirstSubclass implements InterfaceFirst {

    private String name;
    private int id;
    private String address;

    public void getName(String name){
        this.name = name;
    }

    public void getId(int id){
        this.id = id;
    }

    public void getAddress(String address){
        this.address = address;
    }

    public void showData(){
        System.out.println(name+" "+id+" "+address);
    }
}
