import java.util.Scanner;

//Handle IllegalArgumentException
public class Program18 {
    public static void main(String[] args) {
        String value = "Y";
        Scanner sc = new Scanner(System.in);
        count(value, sc);
    }

    static void count(String number, Scanner sc) {
        while (number.equalsIgnoreCase("y")) {
            try {
                System.out.println("Enter an Integer: ");
                int score = sc.nextInt();
                sc.nextLine();
                if (score < 0 || score >= 500) {
                    throw new IllegalArgumentException("SCORE SHOULD BE > 0 & <= 500");
                }
                System.out.println("Score is: " + score);
            } catch (IllegalArgumentException e) {
                System.out.println(e.initCause(e.getCause()));
                System.out.println("Want to Continue: ");
                number = sc.next();
                //sc.nextLine();
                if (number.equalsIgnoreCase("Y")) {
                    count(number, sc);
                }
            }
        }
    }
}
/*
Enter an Integer:
100
Score is: 100
Enter an Integer:
200
Score is: 200
Enter an Integer:
300
Score is: 300
Enter an Integer:
400
Score is: 400
Enter an Integer:
500
java.lang.IllegalArgumentException: SCORE SHOULD BE > 0 & <= 500
Want to Continue:
n
*/