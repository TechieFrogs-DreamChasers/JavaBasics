package StringsAssignment;

import java.util.Arrays;
import java.util.Scanner;

//Check two strings are anagram eg. race:care, listen:silent,triangle:integral
public class Program9 {
    public static void main(String[] args){
        System.out.println("Enter two strings: ");
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        String str2 = obj.nextLine();
        obj.close();

        //check two strings are equal
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Strings are not anagram");
        }
        else{
            //covert string to character array
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            //sort two character arrays
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            System.out.println(Arrays.toString(ch1)+" "+ Arrays.toString(ch2));
            //if both character arrays are equal
            if(Arrays.toString(ch1).equals(Arrays.toString(ch2))){
                System.out.println("The strings are anagram");
                
            }
            else{
                System.out.println("Strings are not anagram");
            }

        }

    }
}
