package com.newPractice.collections.LLassignment;

import java.util.Collections;
import java.util.LinkedList;
//Insert elements at First ll
public class Question7 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Collections.addAll(list,5,12,96,1,111,25,36,58,63,49,79);
        System.out.println("Before: "+list);
        list.addFirst(1001);
        System.out.println("After: "+list);
    }
}
