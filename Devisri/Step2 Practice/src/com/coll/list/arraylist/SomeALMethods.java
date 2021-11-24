package com.coll.list.arraylist;

import java.util.*;

public class SomeALMethods {
    public static void main(String[] args) {
        List<Integer> even_Numbers=new ArrayList<>();
        List<Integer> odd_Numbers=new ArrayList<>();
        for(int i=2;i<20;i+=2){
            even_Numbers.add(i);
        }
        System.out.println(even_Numbers);
        for(int i=1;i<20;i+=2){
            odd_Numbers.add(i);
        }
        System.out.println(odd_Numbers);
        //addAll()
        odd_Numbers.addAll(even_Numbers);
        System.out.println(odd_Numbers);
        System.out.println(even_Numbers);
        //Making arraylist immutable
        List<Character> characterList=new ArrayList<>();
        characterList.add('a');
        characterList.add('e');
        characterList.add('i');
        characterList.add('o');
        characterList.add('u');
        System.out.println(characterList);
        List<Character> imm= Collections.unmodifiableList(characterList);
        //imm.add('U');UnsupportedOperationException
        //System.out.println(characterList);
        //retainAll() to display common elements between lists
        ArrayList<String> list1=new ArrayList<>();
        list1.add("Sam");
        list1.add("Tom");
        list1.add("Ann");
        list1.add("Bob");
        list1.add("Meg");
        ArrayList<String> list2=new ArrayList<>();
        list2.add("Jim");
        list2.add("Tom");
        list2.add("Tim");
        list2.add("Bob");
        list2.add("Joe");
        list1.retainAll(list2);
        System.out.println(list1);//Tom,Bob
        //RemoveAll() canbe used to get unique elements between arraylist
        ArrayList<String> list3=new ArrayList<>();
        list3.add("Sam");
        list3.add("Tom");
        list3.add("Ann");
        list3.add("Bob");
        list3.add("Meg");
        ArrayList<String> list4=new ArrayList<>();
        list4.add("Jim");
        list4.add("Tom");
        list4.add("Tim");
        list4.add("Bob");
        list4.add("Joe");
        list3.removeAll(list4);
        System.out.println(list3);
        ArrayList<String> al=new ArrayList<>();
        al.add("Monday");
        al.add("Tuesday");
        al.add("Wednesday");
        al.add("Thursday");
        al.add("Friday");
        al.add("Saturday");

    }
}
