package com.newPractice.collections.ALassignment;

import java.util.ArrayList;

//retrieve an element from given index
public class Question4 {
    public static void main(String[] args) {
        ArrayList<String> countries = Lists.getCountries();
        int index = (int)(Math.random()* (countries.size()-1)+1);
        System.out.println("All: "+countries);
        System.out.println("Element: "+countries.get(index));
    }
}
