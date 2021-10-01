package Assignment7;

import java.util.Random;
import java.util.Scanner;

public class RandomStrings {

    public static void main(String[] args) {

    String stringUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String stringLowercase = stringUppercase.toLowerCase();
    String string = stringUppercase+stringLowercase;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the String");
    int length = sc.nextInt();
    sc.close();
     
    System.out.println();
    String  rm = generateRandomString(length,string);
    System.out.println(String.format("The String is %s", rm));
  
    }

    private static String generateRandomString(int length,String str){

        StringBuilder randomString = new StringBuilder();
        Random random = new Random();

        for(int i=0;i<length;i++){
            
            randomString.append(str.charAt(random.nextInt(str.length())));
         
        }
        return randomString.toString();

    }
  
}
