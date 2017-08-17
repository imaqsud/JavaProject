package com.example.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by maiq on 30/07/17.
 */

class PeopleClass implements Comparable<PeopleClass>{

    private int id;
    private String name;

    public PeopleClass(int id, String name){

        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "PeopleClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PeopleClass that = (PeopleClass) o;

        if (id != that.id) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(PeopleClass o) {

        //return this.getId().compareTo(o.getId());
        if (this.id > o.id){
            return 1;
        }
        else if (this.id < o.id){
            return -1;
        }
        return 0;
    }
}



class ReverseAlphabeticalOrder implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}


class AlphabeticalOrder implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {

        return o1.compareTo(o2);
    }
}

class SortStringListByLength implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {

        if (o1.length() > o2.length()){
            return -1;
        }

        else if (o1.length() < o2.length()){
            return 1;
        }
        return 0;
    }
}

public class SortingFirst {

    private List<String> list = new ArrayList<String>();

    private List<Integer> integerList = new ArrayList<Integer>();

    void insertIntegerList(){

        integerList.add(11);
        integerList.add(111);
        integerList.add(101);
        integerList.add(2222);
        integerList.add(908);
        integerList.add(786);
        integerList.add(654);
        integerList.add(453);
        integerList.add(342);
        integerList.add(1324);
        integerList.add(90864);
        integerList.add(65365);
        integerList.add(1);
        integerList.add(76);
    }

    void sortIntegerList(){

        Collections.sort(integerList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
    }

    void printIntegerList(){

        for (Integer number:integerList){

            System.out.println(number);
        }
    }

    void insertElements(){

        list.add("Zebra");
        list.add("Dog");
        list.add("Elephant");
        list.add("Cow");
        list.add("Mongoose");
        list.add("Goat");
        list.add("Buffalo");
        list.add("Cockroach");
        list.add("Hen");
        list.add("kmkncas");
        list.add("olkkjbs");
        list.add("amknkjd");
    }

    void sortList(){

        Collections.sort(list, new ReverseAlphabeticalOrder());
    }

    void printList(){

        for (String animal:list){

            System.out.println(animal);
        }
    }

    public static void main(String[] args) {

        List<PeopleClass> peopleClasses = new ArrayList<PeopleClass>();

        peopleClasses.add(new PeopleClass(901, "Maiq"));
        peopleClasses.add(new PeopleClass(7131, "Maiq1"));
        peopleClasses.add(new PeopleClass(22111, "Maiq2"));
        peopleClasses.add(new PeopleClass(201, "Maiq3"));
        peopleClasses.add(new PeopleClass(301, "Maiq4"));
        peopleClasses.add(new PeopleClass(001, "Maiq5"));
        peopleClasses.add(new PeopleClass(801, "Maiq6"));
        peopleClasses.add(new PeopleClass(1301, "Maiq7"));
        peopleClasses.add(new PeopleClass(1881, "Maiq8"));

        for (PeopleClass peopleClass:peopleClasses){

            System.out.println(peopleClass);
        }

        SortingFirst sortingFirst = new SortingFirst();

        sortingFirst.insertElements();
        sortingFirst.sortList();
        sortingFirst.printList();

        System.out.println();

        sortingFirst.insertIntegerList();
        sortingFirst.sortIntegerList();
        sortingFirst.printIntegerList();

    }
}
