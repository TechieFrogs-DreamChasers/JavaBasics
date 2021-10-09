package StringsAssignment;

import java.util.Scanner;

//Program to iterate through each characters of a string
public class Program17 {
    public static void main(String[] args){
        System.err.println("Enter any string: ");
        Scanner obj =new Scanner(System.in);
        String str1 = obj.nextLine();
        obj.close();

        char[] character = str1.toCharArray();

        for(int i=0; i<str1.length();i++){
            System.out.println(character[i]);
        }
    }
    
}
