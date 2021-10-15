package ArraysAssignment;

import java.util.Scanner;

//Print lower triangular matrix: a square matrix ,where all elements above main diagonal are zeros
public class Progrm26 {
    public static void main(String[] args){
        boolean flag =false;
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
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a[i].length;j++){
                if(a[i][j] != 0){
                    
                 flag = true;
                    break;
                }
            }
        }
        if(flag == true)
            System.out.println("Its not a lower triangular matrix ");
        else
            System.out.println("It's a triangular matrix ");
    }

}
    

