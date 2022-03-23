package com.newPractice.java8.mr;

import java.util.*;
import java.util.function.*;

public class DemoInstanceMethodReferences {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Anna","Karen","Henry"));
        Predicate<ArrayList<String>> rp = new ReferenceSampleMethods()::isWordEmpty;
        System.out.println("Predicate-> Instance Method References: "+rp.test(namesList));
        System.out.println();
        BiPredicate<ArrayList<String>,String> rbp = new ReferenceSampleMethods()::isNamePresentInList;
        System.out.println("BiPredicate-> Instance Method References: "+rbp.test(namesList,"Brad"));
        System.out.println();
        Supplier<List<String>> rs = new ReferenceSampleMethods()::displayRefCityStateMaps;
        System.out.println("Supplier-> Instance Method References: "+rs.get());
        System.out.println();
        Function<String[],List<String>> rf = new ReferenceSampleMethods()::displayRefColorsLists;
        String[] colors = {"White","Pink","Black"};
        System.out.println("Function-> Instance Method References: "+rf.apply(colors));
        System.out.println();
        BiFunction<HashSet<Integer>,HashSet<Integer>,HashSet<Integer>> rbf = new ReferenceSampleMethods()::displayRefNumbers;
        HashSet<Integer> evenSet = new HashSet<>();
        Collections.addAll(evenSet,2,4,8,6,10,12,14,16,18,20,22,24);
        HashSet<Integer> oddSet = new HashSet<>();
        Collections.addAll(oddSet,1,3,5,7,9,11,13,15,17,19,21,23,25);
        System.out.println("BiFunction-> Instance Method References: "+rbf.apply(evenSet,oddSet));
        System.out.println();
        Consumer<ArrayList<Integer>> rc = new ReferenceSampleMethods()::displayRefDoubleNumbers;
        ArrayList<Integer> list = new ArrayList<>(oddSet);
        rc.accept(list);
        System.out.println();
        BiConsumer<ArrayList<Integer>,ArrayList<Integer>> rbc = new ReferenceSampleMethods()::displayRefTwoLists;
        ArrayList<Integer> list2 = new ArrayList<>(evenSet);
        rbc.accept(list,list2);
        System.out.println();
        //Supplier<List<String>> supplier =()-> StaticSampleMethods::displayCityStateMap;
    }
}
