package com.newPractice.collections.ALassignment;

import java.util.ArrayList;
import java.util.Collections;

//shuffle elements in al
public class Question9 {
    public static void main(String[] args) {
        ArrayList<String> al = Lists.getCountries();
        System.out.println("All: "+al);
        Collections.shuffle(al);
        System.out.println("After: "+al);
    }
}
