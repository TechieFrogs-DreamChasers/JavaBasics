package com.newPractice.collections.ALassignment;

import java.util.ArrayList;
//Increase size of al
public class Question19 {
    public static void main(String[] args) {
        ArrayList<String> countries = Lists.getCountries();
        countries.ensureCapacity(25);
        System.out.println("All: "+countries);
    }
}
