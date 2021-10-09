package ArraysAssignment;

import java.util.Scanner;

//print the elements of an array
public class Progrm5 {
    public static void main(String []args){
        System.out.println("Enter the elements:");
        int num[] = new int[5];
        Scanner obj =new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i] = obj.nextInt();
        }
        obj.close();
        System.out.println("Array elements are: ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+ " ");
        }
        System.out.println();
    }
    
}
