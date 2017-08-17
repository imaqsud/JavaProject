package com.example.java;

/**
 * Created by maiq on 26/07/17.
 */
public class RunnableInterface implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread created using Runnable");
    }


    public static void main(String[] args) {
        RunnableInterface runnableInterface = new RunnableInterface();

        Thread thread = new Thread(runnableInterface);

        thread.start();
    }
}
