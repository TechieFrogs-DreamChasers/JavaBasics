package assignment;

import java.util.Scanner;

public class lcm {
    public static void main( String[]args){
        Scanner scannerobj = new Scanner(System.in);
        System.out.println(" Enter the first value ");
        int i = scannerobj.nextInt();
        System.out.println(" Enter the second value ");
        int j = scannerobj.nextInt();
        int LCM = ( i > j) ? i : j ;
        while(true){
            if (LCM%i ==0 && LCM%j ==0){
                System.out.println(" LCM IS"+ LCM);
                break;
            }
            else{
                LCM++;
            }
scannerobj.close();
        }
    }
    
}
