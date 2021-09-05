import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        //int dividend = 25
        //int divisor = 4;
        Scanner oScanner=new Scanner(System.in);
        System.out.println("enter value");
        int dividend=oScanner.nextInt();
        System.out.println("enter value");
        int divisor= oScanner.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
    
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
        oScanner.close();
    }
    
}
