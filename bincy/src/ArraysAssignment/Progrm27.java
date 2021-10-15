package ArraysAssignment;

import java.util.Scanner;



//upper triangular matrix
public class Progrm27 {
    public static void main(String[] args){
        boolean flag = false;
        System.out.println("Enter size of square matrix: ");
        Scanner obj = new Scanner(System.in);
        int m = obj.nextInt();
        int a[][]= new int[m][m];
        System.out.println("Enter elements: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j] = obj.nextInt();
            }
        }
        obj.close();
        for(int i=1;i<a.length;i++){
            for(int j=0;j<i;j++){
                if(a[i][j]!=0){
                    flag=true;
                    break;
                }
            }
        }
        if(flag == true){
            System.out.println("It's not an upper triangular matrix ");
        }
        else{
            System.out.println("It's an upper triangular matrix ");
        }
    }
    
}
