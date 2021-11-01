package Practice.InterviewPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOnlyWords {
    public static void main(String[] args) {
        
        //decalaring a variables
        String stringValue;
        int i,j;

        //User Input
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Enter String: ");
        stringValue = Validation.validateString(keyBoard);

        //Printing original Value
        System.out.println("Original String: "+ stringValue);

        //split each word of a string
        String[] string = stringValue.split(" ");

        //printing the words array
        System.out.println("After Spliting the Words: " + Arrays.toString(string));

        //Reversing the words of a string
        try{
            System.out.print("After Reversing Each word: ");
            for(i=0;i<string.length;i++){
                char[] ch = string[i].toCharArray();
                for(j=string[i].length()-1;j>=0;j--){

                    System.out.print(ch[j]);
                }
                System.out.print(" ");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error " + e.getMessage());
        }
       
    }
    
}
