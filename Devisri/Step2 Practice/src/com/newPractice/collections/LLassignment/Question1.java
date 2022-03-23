package com.newPractice.collections.LLassignment;

import java.util.Collections;
import java.util.LinkedList;

//Append element at end of ll
public class Question1{
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        Collections.addAll(colors,"Red","Blue","Green","Yellow","Pink");
        System.out.println("Before: "+colors);
        colors.addLast("Black");
        System.out.println("After: "+colors);
    }
}
