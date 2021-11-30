package com.coll.set.hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethods {
    public static void main(String[] args) {
        HashSet<Integer> numbers=new HashSet<>();
        for(int i=1;i<=100;i++){
            numbers.add(i);
        }
        System.out.println("add(): "+numbers);
        System.out.println("iterator(): ");
        Iterator<Integer> iterator= numbers.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
        System.out.println();
        //contains()
        System.out.println(numbers.contains(150)+" "+numbers.contains(100));
        //copyOf()
        Set<Integer> first_100_Numbers=Set.copyOf(numbers);
        //unordered elements returned as output
        System.out.println("copyOf(): "+first_100_Numbers);
        //addAll()
        HashSet<Character> vowels_Lower=new HashSet<>();
        vowels_Lower.add('a');
        vowels_Lower.add('e');
        vowels_Lower.add('i');
        vowels_Lower.add('o');
        vowels_Lower.add('u');
        System.out.println("Lower case vowels hashset: "+vowels_Lower);
        HashSet<Character> vowels_Upper=new HashSet<>();
        vowels_Upper.add('A');
        vowels_Upper.add('E');
        vowels_Upper.add('I');
        vowels_Upper.add('O');
        vowels_Upper.add('U');
        System.out.println("Upper case vowels hashset: "+vowels_Upper);
        HashSet<Character> vowels=new HashSet<>(vowels_Lower);
        vowels.addAll(vowels_Upper);
        System.out.println("addAll(): "+vowels);
        //retainAll()
        numbers.retainAll(first_100_Numbers);
        System.out.println("After retainAll(): "+numbers);
        System.out.println("After retainAll(): "+first_100_Numbers);
        HashSet<String> first_names_list=new HashSet<>();
        first_names_list.add("John");
        first_names_list.add("Sam");
        first_names_list.add("Bob");
        first_names_list.add("Meghan");
        first_names_list.add("Jim");
        HashSet<String> next_names_list=new HashSet<>();
        next_names_list.add("John");
        next_names_list.add("Sam");
        next_names_list.add("Bobby");
        next_names_list.add("Meg");
        next_names_list.add("Jim");
        System.out.println("Before retainAll(): "+first_names_list);
        System.out.println("Before retainAll(): "+next_names_list);
        first_names_list.retainAll(next_names_list);
        System.out.println("After retainAll(): "+first_names_list);
        System.out.println("After retainAll(): "+next_names_list);
        //removeAll()
        next_names_list.removeAll(first_names_list);
        System.out.println("RemoveAll(): "+first_names_list);
        System.out.println("RemoveAll(): "+next_names_list);
    }
}
