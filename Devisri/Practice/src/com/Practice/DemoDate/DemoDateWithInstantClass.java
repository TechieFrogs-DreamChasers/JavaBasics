package com.Practice.DemoDate;

import java.time.Duration;
import java.time.Instant;

/*
Instant class is used to work with machine-readable time format.
Instant stores date time in unix timestamp.
 */
public class DemoDateWithInstantClass {
    public static void main(String[] args) {
        //Current time
        Instant time = Instant.now();
        System.out.println("Current timestamp: " + time);
        //From time
        Instant specificTime = Instant.ofEpochMilli(time.toEpochMilli());
        System.out.println("Specific Time: " + specificTime);
        //Duration Class Example
        Duration duration = Duration.ofDays(60);
        System.out.println("Duration of 60 days: " + duration);//PT1440H
        Duration duration2 = Duration.ofHours(120);
        System.out.println("Duration of 60 days: " + duration2);//PT120H
    }
}
