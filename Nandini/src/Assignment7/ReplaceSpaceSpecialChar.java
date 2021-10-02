package Assignment7;

import java.util.Scanner;

public class ReplaceSpaceSpecialChar {

    //One Method

    /*public static void main(String[] args) {
        
        String string = "Pogrammers TechieFrogs";

        System.out.println("Enetered String");
        System.out.println("Replace with special Character @ ");
        System.out.println(string.replace(" ", "@"));
    }*/

    //Second Method

    public static void main(String[] args) {
        
        System.out.println("Enter String ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        System.out.println("Enter Special Character ");
        char ch = sc.next().charAt(0);

        sc.close();

        System.out.println("New String is ");
        String newString = string.replace(' ', ch);
        System.out.println(newString);

    }
    
}
