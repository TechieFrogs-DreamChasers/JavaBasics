import java.util.Arrays;
import java.util.Scanner;

//Handle NegativeArraySizeException
public class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();
        sc.nextLine();
        try {
            String[] fruits = new String[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Enter a Fruit Name: ");
                fruits[i] = sc.nextLine();
            }
            System.out.println(Arrays.toString(fruits));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
Enter Array Size:
-5
java.lang.NegativeArraySizeException: -5
	at Program15.main(Program15.java:12)
 */