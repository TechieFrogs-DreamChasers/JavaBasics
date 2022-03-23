package com.java8.practice.stream.previousAssignments.strings;

import java.util.Arrays;
import java.util.List;

public class StringAnagrams {
    public static void main(String[] args) {
        String s1="Care";
        String s2="Race";
        List<String> s1_List = Arrays.asList(s1.toLowerCase().split(""));
        List<String> s2_List = Arrays.asList(s2.toLowerCase().split(""));
        boolean flag=s1_List.containsAll(s2_List);
        if(flag)
            System.out.println("Two Strings are Anagrams");
        else
            System.out.println("Two Strings are not Anagrams");
    }
}
