package com.example.java;

/**
 * Created by maiq on 02/08/17.
 */

public class ToStringOverrideFirst {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "ToStringOverrideFirst{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        ToStringOverrideFirst toStringOverrideFirst = new ToStringOverrideFirst();
        toStringOverrideFirst.setId(101);
        toStringOverrideFirst.setName("Maiq");

        System.out.println(toStringOverrideFirst.getId());
        System.out.println(toStringOverrideFirst.getName());


        System.out.println(toStringOverrideFirst);

    }
}
