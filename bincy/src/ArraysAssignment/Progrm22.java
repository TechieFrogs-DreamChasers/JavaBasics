package ArraysAssignment;

import java.util.Scanner;

//susbtract two matrices
public class Progrm22 {
    public static void main(String[] args){
        int a[][] = new int[2][3];
        int b[][] = new int[2][3];
        int c[][] = new int[2][3];
        System.out.println("Enter elements for the first matrix: ");
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j] = obj.nextInt();
            }
        }
        System.out.println("Enter second matrix: ");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                b[i][j] =obj.nextInt();
            }
        }
        obj.close();
        System.out.println("Firt: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Second: ");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Resultant matrix: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                c[i][j] = a[i][j] +b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
