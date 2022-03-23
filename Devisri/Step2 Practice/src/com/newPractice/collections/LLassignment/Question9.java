package com.newPractice.collections.LLassignment;

import java.util.Collections;
import java.util.LinkedList;

//Insert elements at specified position in ll
public class Question9 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Collections.addAll(list,5,12,96,1,111,25,36,58,63,49,79);
        int position = (int)(Math.random()* list.size()+1);
        System.out.println("Before: "+list);
        list.addAll(position,list);
        System.out.println("After: "+list);
    }
}
