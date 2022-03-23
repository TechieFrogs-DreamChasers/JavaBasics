package com.newPractice.collections.myprograms.queues;

import java.util.*;
import java.util.stream.Collectors;

public class CreateQueue {
    public static void main(String[] args) {
        Queue<String> animals = new PriorityQueue<>();
        Collections.addAll(animals,"Cat","Tiger","Dog");
        animals.offer("Lion");
        animals.offer("Horse");
        animals.offer("Duck");
        System.out.println(animals);
        System.out.println(animals.peek());
        animals.poll();
        System.out.println(animals);
        System.out.println(animals.peek());
        List<String> list = animals.stream().sorted().collect(Collectors.toList());
        System.out.println(list);
        System.out.println();
    }
}
