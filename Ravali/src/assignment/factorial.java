package assignment;

import java.util.Scanner;

public class factorial {
    public static void  main(String[] args) {
        Scanner scannerobj = new Scanner(System.in);
        System.out.println(" Enter a number ");
        int n = scannerobj.nextInt();
        int i = 1;
        int factorial = 1;
        //for( i=1; i<=n; i++){
            while ( i <= n){
                i++;
            }
            factorial = factorial * i;
            System.out.println(" factorial is "+ factorial);
            {

            }
scannerobj.close();
            
        }


        
    

    }
    

