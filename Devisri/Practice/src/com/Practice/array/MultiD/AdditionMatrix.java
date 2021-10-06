package com.Practice.array.MultiD;

//Adding 2D+2D = 2D[2X2]
//Adding 2D+2D+2D= 2D[2X2]
//Adding 3D+3D = 3D[2X2X2]
//Adding 3D+3D+3D = 3D[2X2X2]
public class AdditionMatrix {
    public static void main(String[] args) {
        //Adding twoD matrices
        int[][] matA = new int[2][2];
        int[][] matB = new int[2][2];
        int[][] matC = new int[2][2];
        int[][] intsOf2X2 = new int[2][2];

        matA[0] = new int[]{1, 2};
        matA[1] = new int[]{3, 4};
        matB[0] = new int[]{5, 6};
        matB[1] = new int[]{7, 8};
        matC[0] = new int[]{1, 2};
        matC[1] = new int[]{3, 5};
        System.out.println("Addition of 2 2D Arrays[2][2]:");
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                intsOf2X2[i][j] = matA[i][j] + matB[i][j];
                System.out.print(intsOf2X2[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Addition of 3 2D Arrays[2][2]:");

        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                intsOf2X2[i][j] = matA[i][j] + matB[i][j] + matC[i][j];
                System.out.print(intsOf2X2[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("");

        int[][][] matA1 = new int[2][2][2];
        int[][][] matB1 = new int[2][2][2];
        int[][][] matC1 = new int[2][2][2];
        int[][][] intsOf2X2X2 = new int[2][2][2];

        System.out.println("Addition of 2 3D Arrays[2][2][2]:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    matA1[i][j][k] = 5 * (i + 1);
                    matB1[i][k][k] = 2 * (j + 1);
                    intsOf2X2X2[i][j][k] = matA1[i][j][k] + matB1[i][j][k];
                    System.out.print(intsOf2X2X2[i][j][k] + " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        /*
Element[0][0][0]: 10
Element[0][0][1]: 20
Element[0][1][0]: 35
Element[0][1][1]: 45
Element[1][0][0]: 9
Element[1][0][1]: 18
Element[1][1][0]: 90
Element[1][1][1]: 81
        * */

        matA1[0][0][0] = 10;
        matA1[0][0][1] = 20;
        matA1[0][1][0] = 30;
        matA1[0][1][1] = 40;
        matA1[1][0][0] = 50;
        matA1[1][1][0] = 60;
        matA1[1][0][1] = 70;
        matA1[1][1][1] = 80;

        matB1[0][0][0] = 1;
        matB1[0][0][1] = 2;
        matB1[0][1][0] = 3;
        matB1[0][1][1] = 4;
        matB1[1][0][0] = 5;
        matB1[1][1][0] = 6;
        matB1[1][0][1] = 7;
        matB1[1][1][1] = 8;

        matC1[0][0][0] = 8;
        matC1[0][0][1] = 7;
        matC1[0][1][0] = 6;
        matC1[0][1][1] = 5;
        matC1[1][0][0] = 4;
        matC1[1][1][0] = 3;
        matC1[1][0][1] = 2;
        matC1[1][1][1] = 1;

        System.out.println("Display of all 3 2X2X2 matrices:");
        System.out.println("MatrixA[2][2][2]");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(matA1[i][j][k] + " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        System.out.println("MatrixB[2][2][2]");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(matB1[i][j][k] + " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        System.out.println("MatrixC[2][2][2]");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(matC1[i][j][k] + " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Addition of 3 3D Arrays[2][2][2]:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    intsOf2X2X2[i][j][k] = matA1[i][j][k] + matB1[i][j][k] + matC1[i][j][k];
                    System.out.print(intsOf2X2X2[i][j][k] + " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}
/*
Output:
Addition of 2 2D Arrays[2][2]:
6 8
10 12

Addition of 3 2D Arrays[2][2]:
7 10
13 17

Addition of 2 3D Arrays[2][2][2]:
7 5
5 9

12 10
10 14

Display of all 3 2X2X2 matrices:
MatrixA[2][2][2]
10 20
30 40

50 70
60 80

MatrixB[2][2][2]
1 2
3 4

5 7
6 8

MatrixC[2][2][2]
8 7
6 5

4 2
3 1


Addition of 3 3D Arrays[2][2][2]:
19 29
39 49

59 79
69 89
 */