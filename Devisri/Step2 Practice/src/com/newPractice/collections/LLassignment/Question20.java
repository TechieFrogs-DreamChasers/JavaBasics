package com.newPractice.collections.LLassignment;

import java.util.LinkedList;

//retrieve but don't remove first element
public class Question20 {
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
        String s = cities.peekFirst();
        System.out.println("After: "+cities+" ==> "+s);

    }
}
