package com.example.java;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/**
 * Created by maiq on 28/07/17.
 */
public class HashMapFirst {

    private Map<Integer, String> map = new HashMap<Integer, String>();

    public void insertElements(){
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
    }

    public void getElements(){
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() +": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapFirst hashMapFirst = new HashMapFirst();
        hashMapFirst.insertElements();
        hashMapFirst.getElements();

    }
}
