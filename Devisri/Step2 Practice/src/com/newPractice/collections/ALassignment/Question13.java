package com.newPractice.collections.ALassignment;

import java.util.ArrayList;


//replace second element with specific element
public class Question13 {
    public static void main(String[] args) {
        ArrayList<String> al = Lists.getCountries();
        System.out.println("All: "+al);
        al.set(1,"Taiwan");
        System.out.println("Now: "+al);
    }
}
