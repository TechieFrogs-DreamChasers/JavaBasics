package com.newPractice.collections.LLcodingQ;

import java.util.Collections;
import java.util.LinkedList;

public class MergeSortedLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll_1=new LinkedList<>();
        for(int i=0;i<10;i++){
            ll_1.add((int)(Math.random()*100+1));
        }
        Collections.sort(ll_1);
        LinkedList<Integer> ll_2=new LinkedList<>();
        for(int i=0;i<10;i++){
            ll_2.add((int)(Math.random()*100+1));
        }
        Collections.sort(ll_2);
        LinkedList<Integer> ll=new LinkedList<>(ll_1);
        ll.addAll(ll_2);
        Collections.sort(ll);
        System.out.println("Merged Sorted List: "+ll);
    }
}
