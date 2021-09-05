import java.util.Scanner;

public class Swap {
    
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter num1 value:");
        int num1=scannerObj.nextInt();
        System.out.println("Enter num2 value:");
        int num2=scannerObj.nextInt();
        int c=num1;
        num1=num2;
        num2=c;
        System.out.println("num1 and num2 values after swapping");
        System.out.println("num1" + " " + num1);
        System.out.println("num2" + " " + num2);
        scannerObj.close();

    }
}
