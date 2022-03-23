package com.newPractice.collections.LLassignment;

import java.util.Collections;
import java.util.LinkedList;

//shuffle elements in ll
public class Question16 {
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
        Collections.shuffle(cities);
        System.out.println("After: "+cities);
    }
}
