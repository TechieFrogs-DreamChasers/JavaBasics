package com.coll.set.linkedhashset;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class MethodsLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> italy_cities=new LinkedHashSet<>();
        //add()
        italy_cities.add("Florence");
        italy_cities.add("Rome");
        italy_cities.add("Venice");
        italy_cities.add("Palermo");
        italy_cities.add("Turin");
        italy_cities.add("Naples");
        italy_cities.add("Milan");
        italy_cities.add("Pisa");
        italy_cities.add("Vatican");
        italy_cities.add("Vincenza");
        //iterator
        Iterator<String> iterator=italy_cities.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println(italy_cities.contains("Vatican"));
        Set<String> cities= Collections.unmodifiableSet(italy_cities);
        System.out.println(cities);
        //cities.add("null");//UnsupportedOperationException
        //System.out.println(cities);
        //addAll()
        LinkedHashSet<String> italy= new LinkedHashSet<>(italy_cities);
        //containsAll
        System.out.println(italy.containsAll(italy_cities));//true
        System.out.println(italy.hashCode()==italy_cities.hashCode());//true(Shallow copy)
        
    }
}
