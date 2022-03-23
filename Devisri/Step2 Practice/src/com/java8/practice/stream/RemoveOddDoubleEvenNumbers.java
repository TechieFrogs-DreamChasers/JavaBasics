package com.java8.practice.stream;

import java.util.ArrayList;
import java.util.List;

public class RemoveOddDoubleEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();

        for(int i=0;i<10;i++)
            numbers.add((int)(Math.random()*50+1));
        System.out.println(numbers);//

        numbers.stream().filter((number)->(number%2==0)).map((value)->value*value).forEach(
                (number)->System.out.println(number));
    }

}
