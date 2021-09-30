package com.Practice.Strings;

//jdk 8 String Concatenation = append with StringBuilder & StringBuffer
public class SomeMethodsBuilder {
    public static void main(String[] args) {
        String s1 = "This is";
        String s2 = " String Concatenation";
        //Operator overloading with + concat is done on Strings here.
        String s3 = s1 + s2;//This is String Concatenation
        System.out.println(s3);
        String s4 = new StringBuilder(s1).append(s2).toString();
        System.out.println(s4);//This is String Concatenation
        //13 append() Overloaded methods
        //StringBuilder append(boolean b)
        StringBuilder sb = new StringBuilder("");
        boolean n = true;
        System.out.println("Append(boolean b): " + sb.append(n));//true
        //StringBuilder append(char c)
        System.out.println("Append(char c): " + sb.append('r'));//truer
        //StringBuilder append(char[] str)
        StringBuilder sb1 = new StringBuilder("");
        String s = "StringBuilder";
        char[] carr = s.toCharArray();
        System.out.println("Append(char[] str): " + sb1.append(carr));//StringBuilder
        //StringBuilder append(char[] str, int offset, int len)
        char[] car = s3.toCharArray();
        StringBuilder sb2 = new StringBuilder("");
        System.out.println("Append(char[] str,offset,len): " + sb2.append(car, 8, 6));//String
        //StringBuilder append(CharSequence s)
        System.out.println("Append(CharSequence): " + sb2.append("Builder"));//StringBuilder
        //StringBuilder append(CharSequence s, int start, int end)
        System.out.println("Append(cs,start,end): " + sb2.append(" class", 0, 6));//StringBuilder class
        //StringBuilder append(double d)
        //StringBuilder	append(float f)
        //StringBuilder	append(int i)
        //StringBuilder	append(long lng)
        StringBuilder numbers = new StringBuilder("");
        System.out.println("Append(double): " + numbers.append(5.5));//5.5
        System.out.println("Append(float): " + numbers.append(10.5f));//5.510.5
        System.out.println("Append(int): " + numbers.append(50));//5.510.550
        System.out.println("Append(long): " + numbers.append(700L));//5.510.550700
        //StringBuilder append(Object obj)
        StringBuilder sbobj = new StringBuilder("");
        System.out.println("Append(obj): " + sbobj.append(new Object().getClass()));//class java.lang.Object
        //StringBuilder append(String str)
        System.out.println("Append(str): " + sb2.append("."));//StringBuilder class.
        //StringBuilder append(StringBuffer sb)
        StringBuilder sb3 = new StringBuilder("This is ");
        System.out.println("Append(sb): " + sb3.append(sb2));//This is StringBuilder class.
        //StringBuilder appendCodePoint(int codePoint)
        System.out.println("Append(codepoint): " + numbers.appendCodePoint(97));//5.510.550700a
        //codePointAt(int index)
        System.out.println("codepointat(index): " + numbers.codePointAt(0));//5=53
        //codePointBefore(int index)
        System.out.println("codepointbefore(index): " + numbers.codePointBefore(1));//53
        //codePointCount(int beginIndex, int endIndex)
        System.out.println("codepointcount(begin,end): " + sb.codePointCount(0, sb.length()));//5
        //getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        StringBuilder csb = new StringBuilder("Java Strings");
        char[] charr = new char[csb.length()];
        csb.getChars(0, 5, charr, 0);//5
        //lastIndexOf()
        System.out.println("lastindexof(): " + csb.lastIndexOf("ing"));//8
        System.out.println("lastindexof(str,in): " + csb.lastIndexOf("ring", csb.length()));//7
        //setLength(int newLength)
        StringBuilder sb4 = new StringBuilder("Java Class");
        System.out.println("Length(): " + sb4.length());//10
        sb4.setLength(50);
        System.out.println("setLength(50): " + sb4.length());//50
        //trimToSize()
        sb4.trimToSize();
        System.out.println("sb4 Length() after trimtosize(): " + sb4.length());//50
    }
}
