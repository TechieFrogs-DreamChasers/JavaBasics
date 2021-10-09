package ArraysAssignment;

import java.util.Scanner;

//check whether identity matrix: nXn matrix with 1's in main diagonal and zeros elsewhere
public class Progrm23 {
    public static void main(String[] args){
        int n,m;
        boolean flag =false;
        System.out.println("Enter the number of rows and columns: ");
        Scanner obj =new Scanner(System.in);
        m = obj.nextInt();
        n = obj.nextInt();
        int a[][] = new int[m][n];
        if(m==n){
            
            System.out.println("Enter the elements: ");
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    a[i][j] = obj.nextInt();
                }
            }
            obj.close();
            for(int i =0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    if(i==j){
                        if(a[i][j] == 1)
                            continue;
                        else
                            System.out.println("Not an Identity matrix ");
                            flag =true;
                            break;
                    }
                    else{
                        if(a[i][j] == 0)
                            continue;
                        else
                            //System.out.println("Not an identity matrix ");
                            flag = true;
                            break;
                    }
                }
                
            }
            if(flag)
                System.out.println(" Not an identity matrix");
            else
                System.out.println("It is an identity matrix ");
        }
        else
            System.out.println("Invalid input");



    }
    
}
