package com.example.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by maiq on 27/07/17.
 */
public class ArrayListAndLinkedList {

    private List<Integer> arrayList = new ArrayList<Integer>();

    private List<Integer> linkedList = new LinkedList<Integer>();

    public void calculateTimings(List<Integer> list){
       double startOne = System.currentTimeMillis();

       for (int i=1; i<=1E5; i++){
           list.add(0, i);
       }

       double endOne = System.currentTimeMillis();

        System.out.println(endOne-startOne);



        double startTwo = System.currentTimeMillis();

        for (int i=1; i<=1E5; i++){
            list.add(i);
        }

        double endTwo = System.currentTimeMillis();

        System.out.println(endTwo-startTwo);
    }

    public static void main(String[] args) {

        ArrayListAndLinkedList arrayListAndLinkedList = new ArrayListAndLinkedList();

        arrayListAndLinkedList.calculateTimings(arrayListAndLinkedList.arrayList);

        arrayListAndLinkedList.calculateTimings(arrayListAndLinkedList.linkedList);
    }
}
