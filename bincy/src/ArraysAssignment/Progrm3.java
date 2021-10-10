package ArraysAssignment;

import java.util.Scanner;

//Left rotate elements of an array 
public class Progrm3 {
    public static void main(String[] args){
        int num[] = new int[10];
        System.out.println("Enter 10 elemnets: ");
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i] =obj.nextInt();

        }
        System.out.println("Enter the index: ");
        int index = obj.nextInt();
        obj.close();
        //create new array having size index
        int temp[] = new int[index];
        //copy elements into temp array upto index
        for(int i=0;i<temp.length;i++){
            temp[i]= num[i];
        }
        //shift remaining to left
        for(int i=index; i<num.length;i++){
            num[i-index] = num[i];
            
        }
        //append temp to num array
        int l=num.length-index;
        for(int i= l; i<num.length; i++){
            num[i] = temp[i-l];
        }
        System.out.println("Array after shifting: ");
        for(int i=0; i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }

}
