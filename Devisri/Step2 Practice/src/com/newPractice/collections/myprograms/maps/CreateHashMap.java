package com.newPractice.collections.myprograms.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CreateHashMap {
    public static void main(String[] args) {
        //creating generic Hashmap
        HashMap<String,Integer> numbers = new HashMap<>();
        //Inserting values in HashMap
        numbers.put("One",1);
        numbers.put("Five",5);
        numbers.put("Three",3);
        numbers.put("Two",2);
        numbers.put("Four",4);
        //Inserting null key
        numbers.put(null,50000);
        //getting value of null key
        System.out.println("Value of null Key: "+numbers.get(null));//50000
        //Inserting null value
        numbers.put("Forty Five",null);
        System.out.println("Getting null value: "+numbers.get("Forty Five"));//null
        //inserting all elements of one map to another
        HashMap<String,Integer> map = new HashMap<>();
        map.putAll(numbers);
        //retrieving values
        Integer three = map.get("Three");
        System.out.println("get(): "+three);//3
        //using getOrDefault()
        System.out.println("getOrDefault: "+map.getOrDefault("Six",69000));//69000
        System.out.println("getOrDefault: "+map.getOrDefault("Five",69000));//5
        //checking map contains key
        boolean five = map.containsKey("Five");
        boolean six = map.containsKey("Six");
        System.out.println("Contains Key: Five = "+five+" ,Six = "+six);
        //checking map contains value
        boolean val = map.containsValue(null);
        boolean val2 = map.containsValue(15);
        System.out.println("Map containsValue(): null = "+val+", 15 = "+val2);
        //Iterating keys
        Iterator<String> sitr = map.keySet().iterator();
        while (sitr.hasNext())
            System.out.println("Key: "+sitr.next());
        //Iterating values
        Iterator<Integer> iitr = map.values().iterator();
        while (iitr.hasNext())
            System.out.println("Value: "+iitr.next());
        //Iterating keys, values
        Iterator<Map.Entry<String,Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext())
            System.out.println("Key=Value: "+itr.next());
        //Using streams
        map.keySet().stream().forEach(e-> System.out.println("Stream-Key: "+e));
        map.values().stream().forEach(e-> System.out.println("Stream-Value: "+e));
        map.entrySet().stream().forEach(e-> System.out.println("Stream-Key & Value: "+e));
        //removing
        map.remove(null);
        map.remove("Forty Five",null);
        System.out.println("After remove(k),remove(k,v): "+map);
        //remove all
        numbers.clear();
        System.out.println("After clear: "+numbers);
        //replace
        Map<String,String> city_State = new HashMap<>();
        city_State.put("Jaipur","Rajasthan");
        city_State.put("Mangalore","Rajasthan");
        city_State.put("Hyderabad","Rajasthan");
        city_State.put("Chennai","Rajasthan");
        city_State.put("Mumbai","Rajasthan");
        System.out.println("Before Replace: "+city_State);
        System.out.println("Replace: "+city_State.replace("Mangalore","Karnataka"));
        System.out.println("After Replace: "+city_State);
        System.out.println("After Replace: "+city_State.replace("Chennai","Rajasthan","TamilNadu"));
        System.out.println("After Replace: "+city_State);
       //computing operations
        city_State.compute("Mumbai",(k,v)->{
            if(k=="Mumbai"){
                v.replace("Rajasthan","Maharashtra");
                return v;
            }
            return v;
        });
        //city_State.merge();
        System.out.println(city_State);
    }
}
