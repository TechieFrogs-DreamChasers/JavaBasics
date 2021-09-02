import java.util.Scanner;

public class PerformDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int number1=scanner.nextInt();
        System.out.println("Enter the Second number: ");
        int number2=scanner.nextInt();
        scanner.close();
        int remainder=number1%number2;
        int quotient=number1/number2;
        System.out.println("The remainder is: "+remainder);
        System.out.println("The quotient is: "+quotient);
    }
}
