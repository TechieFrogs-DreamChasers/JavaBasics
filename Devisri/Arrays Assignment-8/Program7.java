import java.util.Arrays;
import java.util.Scanner;

//Print the elements of an array in even position
public class Program7 {
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
        for (int i = 2; i < numbers.length; i += 2) {
            System.out.println("Element at " + i + " is: " + numbers[i]);
        }
    }
}
/*
Enter the length:
15
All Elements: [72, 62, 79, 39, 4, 23, 49, 99, 94, 80, 28, 93, 84, 88, 49]
Element at 2 is: 79
Element at 4 is: 4
Element at 6 is: 49
Element at 8 is: 94
Element at 10 is: 28
Element at 12 is: 84
Element at 14 is: 49
 */
