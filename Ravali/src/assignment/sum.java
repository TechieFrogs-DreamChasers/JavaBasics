package assignment;

import java.util.Scanner;

public class sum{
    public static void main (String[]args){
        
       /* int i = 20;
        int j = 30;
        System.out.println ( i + j);*/
System.out.println(" Enter the value of a for addition");

        Scanner readinput = new Scanner(System.in);
        System.out.println(" Enter the value of b for addition");
int a = readinput.nextInt();
int b = readinput.nextInt();
readinput.close();
System.out.println(" sum of a and b is : "+ " "+ (a+b));
        
    }

}