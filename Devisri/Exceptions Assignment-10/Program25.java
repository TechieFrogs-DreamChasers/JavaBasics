import java.util.Arrays;
import java.util.Scanner;

//Use Finally Block for catching Exceptions
public class Program25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length number: ");
        int size = sc.nextInt();
        sc.nextLine();
        int[] integers = new int[size];
        try {
            System.out.println("Adding elements: ");
            for (int integer : integers) {
                System.out.println(integer);
                if (integer == 0) {
                    throw new ArithmeticException("INVALID INPUT!!!");
                }
            }
            System.out.println(Arrays.toString(integers));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Block!!!");
            System.out.println("Adding elements: ");
            for (int i = 0; i < size; i++) {
                integers[i] = (int) (Math.random() * 100 + 1);
            }
            System.out.println(Arrays.toString(integers));
        }
    }
}
/*
Enter the length number:
15
Adding elements:
0
INVALID INPUT!!!
Finally Block!!!
Adding elements:
[45, 13, 98, 16, 70, 93, 37, 45, 99, 11, 52, 20, 92, 53, 45]
 */