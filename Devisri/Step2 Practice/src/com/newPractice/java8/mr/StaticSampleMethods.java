package com.newPractice.java8.mr;

import java.util.*;
import java.util.stream.Collectors;
/*
Predicate
BiPredicate
Supplier
Function
BiFunction
Consumer
BiConsumer
 */
public class StaticSampleMethods {
    public static Boolean isNamesListEmpty(ArrayList<String> names){
        if(names.isEmpty()){
            System.out.println("Predicate With List: "+names);
            return true;
        }else{
            System.out.println("Predicate With List: "+names);
            return false;
        }
    }
    public static Boolean isNamesPresent(ArrayList<String> names,ArrayList<String> nameList){
        if(names.containsAll(nameList)){
            System.out.println("Bi-Predicate With List: "+names+" \t "+nameList);
            return true;
        }else{
            System.out.println("Bi-Predicate With List: "+names+" \t "+nameList);
            return false;
        }
    }
    public static List<String> displayCityStateMap(){
        HashMap<String,String> csMap = new HashMap<>();
        csMap.put("Ahmedabad","Gujarat");
        csMap.put("Shimla","Himachal Pradesh");
        csMap.put("Jaipur","Rajasthan");
        csMap.put("Mumbai","Maharashtra");
        csMap.put("Bangalore","Karnataka");
        return csMap.values().stream().collect(Collectors.toList());
    }
    public static List<String> displayColorsList(String[] colors){
        return new ArrayList<>(Arrays.asList(colors));
    }
    public static HashSet<Integer> displayNumbers(HashSet<Integer> evenSet,HashSet<Integer> oddSet){
        HashSet<Integer> numberSet = new HashSet<>(evenSet);
        numberSet.addAll(oddSet);
        return numberSet;
    }
    public static void displayDoubleNumbers(ArrayList<Integer> doubles){
        doubles.stream().map(e->e*e).forEach(e-> System.out.println("Consumer--> Static: List-> "+e));
    }
    public static void displayTwoLists(ArrayList<Integer> list_1,ArrayList<Integer> list_2){
        System.out.println("BiConsumer --> List-1: "+list_1+" \t "+"List-2: "+list_2);
    }
}
