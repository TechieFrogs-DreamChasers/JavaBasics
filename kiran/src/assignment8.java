import java.util.Scanner;

public class assignment8 {
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);
             System.out.println("Enter the number");
        int x = scannerObj.nextInt();
          long fact = 1;
        int y = 1;
        while(y <= x){
            fact = fact*y;
            y++;
        }
             System.out.println("Factorial of "+ x + " is : "+ fact);
        scannerObj.close();



        
    }
    
}
