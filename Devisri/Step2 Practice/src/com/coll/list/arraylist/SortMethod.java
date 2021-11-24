package com.coll.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortMethod {
    public static void main(String[] args) {
        ArrayList<Integer> i_Al=new ArrayList<>();
        for(int i=0;i<10;i++){
            i_Al.add((int)(Math.random()*500+1));
        }
        ArrayList<Double> d_Al=new ArrayList<>();
        d_Al.add(990.59);
        d_Al.add(293.56);
        d_Al.add(1010.59);
        d_Al.add(523.56);
        d_Al.add(693.59);
        d_Al.add(101.56);
        d_Al.add(823.59);
        d_Al.add(369.56);
        d_Al.add(726.59);
        d_Al.add(425.56);
        ArrayList<Character> c_Al=new ArrayList<>();
        c_Al.add('a');
        c_Al.add('e');
        c_Al.add('i');
        c_Al.add('o');
        c_Al.add('u');
        c_Al.add('A');
        c_Al.add('E');
        c_Al.add('I');
        c_Al.add('O');
        c_Al.add('U');
        ArrayList<String> s_Al=new ArrayList<>();
        s_Al.add("Zack");
        s_Al.add("Meg");
        s_Al.add("Greg");
        s_Al.add("Noel");
        s_Al.add("Phill");
        s_Al.add("John");
        s_Al.add("Sam");
        s_Al.add("Tom");
        s_Al.add("Bob");
        s_Al.add("Chris");
        Collections.sort(i_Al);
        Collections.sort(d_Al);
        Collections.sort(c_Al);
        Collections.sort(s_Al);
        System.out.println(i_Al);
        System.out.println(d_Al);
        System.out.println(c_Al);
        System.out.println(s_Al);
        System.out.println(Collections.frequency(s_Al,"Bob"));
        System.out.println(Collections.frequency(c_Al,'e'));
        System.out.println(Collections.frequency(d_Al,101.56));
        System.out.println(Collections.frequency(i_Al,25));
    }
}
