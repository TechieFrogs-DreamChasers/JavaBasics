package com.newPractice.collections.ALassignment;

import java.util.ArrayList;
import java.util.Collections;

//reverse elements in al
public class Question10 {
    public static void main(String[] args) {
        ArrayList<String> al = Lists.getCountries();
        System.out.println("All: "+al);
        Collections.reverse(al);
        System.out.println("Now: "+al);
    }
}
