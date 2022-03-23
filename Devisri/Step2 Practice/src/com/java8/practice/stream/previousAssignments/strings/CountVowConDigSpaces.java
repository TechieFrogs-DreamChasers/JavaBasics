package com.java8.practice.stream.previousAssignments.strings;

import java.util.Arrays;
import java.util.List;


public class CountVowConDigSpaces {
    public static void main(String[] args) {
        String s="These are 100 counted green apples";
        String[] letters=s.toLowerCase().split("");
        List<String> vowels=Arrays.asList("a","e","i","o","u");
        List<String> consonants=Arrays.asList
                ("b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z");
        List<String> digits=Arrays.asList("0","1","2","3","4","5","6","7","8","9");
        List<String> space=Arrays.asList(" ");

        long count_Vowels = Arrays.stream(letters).filter(vowels::contains).count();
        long count_Consonants = Arrays.stream(letters).filter(consonants::contains).count();
        long count_Digits = Arrays.stream(letters).filter(digits::contains).count();
        long count_Spaces = Arrays.stream(letters).filter(space::contains).count();

        System.out.println("String: "+s);
        System.out.println("Vowels:- "+count_Vowels+"\t Consonants:- "+count_Consonants+"\t Digits:- "+count_Digits+"\t Spaces:- "+count_Spaces);




    }
}
