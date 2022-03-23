package com.newPractice.collections.LLassignment;

import java.util.LinkedList;
//Compare two ll's
public class Question24 {
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
        LinkedList<String> cities_2 = new LinkedList<>(cities);
        System.out.println(cities.containsAll(cities_2));
    }
}
