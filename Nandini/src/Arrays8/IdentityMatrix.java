package Arrays8;

import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        
        int rows,cols;
        int length;
        int i,j;
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of the Matrix: ");
        length = sc.nextInt();
        rows = length;
        cols = length;
        boolean flag = true;
        int matrix1[][] = new int[length][length];
        
        System.out.println("Enter Values for Matrix: ");
        for(i=0;i<length;i++){
            for(j=0;j<length;j++){
                matrix1[i][j] = sc.nextInt();   
            }
            System.out.println();
        }


        for(i=0;i<length;i++){
            for(j=0;j<length;j++){
                System.out.print(matrix1[i][j]+ " ");
            }
                System.out.println();
        }

        if(rows != cols){
            System.out.println("Matrix is not square matrix");
        }

        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                if(i==j && matrix1[i][j]!=1){
                    flag = false;
                    break;
                }else if(i !=j && matrix1[i][j] != 0){
                    flag = false;
                    break;
                }
            }
        }
        
        System.out.println();

        if(flag){
            System.out.println("Given Matrix is identity Matrix ");
        }else
            System.out.println("Given Matrix is not identity Matrix ");

    }
    
}
