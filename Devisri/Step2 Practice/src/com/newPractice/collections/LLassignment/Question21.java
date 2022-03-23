package com.newPractice.collections.LLassignment;

import java.util.Collections;
import java.util.LinkedList;
//retrieve but don't remove last element
public class Question21 {
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
        String s = cities.peekLast();
        System.out.println("After: "+cities+" ==> "+s);
    }
}
