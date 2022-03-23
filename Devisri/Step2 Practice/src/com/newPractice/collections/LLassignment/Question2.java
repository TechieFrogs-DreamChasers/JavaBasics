package com.newPractice.collections.LLassignment;

import java.util.Iterator;
import java.util.LinkedList;

//Iterate
public class Question2 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        int range = (int)(Math.random()*20+1);
        for(int i=0;i<range;i++){
            numbers.add((int)(Math.random()*1000+1));
        }
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext())
            System.out.println("Number: "+itr.next());
    }
}
