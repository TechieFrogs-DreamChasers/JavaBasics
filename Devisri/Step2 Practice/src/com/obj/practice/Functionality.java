package com.obj.practice;

public class Functionality {
    public static void main(String[] args) {
        Animal an1 = new Animal("Dog", 3);
        Animal an2 = new Animal("Cat", 2);
        System.out.println(an1.hashCode());
        System.out.println(an2.hashCode());
        String s1="Hello";
        String s2="Hello";
        System.out.println(s1.hashCode()==s2.hashCode());//true
        System.out.println(an1);
        System.out.println(an2);
        //System.out.println(an1.equals(an2));//False=before overriding
        System.out.println(an1.equals(an2));
    }
}
