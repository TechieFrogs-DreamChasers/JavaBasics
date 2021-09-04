
//import java.math.BigInteger;
import java.util.Scanner;

public class PracticeScanner {
    public static void main(String[] args) {
        System.out.println("******Bank Deposit/Withdrawl Details********");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Account Number: ");
        long aNum = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.println("Your Withdrawl amount is: ");
        double withdrawl = scanner.nextDouble();
        System.out.println("Checking: " + scanner.hasNextDouble());
        System.out.println("Your deposit is: ");
        double deposit = scanner.nextDouble();
        System.out.println("Did You re-check the entered details Y/N ");
        char check = scanner.next().charAt(0);
        System.out.println("Checking: " + scanner.hasNext());
        scanner.nextLine();
        // System.out.println("Please submit: ");

        boolean isSubmit = false;

        System.out.println("Your Account Number: " + aNum);
        System.out.println("Your Name: " + name);
        System.out.println("Your Withdrawl amount is: " + withdrawl);
        System.out.println("Your deposit is: " + deposit);
        System.out.println("Did You re-check the entered details Y/N " + check);
        while (!isSubmit) {
            String s = scanner.nextLine();
            isSubmit = s.equals("submit");
        }
        scanner.close();
    }
}
