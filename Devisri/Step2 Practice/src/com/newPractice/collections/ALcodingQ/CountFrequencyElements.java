package com.newPractice.collections.ALcodingQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountFrequencyElements {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        Collections.addAll(list, 'i', 'g', 'i', 'e', 'i', 'e', 'i', 'k', 'i', 's', 'f', 'e');
        List<Character> characters = list.stream().distinct().collect(Collectors.toList());
        for(Character ch : characters){
            System.out.println("Frequency of Character "+ch+" is: "+Collections.frequency(list,ch));
        }
    }
}