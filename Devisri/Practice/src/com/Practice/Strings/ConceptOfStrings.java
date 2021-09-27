package com.Practice.Strings;
import java.util.Arrays;
import java.util.Locale;

/*
*When we create a string in java, it actually creates an object of type String.
*
 */
public class ConceptOfStrings {
    public static void main(String[] args) {
        char[] ch={'T','h','i','s','i','s','a','S','t','r','i','n','g'};
        char[] cha={'T','h','i','s',' ','i','s',' ','a',' ','S','t','r','i','n','g'};
        //creating a string with new and passing an array
        String str=new String(ch);
        String string=new String(cha);
        //creating a string as literal
        String s1="This is a String";
        System.out.println("ch array into String object: "+str);
        System.out.println("cha array into String object: "+string);
        System.out.println("char array to string: "+ Arrays.toString(ch));
        System.out.println("Char array to string with spaces: "+Arrays.toString(cha));
        //equals()
        System.out.println("Checking equals method: "+str.equals(string));//false
        System.out.println("Checking equals method between string & s1: "+string.equals(s1));//true
        //== operator
        System.out.println(string==s1);//false
        //toLowerCase()
        String s2=s1.toLowerCase();
        //==operator
        System.out.println(s1==s2);//false
        //equalsIgnoreCase()
        System.out.println(s1.equalsIgnoreCase(s1));//true
        //compareToIgnoreCase()
        System.out.println(s1.compareToIgnoreCase(s2));//0
        //replace
        String s3=s1.replace(" ","-");
        System.out.println("After replace(): "+s3);//This-is-a-String
        //split()
        String[] s4=s3.split("-");
        System.out.println("String split() with array: "+Arrays.toString(s4));//[This,is,a,String]
        String[] s5=s3.split("-",3);
        System.out.println("String split() with another method: "+Arrays.toString(s5));//[This, is, a-String]
        //contains
        boolean has=s3.contains("-");
        System.out.println("s3.contains(-): "+has);//true
        System.out.println("s3.contains(.): "+s3.contains("."));//false
        System.out.println("s3.contains(a): "+s3.contains("a"));//true
        System.out.println("s3.contains(A): "+s3.contains("A"));//false
        //replaceAll()
        String first="Score is 100";
        String second="250 is first Score, 250 is second score";
        System.out.println("Before replaceAll(): "+first);//Score is 100
        String third=first.replaceAll("100","250");
        System.out.println("After replaceAll(regex,replacement): "+third);//Score is 250
        //replaceFirst()
        System.out.println("Before replaceFirst(): "+second);//250 is first Score, 250 is second score
        String fourth=second.replaceFirst("250","100");
        System.out.println("After replaceFirst(regex,replacement): "+fourth);//100 is first Score, 250 is second score
        //format
        String s="www.google.com";
        String s6=String.format("This is %s website",s);
        System.out.println("Format(): "+s6);//This is www.google.com website
        //PI Value
        System.out.println("The value of PI with format() : "+String.format(Locale.US, "%f", 3.14));//3.140000
        //substring()
        String s7=s6.substring(8);
        System.out.println("substring(begin Index): "+s7);//www.google.com website
        String s8=s6.substring(8,22);
        System.out.println("substring(begin,last): "+s8);//www.google.com
        System.out.println(s.equals(s8));//true
        //intern()
        System.out.println("== on string & s1: "+(string==s1));//false
        String string1=string.intern();
        System.out.println("intern() on == on string1 & s1: "+(string1==s1));//true

    }
}
