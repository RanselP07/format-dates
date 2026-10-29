package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {

    static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter american = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter iso = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String date = today.getDayOfWeek() + ", " + today.getMonth() + " " + today.getDayOfMonth() + ", " + today.getYear();
        String dateTime = date + " " + today.getHour() + ":" + today.getMinute();

        System.out.println(today.format(american));
        System.out.println(today.format(iso));
        System.out.println(date);
        System.out.println(dateTime);
    }

}
