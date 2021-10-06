package ArraysAssignment;

import java.util.Scanner;

//sum of all the items of an array
public class Progrm12 {
    public static void main(String[] args){
        System.out.println("Enter values: ");;
        int num[] = new int[10];
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i ] = obj.nextInt();
        }
        obj.close();
        int sum =0;
        for(int i=0;i<num.length;i++){
            sum += num[i];
        }
        System.out.println("Sum = "+ sum);

    }
    
}
