package com.newPractice.collections.ALcodingQ;

import java.util.ArrayList;
import java.util.Scanner;

public class LinesAl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfLines = Integer.parseInt(input.nextLine());
        ArrayList<ArrayList> list = new ArrayList<>();
        for(int i=0;i<numOfLines;i++){
            int numbers = input.nextInt();
            ArrayList<Integer> integers = new ArrayList<>();
            for(int j=0;j<numbers;j++){
                integers.add(input.nextInt());
            }
            list.add(integers);
            input.nextLine();
        }
        int queries = Integer.parseInt(input.nextLine());
        for(int i=0;i<queries;i++){
            int a = input.nextInt()-1;
            int b = input.nextInt()-1;
            input.nextLine();
            if(a<list.size() && b<list.get(a).size()){
                System.out.println(list.get(a).get(b));
            }else{
                System.out.println("ERROR!");
            }
        }
        input.close();
    }
}
