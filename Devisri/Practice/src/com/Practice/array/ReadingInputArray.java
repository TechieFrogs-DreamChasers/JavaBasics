package com.Practice.array;

import java.util.Scanner;

public class ReadingInputArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s= sc.nextLine();
        String[] strings=s.split(" ");

        int[] ints=new int[5];
        double[] doubles=new double[5];
        boolean[] booleans=new boolean[5];

        byte[] bytes=new byte[5];
        char[] chars=new char[5];

        for (int i=0;i< strings.length;i++){
            System.out.println("String at index["+i+"] is: "+strings[i]);
        }

        for (int i=0;i< ints.length;i++){
            System.out.println("Enter an Integer Number:");
            ints[i]= sc.nextInt();
            sc.nextLine();
        }
        for (int i=0;i< ints.length;i++){
            System.out.println("Number at index["+i+"] is: "+ints[i]);
        }

        for (int i=0;i< doubles.length;i++){
            System.out.println("Enter a Double Number:");
            doubles[i]= sc.nextDouble();
            sc.nextLine();
        }
        for (int i=0;i< doubles.length;i++){
            System.out.println("Number at index["+i+"] is: "+doubles[i]);
        }

        for (int i=0;i< booleans.length;i++){
            System.out.println("Enter a Boolean Value:");
            booleans[i]= sc.nextBoolean();
            sc.nextLine();
        }
        for (int i=0;i< booleans.length;i++){
            System.out.println("Value at index["+i+"] is: "+booleans[i]);
        }

        for (int i=0;i< chars.length;i++){
            System.out.println("Enter a Character:");
            chars[i]= sc.next().charAt(0);
            sc.nextLine();
        }
        for (int i=0;i< chars.length;i++){
            System.out.println("Character at index["+i+"] is: "+chars[i]);
        }

        for (int i=0;i< bytes.length;i++){
            System.out.println("Enter a Byte Number:");
            bytes[i]= sc.nextByte();
            sc.nextLine();
        }
        for (int i=0;i< bytes.length;i++){
            System.out.println("Number at index["+i+"] is: "+bytes[i]);
        }
        sc.close();
    }
}
