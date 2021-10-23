package com.Practice.DemoDate;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.zone.ZoneRulesException;

/*
* LocalTime is an immutable class whose instance represents a time in the human-readable format.
* It’s default format is hh:mm:ss.zzz. Just like LocalDate, this class provides time zone support
and creating instance by passing hour, minute and second as input arguments.
 */
public class DemoDateWithLocalTimeClass {
    public static void main(String[] args) {
        //Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        //Creating specific time of the day
        LocalTime localTime = LocalTime.of(05, 56, 30, 3600);
        System.out.println("Specific Time: " + localTime);//05:56:30.000003600

        //Invalid Input
        try {
            LocalTime localTime1 = LocalTime.of(25, 30);
            System.out.println("Specified Time: " + localTime1);
        } catch (DateTimeException e) {
            System.out.println(e.getMessage());//Invalid value for HourOfDay (valid values 0 - 23): 25
        }

        //Zonal Time
        LocalTime time1 = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current time with Indian Zone: " + time1);

        //Using time Zone IST raises Exception
        try {
            LocalTime ist = LocalTime.now(ZoneId.of("IST"));
            System.out.println("Current time with Indian Zone: " + ist);
        } catch (ZoneRulesException e) {
            System.out.println(e.getMessage());//Unknown time-zone ID: IST
        }

        //Getting specific second of the day
        LocalTime time2 = LocalTime.ofSecondOfDay(10000);
        System.out.println("Specific Second: " + time2);//02:46:40
    }
}
