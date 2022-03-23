package com.strings;

public class ComparisonWithoutEquals {
    public static void main(String[] args) {
        String str="This is String";
        String str2="This is String";
        char[] chars=str.toLowerCase().toCharArray();
        char[] chars2=str2.toLowerCase().toCharArray();
        boolean flag=true;
        if(chars.length!= chars2.length){
            flag=false;
        }else{
            for(int i=0;i< chars.length;i++){
                if(chars[i]!=chars[i]){
                    flag=false;
                }
            }
        }
        if(flag){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
