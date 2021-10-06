package com.Practice.array.MultiD;

//Adding 2D+2D = 2D[3X3]
//Adding 2D+2D+2D= 2D[3X3X3]
//long,float
public class MatrixAdditionDiffTypes {
    public static void main(String[] args) {
        long[][] matA = new long[3][3];
        long[][] matB = new long[3][3];
        long[][] matC;
        long[][] longs3X3 = new long[3][3];

        matA[0] = new long[]{10L, 20L, 30L};
        matA[1] = new long[]{30L, 20L, 10L};
        matA[2] = new long[]{20L, 30L, 10L};

        //copying using System.arraycopy()
        System.arraycopy(matA, 0, matB, 0, matA.length);
        System.out.println("*************Long Addition:*************");
        System.out.println("Addition of 2 2D long Array[3][3]");
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                longs3X3[i][j] = matA[i][j] + matB[i][j];
                System.out.print(longs3X3[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Addition of 3 2D long Array[3][3]");
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                //copy as variable type
                matC = matA;
                longs3X3[i][j] = matA[i][j] + matB[i][j] + matC[i][j];
                System.out.print(longs3X3[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("*************Float Addition:*************");
        float[][] matD = {{9.5f, 8.5f, 7.5f}, {6.5f, 5.5f, 4.5f}, {3.5f, 2.5f, 1.5f}};
        float[][] matE = {{1.5f, 2.5f, 3.5f}, {4.5f, 5.5f, 6.5f}, {7.5f, 8.5f, 9.5f}};
        float[][] matF = new float[3][3];
        float[][] floats3X3 = new float[3][3];
        System.out.println("Addition of 2 2D float Array[3][3]");
        for (int i = 0; i < matD.length; i++) {
            for (int j = 0; j < matD[i].length; j++) {
                floats3X3[i][j] = matD[i][j] + matE[i][j];
                System.out.print(floats3X3[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Addition of 3 2D float Array[3][3]");
        //copying using System.arraycopy()
        System.arraycopy(matD, 0, matF, 0, matE.length);
        for (int i = 0; i < matD.length; i++) {
            for (int j = 0; j < matD[i].length; j++) {
                floats3X3[i][j] = matD[i][j] + matE[i][j] + matF[i][j];
                System.out.print(floats3X3[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        /*
           Output:
        *************Long Addition:*************
        Addition of 2 2D long Array[3][3]
        20 40 60
        60 40 20
        40 60 20
        Addition of 3 2D long Array[3][3]
        30 60 90
        90 60 30
        60 90 30
        *************Float Addition:*************
        Addition of 2 2D float Array[3][3]
        11.0 11.0 11.0
        11.0 11.0 11.0
        11.0 11.0 11.0
        Addition of 3 2D float Array[3][3]
        20.5 19.5 18.5
        17.5 16.5 15.5
        14.5 13.5 12.5
         */


    }


}
