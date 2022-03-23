package com.newPractice.collections.myprograms;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoCollectionStreams {
    public static void main(String[] args) {
        List<String> list = DataForCollections.getColorsList();
        Set<String> set = DataForCollections.getNamesSet();
        Map<String,Integer> map = DataForCollections.getItemQuantityMap();
        list.stream().forEach(e-> System.out.println("List Stream: "+e));
        System.out.println();
        set.stream().forEach(e-> System.out.println("Set Stream: "+e));
        System.out.println();
        map.entrySet().stream().forEach(e-> System.out.println("Map Stream: "+e));
    }
}
