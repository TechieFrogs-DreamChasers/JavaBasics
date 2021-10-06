package PRACTICE.Arrays;

import java.util.Scanner;

public class ArrayInMethods {
    public static void main(String[] args){
        System.out.println("Enetr array:");
        Scanner obj = new Scanner(System.in);
        int a[] = new int[10];
        int mini;
        a = array(a,obj);
        mini = min(a);

        System.out.println("Minimum: "+mini);
    }
    public static int min(int b[]){
        
        int min = b[0];
        for(int i =1; i<b.length; i++){
            
            if(min>b[i]){
                min = b[i];

            }
            
        }
        return min;
    }

    public static int[] array(int b[],Scanner obj){
        for(int i=0; i<b.length; i++){
            b[i]= obj.nextInt();
        }
        return b;
    }

}
