package Practice.InterviewPractice;

import java.util.Scanner;

//reverse should be same 151 and lol , madam
public class Palindrome {
    public static void main(String[] args) {


       Scanner input = new Scanner(System.in);
       System.out.println("Enter String/Integer value to check Palindrome or not ");
       String originalValue = input.nextLine();
        input.close();

       checkPalindrome(originalValue);
    } 
    
    static void checkPalindrome(String originalValue){

        String reverse="";
        int length = originalValue.length();

        for(int i=length-1;i>=0;i--){
            reverse = reverse+originalValue.charAt(i);
        }

        if(reverse.equals(originalValue))
            System.out.println(originalValue+ " is a Palindrome ");
        else
            System.out.println(originalValue+ " is not Palindrome");
    }
    
}
