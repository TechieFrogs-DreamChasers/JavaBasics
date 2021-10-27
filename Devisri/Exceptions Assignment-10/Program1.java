import java.util.Scanner;

//Display Sum of integers using Exceptions
public class Program1 {
    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter an Integer: ");
        int number2 = sc.nextInt();
        sc.nextLine();
        try {
            sum(number1, number2);
        } catch (AdditionException e) {
            System.out.println("SUM IS > 100. RE-ENTER VALUES!!!");
        }
    }

    private static void sum(int num1, int num2) throws AdditionException {
        if ((num1 + num2) > 100) {
            throw new AdditionException("SUM IS > 100");
        } else {
            System.out.println("Sum of given integers: " + (num1 + num2));
        }
    }
}

class AdditionException extends ArithmeticException {
    public AdditionException(String s) {
        super(s);
    }
}
/*
Enter an Integer:
50
Enter an Integer:
50
Sum of given integers: 100

Enter an Integer:
51
Enter an Integer:
52
Exception in thread "main" AdditionException: SUM IS > 100
	at Program1.sum(Program1.java:19)
	at Program1.main(Program1.java:13)

Enter an Integer:
50
Enter an Integer:
52
SUM IS > 100. RE-ENTER VALUES!!!
 */