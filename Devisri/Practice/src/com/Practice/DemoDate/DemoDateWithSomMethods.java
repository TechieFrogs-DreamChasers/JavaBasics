package com.Practice.DemoDate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class DemoDateWithSomMethods {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Its Year: " + today.getYear() + ". Is it a leap year: " + today.isLeapYear());

        //Comparing two dates
        System.out.println("Today is: " + today + ". Is it before 01/01/2022: "
                + today.isBefore(LocalDate.of(2022, Month.JANUARY, 01)));
        System.out.println("Today is: " + today + ". Is it After 01/01/2020: "
                + today.isAfter(LocalDate.of(2020, Month.JANUARY, 01)));

        //Create current Time from LocalTime
        System.out.println("Current Time: " + today.atTime(LocalTime.now()));
        //Operations +,-
        System.out.println("15 Days after today is: " + today.plusDays(15));//2021-11-07
        System.out.println("20 Weeks after today is: " + today.plusWeeks(20));//2022-03-12
        System.out.println("30 Months after today is: " + today.plusMonths(30));//2024-04-23

        System.out.println("30 Days Before today is: " + today.minusDays(30));//2021-09-23
        System.out.println("25 Weeks Before today is: " + today.minusWeeks(25));//2021-05-01
        System.out.println("15 Months Before today is: " + today.minusMonths(15));//2020-07-23

        //Period class
        LocalDate lastDay = today.with(TemporalAdjusters.lastDayOfYear());
        Period period = today.until(lastDay);
        System.out.println("Period: " + period);//P2M8D
        System.out.println("Remaining Months this year: " + period.getMonths());//2
        System.out.println("Remaining Days this Month: " + period.getDays());//8
        System.out.println("Chronology: " + period.getChronology());//ISO
    }
}
