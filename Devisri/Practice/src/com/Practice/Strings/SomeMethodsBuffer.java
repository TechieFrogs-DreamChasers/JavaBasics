package com.Practice.Strings;

import java.util.Arrays;

public class SomeMethodsBuffer {
    public static void main(String[] args) {
        //passing null
        String str = null;
        StringBuffer sb = new StringBuffer();
        /*sb.append(str);
        System.out.println("Length: "+sb.length());//4
        System.out.println("String value: "+sb);//null*/
        if (str != null) {
            sb.append(str);
        }
        System.out.println("Length: " + sb.length());//0
        System.out.println("String value: " + sb);//" "
        //appending a new line to StringBuffer
        StringBuffer sb1 = new StringBuffer("Did");
        sb1.append(System.getProperty("line.separator"));
        sb1.append("You");
        sb1.append(System.getProperty("line.separator"));
        sb1.append("Go");
        System.out.println(sb1);//or
        /*
        String value:
        Did
        You
        Go */
        sb1.append(System.lineSeparator());
        sb1.append("Out");
        sb1.append(System.lineSeparator());
        sb1.append("Shopping?");
        System.out.println(sb1);
        /*
        String value:
        Did
        You
        Go
        Did
        You
        Go
        Out
        Shopping? */
        //char charAt(int index)-The charAt() method returns the character present at the specified index.
        StringBuffer sb2 = new StringBuffer("Class is StringBuffer");
        System.out.println("charAt(index): " + sb2.charAt(9));//S
        //int codePointAt(int index)-It returns the Unicode code point of the character at the specified index.
        System.out.println("codePoint(index): " + sb2.codePointAt(2));//a=97
        //int codePointBefore(int index)-It returns the Unicode code point) of the character before the specified index
        System.out.println("codePointBefore(index): " + sb2.codePointBefore(3));//a=97
        //int codePointCount(int beginIndex, int endIndex)
        // This method returns the number of Unicode code points in the String between the specified range.
        System.out.println("codePointCount(begin,end): " + sb2.codePointCount(0, 21));//21
        System.out.println("codePointCount: " + sb2.codePointCount(1, 20));//19
        //void getChars(int sourceBegin, int sourceEnd, char[] destination, int destBegin)
        // This method copies the specified characters in a range to a specific destination character array.
        int start = 0;
        int end = 21;
        char[] carr = new char[end - start];
        sb2.getChars(start, end, carr, 0);
        System.out.println("getChars(): " + Arrays.toString(carr));//[C, l, a, s, s,  , i, s,  , S, t, r, i, n, g, B, u, f, f, e, r]
        //int indexOf(String str, int fromIndex)
        // This method returns the index of the first occurrence of the specified substring
        // that starts at the specified index.
        System.out.println("indexOf(str): " + sb2.indexOf("Buffer"));//15
        System.out.println("indexOf(str,from index): " + sb2.indexOf("String", 0));//9
        //int lastIndexOf(String str)-This method returns the index of the last occurrence of the specified substring.
        System.out.println("lastIndex(str): " + sb2.lastIndexOf("is"));//6
        System.out.println("lastIndex(str,index): " + sb2.lastIndexOf("Buffer", 0));//-1
        //void setCharAt(int index, char ch)-This method sets a character at the specified index.
        StringBuffer sb3 = new StringBuffer("StringBuffer is mutable.");
        sb3.setCharAt(23, '!');
        System.out.println("setCharAt(index,ch): " + sb3);//StringBuffer is mutable!
        //void setLength(int newLength)-This method is used to set the length of the String.
        sb2.setLength(25);
        System.out.println("New Length: " + sb2.length());//25
        sb2.setCharAt(21, '!');
        System.out.println("After setCharAt(): " + sb2);//Class is StringBuffer!
        //String substring(int start, int end)
        // This method returns a new String that starts from the specified index and ends with the specified index.
        System.out.println("subString(start,end): " + sb3.substring(16, 23));//mutable
        //String toString()-The toString() method returns data in the form of a string.
        int[] arr = {1, 2, 3, 4, 5};
        String str1 = Arrays.toString(arr);
        System.out.println("String after passing arr.toString: " + str1);//[1, 2, 3, 4, 5]
        //void trimToSize()	This method reduces the storage space of the string.
        System.out.println("Length of sb3: " + sb3.length());//25
        sb3.trimToSize();
        System.out.println("After trimToSize(): " + sb3.length());//24
        //CharSequence subSequence(int start, int end)
        // This method returns a new character sequence from the specified range.
        System.out.println("subSequence(start,end): " + sb3.subSequence(16, 24));//mutable!

    }
}
