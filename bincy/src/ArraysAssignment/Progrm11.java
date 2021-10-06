package ArraysAssignment;

import java.util.Scanner;

//Number of elements in an array
public class Progrm11 {
    public static void main(String[] args){
        String[] name = new String[10] ;
        System.out.println("Enter elements: ");
        Scanner obj = new Scanner(System.in);
        for(int i=0; i<name.length;i++){
            name[i] = obj.nextLine();
        }
        obj.close();
        System.out.println("Number of elements in the array: "+ name.length );
    }
    
}
