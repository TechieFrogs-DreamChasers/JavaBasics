package Assignment7;

import java.util.Scanner;

public class LowerorUpper {

    public static void main(String[] args) {
        
        System.out.println("Enter the String ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        sc.close();

        String newString = "";

        char[] ch = string.toCharArray();

        for(int i=0;i<string.length();i++){

            char newch = ch[i];
            if(Character.isUpperCase(newch)){
               newString = newString +  Character.toLowerCase(newch); 
            }else{
                newString = newString + Character.toUpperCase(newch);
            }
        }

        System.out.println(" New String is ");
        System.out.println(newString);
    }
    
}
