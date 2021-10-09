import java.util.Arrays;
import java.util.Scanner;

//Find Third-largest element in the array
public class Program16 {
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
        int[] temp = new int[numbers.length];
        System.out.println("All Elements: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            temp[numbers.length - i - 1] = numbers[i];
        }
        System.out.println("Elements: " + Arrays.toString(temp));
        System.out.println("Third Large Number: " + temp[2]);
    }
}
/*
Enter the length:
10
All Elements: [65, 61, 33, 19, 72, 82, 14, 11, 72, 52]
Elements: [82, 72, 72, 65, 61, 52, 33, 19, 14, 11]
Third Large Number: 72
 */
