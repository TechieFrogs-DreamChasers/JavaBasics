package com.newPractice.collections.ALassignment;

import java.util.ArrayList;
import java.util.Collections;

//swap elements in al
public class Question11 {
    public static void main(String[] args) {
        ArrayList<String> al = Lists.getCountries();
        System.out.println("All: "+al);
        Collections.swap(al,2,7);
        System.out.println("Now: "+al);
    }
}
