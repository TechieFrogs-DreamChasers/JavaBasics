package StringsAssignment;

import java.util.Scanner;

//Program to count the punctuation characters in a string
public class Program23 {
    public static void main(String[] args){
        System.out.println("Enter a string :");
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        obj.close();

        int count = 0;//(! , . , ' , - , " , ? , ; )
        for(int i=0; i< str1.length(); i++){
            if(str1.charAt(i)=='!' || str1.charAt(i) == '.' || str1.charAt(i) =='\''||str1.charAt(i)=='-'
            || str1.charAt(i)=='\"'||str1.charAt(i)=='?'||str1.charAt(i)==';'||str1.charAt(i)==','){
                count++;
            } 
        }
        System.out.println("Number of punctuations:" + count);
    }
    
}
