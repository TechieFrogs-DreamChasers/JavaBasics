package assignment;

import java.util.Scanner;

public class reversenum {
    public static void main(String[]args){
        Scanner scannerobj = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = scannerobj.nextInt();
        System.out.println(" * printing * ");
        for(int i=1; i<=n; i++){
            for (int j=n; j>=i; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        scannerobj.close();
    }
    
}
