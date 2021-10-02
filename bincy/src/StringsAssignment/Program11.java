package StringsAssignment;

import java.util.Random;
import java.util.Scanner;

//Create random alphanumeric strings
public class Program11 {
    public static void main(String[] args){
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = upper.toLowerCase();
        String number = "1234567890";
        String alphanumeric = upper + lower + number;

        System.out.println("Enter string length: ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        obj.close();

        StringBuilder sb = new StringBuilder();
        Random rand = new Random();

        int i=0;
        while(i<num){
            sb.append(alphanumeric.charAt(rand.nextInt(alphanumeric.length())));
            i++;
        }

        System.out.println(sb.toString());

    }
}
