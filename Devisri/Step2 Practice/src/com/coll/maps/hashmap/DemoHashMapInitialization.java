package com.coll.maps.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DemoHashMapInitialization {
    public static void main(String[] args) {
        HashMap<Integer,String> numbers=new HashMap<>();
        numbers.put(100,"Hundred");
        numbers.put(200,"Two-Hundred");
        numbers.put(300,"Three-Hundred");
        numbers.put(400,"Four-Hundred");
        numbers.put(500,"Five-Hundred");
        numbers.put(600,"Six-Hundred");
        System.out.println("Mutability of Map: "+numbers.size());
        System.out.println(numbers);
        numbers.put(700,"Seven-Hundred");
        numbers.put(800,"Eight-Hundred");
        System.out.println("Mutability of Map: "+numbers.size());
        System.out.println(numbers);
        //Collections.UnmodifiableMap() makes map object immutable
        Map<Integer,String> number_string= Collections.unmodifiableMap(numbers);
        System.out.println("Immutability of Map: "+number_string.size());
        //number_string.put(900,"Nine-Hundred");//UOE
        System.out.println("Immutability of Map: "+number_string.size());//8
        //values()
        System.out.println("values(): "+numbers.values());
        //keySet()
        System.out.println("Keys: "+numbers.keySet());
        //entrySet()
        System.out.println("entrySet(): "+numbers.entrySet());
        //getKey(),getValue
        Map<String,String> fruit_Veg=new HashMap<>();
        fruit_Veg.put("Cherry","Fruit");
        fruit_Veg.put("Cucumber","Vegetable");
        fruit_Veg.put("Carrot","Vegetable");
        fruit_Veg.put("Cranberry","Fruit");
        fruit_Veg.put("Celery","Vegetable");

        for(Map.Entry<String,String> pair:fruit_Veg.entrySet()){
            String key= pair.getKey();
            String value= pair.getValue();
            System.out.println(key+"="+value);
        }
        //iterator
        Iterator<Map.Entry<String,String>> iterator = fruit_Veg.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> pair= iterator.next();
            String key= pair.getKey();
            String value= pair.getValue();
            System.out.println(key+"\t"+value);
        }


    }
}
