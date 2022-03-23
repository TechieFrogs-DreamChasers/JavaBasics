package com.newPractice.collections.myprograms.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class WorkWithAL {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities,"Barcelona","Madrid","Rome","Milan","Naples");
        cities.add("Venice");
        cities.add(3,"Melbourne");
        cities.forEach(e-> System.out.println(e));
        for(int i=0;i< cities.size();i++){
            System.out.println(">>>City: "+cities.get(i));
        }
        cities.stream().sorted().forEach(System.out::println);
        ArrayList<String> al = new ArrayList<>();
        al.add("Naples");
        al.add("Melbourne");
        al.add("Sydney");
        al.add("Rome");
        System.out.println(al);
        al.retainAll(cities);
        System.out.println(al);
        System.out.println(cities);
        cities.spliterator().forEachRemaining(System.out::println);
        System.out.println();

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            al.add("Sydney");
            System.out.println(itr.next());
        }
    }
}
