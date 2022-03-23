package com.newPractice.collections.ALassignment;

import java.util.ArrayList;

//compare two al's
public class Question17 {
    public static void main(String[] args) {
        ArrayList<Integer> al = Lists.getNumbers();
        ArrayList<Integer> al2 = new ArrayList<>(al);
        System.out.println("Equal/not: "+(al.containsAll(al2)));
    }
}
