package Assignment7;

import java.util.Random;
import java.util.Scanner;

public class alphanumericString {
    
    public static void main(String[] args) {
        
        String stringUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String stringLowercase = stringUppercase.toLowerCase();
        String numeric = "0123456789";
        String string = stringUppercase+stringLowercase+numeric;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length for String: ");
        int length = sc.nextInt();
        sc.close();

        String stringAlphaNumeric = generateAlphanumeric(length, string);
        
        System.out.println(String.format("The AlphaNumeric String is %s", stringAlphaNumeric));

    }

    private static String generateAlphanumeric(int length,String str){

        StringBuilder string = new StringBuilder();
        Random random = new Random();

        for(int i=0;i<length;i++){

             string.append(str.charAt(random.nextInt(str.length())));
        }
        return string.toString();

    }
}
