package ArraysAssignment;

import java.util.Scanner;

//print elements in even position
public class Progrm7 {
    public static void main(String [] args){
        System.out.println("Enter the elements: ");
        int num1[] = new int[10];
        Scanner obj =new Scanner(System.in);
        for(int i=0; i<num1.length; i++){
            num1[i]= obj.nextInt();

        }
        obj.close();
        System.out.println("Elements in even Position");
        for(int i=0;i<num1.length;i=i+2){
            System.out.print(num1[i]+" ");
        }
    }
}
