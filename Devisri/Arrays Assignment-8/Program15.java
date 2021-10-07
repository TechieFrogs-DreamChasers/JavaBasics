import java.util.Arrays;
import java.util.Scanner;

//Sort the elements in descending order
public class Program15 {
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
        Arrays.sort(numbers);
        //System.out.println("After sort: " + Arrays.toString(numbers));
        int[] array = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            array[numbers.length - i - 1] = numbers[i];
        }
        System.out.println("Descending Order: " + Arrays.toString(array));

    }
}
/*
Enter the length:
10
All Elements: [75, 16, 37, 67, 28, 15, 32, 98, 67, 17]
Descending Order: [98, 75, 67, 67, 37, 32, 28, 17, 16, 15]

 */
