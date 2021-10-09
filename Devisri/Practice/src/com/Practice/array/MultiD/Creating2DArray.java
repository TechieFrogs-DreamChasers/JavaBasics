package com.Practice.array.MultiD;

public class Creating2DArray {
    public static void main(String[] args) {
        int[][] numbers=new int[2][2];
        int[][][] ints=new int[4][4][4];
        long []longs[] = new long[3][3];

        char [][]chars= {{'X','O','O'},{'O','X','O'},{'O','O','X'}};
        String strings[][]=new String[][]{{"John","Wilson"},{"Will","Smith"}};

       /* numbers[0][0]=2;
        numbers[0][1]=4;
        numbers[1][0]=6;
        numbers[1][1]=8;*/

        longs[0][0]=10;
        longs[0][1]=20;
        longs[0][2]=30;
        longs[1][0]=40;
        longs[1][1]=50;
        longs[1][2]=60;
        longs[2][0]=70;
        longs[2][1]=80;
        longs[2][2]=90;

        System.out.println("Integer 2D Array[2][2]");

       for (int i=0;i<numbers.length;i++){
           for (int j=0;j<numbers[i].length;j++){
               numbers[i][j]=2*(i+1);
               System.out.print(numbers[i][j]+" ");
           }
           System.out.println(" ");
       }

        System.out.println("Long 2D Array[3][3]");

        for (int i=0;i<longs.length;i++){
            for (int j=0;j<longs[i].length;j++){
               // longs[i][j]=2*(i+1);
                System.out.print(longs[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println("Integer 3D Array[4][4][4]");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    ints[i][j][k]=2*(i+1);
                    System.out.print(ints[i][j][k]+" ");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        System.out.println("Character 2D Array[3][3]:");

        for (int i=0;i<chars.length;i++){
            for (int j=0;j<chars[i].length;j++){
                System.out.print(chars[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println("String 2D Array[2][2]:");

        for (int i=0;i<strings.length;i++){
            for (int j=0;j<strings[i].length;j++){
                System.out.print(strings[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
/*
Integer 2D Array[2][2]
2 2
4 4

Long 2D Array[3][3]
10 20 30
40 50 60
70 80 90

Integer 3D Array[4][4][4]
2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2
4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4
6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6
8 8 8 8 8 8 8 8 8 8 8 8 8 8 8 8

Character 2D Array[3][3]:
X O O
O X O
O O X

String 2D Array[2][2]:
John Wilson
Will Smith

 */
