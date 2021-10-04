package com.Practice.array;

public class ReturnArray {
    public static void main(String[] args) {
        int[] in_arr;
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        in_arr = product(num,5);
        System.out.println("Table of 5:");
        for (int i = 0; i < (num.length); i++) {
            System.out.println("5 X " + num[i] + " = " + in_arr[i]);
        }
        String[] sarr;
        sarr = fruitString();
        for (String s : sarr) {
            System.out.println("Fruit at this index: " + s);
        }
    }

    static int[] product(int[] ints,int num) {
        int[] result = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            result[i] = ints[i] * num;
        }
        return result;
    }

    static String[] fruitString() {
        return new String[]{"Apple", "Mango", "Orange", "Grape", "Berry"};
    }
}
/*
Table of 5:
5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
5 X 4 = 20
5 X 5 = 25
5 X 6 = 30
5 X 7 = 35
5 X 8 = 40
5 X 9 = 45
5 X 10 = 50
Fruit at this index: Apple
Fruit at this index: Mango
Fruit at this index: Orange
Fruit at this index: Grape
Fruit at this index: Berry
 */
