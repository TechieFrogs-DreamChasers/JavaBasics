package com.java8.practice.datesTimes;

import java.time.LocalDate;

public class DemoDates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Today Date: "+date);
        System.out.println("Year: "+date.getYear());
        System.out.println("Month: "+date.getMonth());
        System.out.println("Month Value: "+date.getMonthValue());
        System.out.println("Day of month: "+date.getDayOfMonth());
        System.out.println("Day of year: "+date.getDayOfYear());
        System.out.println("Day of week: "+date.getDayOfWeek());
        System.out.println("Yesterday Date: "+date.minusDays(1));
        LocalDate date2 = LocalDate.now().minusDays(5);
        if(date.isBefore(date2))
            System.out.println(date+" Before "+date2);
        else if(date.isAfter(date2))
            System.out.println(date+" After "+date2);
        else if(date.isEqual(date2))
            System.out.println(date+" equal "+date2);
        System.out.println("Date after 5 days: "+date.plusDays(5));
        System.out.println("Date after 5 weeks: "+date.plusWeeks(5));
        System.out.println("Date after 5 months: "+date.plusMonths(5));
        System.out.println("Date after 5 Years: "+date.plusYears(5));
        System.out.println("Date before 5 days: "+date.minusDays(5));
        System.out.println("Date before 5 weeks: "+date.minusWeeks(5));
        System.out.println("Date before 5 months: "+date.minusMonths(5));
        System.out.println("Date before 5 Years: "+date.minusYears(5));
    }
}
