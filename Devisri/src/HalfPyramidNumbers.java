import java.util.Scanner;

public class HalfPyramidNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int number = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = j; k >= j; k--) {
                    System.out.print(k + " ");
                }
                System.out.print("");
            }
            System.out.println();
        }
    }
}
