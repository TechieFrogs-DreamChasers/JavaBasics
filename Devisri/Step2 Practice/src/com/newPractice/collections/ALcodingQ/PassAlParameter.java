package com.newPractice.collections.ALcodingQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PassAlParameter {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        displayNameList(list);
    }
    public static void displayNameList(ArrayList<String> names){
        Collections.addAll(names,"Anne","Brad","Chris","Dave","Emma","Freya","Grey","Harry","Ingrid","John");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println("Name: "+iterator.next());
        }
    }
}
