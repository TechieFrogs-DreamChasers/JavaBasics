package com.newPractice.collections.ALassignment;

import java.util.ArrayList;

//print al using position
public class Question22 {
    public static void main(String[] args) {
        ArrayList<String> al = Lists.getCountries();
        for (String country: al){
            System.out.println(al.indexOf(country)+" : "+country);
        }
    }
}
