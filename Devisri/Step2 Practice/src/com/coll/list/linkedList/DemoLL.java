package com.coll.list.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DemoLL {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<10;i++){
            list.add((int)(Math.random()*1000+1));
        }
        //displaying LinkedList as toString()
        System.out.println("Displaying LinkedList as toString()");
        System.out.println(list);
        System.out.println(" ");
        //normal For loop
        System.out.println("Normal For loop");
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(" ");
        //enhanced for loop
        System.out.println("Enhanced for loop");
        for(Integer i:list){
            System.out.println(i);
        }
        System.out.println(" ");
        //Iterator
        System.out.println("Using Iterator");
        Iterator<Integer> iterator= list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println(" ");
        //ListIterator
        System.out.println("Using ListIterator");
        ListIterator<Integer> listIterator=list.listIterator();
        System.out.println("Forward Direction: ");
        while(listIterator.hasNext())
            System.out.println(listIterator.next());
        System.out.println("Backward Direction: ");
        while (listIterator.hasPrevious())
            System.out.println(listIterator.previous());
    }
}
