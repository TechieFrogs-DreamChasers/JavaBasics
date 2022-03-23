package com.java8.practice.stringjoiner;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class DemoStringJoiner {
    public static void main(String[] args) {
        StringJoiner s = new StringJoiner("$");
        s.add("John");
        s.add("Meghan");
        s.add("Sam");
        s.add("Brad");
        s.add("Shane");
        System.out.println(s);

        List<String> names = new ArrayList<>();
        names.add("Frank");
        names.add("Ian");
        names.add("Samuel");
        names.add("Bradley");
        names.add("Simon");
        System.out.println(names);
        String s1 = names.stream().collect(Collectors.joining("$"));
        System.out.println(s1);
    }
}
