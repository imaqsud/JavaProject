package com.example.java;

/**
 * Created by maiq on 25/07/17.
 */

public class PrintReferenceOfVariable implements Cloneable{

    int numberOne, numberTwo;

    public static void main(String[] args) throws CloneNotSupportedException {

        //String string = new String("Hello");
        PrintReferenceOfVariable printReferenceOfVariable = new PrintReferenceOfVariable();

        System.out.println(printReferenceOfVariable);

        printReferenceOfVariable.numberOne = 10;
        printReferenceOfVariable.numberTwo = 20;

        System.out.println(printReferenceOfVariable.hashCode());

        PrintReferenceOfVariable printReferenceOfVariable1 = new PrintReferenceOfVariable();

        //printReferenceOfVariable1 = (PrintReferenceOfVariable) printReferenceOfVariable.clone();

        System.out.println(printReferenceOfVariable.equals(printReferenceOfVariable1));
        //System.out.println();


        System.out.println(printReferenceOfVariable.getClass());

        System.out.println(printReferenceOfVariable.toString());

        System.out.println(printReferenceOfVariable.numberOne);
        System.out.println(printReferenceOfVariable.numberTwo);

        printReferenceOfVariable1 = (PrintReferenceOfVariable) printReferenceOfVariable.clone();

        System.out.println(printReferenceOfVariable1);

        System.out.println(printReferenceOfVariable1.numberOne);
        System.out.println(printReferenceOfVariable1.numberTwo);
    }

}
