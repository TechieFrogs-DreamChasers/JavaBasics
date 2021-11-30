package com.coll.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoNotDuplicate {
    public static void main(String[] args) {
        Set<Integer> integerSet=new HashSet<>();
        System.out.println(integerSet.add(100));
        System.out.println(integerSet.add(200));
        System.out.println(integerSet.add(300));
        System.out.println(integerSet.add(400));
        System.out.println(integerSet.add(500));
        System.out.println(integerSet.add(100));
        System.out.println(integerSet.add(200));
        System.out.println(integerSet.add(300));
        System.out.println(integerSet.add(400));
        System.out.println(integerSet.add(500));
        System.out.println(integerSet);
        Set<Integer> integerLinkedSet=new LinkedHashSet<>();
        System.out.println(integerLinkedSet.add(400));
        System.out.println(integerLinkedSet.add(500));
        System.out.println(integerLinkedSet.add(200));
        System.out.println(integerLinkedSet.add(100));
        System.out.println(integerLinkedSet.add(300));
        System.out.println(integerLinkedSet.add(100));
        System.out.println(integerLinkedSet.add(200));
        System.out.println(integerLinkedSet.add(300));
        System.out.println(integerLinkedSet.add(400));
        System.out.println(integerLinkedSet.add(500));
        System.out.println(integerLinkedSet);
        Set<Integer> integerTreeSet=new TreeSet<>();
        System.out.println(integerTreeSet.add(500));
        System.out.println(integerTreeSet.add(400));
        System.out.println(integerTreeSet.add(200));
        System.out.println(integerTreeSet.add(300));
        System.out.println(integerTreeSet.add(100));
        System.out.println(integerTreeSet.add(100));
        System.out.println(integerTreeSet.add(200));
        System.out.println(integerTreeSet.add(300));
        System.out.println(integerTreeSet.add(400));
        System.out.println(integerTreeSet.add(500));
        System.out.println(integerTreeSet);
    }
}
