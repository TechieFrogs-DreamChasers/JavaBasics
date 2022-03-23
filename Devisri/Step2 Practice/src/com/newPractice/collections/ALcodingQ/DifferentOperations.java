package com.newPractice.collections.ALcodingQ;

import java.util.ArrayList;
import java.util.Collections;

public class DifferentOperations {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Collections.addAll(al,100,90,50,150,900,250,30,600,450,700);
        //Add element at the end of al
        al.add(350);
        System.out.println("Adding element at the end: "+al);
        //sort al in ascending order
        Collections.sort(al);
        System.out.println("Sort al in ascending order: "+al);
        //reverse al
        Collections.reverse(al);
        System.out.println("Reverse al: "+al);
        //print size of al
        System.out.println("al Size: "+al.size());
        //print space separated values of al
        for(Integer i:al){
            System.out.print(i+"\t");
        }
        System.out.println();
        //sort al in descending order
        al.add(1150);
        System.out.println("Updated Al: "+al);
        Collections.sort(al);
        Collections.reverse(al);
        System.out.println("Al Descending order: "+al);
    }
}
