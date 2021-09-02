package ASSIGNMENT_1;

import java.util.Scanner;

public class AlphabetOrNot {// 7. Alphabet or not
    public static void main(String[] args){
        char character;
        Scanner obj = new Scanner(System.in);
        character = obj.next().charAt(0);
        obj.close();

        if ((character >= 'a' && character <= 'z') || ( character >='A' && character <= 'Z'))
            System.out.println("Character is an alphabet");
        else
            System.out.println("Character is not an alphabet");
        
        





    }
}
