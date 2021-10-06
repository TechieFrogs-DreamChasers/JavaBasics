package StringsAssignment;

import java.util.Scanner;

//Total number of vowels and consonants in a string
public class Program24 {
    public static void main(String[] args){
        System.out.println("Enter a string: ");
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        obj.close();
        int vcount = 0;
        int concount = 0;
        str1 = str1.toLowerCase();

        for(int i =0; i<str1.length(); i++){
            if(str1.charAt(i)=='a'||str1.charAt(i)=='e'|| str1.charAt(i)=='i'||str1.charAt(i)=='o'||
            str1.charAt(i)=='u'){
                vcount++;
            }
            else if(str1.charAt(i)>='a' && str1.charAt(i)<='z'){
                concount++;

            }
            
        }
        System.out.println("Vowel count: "+vcount);
        System.out.println("Consonant count: "+ concount);
    }
}
