package com.java8.practice.stream;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoIteratingCollectionsStreams {
    public static void main(String[] args) {
        List<String> names = ObjectsForCollections.stringList();
        //Iterating Using Streams
        System.out.println("Iterating List Using Streams: ");
        names.stream().forEach(System.out::println);
        Set<String> names_set = ObjectsForCollections.stringSet();
        //Iterating Using Streams
        System.out.println("Iterating Set Using Streams: ");
        names_set.stream().forEach(System.out::println);
        //Iterating Using Streams
        System.out.println("Iterating Map keySet() Using Streams: ");
        Map<String,String> cities = ObjectsForCollections.cities_Country();
        cities.keySet().stream().forEach(System.out::println);
        System.out.println("Iterating Map values() Using Streams: ");
        cities.values().stream().forEach(System.out::println);
        System.out.println("Iterating Map entrySet() Using Streams: ");
        cities.entrySet().stream().forEach(System.out::println);
        System.out.println("Sort Map keySet() Using Streams: ");
        cities.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("Sort Map values() Using Streams: ");
        cities.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        System.out.println("Sort Map keySet() Using Streams descending order: ");
        cities.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).forEach(System.out::println);
        System.out.println("Sort Map values() Using Streams descending order: ");
        cities.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(System.out::println);

    }
}
