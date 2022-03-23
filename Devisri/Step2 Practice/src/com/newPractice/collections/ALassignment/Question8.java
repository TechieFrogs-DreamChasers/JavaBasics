package com.newPractice.collections.ALassignment;

import java.util.ArrayList;
import java.util.Collections;

//sort given al
public class Question8 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = Lists.getNumbers();
        System.out.println("All: "+integers);
        Collections.sort(integers);
        System.out.println("After: "+integers);
    }
}
