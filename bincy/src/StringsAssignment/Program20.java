package StringsAssignment;

import java.util.Scanner;

//check whether string contains substring using indexof()
public class Program20 {
    public static void main(String[] args){
        System.out.println("enter a string: ");
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        System.out.println("Enter substring: ");
        String str2 = obj.nextLine();
        obj.close();
        //str1.indexOf(str, fromIndex)
        if(str1.indexOf(str2) != -1){
            System.out.println("Contains substring.");
        }
        else{
            System.out.println("No substring.");
        }

    }
}
