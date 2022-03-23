package com.newPractice.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class DemoIntLongDoubleStreams {
    public static void main(String[] args) {
        //primitives
        List<Integer> integers = IntStream.
                of(2, 25, 36, 95, 5, 6, 89, 2, 95, 63, 23, 21).
                boxed().collect(Collectors.toList());
        System.out.println("IntStream.boxed(): "+integers);
        System.out.println();
        List<Long> longs = LongStream.of(100l, 150l, 200l, 250l, 30l, 360l, 960l).boxed().collect(Collectors.toList());
        System.out.println("LongStream.boxed(): "+longs);
        System.out.println();
        List<Double> doubles = DoubleStream.of(25.3, 23.8, 26.9, 52.9, 12.8, 7.5).boxed().collect(Collectors.toList());
        System.out.println("DoubleStream.boxed(): "+doubles);
        System.out.println();
        //objects
        List<Integer> integersList = IntStream.
                of(2, 25, 36, 95, 5, 6, 89, 2, 95, 63, 23, 21).mapToObj(Integer::valueOf).collect(Collectors.toList());
        System.out.println("IntStream.mapToObj(): "+integersList);
        System.out.println();
        List<Long> longsList = LongStream.of(100l, 150l, 200l, 250l, 30l, 360l, 960l).mapToObj(Long::valueOf).collect(Collectors.toList());
        System.out.println("LongStream.mapToObj(): "+longsList);
        System.out.println();
        List<Double> doublesList = DoubleStream.of(25.3, 23.8, 26.9, 52.9, 12.8, 7.5).mapToObj(Double::valueOf).collect(Collectors.toList());
        System.out.println("DoubleStream.mapToObj(): "+doublesList);
        System.out.println();
        //toArray()
        int[] ints = IntStream.of(23, 25, 36, 45, 23, 22, 89, 90).toArray();
        long[] longArr = LongStream.of(100, 150, 200, 300, 250, 350, 400, 450, 500).toArray();
        double[] doubleArr = DoubleStream.of(2.5, 3.5, 4.5, 1.5, 5.5, 6.5, 7.8, 8.5, 9.6).toArray();
        System.out.println("IntStream.toArray(): "+ Arrays.toString(ints));
        System.out.println("LongStream.toArray(): "+ Arrays.toString(longArr));
        System.out.println("DoubleStream.toArray(): "+ Arrays.toString(doubleArr));
    }
}
