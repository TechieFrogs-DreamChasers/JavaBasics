package com.newPractice.collections.LLassignment;

import java.util.LinkedList;
//replace an element in ll
public class Question26 {
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
        cities.set(4,"Singapore");
        System.out.println("Now: "+cities);
    }
}
