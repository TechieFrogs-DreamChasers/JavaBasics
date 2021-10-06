package PRACTICE.Arrays;

import java.util.Scanner;

public class Multidimention {
    public static void main(String[] args){
        int [][]number = new int[2][2];
        int []num1[];
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for(int i=0;i<number.length;i++){
            for(int j=0; j<number[i].length;j++){
                number[i][j] = obj.nextInt();
            }
        }
        //num1 = new int[][3];//cannot specify an array dimension after an empty dimension
        num1 = new int[2][];
        int num2[][]= {{1,2},{3,4}};

        for(int i=0;i<2;i++){
            for(int j =0;j<2;j++){
                System.out.print(num2[i][j]+" ");
            }
            System.out.println();
        }




    }
}
