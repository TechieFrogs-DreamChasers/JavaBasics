import java.util.Scanner;

public class Oddoreven {
    public static void main(String[] args) {
        int num;

        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
            
         if (num%2 == 0) {
             System.out.println("This is an Even Number");
            
        }           
        else 
        
            {
              System.out.println("This is an Odd Number");
            }
    } 
    
}
