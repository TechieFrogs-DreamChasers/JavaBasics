package StringsAssignment;
//Create random strings using stringbuilder

import java.util.Random;
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args){
        //creating ascii characters 
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = upper.toLowerCase();
        String characters = upper+lower;

        System.out.println("Enter the length of random number:");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        obj.close();

        StringBuilder sbobj = new StringBuilder();
        int i=0;
        Random rand = new Random();


        while(i<num){
            sbobj.append(characters.charAt(rand.nextInt(characters.length())));
            i++;
        }
        System.out.println(sbobj.toString());

    }
    
}
