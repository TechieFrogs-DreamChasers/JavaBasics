package com.Practice.Strings;
/*
Java 8 String join()
Java 9 String Methods: two methods this release. They are – codePoints() and chars().
Both of these methods return IntStream object on which we can perform some operations.
Java 11 Methods:
isBlank() – returns true if the string is empty or contains only white space codepoints, otherwise false.
lines() – returns a stream of lines extracted from this string, separated by line terminators.
strip(), stripLeading(), stripTrailing() – for stripping leading and trailing white spaces from the string.
repeat()– returns a string whose value is the concatenation of this string repeated given number of times.
*/
public class StringsNewMethods {
    public static void main(String[] args) {
        //join()
        String first= String.join("-","pre","distributed");
        System.out.println("join(delimiter,char sequence): "+first);//pre-distributed
        //can't use null as delimiter
        String second= String.join(", ","Apples","Bananas","Cherries");
        System.out.println("join(delimiter,char sequence): "+second);//Apples, Bananas, Cherries
        char[] ch={'N','e','w','S','t','r','i','n','g','M','e','t','h','o','d','s'};
        String s=new String(ch);
        System.out.println(s);//NewStringMethods
        String third=String.join(" ","New","String","Methods");
        System.out.println("After join(): "+third);//New String Methods
        //codePoints()
        String fourth="Apples";
        fourth.codePoints().forEach(x -> System.out.println(fourth));//prints Apples 6 times
        System.out.println(" ");
        fourth.chars().forEach(x -> System.out.println(x));//prints values of characters: 65,112,112,108,101,115
        //isBlank()
        String zero=" ";
        System.out.println(zero.isBlank());//true
        zero="Hello";
        System.out.println(zero.isBlank());//false
        //strip()
        String fifth="  School, College, University  ";
        System.out.println("&"+fifth+"&");//&  School, College, University  &
        System.out.println("&"+fifth.strip()+"&");//&School, College, University&
        System.out.println("&"+fifth.stripLeading()+"&");//&School, College, University  &
        System.out.println("&"+fifth.stripTrailing()+"&");//&  School, College, University&
        //repeat()
        String call="Call ";
        System.out.println("repeat(): "+call.repeat(3));//Call Call Call
        String ha="ha\n";//repeat in new line
        System.out.println("repeat(): "+ha.repeat(2));//ha ha

    }
}
