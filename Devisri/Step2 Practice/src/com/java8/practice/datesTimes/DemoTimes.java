package com.java8.practice.datesTimes;

import java.time.LocalTime;

public class DemoTimes {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Time: "+time);
        System.out.println("Hour: "+time.getHour());
        System.out.println("Minute: "+time.getMinute());
        System.out.println("Second: "+time.getSecond());
        System.out.println("NanoSecond: "+time.getNano());
        System.out.println(time.toSecondOfDay());
        System.out.println("Time after 15 Hours: "+time.plusHours(5));
        System.out.println("Time after 15 minutes: "+time.plusMinutes(5));
        System.out.println("Time after 15 seconds: "+time.plusSeconds(5));
        System.out.println("Time before 15 Hours: "+time.minusHours(5));
        System.out.println("Time before 15 minutes: "+time.minusMinutes(5));
        System.out.println("Time before 15 seconds: "+time.minusSeconds(5));
        System.out.println("Time before 15 nanoseconds: "+time.minusNanos(5));
    }
}
