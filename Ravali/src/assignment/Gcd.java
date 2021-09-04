package assignment;

import java.util.Scanner;

public class Gcd {
    public static void main(String[]args){
        Scanner scannerobj = new Scanner(System.in);
        System.out.println(" Enter the first number ");
        int i = scannerobj.nextInt();
        System.out.println(" Enter the second number");
        int j = scannerobj.nextInt();
        int GCD = ( i <= j) ? i : j ;
        while ( true ){
            if ( i%GCD == 0 && j%GCD == 0){
                System.out.println(" The Gcd is"+ GCD);
                break;
            }
            else{
            GCD--;
            }
            scannerobj.close();
        }
        


    }
    
}
