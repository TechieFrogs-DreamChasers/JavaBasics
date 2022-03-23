package com.newPractice.collections.LLassignment;

import java.util.LinkedList;

//check if element exists in a list or not
public class Question22 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Rome");
        cities.add("Berlin");
        cities.add("Barcelona");
        cities.add("Madrid");
        cities.add("New York");
        cities.add("Sydney");
        cities.add("London");
        cities.add("Montgomery");
        cities.add("Naples");
        cities.add("Melbourne");
        System.out.println("All: "+cities);
        System.out.println("Check: "+(cities.contains("Sydney")));
        System.out.println("Check: "+(cities.contains("Singapore")));
    }
}
