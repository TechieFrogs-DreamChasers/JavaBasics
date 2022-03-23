package com.coll.maps.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DemoConcurrentHM {
    public static void main(String[] args) {
        Map<String,String> fruit_veg=new ConcurrentHashMap<>();
        //ConcurrentHashMap does not allow either null key/value
        fruit_veg.put("Cucumber","Vegetable");
        fruit_veg.put("Mango","Fruit");
        fruit_veg.put("Carrot","Vegetable");
        fruit_veg.put("Apple","Fruit");
        fruit_veg.put("Berry","Fruit");
        Iterator<Map.Entry<String,String>> iterator=fruit_veg.entrySet().iterator();
        while(iterator.hasNext()){
            fruit_veg.put("Melon","Fruit");
            System.out.println(iterator.next());
            fruit_veg.put("Grape","Fruit");
            fruit_veg.remove("Carrot");
            fruit_veg.remove("Cucumber");
        }
        System.out.println(fruit_veg);
    }
}
