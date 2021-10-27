package ArraysAssignment;

import java.util.Scanner;

//frequency of odd and even numbers in the given matrix
public class Progrm28 {
    public static void main(String[] args){
        int m,n;
        System.out.println("Enter the row and column size : ");
        Scanner obj =new Scanner(System.in);
        m = obj.nextInt();
        n = obj.nextInt();
        int a[][]= new int[m][n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j] = obj.nextInt();
            }
        }
        obj.close();
        int even=0,odd =0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j] %2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
    
}
