import java.util.Scanner;

public class LcmOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the Second number: ");
        int number2 = scanner.nextInt();
        scanner.close();
        int lcm = (number1 > number2) ? number1 : number2;
        if (number1 == 0 || number2 == 0) {
            System.out.println("Lcm of " + number1 + " and " + number2 + " is " + number1);
        } else {
            while (true) {
                if (lcm % number1 == 0 && lcm % number2 == 0) {
                    System.out.println("Lcm of " + number1 + " and " + number2 + " is " + lcm);
                    break;
                }
                ++lcm;
            }
        }
    }
}



