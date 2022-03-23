package com.newPractice.collections.myprograms.maps;

import java.util.*;
import java.util.stream.Collectors;

public class CreateMap {
    public static void main(String[] args) {
        Map<String,String> fruit_Color = new HashMap<>();
        fruit_Color.put("Apple","Red");
        fruit_Color.put("WaterMelon","Green");
        fruit_Color.put("Cherry","Red");
        fruit_Color.put("StrawBerry","Red");
        fruit_Color.put("Mango","Yellow");
        fruit_Color.put("Banana","Yellow");
        System.out.println("Normal toString(): ");
        System.out.println(fruit_Color);
        System.out.println();
        System.out.println("For-Each: ");
        for(Map.Entry<String,String> mp:fruit_Color.entrySet()){
            System.out.println(mp.getKey()+" : "+mp.getValue());
        }
        System.out.println();
        System.out.println("Stream For Each: ");
        fruit_Color.entrySet().stream().forEach(System.out::println);
        System.out.println();
        System.out.println("Using Iterator: ");
        Iterator<Map.Entry<String,String>> itr = fruit_Color.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println("Fruit-Color Pair: "+itr.next());
        }
        System.out.println();
        List<String> colors = fruit_Color.values().stream().collect(Collectors.toList());
        colors.stream().forEach(System.out::println);
        System.out.println();
        List<String> fruits = fruit_Color.keySet().stream().collect(Collectors.toList());
        fruits.stream().forEach(System.out::println);
        System.out.println();
        fruit_Color.forEach((String,fruit)-> System.out.println(fruit));//values
        System.out.println();
        Map<String,String> map = new HashMap<>();
        map.putAll(fruit_Color);
        System.out.println(map);
        System.out.println();
        Map<String,String> map1 = new HashMap<>();
        map1.put("A","a");
        map1.put("B","b");
        map1.put("C","c");
        map1.put(null,"l");
        map1.put("E",null);
        Map<String,String> map2 = new HashMap<>();
        map2.put("I","i");
        map2.put("H","h");
        map2.put("G","g");
        map2.put(null,"n");
        map2.put("F",null);
        Map<String,String> map3 = new HashMap<>(map2);
        map3.putAll(map1);
        System.out.println(map3);
        System.out.println(map3.getOrDefault("D","Dave Default"));
        System.out.println(map3.getOrDefault("G","Dave Default"));
    }
}
