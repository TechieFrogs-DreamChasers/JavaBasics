package com.newPractice.collections.LLcodingQ;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i=0;i<10;i++){
            ll.add((int)(Math.random()*100+1));
        }
        System.out.println("Before reverse: "+ll);
        Collections.reverse(ll);
        System.out.println("After reverse: "+ll);
    }
}
