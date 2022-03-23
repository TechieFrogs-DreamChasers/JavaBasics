package com.newPractice.collections.myprograms.list;

import java.util.Enumeration;
import java.util.Stack;

public class WorkWithS {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.add("Cat");
        animals.push("Dog");
        boolean horse = animals.add("Horse");
        System.out.println(horse);
        animals.push("Lion");
        animals.add("Tiger");
        animals.push("Duck");
        System.out.println(animals);
        System.out.println(animals.peek());
        System.out.println(animals.pop());
        Enumeration<String> enu = animals.elements();
        while (enu.hasMoreElements())
            System.out.println(enu.nextElement());
        System.out.println(animals.peek());
        int lion = animals.search("Lion");//2
        System.out.println(lion);
        System.out.println(animals.search("Tiger"));//1
        System.out.println(animals.search("Horse"));//3
        System.out.println(animals.search("Duck"));//-1

    }
}
