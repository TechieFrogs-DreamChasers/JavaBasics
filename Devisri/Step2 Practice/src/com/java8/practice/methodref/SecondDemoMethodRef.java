package com.java8.practice.methodref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondDemoMethodRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Harry","John","Sam","Anne","Ella");
        names.forEach((name)-> System.out.println(name));

        List<String> names_List = new ArrayList<>(names);
        names.forEach(System.out::println);
    }
}
