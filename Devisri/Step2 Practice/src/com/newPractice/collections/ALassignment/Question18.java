package com.newPractice.collections.ALassignment;

import java.util.ArrayList;
import java.util.Collections;

//Trim the Capacity to it's current size
public class Question18 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Collections.addAll(integers,5,2,3,6,5);
        integers.trimToSize();
        System.out.println("All: "+integers);
    }
}
