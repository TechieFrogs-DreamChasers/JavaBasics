import java.util.Scanner;

//Handle NumberFormatException
public class Program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String string1 = sc.nextLine();
        System.out.println("Enter a String: ");
        String string2 = sc.nextLine();
        double average;
        try {
            if (string1.matches("[0-9]+") && string2.matches("[0-9]+")) {
                int num1 = Integer.parseInt(string1);
                int num2 = Integer.parseInt(string2);
                average = (num1 + num2) / 2;
                System.out.println("Average of Integers: " + average);
            } else {
                throw new NumberFormatException("NON-NUMERIC STRING");
            }
        } catch (NumberFormatException e) {
            System.out.println(e.initCause(e.getCause()));
        }

    }

}
/*
Enter a String:
500
Enter a String:
hi
java.lang.NumberFormatException: NON-NUMERIC STRING
 */
