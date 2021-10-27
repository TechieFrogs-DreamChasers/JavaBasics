package Practice.TypeCasting;

import java.util.Scanner;

public class NarrowingTypeCasting {
    public static void main(String[] args) {
        
        double d = 19.89;

        //converting double data type into long
        long l = (long)d;

        //converting long to int
        int i = (int)l;

        System.out.println("Before conversion,double value  "+ d);
        System.out.println("After conversion,long value  "+ l);
        System.out.println("After conversiion,int value  "+i);

        System.out.println("Enter an Integer Value ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //converting int to char
        char ch = (char)n;
        System.out.println("Char value of given Inetger : "+ch);
    }
    
}
