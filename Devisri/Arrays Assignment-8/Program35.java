import java.util.Arrays;
import java.util.Scanner;

//Calculate Standard Deviation
public class Program35 {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        sc.close();
        int[] numbers = new int[size];
        double total = 0.0D;
        double pow_Sum = 0.0D;
        double standard = 0.0D;
        for (int i = 0; i < size; i++) {
            numbers[i] = i + (int) (Math.random() * 100) + 1;
        }
        System.out.println("Array to Calculate Standard Deviation: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
            pow_Sum += Math.pow(total, 2);
            standard = Math.sqrt(i * pow_Sum - Math.pow(total, 2)) / i;
        }
        System.out.println("The Standard Deviation of above Array Elements: " + standard);
    }
}
/*
Enter the size of Array:
15
Array to Calculate Standard Deviation: [89, 7, 32, 14, 40, 95, 83, 79, 41, 64, 12, 36, 35, 22, 16]
The Standard Deviation of above Array Elements: 454.8753753973248
*/
