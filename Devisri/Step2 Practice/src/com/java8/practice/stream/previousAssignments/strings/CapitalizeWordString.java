package com.java8.practice.stream.previousAssignments.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalizeWordString {
    public static void main(String[] args) {
        String s="blue berries are blue in color";
        List<String> words_List = Arrays.asList(s.split(" "));
        System.out.println("Original Strings: "+words_List);
        List<String> updated_words = words_List.
                stream().
                map(e->e.substring(0,1).toUpperCase().concat(e.substring(1))).
                collect(Collectors.toList());
        System.out.println("After Capitalizing: "+updated_words);
    }
}
