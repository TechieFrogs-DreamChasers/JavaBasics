package com.java8.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FeaturesMethodStream {
    public static void main(String[] args) {
        //IntStream numbers generating from(inclusive) and to(exclusive) range
        System.out.println("IntStream numbers generating from(inclusive) and to(exclusive) range: ");
        IntStream.range(1,11).forEach(System.out::println);
        //skip(number)
        System.out.println("Using skip() on IntStream: ");
        IntStream.range(1,11).skip(5).forEach(System.out::println);
        //sum()
        System.out.println("Using Sum() on IntStream: ");
        System.out.println("Sum: "+IntStream.range(1,11).sum());
        //Stream.of()
        System.out.println("Using Stream.Of(String): ");
        Stream.of("Thomas","Bradley","Anne","Ella","Yvonne").forEach(System.out::println);
        //Stream.of().sorted()
        System.out.println("Using Stream.Of(String).sorted(): ");
        Stream.of("Thomas","Bradley","Anne","Ella","Yvonne").sorted().forEach(System.out::println);
        //Stream.of().sorted().findFirst().ifPresent
        System.out.println("Using Stream.of().sorted().findFirst().ifPresent(): ");
        Stream.of("Thomas","Bradley","Anne","Ella","Yvonne").sorted().findFirst().ifPresent(System.out::println);
        //Not sorted
        System.out.println("Using Stream.Of().findFirst().ifPresent(): ");
        Stream.of("Thomas","Bradley","Anne","Ella","Yvonne").findFirst().ifPresent(System.out::println);
        //findAny()
        System.out.println("Using Stream.Of().findAny().ifPresent(): ");
        Stream.of("Thomas","Bradley","Anne","Ella","Yvonne").findAny().ifPresent(System.out::println);
        //starsWith
        System.out.println("Using startsWith() in Array to Stream.filter: ");
        String[] fruits={"Melon","Berry","Banana","Apple","Peach","Pine Apple","StrawBerry","Cherry","Cranberry","BlueBerry"};
        Arrays.stream(fruits).filter((fruit)->fruit.startsWith("B")).sorted().forEach(System.out::println);
        //average()
        System.out.println("Using Arrays.Stream.map.Average().ifPresent(): ");
        Arrays.stream(new int[]{3,5,7,9,11,13,15,17,19,21}).map((x)->x*x).average().ifPresent(System.out::println);
        List<String> list=new ArrayList<>(Arrays.asList(fruits));
        System.out.println(list);
        System.out.println("Using toLowerCase() in list to Stream.map: ");
        list.
                stream().
                filter(x->x.startsWith("S")).
                map(String::toLowerCase).
                forEach(System.out::println);
        //Reduce
        List<Double> numbers=new ArrayList<>();
        for(int i=0;i<10;i++)
            numbers.add((Math.random()*10+1));
        System.out.println(numbers);
        System.out.println("Using reduce(): ");
        System.out.println("Sum: "+numbers.stream().reduce(0.0, Double::sum));
        Optional<Integer> sum = Stream.of(90,25,30,55,28,35,42,82,22).reduce((a,b)->a+b);
        System.out.println(sum);


    }
}
