package com.java8.practice.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleFlatMap {
    public static void main(String[] args) {
        Map<String, List<Long>> contacts = new HashMap<>();
        contacts.put("Arjun", Arrays.asList(8521479630L,7412589630L));
        contacts.put("Barun", Arrays.asList(9521479630L,8412589630L));
        contacts.put("Leela", Arrays.asList(6521479630L,9412589630L));
        contacts.put("Madhu", Arrays.asList(7521479630L,8412589630L));
        contacts.put("Neela", Arrays.asList(6521479630L,6412589630L));
        contacts.entrySet().stream().forEach(System.out::println);
       // contacts.keySet().stream().map(e->e.equals("Barun")).forEach(System.out::println);
        List<List<Long>> list = contacts.values().stream().collect(Collectors.toList());
        System.out.println(list);

    }
}
