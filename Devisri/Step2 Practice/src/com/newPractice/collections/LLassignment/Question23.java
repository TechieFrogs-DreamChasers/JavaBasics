package com.newPractice.collections.LLassignment;

import java.util.ArrayList;
import java.util.LinkedList;
//Convert ll to al
public class Question23 {
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
        System.out.println("ll: "+cities);
        ArrayList<String> al = new ArrayList<>(cities);
        System.out.println("Al: "+al);
    }
}
