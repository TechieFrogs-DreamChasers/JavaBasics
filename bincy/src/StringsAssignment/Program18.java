package StringsAssignment;

import java.util.Scanner;

//Program to iterate through each characters using for each
public class Program18 {
    public static void main(String[] args){
        System.out.println("Enter a string: ");
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        obj.close();

        char[] character = str1.toCharArray();
        //for each --for(type variable name:array name)--type of variable and array should same.
        for(char w : character){
            System.out.println(w);
        }
    }
    
}
