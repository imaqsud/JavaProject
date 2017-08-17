package com.example.java;

import java.util.Scanner;

/**
 * Created by maiq on 01/08/17.
 */

public class SwitchFirst {

    public static final int CAT = 0;
    public static final int DOG = 1;
    public static final int GOAT = 2;
    public static final int COW = 3;
    public static final int ELEPHANT = 4;

    public static void main(String[] args) {

        // SwitchFirstTwo switchFirstTwo = new SwitchFirstTwo();

        int animal;

        Scanner scanner = new Scanner(System.in);
        animal = scanner.nextInt();

        switch (animal) {
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case GOAT:
                System.out.println("Goat");
                break;
            case COW:
                System.out.println("Cow");
                break;
            case ELEPHANT:
                System.out.println("Elephant");
                break;
            default:
                System.out.println("Invalid options");
                break;
        }


        System.out.println();

        EnumFirst enumFirst = EnumFirst.CAT;

        switch (enumFirst) {
            case CAT:
                System.out.println("cat");
                break;
            case DOG:
                System.out.println("dog");
                break;
            case GOAT:
                System.out.println("goat");
                break;
            case COW:
                System.out.println("cow");
                break;
            case ELEPHANT:
                System.out.println("elephant");
                break;
            default:
                System.out.println("Invalid options");
                break;
        }

        System.out.println();

        System.out.println(EnumFirst.CAT);
        System.out.println(EnumFirst.CAT.getName());
        System.out.println(EnumFirst.CAT.name());
        System.out.println(EnumFirst.CAT.getClass());
    }
}
