package Assignment1;

import java.util.Scanner;

public class SwapTwoNumbers {
    
    public static void main(String[] args) {
        int num1, num2, swap;
        Scanner sc = new Scanner(System.in);

        System.out.println( "Enter two nymbers : ");
        
        System.out.println("First number : ");
        num1 = sc.nextInt();
        System.out.print("Second Number : ");
        num2 = sc.nextInt();

        swap = num1;
        num1 = num2;
        num2 = swap;

        System.out.print("The Value after Swapping is \n");

        System.out.println("First number = " +num1);
        System.out.println("Second number = " +num2);

    }
}
