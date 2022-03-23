package com.newPractice.collections.ALassignment;

import java.util.ArrayList;

//join 2 al's
public class Question21 {
    public static void main(String[] args) {
        ArrayList<String> al1 = Lists.getCountries();
        ArrayList<String> al2 = Lists.getCountries();
        ArrayList<String> al = new ArrayList<>(al1);
        al.addAll(al2);
        System.out.println("All: "+al);
    }
}
