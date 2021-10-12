package ArraysAssignment;

import java.util.Scanner;

//sparse matrix =number of zeros is greater than size of matrix/2
public class Progrm24 {
    public static void main(String[] args){
        int m,n;
        System.out.println("Enter rows and columns :");
        Scanner obj = new Scanner(System.in);
        m = obj.nextInt();
        n = obj.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Enter elements : ");
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j] = obj.nextInt();
            }
        }
        obj.close();
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j] ==0){
                    count++;
                }
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        int size =m*n;
        if(count >size/2)
            System.out.println("Matrix is sparse");
        else
            System.out.println("Matrix is not sparse");
    }
}
