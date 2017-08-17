package com.example.java;

/**
 * Created by maiq on 27/07/17.
 */

public class ThreadConCurrentAccess {

    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public void doWork(){

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i=1; i<=10; i++){
                    increment();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1; i<=10; i++){
                    increment();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();
        threadOne.start();

        try {
            thread.join();
            threadOne.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(count);

    }

    public static void main(String[] args) {

            ThreadConCurrentAccess threadConCurrentAcces = new ThreadConCurrentAccess();

            threadConCurrentAcces.doWork();
    }

}
