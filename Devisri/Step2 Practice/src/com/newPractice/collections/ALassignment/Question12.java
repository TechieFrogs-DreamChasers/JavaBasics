package com.newPractice.collections.ALassignment;

import java.util.ArrayList;
import java.util.List;

//extract a portion of al
public class Question12 {
    public static void main(String[] args) {
        ArrayList<String> al = Lists.getCountries();
        System.out.println("All: "+al);
        List<String> countries = al.subList(1,7);
        System.out.println("SubList: "+countries);
    }
}
