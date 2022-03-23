package com.java8.practice.stream.previousAssignments.basicPrograms;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DisplayVowels {
    public static void main(String[] args) {
        IntStream.
                rangeClosed('A', 'Z').
                filter(e->String.valueOf(e).equals(Stream.of('A','E','I','O','U'))).
                forEach(e-> System.out.println((char) e));
    }
}
