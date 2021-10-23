package com.Practice.DemoDate;

import java.time.*;

/*
LocalDateTime is an immutable date-time object that represents a date-time with default format
as yyyy-MM-dd-HH-mm-ss.zzz.
It provides a factory method that takes LocalDate and LocalTime input arguments to create
LocalDateTime instance.
 */
public class DemoDateWithLocalDateTimeClass {
    public static void main(String[] args) {
        //Current Date & Time
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Current Date & Time: " + today);

        //Current Date & Time using LocalDate,LocalTime as arguments
        LocalDateTime dateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("Current Date & Time together: " + dateTime);

        //Specific date & time
        LocalDateTime localDateTime = LocalDateTime.of(1992, Month.MARCH, 15, 4, 30, 26, 13000);
        System.out.println("Specified Date & Time: " + localDateTime);//1992-03-15T04:30:26.000013

        //Date & Time using Zonal id
        LocalDateTime local = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Zonal Date & Time: " + local);

        LocalDateTime localDateTime1 = LocalDateTime.ofEpochSecond(10000, 0, ZoneOffset.UTC);
        System.out.println("OfEpochSecond: " + localDateTime1);
    }
}
