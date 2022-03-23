package com.coll.maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DemoMapInitialization {
    public static void main(String[] args) {
        //Creating empty map
        Map<String,String> empty_map= Collections.emptyMap();
        System.out.println("Empty Map: "+empty_map);
        //creating a synchronised map and passing empty map
        Map<String,String> modify_map=Collections.unmodifiableMap(empty_map);
        System.out.println("Un-Modifiable Map Values: "+modify_map);
        //creating singleton map
        Map<Integer,String> singleton_map=Collections.singletonMap(100,"Hundred");
        //singleton_map.put(20,"Twenty");//UOE
        System.out.println("Singleton Map: "+singleton_map);
        //double-brace/Normal initialization
        Map<String,String> cities_Country=new HashMap<>();
        cities_Country.put("Florence","Italy");
        cities_Country.put("Madrid","Spain");
        cities_Country.put("Rome","Italy");
        cities_Country.put("Barcelona","Spain");
        cities_Country.put("Naples","Italy");
        System.out.println("City "+" \t "+"Country");
        Iterator<Map.Entry<String,String>> iterator=cities_Country.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> pair=iterator.next();
            String key= pair.getKey();
            String value= pair.getValue();
            System.out.println(key+"\t-\t"+value);
        }
    }
}
