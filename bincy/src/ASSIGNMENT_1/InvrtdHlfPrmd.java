package ASSIGNMENT_1;

import java.util.Scanner;

public class InvrtdHlfPrmd {  //21.Inverted half pyramid
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        obj.close();

        for(int i=0; i<num; i++){
            for(int j=1; j<=(num-i); j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
