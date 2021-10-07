package Assignment7;

import java.util.Scanner;

public class CapitalizeFirstChar2 {

    public static void main(String[] args) {

        System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String string  = sc.nextLine();
        sc.close();

        System.out.println(String.format("After String %s : ", capitalizeFirstChar(string)));
        
    }

    public static String capitalizeFirstChar(String str){

    String words[]=str.split("\\s");  
    String capitalizeWord=" "; 

    for(String string:words){  
        String first=string.substring(0,1);  
        String afterfirst=string.substring(1);  
        capitalizeWord += first.toUpperCase()+afterfirst+" "; 
        
    }

    return capitalizeWord;
}
    
}
