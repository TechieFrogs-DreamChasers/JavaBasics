import java.util.Scanner;

//Handling Exceptions with overloaded methods
public class Program8 {
    public static void main(String[] args) {
        System.out.println("Enter a value: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a value: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        try {
            int result_Of_2Ints = sum(num1, num2);
            System.out.println("Sum of 2 Integers: " + result_Of_2Ints);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Enter a value: ");
        int num3 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a value: ");
        float num4 = sc.nextFloat();
        sc.nextLine();
        try {
            int result_Of_FloatInt = sum(num3, num4);
            System.out.println("Sum of Float + Integer: " + result_Of_FloatInt);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Enter a value: ");
        String string = sc.nextLine();
        System.out.println("Enter a value: ");
        int number = sc.nextInt();
        sc.nextLine();
        try {
            int result_Of_StringInt = sum(string, number);
            System.out.println("Sum of String + Integer: " + result_Of_StringInt);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }

    static int sum(int num1, int num2) throws ArithmeticException {
        if (num2 <= 0 || num1 <= 0) {
            throw new ArithmeticException("INTEGERS NUMBER SHOULD BE > 0");
        }
        return num1 + num2;
    }

    static int sum(int num1, float num2) throws ArithmeticException {
        if (num1 <= 0 || num2 <= 0.0f) {
            throw new ArithmeticException("FLOAT AND INTEGER NUMBER SHOULD BE > 0");
        }
        return (int) (num1 + num2);
    }

    static int sum(String s, int num) throws NumberFormatException {
        if (s == null || !(s.matches("[0-9]+"))) {
            throw new NumberFormatException("NON-NUMERIC STRING");
        }
        int temp = Integer.parseInt(s);
        return temp + num;
    }
}
/*
Enter a value:
5
Enter a value:
0
INTEGERS NUMBER SHOULD BE > 0
Enter a value:
0
Enter a value:
-1
FLOAT AND INTEGER NUMBER SHOULD BE > 0
Enter a value:
hi
Enter a value:
5
NON-NUMERIC STRING
 */