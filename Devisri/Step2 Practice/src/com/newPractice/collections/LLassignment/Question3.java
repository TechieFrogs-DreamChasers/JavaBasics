package com.newPractice.collections.LLassignment;
import java.util.LinkedList;

//iterate through linked list from a specified location
public class Question3 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        int range = (int)(Math.random()*20+1);
        int index = (int)(Math.random()*range+1);
        for(int i=0;i<range;i++){
            numbers.add((int)(Math.random()*1000+1));
        }
        System.out.println("All: "+numbers);
        for(int i =index;i<numbers.size();i++){
            System.out.println("Numbers: "+numbers.get(i));
        }
    }
}
