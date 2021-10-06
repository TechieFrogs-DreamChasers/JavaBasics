package ArraysAssignment;

import java.util.Scanner;

//Smallest number in the array
public class Progrm10 {
    public static void main(String [] args) {
        int num[] = new int[10];
        System.out.println("Enter elements: ");
        Scanner obj = new Scanner(System.in);
        for(int i=0; i<num.length; i++){
            num[i] = obj.nextInt();
        }
        obj.close();
        int small = num[0];
        for(int i=1;i<num.length;i++){
            if (small> num[i]){
                small = num[i];
            }

        }
        System.out.println("Smallest: "+ small);
    }
}
