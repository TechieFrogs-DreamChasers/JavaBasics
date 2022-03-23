package com.java8.practice.stream;

import java.util.List;
import java.util.stream.Collectors;

public class ConsumerMain {
    public static void main(String[] args) {
        List<Consumer> phones = ConsumerDataBase.contactList();
        List<String> names = phones.stream().map(consumer -> consumer.getName()).collect(Collectors.toList());
        System.out.println(names);
        List<List<String>> list = phones.stream().map(consumer -> consumer.getPhone()).collect(Collectors.toList());
        System.out.println(list);
        List<String> phoneNumbers = phones.stream().flatMap(consumer -> consumer.getPhone().stream()).collect(Collectors.toList());
        System.out.println(phoneNumbers);
    }
}
