package StringsAssignment;

import java.util.Arrays;
import java.util.Scanner;

//whether a string is a valid shuffle of two strings
public class Program21 {
    public static void main(String[] args)    {
        System.out.println("Enter first string: ");
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        System.out.println("Enter second string: ");
        String str2 = obj.nextLine();
        System.out.println("Enter the shuffled string: ");
        String str3 = obj.nextLine();
        obj.close();

        String result = str1+ str2;
        if(result.length() != str3.length()){
            System.out.println("Third string is not a valid shuffle of first and second.");
        }
        else{
            char[] resultChar = result.toCharArray();
            Arrays.sort(resultChar);
            result = String.valueOf(resultChar);
            System.err.println(result);
            char[] str3Char = str3.toCharArray();
            Arrays.sort(str3Char);
            str3 = String.valueOf(str3Char);
            System.out.println(str3);
            if(result.equals(str3)){
                System.out.println("Shuffled");
            }
            else{
                System.out.println("Not shuffled");
            }
        }


    }
}
