package com.newPractice.collections.LLassignment;

import java.util.LinkedList;

//remove first & last element from list
public class Question13 {
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
        cities.removeFirst();
        System.out.println("After first: "+cities);
        cities.removeLast();
        System.out.println("After last: "+cities);
    }
}
