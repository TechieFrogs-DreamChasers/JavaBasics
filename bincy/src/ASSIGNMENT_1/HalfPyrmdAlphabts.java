package ASSIGNMENT_1;

import java.util.Scanner;

public class HalfPyrmdAlphabts { //19. Half Pyramid Alphabets
    public static void main(String[] args){
        System.out.println("Enter the alphabet: ");
        Scanner obj = new Scanner(System.in);
        char ch = obj.next().charAt(0);
        char ch1=Character.toUpperCase(ch);
        obj.close();
        for(char i='A'; i<=ch1; i++ ){
            for(char j='A'; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
    
}
