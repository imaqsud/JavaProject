package com.example.java;

/**
 * Created by maiq on 27/07/17.
 */
public class ThreadLockFirst {

    private int count = 0;

    private Object lockOne = new Object();
    private Object lockTwo = new Object();

    public void doWork(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockOne){
                    for (int i=1; i<=10; i++){
                        count++;
                    }
                }
            }
        });

        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockTwo){
                    for (int i=1; i<=10; i++){
                        count++;
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
        ThreadLockFirst threadLockFirst = new ThreadLockFirst();
        threadLockFirst.doWork();
    }
}
