import java.util.Scanner;

//Use catch to handle chained exception
public class Program7 {
    private static final double MIN_BALANCE = 500.0d;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount: ");
        double balance = sc.nextDouble();
        sc.nextLine();
        try {
            checkBalance(balance);
        } catch (MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Balance: " + balance);
        sc.close();
    }

    private static void checkBalance(double amount) throws MinimumBalanceException {
        if (amount < MIN_BALANCE) {
            throw new MinimumBalanceException("CHECK MINIMUM BALANCE REQUIREMENT");
        }
        try {
            amount_Details(amount);
        } catch (ArithmeticException e) {
            System.out.println("Message=> " + e.getMessage());
            System.out.println("Cause=> " + e.getCause());
        }
    }

    private static void amount_Details(double amount) throws ArithmeticException {
        if (amount > MIN_BALANCE && amount < 1000) {
            ArithmeticException ae = new ArithmeticException("ArithmeticException Thrown");
            ae.initCause(new MinimumBalanceException("GET MINIMUM WITHDRAWAL AMOUNT"));
            throw ae;
        }
    }
}

class MinimumBalanceException extends Exception {
    MinimumBalanceException(String message) {
        super(message);
    }
}
/*
Enter Amount:
800
Message=> ArithmeticException Thrown
Cause=> MinimumBalanceException: GET MINIMUM WITHDRAWAL AMOUNT
Balance: 800.0
 */