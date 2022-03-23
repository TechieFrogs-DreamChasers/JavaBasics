package com.java8.practice.stream.previousAssignments.basicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class AddIntegers {
    public static void main(String[] args) {
        int sum = Stream.of(90,25,30,55,28,35,42,82,22).reduce(0,(a, b)->a+b);
        System.out.println(sum);
        int[] ints=new int[15];
        for(int i=0;i<15;i++)
            ints[i]=(int)(Math.random()*15+1);
        Arrays.stream(ints).forEach(System.out::println);
        System.out.println("Sum of Integer Array: "+Arrays.stream(ints).sum());
        List<Integer> list_Of_Integers = new ArrayList<>();
        for(int i=0;i<15;i++)
            list_Of_Integers.add((int)(Math.random()*15+1));
        System.out.println("list: "+list_Of_Integers);
        System.out.println("Sum of list: "+list_Of_Integers.stream().reduce(0,(a,b)->a+b));

    }
}
