package com.java8.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsumerDataBase {
    public static List<Consumer> contactList(){
        return Stream.of(new Consumer("Arjun", Arrays.asList("8521479630","7412589630")),
                new Consumer("Barun", Arrays.asList("9521479630","8412589630")),
                new Consumer("Leela", Arrays.asList("6521479630","9412589630")),
                new Consumer("Madhu", Arrays.asList("7521479630","8412589630")),
                new Consumer("Neela", Arrays.asList("6521479630","6412589630"))
                ).collect(Collectors.toList());
    }
}
