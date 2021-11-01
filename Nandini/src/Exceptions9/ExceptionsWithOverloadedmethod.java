package Exceptions9;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionsWithOverloadedmethod{
    public static void main(String[] args) throws Exception{
       
        String s;
        String[] s1 = {"HI","Hello","How r u"};
        String s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String ");
        s = sc.nextLine();
        System.out.println("Enter Second String ");
        s2 = sc.nextLine();

        try{
            display(s);
        }catch(NullPointerException e){
            System.out.println("First String Error Message:  "+ e.getMessage());
        }

        System.out.println(" ");

        try{
            display(s1[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Error Message: "+e.getMessage());
        }

        System.out.println(" ");

        try{
            display(s, s2);
        }catch(NullPointerException e){
            System.out.println("Second String Error Message: "+e.getMessage());
        }

    }
    
    public static void display(String s)throws NullPointerException{
        if(s.length()==0){
            throw new NullPointerException("String should not be null");
        }
        System.out.println(s);
        //return s;
    }

    static void display(String[] s)throws ArrayIndexOutOfBoundsException{
        int i;
        for(i=0;i<s.length;i++){
            if(i > s.length){
                throw new ArrayIndexOutOfBoundsException("Array length is less than the index ");
            }
        }
        System.out.println(Arrays.toString(s));
    }

    static void display(String s,String s1)throws NullPointerException{

        if(s.length()==0 || s1.length()==0){
            throw new NullPointerException(" String should not null ");   
        }
        System.out.println(s+" "+s1);
    }
}
