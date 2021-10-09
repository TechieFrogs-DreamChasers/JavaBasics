package com.Practice.array.MultiD;
//Product of 2 2D Array[2][2]
//Product of 2 2D Array[3][3]
//Product of 2 2D Array[2][3]
public class MultiplicationMatrix {
    public static void main(String[] args) {
        int[][] mat1={{5,5},{5,5}};
        int[][] mat2={{1,2},{3,4}};
        int[][] intsOf2X2=new int[2][2];
        System.out.println("Product of 2 2D Integer Array[2][2]");

        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                intsOf2X2[i][j] = mat1[i][j]*mat2[i][j];
                System.out.print(intsOf2X2[i][j]+" ");
            }
            System.out.println(" ");
        }
        int[][] matA={{10,10,10},{10,10,10},{10,10,10}};
        int[][] matB={{1,2,3},{4,5,6},{7,8,9}};
        int[][] intsOf3X3=new int[3][3];
        System.out.println("Product of 2 2D Integer Array[3][3]");
        for(int i=0;i<matA.length;i++){
            for(int j=0;j<matA[i].length;j++){
                intsOf3X3[i][j] = matA[i][j]*matB[i][j];
                System.out.print(intsOf3X3[i][j]+" ");
            }
            System.out.println(" ");
        }

        int[][] matD={{10,10,10},{10,10,10}};
        int[][] matE={{1,2,3},{4,5,6}};
        int[][] intsOf2X3=new int[2][3];
        System.out.println("Product of 2 2D Integer Array[2][3]");
        for(int i=0;i<matD.length;i++){
            for(int j=0;j<matD[i].length;j++){
                intsOf2X3[i][j] = matD[i][j]*matE[i][j];
                System.out.print(intsOf2X3[i][j]+" ");
            }
            System.out.println(" ");
        }

        int[][] numbers={{1},{2},{3},{4},{5},{6},{7},{8},{9},{10}};
        int[][] table7={{7},{7},{7},{7},{7},{7},{7},{7},{7},{7}};
        int[][] product=new int[10][1];
        System.out.println("Product of 2 2D Integer Array[10][1]");
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                product[i][j]= numbers[i][j] * table7[i][j];
                System.out.print(+product[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
/*
Output:
Product of 2 2D Integer Array[2][2]
5 10
15 20
Product of 2 2D Integer Array[3][3]
10 20 30
40 50 60
70 80 90
Product of 2 2D Integer Array[2][3]
10 20 30
40 50 60
Product of 2 2D Integer Array[10][1]
7
14
21
28
35
42
49
56
63
70
 */
