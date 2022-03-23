package com.strings;

public class ReplaceChars {
    public static void main(String[] args) {
        String str="This is a String";
        str=str.toLowerCase();
        int count=1;
        String res="";
        char[] chars=str.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='i'){
                res+=+count;
                count++;
            }else {
                res+=chars[i];
            }
        }
        System.out.println(res);
    }
    public void show(){
        System.out.println("This is Show()");
    }
}
