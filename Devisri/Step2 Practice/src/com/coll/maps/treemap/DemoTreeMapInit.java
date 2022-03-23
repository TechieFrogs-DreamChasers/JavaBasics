package com.coll.maps.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMapInit {
    public static void main(String[] args) {
        TreeMap<String,String> movie_Genre=new TreeMap<>();
        //Tree map sorts ascending order based on key
        //TreeMap does not allow either null key/value
        movie_Genre.put("The Avengers","MCU");
        movie_Genre.put("Me Before You","Melodrama");
        movie_Genre.put("Prisoners","Thriller");
        movie_Genre.put("Mission-Impossible","Action");
        movie_Genre.put("The Conjuring","Horror");
        System.out.println(movie_Genre);
        //enhanced for
        System.out.println(" ");
        System.out.println("Enhanced For: ");
        for(Map.Entry<String,String> pair: movie_Genre.entrySet()){
            System.out.println(pair.getKey()+" = "+pair.getValue());
        }
        //Using Iterator
        System.out.println(" ");
        System.out.println("Using Iterator: ");
        Iterator<Map.Entry<String,String>> iterator=movie_Genre.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
