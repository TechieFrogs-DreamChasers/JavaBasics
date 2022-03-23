package com.newPractice.collections.LLassignment;

import java.util.Collections;
import java.util.LinkedList;

//Check ll is empty or not
public class Question25 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        System.out.println("Empty or not: "+numbers.isEmpty());
        Collections.addAll(numbers,25,2,3,45,89,26,48,33);
        System.out.println("Empty or not: "+numbers.isEmpty());
    }
}
