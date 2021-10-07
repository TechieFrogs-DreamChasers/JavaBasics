package ArraysAssignment;

import java.util.Scanner;

//Largest element in an array
public class Progrm9 {
    public static void main(String []args){
        int num[] = new int[10];
        System.out.println("Enter the elements: ");
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i]=obj.nextInt();
        }
        obj.close();
        int large = num[0];
        for(int i=1;i<num.length;i++){
            if(large < num[i]){
                large = num[i];
            }
            
        }
        System.out.println("Largest: "+ large);
    }
    
}
