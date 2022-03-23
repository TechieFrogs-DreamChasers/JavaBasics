package com.java8.practice.stream;
//3sec86ms,109ms,2sec997ms
import java.util.ArrayList;
import java.util.List;

public class UsingCollectionsStream {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<30;i++)
            list.add((int)(Math.random()*500+1));
        list.stream().forEach(System.out::println);
        System.out.println("Printing numbers > 350 using filter(): ");
        list.stream().filter((x)->(x > 350)).sorted().forEach((value)-> System.out.println(value));
        List<Integer> squares=new ArrayList<>();
        for(int i=0;i<20;i++)
            squares.add(i+1);
        System.out.println(squares);
        System.out.println("Printing square of odd numbers from list using filter(cond.) and map(): ");
        squares.stream().filter((x)->(x%2!=0)).map((x)->(x*x)).forEach((square)-> System.out.println(square));
        System.out.println("Printing cube of even numbers from list using filter(cond.) and map(): ");
        squares.stream().filter((x)->(x%2==0)).map((x)->(x*x*x)).forEach((square)-> System.out.println(square));

    }
}
