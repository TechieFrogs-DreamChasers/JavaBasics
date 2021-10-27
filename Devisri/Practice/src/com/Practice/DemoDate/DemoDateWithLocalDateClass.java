package com.Practice.DemoDate;

import java.time.*;

//LocalDate is an immutable class that represents Date with default format of yyyy-MM-dd.
// We can use now() method to get the current date.
// We can also provide input arguments for year, month and date to create LocalDate instance.
//This class provides an overloaded method for now() where we can pass ZoneId for getting dates in a
//specific time zone. This class provides the same functionality as java.sql.Date.
public class DemoDateWithLocalDateClass {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);//2021-10-23

        LocalDate day = LocalDate.of(1992, Month.MARCH, 15);
        System.out.println("Date Representation of given: " + day);//1992-03-15
        //With invalid input
        try {
            LocalDate input = LocalDate.of(2021, 2, 29);
            System.out.println("February Date: " + input);
        } catch (DateTimeException e) {
            System.out.println(e.getMessage());//Invalid date 'February 29' as '2021' is not a leap year
        }

        LocalDate todayAp = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current date with Indian Zone: " + todayAp);//2021-10-23

        LocalDate date = LocalDate.ofEpochDay(365);
        System.out.println("Base Date: " + date);//1971-01-01

        LocalDate twoHundred = LocalDate.ofYearDay(2021, 200);
        System.out.println("The 200th date of 2021: " + twoHundred);//2021-07-19

    }
}
