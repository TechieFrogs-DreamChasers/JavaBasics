package assignment;

import java.util.Scanner;

public class floyds {
public static void main( String[]args){
    Scanner scannerobj = new Scanner(System.in);
    System.out.println(" enter the number of rows ");
    int n = scannerobj.nextInt();
    int k = 1;
    System.out.println(" * print * ");
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i ; j++){
            System.out.print(k + " ");
            k++;

        }
        System.out.println();
    }
scannerobj.close();

}
    
}
