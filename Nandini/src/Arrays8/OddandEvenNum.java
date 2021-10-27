package Arrays8;

import java.util.Arrays;
import java.util.Scanner;

public class OddandEvenNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an Array Length: ");
        int length = sc.nextInt();
        

        int[] numbers = new int[length];
        System.out.println("Enter Number: ");
        for(int i=0;i<numbers.length;i++){
            int number = sc.nextInt();
            numbers[i] = number;    
        }
        sc.close();

        System.out.print(Arrays.toString(numbers));
        System.out.println();

        System.out.println("Even Numbers in an Array: ");
        for(int i=0;i<numbers.length;i++){
            int temp = numbers[i];
            if((temp%2) == 0){
                System.out.println(temp);
            }
        }

        System.out.println("Odd Numbers in an Array: ");
        for(int i=0;i<numbers.length;i++){
            int temp = numbers[i];
            if((temp%2) != 0){
                System.out.println(temp);
            }
        }

    }
    
}
