package com.java8.practice.stream.previousAssignments.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertEveryWordToLowerUpper {
    public static void main(String[] args) {
        String s = "BlUe BeRrIeS ArE BlUe IN CoLoR";
        List<String> list = Arrays.asList(s.split(" "));
        System.out.println("Original: "+list);
        List<String> lower_List = list.stream().map(e->e.toLowerCase()).collect(Collectors.toList());
        System.out.println("Lower Case: "+lower_List);
        List<String> upper_List = list.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
        System.out.println("Upper Case: "+upper_List);
    }
}
