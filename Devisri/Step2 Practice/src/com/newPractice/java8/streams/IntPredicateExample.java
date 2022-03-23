package com.newPractice.java8.streams;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntPredicateExample {
    public static void main(String[] args) {
        IntPredicate isOdd = arg -> arg % 2 == 0;
        IntStream stream =IntStream.range(1,20);
        List<Integer> list = stream.filter(isOdd.and(IntPredicateExample::isPrime)).boxed().collect(Collectors.toList());
        System.out.println(list);
    }
    public static boolean isPrime(int i){
        IntPredicate predicate = index-> i % index == 0;
        return i > 1 && (IntStream.range(2,i).noneMatch(predicate));
    }
}
