package com.newPractice.java8.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(6,7,8,9,10);
        List<Integer> list3 = Arrays.asList(11,12,13,14,15);
        List<List<Integer>> list = new ArrayList<>();
        Collections.addAll(list,list1,list2,list3);
        List<String> strings = list.stream().map(Object::toString).collect(Collectors.toList());
        System.out.println("Map: "+strings);
        List<Integer> numbers = list.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println("FlatMap: "+numbers);
    }
}
