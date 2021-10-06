import java.util.Arrays;
import java.util.Scanner;

//Print the elements of an array in odd position
public class Program8 {
    public static void main(String[] args) {
        System.out.println("Enter the length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        sc.close();
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("All Elements: " + Arrays.toString(numbers));
        for (int i = 1; i < numbers.length; i += 2) {
            System.out.println("Element at " + i + " is: " + numbers[i]);
        }
    }
}
/*
Enter the length:
14
All Elements: [38, 7, 87, 4, 85, 68, 73, 100, 90, 12, 95, 38, 79, 74]
Element at 1 is: 7
Element at 3 is: 4
Element at 5 is: 68
Element at 7 is: 100
Element at 9 is: 12
Element at 11 is: 38
Element at 13 is: 74
 */
