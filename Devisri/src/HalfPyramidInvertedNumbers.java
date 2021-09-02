import java.util.Scanner;

public class HalfPyramidInvertedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int number = scanner.nextInt();
        scanner.close();
        for (int i = number; i >= 1; i--) {
            for (int j = i; j >= i; j--) {
                for (int k = 1; k <= j; k++) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }
    }
}
