package com.newPractice.collections.ALassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//create al string
public class Question1 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        Collections.addAll(colors,"Red","Cyan","Blue","Pink","Black");
        Iterator<String> citr = colors.iterator();
        while (citr.hasNext())
            System.out.println("Color: "+citr.next());
    }
}
