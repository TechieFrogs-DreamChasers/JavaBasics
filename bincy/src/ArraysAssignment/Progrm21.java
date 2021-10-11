package ArraysAssignment;

import java.util.Scanner;

//Sort an array in java
public class Progrm21 {
    public static void main(String[] args){
        int num[]=new int[10];
        System.out.println("Enter 10 elements: ");
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i] = obj.nextInt();
        }
        obj.close();
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length-(i+1);j++){
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] =num[j+1];
                    num[j+1]=temp;
                }
                
            }
        }
        System.out.println("Array after sorting:");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
    
}
