package StringsAssignment;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args){
       /* String str1 = "Tomy";
        String str2 = "Tany";

        if (str1.equals(str2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }*/
        Scanner obj = new Scanner(System.in);
        System.out.println("enter two strings: ");
        String str3 = obj.nextLine();
        String str4 = obj.nextLine();
        obj.close();

        if(str3.equals(str4)){
            System.out.println("Equal");

        }
        else{
            System.out.println("Not Equal");
        }
    }
    

}
