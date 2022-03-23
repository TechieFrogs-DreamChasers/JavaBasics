package com.newPractice.collections.LLassignment;

import java.util.LinkedList;

//Clone a linked list to another
public class Question18 implements Cloneable{
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
        LinkedList<String> cities_copy = (LinkedList<String>) cities.clone();
        System.out.println("Copy: "+cities_copy);
        System.out.println("Cloned or not: "+(cities.hashCode()==cities_copy.hashCode()));
    }
}
