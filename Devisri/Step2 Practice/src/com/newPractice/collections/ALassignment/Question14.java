package com.newPractice.collections.ALassignment;

import java.util.ArrayList;

//empty al
public class Question14 {
    public static void main(String[] args) {
        ArrayList<Integer> al = Lists.getNumbers();
        System.out.println("All: "+al);
        al.clear();
        System.out.println("Now: "+al);
    }
}
