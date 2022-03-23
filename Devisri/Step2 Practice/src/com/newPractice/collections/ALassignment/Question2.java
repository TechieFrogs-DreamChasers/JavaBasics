package com.newPractice.collections.ALassignment;

import java.util.ArrayList;
import java.util.Iterator;

//Iterate through all elements of AL
public class Question2 {
    public static void main(String[] args) {
        ArrayList<String> countries = Lists.getCountries();
        Iterator<String> itr = countries.iterator();
        while (itr.hasNext())
            System.out.println("Country: "+itr.next());
    }
}
