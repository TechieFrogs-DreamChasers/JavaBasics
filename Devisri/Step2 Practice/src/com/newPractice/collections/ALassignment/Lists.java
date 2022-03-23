package com.newPractice.collections.ALassignment;

import java.util.ArrayList;

public class Lists {
    public static ArrayList<String> getCountries(){
        ArrayList<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("Spain");
        countries.add("Poland");
        countries.add("China");
        countries.add("Scotland");
        countries.add("Sweden");
        countries.add("Mexico");
        countries.add("Argentina");
        countries.add("Brazil");
        countries.add("Chile");
        return countries;
    }
    public static ArrayList<Integer> getNumbers(){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<15;i++){
            numbers.add((int)(Math.random()*100+1));
        }
        return numbers;
    }
}
