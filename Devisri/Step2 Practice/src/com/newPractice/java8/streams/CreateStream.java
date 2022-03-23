package com.newPractice.java8.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(5,15,20,25,30,35,40,45,50);
        System.out.println(">>>Stream.of(values...):  ");
        numbers.forEach(System.out::println);
        System.out.println();
        System.out.println(">>>Stream.of(new Integer[]{values...}):  ");
        Stream<Integer> numberArray = Stream.of(new Integer[]{1,2,3,4,5,6,7,8,9,10});
        numberArray.forEach(System.out::println);
        System.out.println();
        System.out.println(">>>list.Stream():  ");
        List<String> words = new ArrayList<>();
        Collections.addAll(words,"Prepare","Start","Glow","Hail","Land");
        Stream<String> wordsStream = words.stream();
        wordsStream.forEach(System.out::println);
        System.out.println();
        System.out.println(">>>Stream.generate():  ");
        Stream<Integer> values = Stream.generate(()->(new Random().nextInt(100)));
        values.limit(15).forEach(System.out::println);
        System.out.println();
        System.out.println(">>>Stream of String chars: ");
        IntStream stream = "Alfred is working from 18 months in this manor!!!".chars();
        stream.forEach(c-> System.out.println((char) c));
        System.out.println();
        Stream<String> names_1 = Stream.of("Anna","Brad","Chad","Dave","Elsa");
        Stream<String> names_2 = Stream.of("Freya","Grace","Harry","Ian","John");
        Stream<String> names = Stream.concat(names_2,names_1);
        System.out.println("Stream.concat(stream1,stream2): ");
        names.sorted().forEach(System.out::println);
        System.out.println();
        System.out.println("Stream.iterate(): ");
        Stream.iterate(2,n->n*n).limit(5).forEach(System.out::println);
    }
}
