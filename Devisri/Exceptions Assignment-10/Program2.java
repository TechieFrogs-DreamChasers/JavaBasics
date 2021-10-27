import java.util.Arrays;
import java.util.Scanner;

//Program to catch multiple Exceptions
public class Program2 {
    public static void main(String[] args) {
        int[] ints = new int[10];
        System.out.println("Enter an Integer: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter an Integer: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        try {
            for (int i = 0; i < ints.length; i++) {
                if (num2 > 0)
                    ints[i] = num1 / num2;
                else
                    throw new ArithmeticException("NUMBER CAN'T BE / BY ZERO");
            }
            System.out.println("The element at index 10 is: " + ints[10]);

        } catch (ArithmeticException e) {
            System.err.println("NUMBER CAN'T BE / BY ZERO");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("RE-CHECK ARRAY LENGTH");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Array Elements: " + Arrays.toString(ints));
    }
}
/*
Enter an Integer:
10
Enter an Integer:
5
Array Elements: [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
Enter an Integer:
5
Enter an Integer:
0
RE-CHECK ARRAY LENGTH
Array Elements: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
Enter an Integer:
5
Enter an Integer:
0
NUMBER CAN'T BE / BY ZERO
Array Elements: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 */