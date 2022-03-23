package com.newPractice.collections.LLassignment;

import java.util.Collections;
import java.util.LinkedList;

//Insert elements at last in ll
public class Question8 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Collections.addAll(list,5,12,96,1,111,25,36,58,63,49,79);
        System.out.println("Before: "+list);
        list.addLast(1101);
        System.out.println("After: "+list);
    }
}
