package com.Practice.Strings;

import java.util.Arrays;

/*
contains()	checks whether the string contains a substring
substring()	returns the substring of the string
replace()	replaces the specified old character with the specified new character
charAt()	returns the character present in the specified location
getBytes()	converts the string to an array of bytes
indexOf()	returns the position of the specified character in the string
compareTo()	compares two strings in the dictionary order
compareToIgnoreCase()	compares two strings ignoring case differences
trim()	removes any leading and trailing whitespaces
format()	returns a formatted string
toLowerCase()	converts the string to lowercase
toUpperCase()	converts the string to uppercase
valueOf()	returns the string representation of the specified argument
toCharArray()	converts the string to a char array
startsWith()	checks if the string begins with the given string
endsWith()	checks if the string ends with the given string
isEmpty()	checks whether a string is empty of not
intern() 	returns the canonical representation of the string
hashCode()	returns a hash code for the string
 */
public class Methods {
    public static void main(String[] args) {
        //str.length();
        String s1= new String("I am a String");
        String s="I am a String";
        System.out.println("The value of \"s1\": \""+s1+"\" and the length of \"s1\": "+s1.length());
        //charAt(0);
        System.out.println("The character at the index of s1(5): \'"+s1.charAt(5)+"\'");//'a'
        //trim()
        String s2="     Hi Whitespace";
        String s3=s2.trim();
        System.out.println("s2 spaces before Trim(): "+s2);
        System.out.println("Trimming spaces of s2 and stored in s3: "+s3);
        //indexOf()
        System.out.println("IndexOf() method: "+s3.indexOf('t'));//6
        System.out.println("IndexOf() method: "+s3.indexOf("Whitespace"));//3
        //lastIndexOf()
        System.out.println("LastIndexOf(): "+s1.lastIndexOf('i'));//10
        System.out.println("LastIndexOf(): "+s1.lastIndexOf("am"));//2
        //replace()
        System.out.println("Replace with s2: "+s2.replace(' ','-'));
        //toLowercase()
        String s4=s1.toLowerCase();
        System.out.println("Converts to Lower case:"+s4);
        //toUppercase()
        String s5=s4.toUpperCase();
        System.out.println("Converts to Upper case: "+s5);
        //subString()
        String s6=s5.substring(6);
        System.out.println("SubString(): "+s6);
        //contains
        System.out.println("Contains(): "+s5.contains(s6));//true
        //compareTo()
        System.out.println("Comparesto(): "+s4.compareTo(s5));//32
        //compareToIgnoreCase
        System.out.println("Compares to ignore case: "+s4.compareToIgnoreCase(s1));
        //startswith()
        System.out.println("Startswith(): "+s2.startsWith(" "));//true
        //endswith()
        System.out.println("EndsWith(): "+s1.endsWith("String."));//false
        //isempty()
        String s7=new String();
        boolean yes=s7.isEmpty();
        System.out.println("IsEmpty(): "+yes);//true
        //intern()
        System.out.println("Intern(): "+s.intern());
        //hashCode()
        System.out.println("HashCode(): "+s.hashCode());//2103443693
        //toCharArray()
        char[] ch=s.toCharArray();
        System.out.println("CharArray(): "+ Arrays.toString(ch));//[I, ,a,m, ,a, ,S,t,r,i,n,g]
        //format()
        String str= String.format(s1, s);
        System.out.println("After format: "+str);

    }
}