package com.java8.practice.stream;

import java.util.Arrays;

public class DemoStream {
    public static void main(String[] args) {
        int[] ints=new int[10];
        for(int i=0;i<ints.length;i++)
            ints[i]=(int)(Math.random()*500+1);
        //Length of Array using count()
        System.out.println("Stream.count()-->Length of Array: "+Arrays.stream(ints).count());
        //forEach() for displaying elements
        System.out.println("Array Elements using stream.forEach(): ");
        Arrays.stream(ints).forEach((value)-> System.out.println(value));
        //sorted() for sorting elements of array using Stream
        System.out.println("Sorted elements using sorted(): ");
        Arrays.stream(ints).sorted().forEach((value -> System.out.println(value)));
        //Printing only even numbers using stream.filter(Condition check)
        System.out.println("Displaying even numbers using filter(): ");
        Arrays.stream(ints).filter((x)->(x%2==0)).forEach((value -> System.out.println(value)));
        //Printing only even numbers using stream.filter(Condition check) in sorted order
        System.out.println("Displaying even numbers in sorted order using filter().sorted : ");
        Arrays.stream(ints).filter((x)->(x%2==0)).sorted().forEach((value -> System.out.println(value)));
        //adding elements in array using stream.sum
        System.out.println("Adding elements in array using stream.sum(): "+Arrays.stream(ints).sum());
        //Printing max element in Array using stream.max
        System.out.println("Printing max element in Array using stream.max(): "+Arrays.stream(ints).max().getAsInt());
        //Printing min element in Array using stream.min
        System.out.println("Printing min element in Array using stream.min(): "+Arrays.stream(ints).min().getAsInt());
        //Remove duplicate elements from Array using stream.distinct
        int[] numbers={50,40,30,20,10,10,20,30,40,50};
        System.out.println("Remove duplicate elements from Array using stream.distinct(): ");
        Arrays.stream(numbers).distinct().forEach((value -> System.out.println(value)));
        System.out.println("Using String[]: ");
        String[] names={"Anne","Chloe","Meg","Joe","Zoey"};
        Arrays.stream(names).forEach((name)->System.out.println(name));
    }
}
