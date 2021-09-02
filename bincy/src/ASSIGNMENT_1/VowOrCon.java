package ASSIGNMENT_1;

import java.util.Scanner;

public class VowOrCon {
    public static void main(String[] args){ // 5. Vowel or Consonent
        char alphabet;
        Scanner obj= new Scanner(System.in);
        alphabet = obj.next().charAt(0);
        obj.close();
        switch(alphabet){
            case 'a','e','i','o','u' -> System.out.println("It's vowel");
            default -> System.out.println("It's consonent");
        }
    }
}
