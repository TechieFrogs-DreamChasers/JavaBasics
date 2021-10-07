import java.util.Arrays;
import java.util.Scanner;

//Second-smallest number in an array
public class Program18 {
    public static void main(String[] args) {
        System.out.println("Enter the Length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        sc.close();
        int[] ints = new int[length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Elements are: " + Arrays.toString(ints));
        Arrays.sort(ints);
        System.out.println("Second-smallest Number: " + ints[1]);
    }
}
/*
Enter the Length:
10
Elements are: [68, 43, 43, 16, 81, 54, 57, 49, 54, 99]
Second-smallest Number: 43
*/