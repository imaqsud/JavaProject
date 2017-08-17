package com.example.java;

/**
 * Created by maiq on 31/07/17.
 */

interface JavaEightInterfaceTwo{

    public void execute();
}

class JavaEightTwo implements JavaEightInterfaceTwo{

    public void execute(){

        System.out.println("Executing interface method");
    }

    public void run(){

        System.out.println("Hello, its amazing");
        execute();
    }
}

interface JavaEightInterface{

    void execute();
}

class JavaEight {

    public void run(JavaEightInterface j){

        System.out.println("using java 8....");

        j.execute();
    }
}
public class JavaEightFirst {

    public static void main(String[] args) {


        JavaEightTwo javaEightTwo = new JavaEightTwo();
        javaEightTwo.run();
        javaEightTwo.execute();
        System.out.println();

        JavaEight javaEight = new JavaEight();
        javaEight.run(new JavaEightInterface() {
            @Override
            public void execute() {

                System.out.println("Hi, its a method of JavaEightInterface");
            }
        });

    }
}
