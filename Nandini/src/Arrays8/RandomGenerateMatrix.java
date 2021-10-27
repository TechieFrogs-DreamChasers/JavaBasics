package Arrays8;

import java.util.Random;

public class RandomGenerateMatrix {
        
    static int[][] random(){
        Random rd = new Random();
        int[][] matrix = new int[3][3];
        
        System.out.println("Matrix Original Form ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j] = rd.nextInt(15);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
         }

         return matrix;
    }

} 

