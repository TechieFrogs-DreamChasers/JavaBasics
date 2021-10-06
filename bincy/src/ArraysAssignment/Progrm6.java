package ArraysAssignment;

import java.util.Scanner;

//print elements in reverse order
public class Progrm6 {
    public static void main(String[] args){
        int num[]= new int[10];
        System.out.println("Enter elements: ");
        Scanner obj = new Scanner(System.in);
        for(int i=0; i<num.length; i++){
            num[i] = obj.nextInt();
        }
        obj.close();
        System.out.println("Elements in  reverse order: ");
        for(int i= num.length-1;i>=0;i--){
            System.out.print(num[i]+" ");
        }
    }
    
}
