package Assignment1;

import java.util.Scanner;

public class Largestamoungthreenumbers {
    public static void main(String[] args) {
        int num1, num2, num3;

        System.out.println("Enter Three Numbers");
        Scanner sc= new Scanner(System.in);
        num1= sc.nextInt();
        num2= sc.nextInt();
        num3= sc.nextInt();
        if (num1 > num2 && num2 > num3) {
            System.out.println("The Largest number is: "+ num1);
            
        } else {
            if (num2 > num1 && num2 > num3) {
                System.out.println("The Largest number is: "+num2);
                
            } else {
                if (num3 > num1 && num3 > num2) {
                    System.out.println("The largest number is: "+num3);
                    
                } else {
                    System.out.println("The Number is same");
                }
            }
            
        }
    }
    
}
