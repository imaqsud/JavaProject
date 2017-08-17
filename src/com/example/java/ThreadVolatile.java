package com.example.java;

import java.util.Scanner;

/**
 * Created by maiq on 27/07/17.
 */

class AppSecond extends Thread{

    private volatile boolean isTrue = true;

    @Override
    public void run(){

        while (isTrue){
            System.out.println("Hey, do it by tomorrow.");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopExecution(){

        isTrue = false;
    }
}
public class ThreadVolatile {

    public static void main(String[] args) {

        AppSecond appSecond = new AppSecond();
        appSecond.start();

        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();

        appSecond.stopExecution();
    }
}
