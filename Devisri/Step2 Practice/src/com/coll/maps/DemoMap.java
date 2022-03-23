package com.coll.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        Map<String,String> languages=new HashMap<>();
        languages.put("Java","High-Level language");
        languages.put("Python","High-Level language");
        languages.put("C","Middle-Level language");
        languages.put("C++","Middle-Level language");
        languages.put("Algol","Low-Level language");
        LinkedHashMap<String,String> linked_Languages=new LinkedHashMap<>(languages);
        System.out.println("Linked: "+linked_Languages);
        System.out.println(languages);
        System.out.println(languages.get("Java"));
        Map<Integer,String> days=new HashMap<>();
        days.put(1,"Sunday");
        days.put(2,"Monday");
        days.put(3,"Tuesday");
        days.put(4,"Wednesday");
        days.put(5,"Thursday");
        days.put(6,"Friday");
        days.put(7,"Saturday");
        //normal toString way
        System.out.println(" ");
        System.out.println("Normal toString() way: ");
        System.out.println("Days: "+days);
        //Enhanced for
        System.out.println(" ");
        System.out.println("Enhanced For: ");
        for(Map.Entry<Integer, String> pair:days.entrySet()){
            System.out.println(pair);
        }
        System.out.println(" ");
        System.out.println("Using Iterator: ");
        Iterator<Map.Entry<Integer,String>> iterator=days.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
