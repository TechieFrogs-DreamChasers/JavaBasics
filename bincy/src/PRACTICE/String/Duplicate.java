package PRACTICE.String;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args){
        System.out.println("enter string");
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        obj.close();

        char ch[]= str.toCharArray();
        char newch[]= new char[ch.length];
        newch[0] = ch[0];
        int k=1;
        for(int i=1;i<ch.length;i++){
            boolean flag=false;
            for(int j=0;j<i;j++){
                if(newch[j] == ch[i]){
                    flag=true;
                }
            }
            if(flag == false){
                newch[k++] = ch[i];
            }
        }
        for(int i=0;i<newch.length;i++){
            System.out.print(newch[i]);
        }
    }
    
}
