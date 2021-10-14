package com.TcaNqit.Coding;

import java.util.Scanner;

//The Program will receive 3 english words as inputs...
public class Question16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Enter String " + (i + 1) + ": ");
            String str = scanner.nextLine();
            strings[i] = str;
        }
        strings[0] = strings[0].toLowerCase();
        char[] chars = strings[0].toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
                chars[i] = '%';
            }
        }
        strings[1] = strings[1].toLowerCase();
        char[] chars2 = strings[1].toCharArray();
        for (int i = 0; i < chars2.length; i++) {
            if (!(chars2[i] == 'a' || chars2[i] == 'e' || chars2[i] == 'i' || chars2[i] == 'o' || chars2[i] == 'u' || chars2[i] == 'A' || chars2[i] == 'E' || chars2[i] == 'I' || chars2[i] == 'O' || chars2[i] == 'U')) {
                chars2[i] = '#';
            }
        }
        String s1 = new String(chars);
        String s2 = new String(chars2);
        strings[2] = strings[2].toUpperCase();
        char[] chars3 = strings[2].toCharArray();
        String s3 = new String(chars3);
        String s = s1 + s2 + s3;
        System.out.println(s);
        scanner.close();
    }
}
/*
Enter String 1:
How
Enter String 2:
are
Enter String 3:
you
h%wa#eYOU
 */