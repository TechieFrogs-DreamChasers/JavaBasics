package com.newPractice.collections.LLcodingQ;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesSortedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Collections.addAll(list,12,55,36,58,55,12,36,25,25,36,96,2,1,2,6);
        Collections.sort(list);
        System.out.println("Sorted List with duplicates: "+list);
        List<Integer> unique = list.stream().distinct().collect(Collectors.toList());
        System.out.println("After removal: "+unique);
    }
}
