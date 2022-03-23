package com.newPractice.java8.le;

import com.newPractice.collections.myprograms.DataForCollections;

import java.util.*;
import java.util.function.*;

/*
Function--> **
BiFunction--> **
Predicate--> **
BiPredicate--> **
Supplier--> **
Consumer--> **
BiConsumer--> **
 */
public class FunctionalDemoLambdas {
    public static void main(String[] args) {
        ArrayList<Integer> list_1 = new ArrayList<>();
        Collections.addAll(list_1,5,15,25,20,30,35,40,45,50);
        ArrayList<Integer> list_2 = new ArrayList<>(list_1);
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<20;i++){
            numbers.add((int)(Math.random()*500+2));
        }
        Predicate<String> predicate = (s)->{
            if(!s.isEmpty())
                return true;
            else
                return false;
        };
        System.out.println("Predicate: "+predicate.test(""));
        Predicate<ArrayList<Integer>> p = (list)->{
            if(list.isEmpty())
                return true;
            else{
                System.out.println("Numbers: "+list_1);
                return false;
            }
        };
        System.out.println("List with Predicate: "+p.test(list_1));
        System.out.println();
        BiPredicate<String,String> bp = (s1,s2)->{
            if(s1.contains(s2))
                return true;
            else
                return false;
        };
        System.out.println("BiPredicate: "+bp.test("Testing","ing"));
        BiPredicate<ArrayList<Integer>,ArrayList<Integer>> biList = (l1,l2)->{
            if (l1.containsAll(l2)){
                System.out.println("List-1: "+list_1+"\t"+"List-2: "+list_2);
                return true;
            }
            else
                return false;
        };
        System.out.println("List with BiPredicate: "+biList.test(list_1,list_2));
        System.out.println();
        Supplier<String> supplier = ()->"This is Supplier Functional Interface Example!!!";
        System.out.println("Supplier: "+supplier.get());
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Anna","Brad","Chad","Dane","Elsa"));
        Supplier<ArrayList<String>> listSupplier = ()->names;
        System.out.println("List with Supplier: "+listSupplier.get());
        System.out.println();
        Function<Integer,String> fn = (radius)->"Area of Circle: "+(Math.PI*radius*radius);
        System.out.println("Function-> Circle Area: "+fn.apply(15));
        Function<ArrayList<String>,String> functionList=(name)->"List with Function: "+name;
        System.out.println(functionList.apply(names));
        System.out.println();
        BiFunction<Integer,Integer,String> bps = (length,width)->"Bi-Function-> Area of Rectangle: "+(length*width);
        System.out.println(bps.apply(15,10));
        HashSet<Integer> evenNumbers = new HashSet<>();
        HashSet<Integer> oddNumbers = new HashSet<>();
        for(int i=0;i< numbers.size();i++){
            if(numbers.get(i)%2==0)
                evenNumbers.add(numbers.get(i));
            else
                oddNumbers.add(numbers.get(i));
        }
        HashSet<Integer> allNumbers = new HashSet<>();
        BiFunction<HashSet<Integer>,HashSet<Integer>,HashSet<Integer>> bfs = (hs1,hs2)->{
             allNumbers.addAll(hs1);
             allNumbers.addAll(hs2);
             return allNumbers;
        };
        System.out.println("Set with BiFunction: "+bfs.apply(evenNumbers,oddNumbers));
        System.out.println();
        Consumer<String> cs = (s)-> System.out.println("This is "+s+" Example!!!");
        cs.accept("Consumer");
        Map<String,String> map = DataForCollections.getCityCountriesMap();
        Consumer<Map<String,String>> csm = (maps)-> System.out.println("Map with Consumer: "+maps);
        csm.accept(map);
        System.out.println();
        BiConsumer<Integer,Integer> perm = (length,width)-> System.out.println("BiConsumer-> Perimeter of Rectangle: "+(2*(length+width)));
        perm.accept(15,10);
        BiConsumer<HashSet<Integer>,HashSet<Integer>> bcs =
                (hs_1,hs_2)-> System.out.println("BiConsumer with HashSet: "+hs_1+"\t"+hs_2);
        bcs.accept(evenNumbers,oddNumbers);
    }
}
