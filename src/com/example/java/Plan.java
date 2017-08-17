package com.example.java;

/**
 * Created by maiq on 24/07/17.
 */
abstract public class Plan {

    protected double rate;
    abstract void getRate();
    public void getBill(int units){
        System.out.println(units*rate);
    }
}
