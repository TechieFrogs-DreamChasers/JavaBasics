package assignment;

import java.util.Scanner;

public class naturalno {
    public static void main(String[]args){
        Scanner scannerobj = new Scanner(System.in);
        System.out.println(" enter the value ");
        int n = scannerobj.nextInt();
        int sum = 0;
        for( int i=1; i<=n; i++){
            sum = sum + i;
            System.out.println (sum);
        }
        scannerobj.close();
    }
    
}
