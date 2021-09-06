import java.util.Scanner;

public class assign2 {
    public static void main(String args[]) {
       int a,b,Quotient,Remainder;
       Scanner ScannerObj = new Scanner(System.in);
       System.out.println("enter the divident and divisor");
       a = ScannerObj.nextInt();
       b = ScannerObj.nextInt();
       Quotient = a/b;
       Remainder = a%b;
       System.out.println("the Quotient is "+Quotient + "\nthe Remainder is " +Remainder); 
       ScannerObj.close();
        
    }
    
}
