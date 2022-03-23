package com.newPractice.collections.LLassignment;

import java.util.LinkedList;

//Insert elements at First and last in ll
public class Question6 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Berlin");
        System.out.println("Before: "+cities);
        cities.addLast("Rome");
        System.out.println("Add Last: "+cities);
        cities.addFirst("Madrid");
        System.out.println("Add First: "+cities);
    }
}
