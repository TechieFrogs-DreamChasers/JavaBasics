package com.newPractice.collections.ALassignment;

import java.util.ArrayList;
//update element by given element
public class Question5 {
    public static void main(String[] args) {
        ArrayList<String> countries = Lists.getCountries();
        int index = (int)(Math.random()* (countries.size()-1)+1);
        System.out.println("All: "+countries);
        countries.set(index,"Thailand");
        System.out.println("Now: "+countries);
    }
}
