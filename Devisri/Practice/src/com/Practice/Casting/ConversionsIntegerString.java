package com.Practice.Casting;

public class ConversionsIntegerString {
    public static void main(String[] args) {
        byte b = 100;
        short s = 2021;
        int i = 30000;
        long l = 400000L;
        float f = 5000000.256f;
        double d = 6000000.635;
        //String.valueOf()
        String fare = String.valueOf(b);
        String year = String.valueOf(s);
        String emi = String.valueOf(i);
        String balance = String.valueOf(l);
        String income = String.valueOf(f);
        String target = String.valueOf(d);
        System.out.println("String fare: " + fare);
        System.out.println("String year: " + year);
        System.out.println("String emi: " + emi);
        System.out.println("String balance: " + balance);
        System.out.println("String income: " + income);
        System.out.println("String target: " + target);
        System.out.println(" ");
        //toString
        String s1 = Byte.toString(b);
        String s2 = Short.toString(s);
        String s3 = Integer.toString(i);
        String s4 = Long.toString(l);
        String s5 = Float.toString(f);
        String s6 = Double.toString(d);
        System.out.println("String fare: " + s1);
        System.out.println("String year: " + s2);
        System.out.println("String emi: " + s3);
        System.out.println("String balance: " + s4);
        System.out.println("String income: " + s5);
        System.out.println("String target: " + s6);
        System.out.println(" ");
        String str1 = String.format("%d", b);
        String str2 = String.format("%d", s);
        String str3 = String.format("%d", i);
        String str4 = String.format("%d", l);
        String str5 = String.format("%f", f);
        String str6 = String.format("%f", d);
        System.out.println("String fare: " + str1);
        System.out.println("String year: " + str2);
        System.out.println("String emi: " + str3);
        System.out.println("String balance: " + str4);
        System.out.println("String income: " + str5);
        System.out.println("String target: " + str6);

    }
}
