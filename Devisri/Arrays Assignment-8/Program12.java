import java.util.Arrays;
import java.util.Scanner;

//Print the sum of all elements in the array
public class Program12 {
    public static void main(String[] args) {
        System.out.println("Enter the length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        sc.close();
        int[] numbers = new int[length];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("All Elements: " + Arrays.toString(numbers));
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("The sum of all Integers: " + sum);
        double[] doubles = new double[length];
        double total = 0.0d;
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = Math.round((Math.random() * 100)) + 1;
        }
        System.out.println("All Elements: " + Arrays.toString(doubles));
        for (double d : doubles) {
            total += d;
        }
        System.out.println("The sum of all Integers: " + total);
    }
}
/*
Enter the length:
10
All Elements: [77, 38, 26, 64, 16, 70, 44, 78, 29, 8]
The sum of all Integers: 450
All Elements: [94.0, 50.0, 9.0, 10.0, 10.0, 29.0, 42.0, 57.0, 48.0, 10.0]
The sum of all Integers: 359.0
 */
