package Assignment1;

import java.util.Scanner;

public class GcdWhileloop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number:");
        int b = sc.nextInt();
        int gcd = 0;
        int Temp;
        while (b !=0) {
            Temp = b;
            b = a % b;
            a = Temp;
            
        }
        gcd = a;
        System.out.println("GCD of Two numbers: "+gcd);    
    }
    
}
