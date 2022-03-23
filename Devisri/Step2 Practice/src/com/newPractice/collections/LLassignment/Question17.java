package com.newPractice.collections.LLassignment;

import java.util.LinkedList;

//Join two linked lists
public class Question17 {
    public static void main(String[] args) {
        LinkedList<Character> lowercase = new LinkedList<>();
        for(int i=97;i<123;i++){
            lowercase.add((char) i);
        }
        System.out.println("Lowercase: "+lowercase);
        LinkedList<Character> uppercase = new LinkedList<>();
        for(int i=65;i<91;i++){
            uppercase.add((char) i);
        }
        System.out.println("Uppercase: "+uppercase);
        LinkedList<Character> alphabets = new LinkedList<>(uppercase);
        alphabets.addAll(lowercase);
        System.out.println("All: "+alphabets);
    }
}
