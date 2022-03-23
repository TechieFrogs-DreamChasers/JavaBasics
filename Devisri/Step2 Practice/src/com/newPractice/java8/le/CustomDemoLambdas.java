package com.newPractice.java8.le;

import com.newPractice.java8.fi.Addition;
import com.newPractice.java8.fi.Division;
import com.newPractice.java8.fi.Multiplication;
import com.newPractice.java8.fi.Subtraction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CustomDemoLambdas {
    public static void main(String[] args) {
        Random r = new Random();
        int value_1 = r.nextInt(1000);
        int value_2 = r.nextInt(1000);
        Addition addition = (a,b)-> System.out.println("Addition: "+(a+b));
        System.out.println(value_1+" "+value_2);
        addition.add(value_1,value_2);
        Subtraction subtraction = (a,b)-> System.out.println("Subtraction: "+(a-b));
        subtraction.sub(value_1,value_2);
        Multiplication multiplication = (a,b)-> System.out.println("Multiplication: "+(a*b));
        multiplication.mul(value_1,value_2);
        Division division = (a,b)-> System.out.println("Division: "+(a/b));
        division.div(value_1,value_2);
        VMessage msg = ()-> System.out.println("Void -> Greet Message: ");
        msg.greetMessage();
        SMessage sMessage = (m)-> m.concat(" Functional Interface!!!");
        System.out.println("String -> Send Message: "+sMessage.sendMessage("Hello!!! Good Morning"));
        ITotal total = (a,b)->(a+b);
        System.out.println("Integer-> ITotal: "+total.getTotal(value_1,value_2));
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<15;i++){
            list.add(r.nextInt(500));
        }
        IDisplayList displayList = (numbers -> numbers);
        System.out.println("ArrayList-> displayList: "+displayList.displayNumbers(list));
        String[] words = {"Anna","is","studying","Java"};
        SDisplayArrays arr = (word)->word;
        System.out.println(Arrays.toString(arr.displayWords(words)));
    }
}
