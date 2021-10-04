package StringsAssignment;

import java.util.Scanner;

//Check if a string contains substring
public class Program19 {
    public static void main(String[] args){
        System.out.println("Enter a string: ");
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        System.out.println("Enter a substring: ");
        String str2 = obj.nextLine();
        obj.close();

        if(str1.contains(str2)){
            System.out.println("It contains substring.");
        }
        else{
            System.out.println("It does not contain substring.");
        }
    }
}
