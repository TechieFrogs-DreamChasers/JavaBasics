package Arrays;

import java.util.Scanner;

public class oned {
    public static void main (String[]args){
        int x[];// declaration 1. only subscript and no size mentioned
        int []y;
        y =new int [5];// instatntiation / initialisation
        y[0]=10;
        y[2]=20;
        int[] z= new int [4];// instantiation and declaration
        int a[]={1,2,3,4,5};//declaration, instatntiation, initialisation
        System.out.println(y.length);// length is an attribute and doesnt require values
        System.out.println(a.length);
        System.out.println(z.length);
        System.out.println(y[0]);//default values
        System.out.println(y[1]);
        for(int j=0; j<=a.length; j++){
            System.out.println("elements of a"+" "+a[j]);
            Scanner Scannerobj= new Scanner(System.in);
            for(int i=0; i<z.length; i++){
                System.out.println("enter"+""+(i+1)+""+" "+"value of z");
               z[i]= Scannerobj.nextInt();
            }
            Scannerobj.close();
            for(int i=0; i<z.length; i++){
                System.out.println("the values of array a are:"+" "+z[i]);
            }


        }
        
        
    }
    
}
