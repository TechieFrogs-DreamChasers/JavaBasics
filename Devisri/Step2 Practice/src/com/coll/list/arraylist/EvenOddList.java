package com.coll.list.arraylist;

import java.util.ArrayList;

public class EvenOddList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers_List=new ArrayList<>();
        for(int i=1;i<=20;i++){
            numbers_List.add(i);
        }
        System.out.println(numbers_List);
        ArrayList<Integer> odd_Numbers=new ArrayList<>();
        ArrayList<Integer> even_Numbers=new ArrayList<>();
        for (int i=0;i< numbers_List.size();i++){
            if(numbers_List.get(i)%2==0){
                even_Numbers.add(numbers_List.get(i));
            }else{
                odd_Numbers.add(numbers_List.get(i));
            }
        }
        System.out.println(even_Numbers);
        System.out.println(odd_Numbers);
    }
}
