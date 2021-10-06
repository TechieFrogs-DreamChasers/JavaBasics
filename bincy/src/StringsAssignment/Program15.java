package StringsAssignment;

import java.util.Scanner;

//Program to capitalize first character of each word in a sentence
public class Program15 {
    public static void main(String[] args){
        System.out.println("Enter any string: ");
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        obj.close();
        String capital = "";

        //split the words on space
        String[] words = str1.split("\\s");
        for(int i=0; i< words.length; i++){
            //take the substring in the first place
          String w = words[i].substring(0 , 1);
          String remaining = words[i].substring(1);
          capital+= (w .toUpperCase() + remaining+ " ");

        }
        System.out.println(capital);

    }
    
}
