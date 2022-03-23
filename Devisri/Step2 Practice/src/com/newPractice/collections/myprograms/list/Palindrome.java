package com.newPractice.collections.myprograms.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Palindrome {
    public static void main(String[] args) {
        String name = "redder";
        String[] names = name.split("");
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        Collections.reverse(namesList);
        ArrayList<String> copy = new ArrayList<>(Arrays.asList(names));
        if(namesList.equals(copy))
            System.out.println("It's a Palindrome");
        else
            System.out.println("not Palindrome");
    }
}
