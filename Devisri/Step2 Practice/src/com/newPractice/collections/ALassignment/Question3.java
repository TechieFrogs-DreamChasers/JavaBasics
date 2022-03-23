package com.newPractice.collections.ALassignment;

import java.util.ArrayList;

//Insert element at first
public class Question3 {
    public static void main(String[] args) {
        ArrayList<String> countries = Lists.getCountries();
        System.out.println("List: "+countries);
        countries.add(0,"Thailand");
        System.out.println("After: "+countries);
    }
}
