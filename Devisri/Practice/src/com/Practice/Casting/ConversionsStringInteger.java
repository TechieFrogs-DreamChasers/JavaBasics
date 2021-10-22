package com.Practice.Casting;

public class ConversionsStringInteger {
    public static void main(String[] args) {
        String s = "10";
        byte change = Byte.parseByte(s);
        String s1 = "300";
        short chump = Short.parseShort(s1);
        String s2 = "5000";
        int amount = Integer.parseInt(s2);
        String s3 = "50000";
        long deposit = Long.parseLong(s3);
        String s4 = "15000.867";
        float withdrawal = Float.parseFloat(s4);
        String s5 = "100000.5216";
        double balance = Double.parseDouble(s5);
        System.out.println("byte change: " + change);
        System.out.println("short chump: " + chump);
        System.out.println("int amount: " + amount);
        System.out.println("long deposit: " + deposit);
        System.out.println("float withdrawal: " + withdrawal);
        System.out.println("double balance: " + balance);
    }
}
