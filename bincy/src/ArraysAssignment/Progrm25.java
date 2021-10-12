package ArraysAssignment;

import java.util.Scanner;

//check two matrices are equal
public class Progrm25 {
    public static void main(String[] args){
        int a[][];
        int b[][];
        int m,n,p,q;
        boolean flag = false;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of first matrix: ");
        m = obj.nextInt();
        n =obj.nextInt();
        System.out.println("Enter size of second matrix: ");
        p =obj.nextInt();
        q = obj.nextInt();
        a = new int[m][n];
        b = new int[p][q];
        if(m*n == p*q){
            System.out.println("Enter  elements of first matrix : ");
        

            for(int i=0;i<a.length;i++){
                for(int j =0; j<a[i].length;j++){
                    a[i][j] = obj.nextInt();
                }
            }
            System.out.println("Enter elements of second matrix: ");

            for(int i=0;i<b.length;i++){
                for(int j=0;j<b[i].length;j++){
                    b[i][j] = obj.nextInt();
                }
            }
            obj.close();
            for(int i=0; i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    if (a[i][j] !=b[i][j]){
                        flag = true;
                    }
                }
            }
        
        if(flag)
            System.out.println("Matrices are not equal");
        
        else
            System.out.println("Matrices are equal");

    
        }
        else{
            System.out.println("Invalid input");
        }
    }
    
}
