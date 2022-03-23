package com.newPractice.java8.mr;

import java.util.*;
import java.util.function.*;

public class DemoStaticMethodReferences {
    public static void main(String[] args) {
        //Static Method Reference
        ArrayList<String> namesList = new ArrayList<>();
        Collections.addAll(namesList,"Anna","Chad","Brad","Elsa","Dave");
        Predicate<ArrayList<String>> sPredicate = StaticSampleMethods::isNamesListEmpty;
        System.out.println("Predicate->Static Method Reference: "+sPredicate.test(namesList));
        System.out.println();
        ArrayList<String> stringArrayList = new ArrayList<>(namesList);
        BiPredicate<ArrayList<String>,ArrayList<String>> bps = StaticSampleMethods::isNamesPresent;
        System.out.println("BiPredicate->Static Method Reference: "+bps.test(namesList,stringArrayList));
        System.out.println();
        String[] colors = {"Red","Black","Yellow","Blue","Cyan"};
        Supplier<List<String>> sp = StaticSampleMethods::displayCityStateMap;
        System.out.println("Supplier->Static Method Reference: "+sp.get());
        System.out.println();
        Function<String[],List<String>> sf = StaticSampleMethods::displayColorsList;
        System.out.println("Function->SMR: "+sf.apply(colors));
        System.out.println();
        BiFunction<HashSet<Integer>,HashSet<Integer>,HashSet<Integer>> sbf = StaticSampleMethods::displayNumbers;
        HashSet<Integer> evenSet = new HashSet<>();
        Collections.addAll(evenSet,2,4,8,6,10,12,14,16,18,20,22,24);
        HashSet<Integer> oddSet = new HashSet<>();
        Collections.addAll(oddSet,1,3,5,7,9,11,13,15,17,19,21,23,25);
        System.out.println("BiFunction->SMR: "+sbf.apply(evenSet,oddSet));
        System.out.println();
        Consumer<ArrayList<Integer>> sc = StaticSampleMethods::displayDoubleNumbers;
        ArrayList<Integer> evenList = new ArrayList<>(evenSet);
        sc.accept(evenList);
        System.out.println();
        BiConsumer<ArrayList<Integer>,ArrayList<Integer>> sbc = StaticSampleMethods::displayTwoLists;
        ArrayList<Integer> oddList = new ArrayList<>(oddSet);
        sbc.accept(evenList,oddList);
    }
}
