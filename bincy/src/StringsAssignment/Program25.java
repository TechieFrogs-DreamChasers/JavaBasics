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

        if(str1.equals(str2)){
            char[] character1 = str1.toCharArray();
            char[] character2 = str2.toCharArray();
            Arrays.sort(character1);
            Arrays.sort(character2);
            
        }

     }
}
