//import java.util.Scanner;

public class HalfPyramidAlphabets {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= i; j++) {
                for (int k = j; k >= j; k--) {
                    System.out.print((char) k + " ");
                }
                System.out.print("");
            }
            System.out.println();
        }
    }
}
