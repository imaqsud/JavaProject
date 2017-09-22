package com.example.java.calendaranddate;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by maiq on 22/09/17.
 */
public class DateTest {

    public static void main(String[] args) {

        Date now = new Date();

        System.out.println(now);

        System.out.println(now.toString());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, y-M-d h:m:s a z");
        System.out.println(simpleDateFormat.format(now));

        System.out.println(now.getTime());
    }
}
