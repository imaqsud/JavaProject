package com.example.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by maiq on 29/07/17.
 */

class DifferentMapsTwo{

    private Map<Integer, String> hashMap = new HashMap<Integer, String>();

    private Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

    private Map<Integer, String> treeMap = new TreeMap<Integer, String>();


     void insertHashMap(){

        hashMap.put(0, "zero");
        hashMap.put(11, "eleven");
        hashMap.put(2, "two");
        hashMap.put(13, "thirteen");
        hashMap.put(24, "twenty four");
    }

    void insertLinkedHashMap(){

        linkedHashMap.put(0, "zero");
        linkedHashMap.put(11, "eleven");
        linkedHashMap.put(2, "two");
        linkedHashMap.put(13, "thirteen");
        linkedHashMap.put(24, "twenty four");
    }

    void insertTreeMap(){

        treeMap.put(0, "zero");
        treeMap.put(11, "eleven");
        treeMap.put(2, "two");
        treeMap.put(13, "thirteen");
        treeMap.put(24, "twenty four");
    }

    void getHashMap(){

        for (Integer integer:hashMap.keySet()){
            System.out.println(integer+": "+hashMap.get(integer));
        }
    }

    void getLinkedHashMap(){

        for (Integer integer:linkedHashMap.keySet()){
            System.out.println(integer+": "+linkedHashMap.get(integer));
        }
    }


    void getTreeMap(){

        for (Integer integer:treeMap.keySet()){
            System.out.println(integer+": "+treeMap.get(integer));
        }
    }
}

public class DifferentMaps {

    public static void main(String[] args) {


        DifferentMapsTwo differentMapsTwo = new DifferentMapsTwo();

        differentMapsTwo.insertHashMap();

        differentMapsTwo.insertLinkedHashMap();

        differentMapsTwo.insertTreeMap();

        System.out.println("HashMap");
        differentMapsTwo.getHashMap();
        System.out.println();

        System.out.println("LinkedHashMap");
        differentMapsTwo.getLinkedHashMap();
        System.out.println();

        System.out.println("TreeMap");
        differentMapsTwo.getTreeMap();
    }
}
