package Assignment7;

import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
      
    String str;
    int vowels = 0;
    int consonants = 0;

        System.out.println("Enter the Sentence to count Vowels and Consonants");
        Scanner sc = new Scanner(System.in);
        str=sc.nextLine();
        sc.close();

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);
            if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'||
               ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U'){
                   vowels++;   

            }
            else if((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' )){
                consonants++;
            }
        }

        System.out.println("Vowels: "+ vowels);
        System.out.println("Consonants: "+ consonants);

    }
    
}
