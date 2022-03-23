package com.newPractice.collections.myprograms.maps;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CreateConcurrentHM {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> items_Quan = new ConcurrentHashMap<>();
        items_Quan.put("Mobile Chargers",5);
        items_Quan.put("Airpods Chargers",25);
        items_Quan.put("Laptop Chargers",3);
        items_Quan.put("Tablet Chargers",10);
        items_Quan.put("Smart-Watch Chargers",15);
        Iterator<Map.Entry<String, Integer>> itr = items_Quan.entrySet().iterator();
        while (itr.hasNext()){

            System.out.println("Keys-->Values: "+itr.next());
            items_Quan.put("Smart-Bulb",40);
            items_Quan.remove("Airpods Chargers");
            //itr.remove();
        }
        System.out.println(items_Quan);
        System.out.println("Mapping count: "+items_Quan.mappingCount());
        items_Quan.compute("Laptop Chargers",(a,b)-> Integer.valueOf(b+b));
        System.out.println(items_Quan);
        items_Quan.computeIfAbsent("Smart-Ac",(v)-> Integer.valueOf(5));
        System.out.println(items_Quan);
        items_Quan.computeIfPresent("Mobile Chargers",(k,v)->Integer.valueOf(v*v));
        System.out.println(items_Quan);
        items_Quan.putIfAbsent("Extension Cords",6);
        System.out.println(items_Quan);
        System.out.println("Mapping Count: "+items_Quan.mappingCount());
    }
}
