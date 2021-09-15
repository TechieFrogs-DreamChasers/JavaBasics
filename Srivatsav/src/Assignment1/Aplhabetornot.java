package Assignment1;

import java.util.Scanner;

public class Aplhabetornot {
    public static void main(String[] args) {
        
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Alphabet: ");
        char ch= sc.next().charAt(0);

        if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
            System.out.println("Is an Alphabet");
            
        } else {
            System.out.println("Is not an Alphabet");
            
        }
    }
    
}
