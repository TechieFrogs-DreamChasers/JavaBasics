package com.newPractice.collections.LLassignment;

import java.util.LinkedList;

//remove specified element from list
public class Question12 {
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
        String element =  cities.get((int)(Math.random()* cities.size()+1));
        System.out.println("All: "+cities);
        cities.remove(element);
        System.out.println("After: "+cities);
    }
}
