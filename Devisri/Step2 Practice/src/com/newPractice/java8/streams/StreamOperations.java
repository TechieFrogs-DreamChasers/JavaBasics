package com.newPractice.java8.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.generate(()->(new Random().nextInt(1000)));
        List<Integer> integers = numbers.limit(20).collect(Collectors.toList());
        System.out.println("Collectors.toList(): "+integers);
        System.out.println();
        Stream<Integer> stream = integers.stream();
        Integer[] evenArr = stream.filter(i -> i % 2 == 0).toArray(Integer[]::new);
        System.out.println("Stream.toArray(): "+ Arrays.toString(evenArr));
        Stream<Integer> valueStream = integers.stream();
        Integer[] oddArr = valueStream.filter(i -> i % 2 != 0).toArray(Integer[]::new);
        System.out.println("Stream.toArray(): "+ Arrays.toString(oddArr));
        System.out.println();
        ArrayList<String> countries = new ArrayList<>();
        Collections.addAll(countries,
                "Chile","Argentina","India","Australia","Uk","England","Spain","Italy","Germany","Indonesia");
        System.out.println("Stream.filter(): ");
        countries.
                stream().
                filter(e->e.startsWith("A")).
                forEach(System.out::println);
        System.out.println();
        System.out.println("Stream.map(): ");
        countries.
                stream().
                filter(e->e.startsWith("I")).
                map(e->e.toUpperCase()).forEach(System.out::println);
        System.out.println();
        System.out.println("Stream.sorted(): ");
        countries.stream().sorted().forEach(System.out::println);
        System.out.println();
        System.out.println("Stream.match(): ");
        System.out.println("Any Match: "+countries.stream().anyMatch(s -> s.endsWith("a")));
        System.out.println("All Match: "+countries.stream().allMatch(s->s.contains("na")));
        System.out.println("None Match: "+countries.stream().noneMatch(s->s.startsWith("F")));
        System.out.println();
        System.out.println("Count: "+countries.stream().filter(s->s.startsWith("I")).count());
        System.out.println();
        System.out.println("Stream.reduce(): ");
        Optional<String> optional = countries.stream().filter(s->s.startsWith("I")).reduce((s1, s2) -> s1 + "$$$" + s2);
        optional.ifPresent(System.out::println);
        System.out.println();
        System.out.println("Stream.findFirst(): ");
        countries.stream().filter(e->e.contains("ia")).findFirst().ifPresent(System.out::println);
        System.out.println("Stream.findAny(): ");
        countries.stream().filter(e->e.contains("ia")).parallel().findAny().ifPresent(System.out::println);
        System.out.println();
        System.out.println("Stream.forEach: ");
        countries.stream().parallel().forEach(System.out::println);
        System.out.println();
        System.out.println("Stream.forEachOrdered: ");
        countries.stream().parallel().forEachOrdered(System.out::println);
        System.out.println();
    }
}
