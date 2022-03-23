package com.newPractice.collections.LLassignment;

import java.util.Collections;
import java.util.LinkedList;

//get first and last occurrence of element in ll
public class Question10 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Collections.addAll(list,5,3,1,7,8,9,5,2,3,6,5,4,8,9,1);
        System.out.println("All: "+list);
        int element = list.get((int)(Math.random()* list.size()+1));
        System.out.println("First Occurrence: "+list.indexOf(element));
        System.out.println("Last Occurrence: "+list.lastIndexOf(element));
    }
}
