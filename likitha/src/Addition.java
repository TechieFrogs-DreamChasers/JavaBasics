import java.util.Scanner;

public class Addition {
    
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter num1 value:");
        int num1=scannerObj.nextInt();
        System.out.println("Enter num2 value:");
        int num2=scannerObj.nextInt();
        int sum=num1+num2;
        System.out.println("sum:" + " " + sum);
        scannerObj.close();

    }
}
