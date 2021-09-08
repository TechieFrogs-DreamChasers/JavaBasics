import java.util.Scanner;

public class BankAtmOptions {
    public static final String MSG1 = "***Welcome***";
    public static final String MSG2 = "***Happy Banking***";
    public static final String ERR_MSG = "Invalid Entry";
    public static final String MINI = "Printing Your Mini-Statement....";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 4-digit pin: ");
        int pin = checkDigitValues(scanner);
        System.out.println("Check your Balance: ");
        double balance = checkAmountValues(scanner);
        System.out.println("Enter Your Withdrawl amount: ");
        double withdrawl = checkAmountValues(scanner);
        System.out.println("Enter your Option: ");
        int option = checkOptionValues(scanner);
        switch (option) {
            case 0:
                System.out.println(MSG1);
                break;
            case 1:
                System.out.println("Enter your Pin: " + pin);
                break;
            case 2:
                System.out.println("Your Balance is: " + balance);
                break;
            case 3:
                balance = balance - withdrawl;
                System.out.println("Your balance after withdrawl is: " + balance);
                break;
            case 4:
                System.out.println(MINI);
                break;
            case 5:
                System.out.println(MSG2);
                break;
        }
    }

    static int checkDigitValues(Scanner scanner) {
        int digit;
        do {
            System.out.println("Enter Valid digits: ");
            while (!(scanner.hasNextInt())) {
                System.out.println("Please check the entered input again ");
                scanner.next();
            }
            digit = scanner.nextInt();
        } while ( digit > 0 & !( digit >= 1000 & digit<=9999 ) );
        return digit;
    }
   //checking for validation
    static int checkOptionValues(Scanner scanner){
        int option;
        do{
            System.out.println("Enter a Valid Option Number: ");
            while (!(scanner.hasNextInt())){
                System.out.println(ERR_MSG);
                scanner.next();
            }
            option=scanner.nextInt();
        }while(option<0 & option>=5);
        return option;
    }

    static double checkAmountValues(Scanner scanner) {
        double amount;
        do {
            System.out.println("Enter a Valid Amount: ");
            while (!(scanner.hasNextDouble())) {
                System.out.println("Please check the entered input again ");
                scanner.next();
            }
            amount = scanner.nextDouble();
        } while (amount <= 0);
        return amount;
    }
}

