package com.strings;

public class ReverseString {
    public static void main(String[] args) {
        String str="Redder";
        String rev="";
        str=str.toLowerCase();
        char[] chars=str.toCharArray();
        boolean flag=true;
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+chars[i];
        }
        System.out.println(rev);
        for(int i=0;i<chars.length;i++){
            if(chars[i]!=rev.charAt(i)){
                flag=false;
            }
            else{
                flag=true;
            }
        }
        if(flag){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
