package com.Practice.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        byte[] rev = str.getBytes();
        byte[] res = new byte[rev.length];
        System.out.println(Arrays.toString(rev));
        for (int i = 0; i < rev.length; i++) {
            res[i] = rev[rev.length - i - 1];
        }
        System.out.println(new String(res));
        System.out.println(Arrays.toString(res));
        System.out.println("*******************************************");
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        byte[] reverse = string.getBytes();
        byte[] result = new byte[reverse.length];
        System.out.println(Arrays.toString(reverse));
        for (int i = 0; i < reverse.length; i++) {
            result[i] = reverse[reverse.length - i - 1];
        }
        System.out.println(new String(result));
        System.out.println(Arrays.toString(result));
    }
}
