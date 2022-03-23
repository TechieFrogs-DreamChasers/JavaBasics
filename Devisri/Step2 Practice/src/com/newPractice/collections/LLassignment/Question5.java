package com.newPractice.collections.LLassignment;

import java.util.LinkedList;

//Insert specified element at specific index
public class Question5 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        int range = (int)(Math.random()*20+1);
        int index = (int)(Math.random()*range+1);
        int number= (int) (Math.random()*1500+1);
        for(int i=0;i<range;i++){
            numbers.add((int)(Math.random()*1000+1));
        }
        System.out.println("All: "+numbers);
        numbers.add(index,number);
        System.out.println("After Insert: "+numbers);
    }
}
