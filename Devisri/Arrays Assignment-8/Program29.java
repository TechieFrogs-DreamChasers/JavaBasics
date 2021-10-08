import java.util.Scanner;

//Product Of Two Matrices
public class Program29 {
    public static void main(String[] args) {
        int[][] mat1 = new int[3][3];
        int[][] mat2 = new int[3][3];
        int[][] result = new int[3][3];
        mat1[0] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat1[1] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat1[2] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat2[0] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat2[1] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        mat2[2] = new int[]{(int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        System.out.println("Matrix-1: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Matrix-2: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Multiplication: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                result[i][j]=0;
                for (int k=0;k<3;k++){
                result[i][j]= result[i][j]+(mat1[i][j]*mat2[i][j]);
                System.out.print(result[i][j]+"   ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
/*
Matrix-1:
70 76 81
43 65 82
36 61 82
Matrix-2:
74 46 9
51 26 74
16 79 38
Multiplication:
5180   10360   15540   3496   6992   10488   729   1458   2187
2193   4386   6579   1690   3380   5070   6068   12136   18204
576   1152   1728   4819   9638   14457   3116   6232   9348
 */
