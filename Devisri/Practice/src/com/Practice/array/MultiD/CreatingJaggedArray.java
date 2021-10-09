package com.Practice.array.MultiD;

public class CreatingJaggedArray {
    public static void main(String[] args) {
        char [][]chars= {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},
                {'m','n','o'},{'p','q','r'},{'s','t','u'},{'v','w','x'},{'y','z'}};

        int[][] numbers= {{1},{2,2},{3,3,3},{4,4,4,4},{5,5,5,5,5}};

        System.out.println("Character 2D Array[9][3]");

        for(int i=0;i<chars.length;i++){
            for (int j=0;j<chars[i].length;j++){
                System.out.print(chars[i][j]+"  ");
            }
            System.out.println(" ");
        }

        System.out.println("Integer 2D Array[5][5]");

        for(int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers[i].length;j++){
                System.out.print(numbers[i][j]+"  ");
            }
            System.out.println(" ");
        }

        boolean[][] booleans=new boolean[5][];
        System.out.println("Boolean 2D Array[5][5]");

        booleans[0] = new boolean[]{true,true,true,true,true};
        booleans[1] = new boolean[]{false,false,false,false};
        booleans[2] = new boolean[]{true,true,true};
        booleans[3] = new boolean[]{false,false};
        booleans[4] = new boolean[]{true};
        for(int i=0;i<booleans.length;i++){
            for (int j=0;j<booleans[i].length;j++){
                System.out.print(booleans[i][j]+"  ");
            }
            System.out.println(" ");
        }
        
        double[][] doubles=new double[4][];
        System.out.println("Double 2D Array[4][4]");
        doubles[0] = new double[]{10,9,8,7,6};
        doubles[1] = new double[]{7,6,5,4};
        doubles[2] = new double[]{3,2};
        doubles[3] = new double[]{1};

        for(int i=0;i<doubles.length;i++){
            for (int j=0;j<doubles[i].length;j++){
                System.out.print(doubles[i][j]+"  ");
            }
            System.out.println(" ");
        }

    }
}
/*
Character 2D Array[9][3]
a  b  c   
d  e  f   
g  h  i   
j  k  l   
m  n  o   
p  q  r   
s  t  u   
v  w  x   
y  z   

Integer 2D Array[5][5]
1   
2  2   
3  3  3   
4  4  4  4   
5  5  5  5  5  
 
Boolean 2D Array[5][5]
true  true  true  true  true   
false  false  false  false   
true  true  true   
false  false   
true

Double 2D Array[4][4]
10.0  9.0  8.0  7.0  6.0
7.0  6.0  5.0  4.0
3.0  2.0
1.0

 */
