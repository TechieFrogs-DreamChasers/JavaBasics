package StringsAssignment;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String str1 = obj.nextLine();
        String str2 = obj.nextLine();
        obj.close();

        if(str1 == str2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }

        str1 = "Tomy";
        str2 = "Tomy";
        if(str1 == str2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
