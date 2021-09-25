package com.Practice.Strings;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
/*
*String():Creates empty string object.
*String(String value): Creates String objects with the string value
*String(char[] ch): Creates String object  with the given array values.
*String(char ch, int offset, int count):
Creates String object with the given array values start with offset by including with the  given count of characters.
*String(byte[] b): Creates String object with the given byte array values.
*String(byte[] b, int offset, int count):
Creates String object with the given byte array values starts with offset by including with the given count of bytes
 */
public class Constructors {
    public static void main(String[] args) {
        String s1=new String();//default constructors. empty String Object
        System.out.println("********: "+s1);
        s1="First Constructor";//empty object now has some string value
        String s2=new String("Second Constructor");//string obj with value
        char[] ch=new char[]{'J','a','v','a','.'};
        String s3=new String(ch);//string object with char array values,Third constructor
        int[] arr=new int[]{1,2,3,4,5};
        String s4=new String(String.valueOf(arr.length));//or
        String s5= Arrays.toString(arr);
        String s6=new String(ch,1,3);//ch=array,offset=1->a,count=3->ava, fourth constructor
        String str="Meghan";
        byte[] barr=str.getBytes();
        String s7=new String(barr);//string object with byte array values, Fifth constructor
        System.out.println(s7);//Meghan
        s7=Arrays.toString(barr);
        String s8=new String(barr,2,4);//sixth constructor, like s6 with byte values

        System.out.println("First Constructor: "+s1);
        System.out.println("Second Constructor: "+s2);
        System.out.println("Third Constructor: "+s3);
        System.out.println("Passing length of integer array using valueOf(): "+s4);//5
        System.out.println("Displaying int arr as String: "+s5);
        System.out.println("Fourth Constructor: "+s6);
        System.out.println("Fifth Constructor using Arrays.toString(barr) :"+s7);//[77,101,103,104,97,110]
        System.out.println("Sixth Constructor: "+s8);

    }
}
