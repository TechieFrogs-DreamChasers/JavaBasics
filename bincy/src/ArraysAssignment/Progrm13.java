package ArraysAssignment;

import java.util.Scanner;

//Right rotate elements of an array
public class Progrm13 {
    public static void main(String[] args){
        int num[]=new int[10];
        System.out.println("Enter 10 elements: ");
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i]= obj.nextInt();

        }
        System.out.println("Enter index: ");
        int index = obj.nextInt();
        obj.close();
        int len = num.length-index;
        int temp[] = new int[len];

        for(int i=index;i<num.length;i++){
            temp[i-index] = num[i];
        }

        //int l = num.length-index;
        for(int i = num.length;i>len;i--){
            num[i] = num[i-len-1];
        }
        for(int i=0;i<temp.length;i++){
            num[i] = temp[i];

        }
        System.out.println("Resulted array: ");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]+ " ");
        }

    }
    
}
