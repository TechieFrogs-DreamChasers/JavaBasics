import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int number1=scanner.nextInt();
        System.out.println("Enter the Second number: ");
        int number2=scanner.nextInt();
        scanner.close();
        number1=number1-number2;
        number2=number1+number2;
        number1=number2-number1;
        System.out.println("The value of first number after swapping "+number1);
        System.out.println("The value of second number after swapping "+number2);
    }
}
