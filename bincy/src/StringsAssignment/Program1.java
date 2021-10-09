package StringsAssignment;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = obj.nextLine();
        s = s.toLowerCase();
        obj.close();
        int len = s.length();
        int vowel = 0;
        int consonant = 0;
        int number = 0;
        int space = 0;

        for (int i=0; i<len; i++){
            char ch = s.charAt(i);
            switch(ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowel++;
                    continue;
                case 'b': case 'c': case 'd': case 'f': case 'g': case 'h': case'j': case 'k':
                case 'l': case 'm': case 'n': case 'p': case 'q': case 'r': case 's': case 't':
                case 'v': case 'w': case 'x': case 'y': case 'z':
                    consonant++;
                    continue;
                case '0': case '1': case '2': case '3': case '4': case '5': case '6':
                case '7': case '8': case '9':
                    number++;
                
                
                    
            }
        
            
            
           if(ch == ' '){
                space++;
            }
            
        }
        System.out.println( vowel + " "+ consonant+ " "+ number+ " "+ space);
    }
}
