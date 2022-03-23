package com.newPractice.collections.ALassignment;

import java.util.ArrayList;
import java.util.List;

//copy one al to another
public class Question16 {
    public static void main(String[] args) {
        ArrayList<String> al = Lists.getCountries();
        List<String> countries = List.copyOf(al);
        System.out.println("Countries: "+countries);
    }
}
