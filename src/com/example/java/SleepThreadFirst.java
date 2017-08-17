package com.example.java;

/**
 * Created by maiq on 26/07/17.
 */
public class SleepThreadFirst extends Thread {

    @Override
    public void run(){

        for (int i=1; i<=5; i++){

            try {
                Thread.sleep(1000);
            } catch (Exception e){
                System.out.println(e);
            }

            System.out.println(i);
        }

    }

    public static void main(String[] args) {

        SleepThreadFirst sleepThreadFirst = new SleepThreadFirst();
        SleepThreadFirst sleepThreadFirst1 = new SleepThreadFirst();

        sleepThreadFirst.start();
        sleepThreadFirst1.start();
    }
}