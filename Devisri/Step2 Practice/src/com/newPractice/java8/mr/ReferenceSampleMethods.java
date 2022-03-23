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
public class ReferenceSampleMethods {
    public Boolean isWordEmpty(ArrayList<String> names){
        for(int i=0;i< names.size();i++){
            if(names.get(i).isEmpty()){
                System.out.println("Predicate With List: "+names.get(i));
                return true;
            }else{
                System.out.println("Predicate With List: "+names.get(i));
                return false;
            }
        }
        return true;
    }
    public Boolean isNamePresentInList(ArrayList<String> names,String name){
        if(names.contains(name)){
            System.out.println("Bi-Predicate With List: "+names+" \t "+name);
            return true;
        }else{
            System.out.println("Bi-Predicate With List: "+names+" \t "+name);
            return false;
        }
    }
    public List<String> displayRefCityStateMaps(){
        HashMap<String,String> csMap = new HashMap<>();
        csMap.put("Ahmedabad","Gujarat");
        csMap.put("Shimla","Himachal Pradesh");
        csMap.put("Jaipur","Rajasthan");
        csMap.put("Mumbai","Maharashtra");
        csMap.put("Bangalore","Karnataka");
        return csMap.values().stream().collect(Collectors.toList());
    }
    public List<String> displayRefColorsLists(String[] colors){
        List<String> colorsList = new ArrayList<>(Arrays.asList(colors));
        return colorsList;
    }
    public HashSet<Integer> displayRefNumbers(HashSet<Integer> evenSet, HashSet<Integer> oddSet){
        HashSet<Integer> numberSet = new HashSet<>(evenSet);
        numberSet.addAll(oddSet);
        return numberSet;
    }
    public void displayRefDoubleNumbers(ArrayList<Integer> doubles){
        doubles.stream().map(e->e*e*e).forEach(e-> System.out.println("Consumer--> Instance Method References: List-> "+e));
    }
    public void displayRefTwoLists(ArrayList<Integer> list_1,ArrayList<Integer> list_2){
        System.out.println("BiConsumer Instance Method References--> List-1: "+list_1+" \t "+"List-2: "+list_2);
    }
}
