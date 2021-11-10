package PRACTICE.Arrays;


import java.util.Scanner;

public class JaggedArray {
    public static void main(String []args){
        int num[][] ={{1,2,3,4},{2,3,5},{1,2},{1}};//array of array with different number of columns
        String [][]names;
        double [][]price = new double[3][4];
        char [][]alphabet;
        int num1[][] = new int[4][];
        num1[0] = new int[4];
        num1[1] = new int[3];
        num1[2] = new int[2];
        num1[3] = new int[1];
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter array elements:");
        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num1[i].length;j++){
                num1[i][j] = obj.nextInt();
            }
        }
        obj.close();
        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num1[i].length;j++){
                System.out.print(num1[i][j]+ " ");
            }
            System.out.println();
        }
        String name = num1.getClass().getName();
        System.out.println(name);
        String name1 = price.getClass().getName();//only after initialization
        System.out.println(name1);
        

    }
}
