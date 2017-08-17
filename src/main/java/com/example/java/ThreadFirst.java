package com.example.java;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * Created by maiq on 26/07/17.
 */
public class ThreadFirst extends Thread {

    public void run(){
        System.out.println("First thread, I am creating");
    }


    public static void main(String[] args) {
        ThreadFirst threadFirst = new ThreadFirst();

        threadFirst.start();
    }


}
