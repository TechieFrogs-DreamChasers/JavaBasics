package com.java8.practice.datesTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemoDateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date Time: "+localDateTime);

        String date = "Apr 02 2021";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM DD YYYY");
        LocalDate localDate = LocalDate.parse(date,format);
        //System.out.println("String to Date: "+localDate);

    }
}
