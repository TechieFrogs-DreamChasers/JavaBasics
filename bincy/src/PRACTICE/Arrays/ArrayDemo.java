package PRACTICE.Arrays;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args){
        //declaration
        int[] num;
        int num1[];

        //declaration and instantiation
        int []num2 = new int[10];
        //instatiation
        num = new int[5];
        num1 = new int[6];

        int a[] = {1,2,3,4};
        for (int i =0; i<a.length;i++ ){
            System.out.println(a[i]);
        }


        System.out.println("Enetr array elements: ");
        Scanner obj =new Scanner(System.in);
        obj.close();
        for(int i:num2){
            i = obj.nextInt();
            
            //System.out.println(i);
        }
        //int num2[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i:num2){
            System.out.println(i);
        }
    }
}
