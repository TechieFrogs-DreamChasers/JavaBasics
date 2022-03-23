package com.newPractice.collections.LLassignment;

import java.util.LinkedList;
import java.util.ListIterator;

//Iterate LL in ReverseOrder
public class Question4 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        int range = (int)(Math.random()*20+1);
        for(int i=0;i<range;i++){
            numbers.add((int)(Math.random()*1000+1));
        }
        ListIterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext())
            System.out.println("Numbers Forward: "+iterator.next());
        while (iterator.hasPrevious())
            System.out.println("Numbers Backward: "+iterator.previous());
    }
}
