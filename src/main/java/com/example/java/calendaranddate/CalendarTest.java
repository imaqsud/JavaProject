package com.example.java.calendaranddate;

import java.util.Calendar;

/**
 * Created by maiq on 22/09/17.
 */
public class CalendarTest {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        System.out.println(calendar.toString());

        System.out.println(calendar.getTimeZone());
        System.out.println(calendar.getCalendarType());
        System.out.println(calendar.getFirstDayOfWeek());
        System.out.println(calendar.getTimeInMillis());
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));

        System.out.println(calendar.get(Calendar.MONDAY));
        System.out.println(calendar.get(Calendar.SUNDAY));
    }
}
