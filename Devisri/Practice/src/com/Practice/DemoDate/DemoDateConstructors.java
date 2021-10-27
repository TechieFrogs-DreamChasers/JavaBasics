package com.Practice.DemoDate;

import java.util.Date;
/*
* Date Time API is one of the biggest features of Java 8 release.
* We have Date Class in both java.util and java.sql packages.
* Again formatting and parsing classes are defined in java.text package.
* Usually, the SimpleDateFormat class is used for parsing and formatting.
* java.util.Calendar and java.util.TimeZone classes were introduced.
* All the classes in the new Date-Time API are immutable and good for multithreaded environments.
* It defines separate classes for Date, Time, DateTime, Timestamp, Timezone, etc.
* All the classes use Factory Pattern and Strategy Pattern for better handling.
* All the new Date-Time API classes come with methods to perform common tasks,
such as plus, minus, format, parsing, getting the separate part in date/time, etc.
 */

public class DemoDateConstructors {
    public static void main(String[] args) {
        //first Constructor
        //Allocates a Date object and initializes it so that it represents the time at which it was allocated,
        // measured to the nearest millisecond.
        Date date=new Date();
        System.out.println(date);
        //Second Constructor
        //Allocates a Date object and initializes it to represent the specified number of milliseconds since the
        // standard base time known as "the epoch", namely January 1, 1970, 00:00:00 GMT.
        Date date2=new Date(5);
        System.out.println(date2);
    }
}
