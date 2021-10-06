package Assignment3.Exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("");   
        int[] temp = new int[10];

        Scanner sc = new Scanner(System.in);
        int i;

        for(i=0;i<temp.length;i++){
            
            int k = i+1;
            System.out.println("Enter Side for Square "+k+ " is: " );
            temp[i] = sc.nextInt();
            
            int j = temp[i];

                System.out.println("Area of Square " + k +" is: ");
                Square s = new Square(j);
                s.getArea();
            
        }
            
       sc.close();
    }
}
