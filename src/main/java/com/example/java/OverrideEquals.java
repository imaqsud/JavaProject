package com.example.java;

//import java.awt.print.Book;

import java.util.Objects;

/**
 * Created by maiq on 26/07/17.
 */
public class OverrideEquals {

    private String isbn;
    private double price;



    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof OverrideEquals)) {
            return false;
        }

        OverrideEquals overrideEquals = (OverrideEquals) o;

        return overrideEquals.isbn.equals(isbn);
    }


    @Override
    public int hashCode(){
        int hash = 13;
        hash = 31*hash+(this.isbn != null? this.isbn.hashCode():0);
        return hash;
    }



    public void getClassExample(OverrideEquals overrideEquals){

        System.out.println(overrideEquals.getClass().getSimpleName()+" "+overrideEquals.getClass().getName()+" "+overrideEquals.getClass().getTypeName()+" "+overrideEquals.getClass().getMethods()+" "+overrideEquals.getClass().getPackage());

    }


    public static void main(String[] args) {

       OverrideEquals overrideEqualsTwo = new OverrideEquals();
        overrideEqualsTwo.setIsbn("ISBN101");


        OverrideEquals overrideEqualsThree = new OverrideEquals();
        overrideEqualsThree.setIsbn("ISBN101");

        System.out.println(overrideEqualsTwo.equals(overrideEqualsThree));


        OverrideEquals overrideEqualsFour = new OverrideEquals();
        overrideEqualsFour.setIsbn("ISBN102");

        OverrideEquals overrideEqualsFive = new OverrideEquals();
        overrideEqualsFive.setIsbn("ISBN103");
        overrideEqualsFive.setPrice(599);

        System.out.println(overrideEqualsFour.equals(overrideEqualsFive));


        System.out.println(overrideEqualsFive.hashCode());



        //example of getClass method of Object class

        overrideEqualsFive.getClassExample(overrideEqualsFive);

    }
}
