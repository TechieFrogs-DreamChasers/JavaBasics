package com.newPractice.collections.ALassignment;

import java.util.ArrayList;

//clone al to another al
public class Question20 {
    public static void main(String[] args) {
        ArrayList<String> countries = Lists.getCountries();
        ArrayList<String> al = (ArrayList<String>) countries.clone();
        System.out.println(countries.hashCode()==al.hashCode());
    }
}
