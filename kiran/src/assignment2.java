import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
             System.out.println("Enter dividend");
          int dividend = scannerObj.nextInt();
             System.out.println("Enter divisor");
          int divisor = scannerObj.nextInt();
          int quotient = dividend / divisor;
          int remainder = dividend % divisor;
             System.out.println("Quotient is  "+quotient);
             System.out.println("Reminder is "+remainder);
        scannerObj.close(); 

    




    }    
}
