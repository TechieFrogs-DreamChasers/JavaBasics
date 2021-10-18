package com.Practice.Exceptions;

public class ThrowsException {
    public static void main(String[] args) {
        String string1=null;
        String string2="5000";
        String s1="Apple";
        String s2="2000";
       /* excp_Methods(string1,s1);
        excp_Methods(string2,s2);
        excp_Methods(string2,s1);*/
       try{
        excp_Methods(string1,s1);
        } catch (NullPointerException | NumberFormatException n){
            System.out.println(n.getMessage());
        }
        try{
        excp_Methods(string2,s2);
        } catch (NumberFormatException n){
            System.out.println(n.getMessage());
        }
        try{
        excp_Methods(string2,s1);
        } catch (NumberFormatException n){
            System.out.println(n.getMessage());
        }
    }
    static void excp_Methods(String s1,String s2) throws NullPointerException,NumberFormatException{
        if(s1 == null || s2 == null){
            throw new NullPointerException("Can't use String, Value = null");
        } else if(!(s1.matches("[0-9]+"))||!(s2.matches("[0-9]+"))){
            throw new NumberFormatException("Not Numeric String");
        } else{
            System.out.println("Valid Usage");
        }
    }
}
/*
Can't use String, Value = null
Valid Usage
Not Numeric String
 */