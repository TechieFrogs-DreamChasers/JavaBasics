package ArraysAssignment;

import java.util.Scanner;

//Product of two matrices
public class Progrm29 {
    public static void main(String[] args){ 
        System.out.println("Enter row and column size of first matrix: ");
        Scanner obj = new Scanner(System.in);
        int m = obj.nextInt();
        int n = obj.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter row and column size of second matrix: ");
        int p = obj.nextInt();
        int q = obj.nextInt();
        int b[][]=new int [p][q];
        if(m == q){
            System.out.println("Enter elements of first matrix: ");
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    a[i][j] =obj.nextInt();
                }
            }
            System.out.println("Enter elements of second matrix: ");
            for(int i=0;i<b.length;i++){
                for(int j=0;j<b[i].length;j++){
                    b[i][j] = obj.nextInt();
                }
            }
            obj.close();
            //Multiplying
            int c[][] = new int [m][q];
            for(int i=0;i<a.length;i++){
                for(int j=0;j<b[i].length;j++){
                    c[i][j] = 0;
                    for(int k=0;k<b[i].length;k++){
                        c[i][j] = c[i][j] + a[i][k] *b[k][j];
                    }
                }
            }
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
            for(int i=0;i<b.length;i++){
                for(int j=0;j<b[i].length;j++){
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }

            for(int i=0;i<c.length;i++){
                for(int j=0;j<c[i].length;j++){
                    System.out.print(c[i][j]+ " ");
                }
                System.out.println("");
            }
        }
        else{
            System.out.println("Invalid input ");
        }
    }

    
}
