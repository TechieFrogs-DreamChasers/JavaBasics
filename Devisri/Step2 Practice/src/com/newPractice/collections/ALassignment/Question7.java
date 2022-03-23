package com.newPractice.collections.ALassignment;

import java.util.ArrayList;

//search an element in al
public class Question7 {
    public static void main(String[] args) {
        ArrayList<String> al = Lists.getCountries();
        System.out.println("All: "+al);
        al.stream().filter(e->e.contains("Sweden")).forEach(e-> System.out.println(e));
    }
}
