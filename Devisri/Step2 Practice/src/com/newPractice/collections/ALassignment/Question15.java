package com.newPractice.collections.ALassignment;

import java.util.ArrayList;

//test al empty or not
public class Question15 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Empty/not: "+al.isEmpty());
        al = Lists.getNumbers();
        System.out.println("Empty/not: "+al.isEmpty());
    }
}
