package StringsAssignment;

import java.util.Arrays;
import java.util.Scanner;

//Check two strings are anagram
public class Program25 {
    public static void main(String[] args){
        System.out.println("Enter two strings");
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        String str2 = obj.nextLine();
        obj.close();

        if(str1.length() ==str2.length()){
            char[] character1 = str1.toCharArray();
            char[] character2 = str2.toCharArray();
            Arrays.sort(character1);
            Arrays.sort(character2);
            if (Arrays.equals(character1,character2)){
                System.out.println("Strings are anagram");
            }
            else{
                System.out.println("Strings are not anagram");
            }
            
            
        }
        else{
            System.out.println("Strings are not anagram");
        }

     }
}
