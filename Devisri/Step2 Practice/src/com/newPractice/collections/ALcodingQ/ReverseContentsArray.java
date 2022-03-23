package com.newPractice.collections.ALcodingQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseContentsArray {
    public static void main(String[] args) {
        String[] words = {"Anne","Brad","Chris","Drew","Emma"};
        List<String> list = reverseArrayContents(words);
        System.out.println(list);
    }
    public static List<String> reverseArrayContents(String[] words){
        List<String> list = new ArrayList<>(Arrays.asList(words));
        Collections.reverse(list);
        return list;
    }
}
