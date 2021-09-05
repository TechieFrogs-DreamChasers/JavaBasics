import java.util.Scanner;



public class Largest {
    
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter num1 value:");
        int num1=scannerObj.nextInt();
        System.out.println("Enter num2 value:");
        int num2=scannerObj.nextInt();
        System.out.println("Enter num3 value:");
        int num3=scannerObj.nextInt();

        if(num1>num2 && num1>num3)
        System.out.println("Largest number:" +num1);
        else if(num2>num3)
        System.out.println("Largest number:" +num2);
        else
        System.out.println("Largest number:" +num3);
       
       
        scannerObj.close();

    }
}
