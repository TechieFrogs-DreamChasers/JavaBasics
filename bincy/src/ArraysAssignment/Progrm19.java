package ArraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

//Remove duplicates
public class Progrm19 {
    public static void main(String[] args){
        int num[] = new int[10];
        System.out.println("Enter 10 elements: ");
        Scanner obj = new Scanner(System.in);
        for (int i=0;i<num.length;i++){
            num[i] = obj.nextInt();
        }
        obj.close();
        Arrays.sort(num);
        int j=0;
        int temp[] = new int[num.length];
        for(int i=0;i<num.length-1;i++){
            
            if(num[i]!= num[i+1])
                temp[j++] = num[i];
        }
        temp[j++] = num[num.length-1];
        System.out.println("Array after removing duplicates: ");
        for(int i=0;i<j;i++)
            System.out.println(temp[i]);
    }
}
