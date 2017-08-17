package com.example.java;

/**
 * Created by maiq on 31/07/17.
 */

interface JavaEightSecondInterfaceTwo{

    void execute(int number1, int number2);
}


interface JavaEightSecondInterface{

    void execute();
}

class JavaEightSecondTwo {

    public void run(JavaEightSecondInterface j){

        System.out.println("Running java 8....");

        j.execute();

    }
}
public class JavaEightSecond {

    public static void main(String[] args) {

        JavaEightSecondTwo javaEightSecondTwo = new JavaEightSecondTwo();

        javaEightSecondTwo.run(() -> {
            System.out.println("Running java 8 lambda expression...");
            System.out.println("Nice to think about it !");
        });

    }
}
