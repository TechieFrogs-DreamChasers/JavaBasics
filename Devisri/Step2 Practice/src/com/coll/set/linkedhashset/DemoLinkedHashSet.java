package com.coll.set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class DemoLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits=new LinkedHashSet<>();
        fruits.add("WaterMelon");
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Berry");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Cherry");
        System.out.println(fruits);
        Iterator<String> iterator= fruits.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //if(iterator.next().equals("Berry"))//NoSuchElementException
              //  iterator.remove();
        }
        System.out.println(fruits);
    }
}
