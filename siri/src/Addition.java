import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        
        Scanner oScanner=new Scanner(System.in);
        System.out.println("enter number");
        int num1=oScanner.nextInt();
        System.out.println("enter number");
        int num2=oScanner.nextInt();
        int sum=num1+num2;
        System.out.println("sum of two numbers" + sum);
        oScanner.close();
        

    }
    
}
