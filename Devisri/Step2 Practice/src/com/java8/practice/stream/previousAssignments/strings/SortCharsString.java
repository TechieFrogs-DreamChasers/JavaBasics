package com.java8.practice.stream.previousAssignments.strings;

import java.util.Arrays;
import java.util.List;

public class SortCharsString {
    public static void main(String[] args) {
        String s="Blue Berries";
        List<String> letters_List = Arrays.asList(s.toLowerCase().split(""));
        System.out.println("Original Order: "+letters_List);
        letters_List.stream().sorted().forEach(System.out::println);
    }
}
