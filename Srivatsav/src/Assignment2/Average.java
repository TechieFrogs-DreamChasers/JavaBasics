import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    double x = sc.nextInt();
    System.out.println("Enter second number: ");
    double y = sc.nextInt();
    System.out.println("Enter third number: ");
    double z = sc.nextInt();
  
    System.out.println("Average "+avr(x,y,z));

    }
    public static double avr(double x,double y,double z) {
        return (x+y+z)/3;
        
    }
    
}
