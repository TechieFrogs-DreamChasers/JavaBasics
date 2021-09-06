import java.util.Scanner;

public class assign1 {
    public static void main(String [] args) {
        int a,b,add;
        Scanner ScannerObj = new Scanner(System.in);
        System.out.println("enter the first number");
        a = ScannerObj.nextInt();
        System.out.println("enter the second number");
        b = ScannerObj.nextInt();
        add = a+b;
        System.out.println("the sum of two numbers is "+add);//printing sum
        ScannerObj.close();
        
    }
    
}
