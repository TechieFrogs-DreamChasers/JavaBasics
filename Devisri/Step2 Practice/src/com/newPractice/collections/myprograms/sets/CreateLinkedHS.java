package com.newPractice.collections.myprograms.sets;

import java.util.*;

public class CreateLinkedHS {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();
        for(int i=0;i<10;i++){
            numbers.add((int)(Math.random()*100+2));
        }
        System.out.println(numbers);
        System.out.println();

        Integer[] numArr = numbers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(numArr));
        System.out.println();
        LinkedHashSet<Integer> lset = new LinkedHashSet<>(Arrays.asList(numArr));
        System.out.println(lset);
        System.out.println();
        LinkedHashSet<String> names = new LinkedHashSet<>();
        Collections.addAll(names,null,"Anna",null,"Brad","Anna");
        System.out.println("Names: "+names);

    }
}
