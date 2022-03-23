package com.newPractice.collections.ALassignment;

import java.util.ArrayList;

//remove third element from al
public class Question6 {
    public static void main(String[] args) {
        ArrayList<String> al = Lists.getCountries();
        System.out.println("All: "+al);
        al.remove(2);
        System.out.println("Now: "+al);
    }
}
