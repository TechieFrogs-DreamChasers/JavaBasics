import java.util.Arrays;
import java.util.Scanner;

//Print Even & Odd numbers from an Array
public class Program20 {
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
        int even = 0;
        int odd = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                even = ints[i];
                System.out.println("Even Number at index: " + i + ": " + even);
            } else {
                odd = ints[i];
                System.out.println("Odd Number at index: " + i + ": " + odd);
            }
        }
    }
}
/*
Enter the Length:
10
Elements are: [4, 29, 72, 78, 65, 94, 33, 92, 44, 12]
Even Number at index: 0: 4
Odd Number at index: 1: 29
Even Number at index: 2: 72
Even Number at index: 3: 78
Odd Number at index: 4: 65
Even Number at index: 5: 94
Odd Number at index: 6: 33
Even Number at index: 7: 92
Even Number at index: 8: 44
Even Number at index: 9: 12
*/
