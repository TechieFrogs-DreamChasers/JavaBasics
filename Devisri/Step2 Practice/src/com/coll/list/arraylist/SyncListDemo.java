package com.coll.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SyncListDemo {
    public static void main(String[] args) {
        //Non-Sync arraylist obj
        List<Integer> integers=new ArrayList<>();
        for(int i=1;i<10;i++){
            integers.add(i*10);
        }
        System.out.println(integers);
        //Synchronizing ArrayList in Java
        List<Integer> synIntegers= Collections.synchronizedList(integers);
        synchronized (synIntegers){
            Iterator iterator= synIntegers.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
        List<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Grape");
        fruits.add("Peach");
        fruits.add("Berry");
        fruits.add("Melon");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Banana");
        List<String> synFruits=Collections.synchronizedList(fruits);
        synchronized (synFruits){
            Iterator itr=synFruits.iterator();
            while (itr.hasNext()){
                //synFruits.add("Guava");raises ConcurrentModificationException
                System.out.println(itr.next());
            }
        }
    }
}
