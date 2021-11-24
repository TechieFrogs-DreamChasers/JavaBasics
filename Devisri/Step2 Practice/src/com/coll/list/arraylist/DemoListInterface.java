package com.coll.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//Demo of list displaying heterogeneous data
public class DemoListInterface {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(100021);
        list.add("Oathbringer");
        list.add("Brandon Sanderson");
        list.add("High Fantasy");
        list.add(2017);
        list.add("HardCover");
        //directly getting data
        System.out.println("Normal list as String rep: ");
        System.out.println(list);
        System.out.println(" ");
        //using enhanced for loop
        System.out.println("Enhanced For: ");
        for(Object i:list){
            System.out.println(i);
        }
        //using normal for
        System.out.println(" ");
        System.out.println("Normal For: ");
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
        //using iterator
        System.out.println(" ");
        Iterator iterator=list.iterator();
        System.out.println("Using Iterator: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //using ListIterator
        System.out.println(" ");
        ListIterator listIterator= list.listIterator();
        System.out.println("Using ListIterator: ");
        System.out.println("Forward Direction");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println(" ");
        System.out.println("Backward Direction");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
