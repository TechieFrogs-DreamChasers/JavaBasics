package com.newPractice.collections.LLassignment;

import java.util.LinkedList;

//display elements and their positions in linked list
public class Question11 {
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
        for(String city:cities){
            System.out.println(cities.indexOf(city)+" : "+city);
        }
    }
}
