package ArraysAssignment;

import java.util.Scanner;

//print elements in odd position
public class Progrm8 {
    public static void main(String[] args){
        int num1[] = new int[10];
        System.out.println("Enter the elements: ");
        Scanner obj =new Scanner(System.in);
        for(int i=0;i<num1.length;i++){
            num1[i] = obj.nextInt();
        }
        obj.close();
        System.out.println("Elements in odd positions:");
        for(int i=1;i<num1.length;i=i+2){
            System.out.print(num1[i]+" ");
        }
    }
}
