package com.Practice.DemoDate;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DemoDateWithParseAndFormat {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Default Format: " + today);
        //Specific Format
        System.out.println(today.format(DateTimeFormatter.ofPattern("d/MMM/uuuu")));
        //Local date
        System.out.println(today.format(DateTimeFormatter.BASIC_ISO_DATE));
        LocalDateTime dateTime = LocalDateTime.parse("23::Oct::2021 02::06::48",
                DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
        System.out.println(dateTime);
    }
}
