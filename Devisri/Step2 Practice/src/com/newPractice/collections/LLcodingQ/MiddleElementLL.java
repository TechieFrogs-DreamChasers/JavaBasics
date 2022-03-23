package com.newPractice.collections.LLcodingQ;

import java.util.LinkedList;

public class MiddleElementLL {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        int number = (int) (Math.random()*20+1);
        for(int i=0;i<number;i++){
            integers.add((int)(Math.random()*200+1));
        }
        System.out.println("Whole Linked List: "+integers);
        Integer middle_Element = integers.get(integers.size()/2);
        System.out.println("Middle Element: "+middle_Element);
    }
}
