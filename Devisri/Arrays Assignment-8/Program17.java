import java.util.Arrays;
import java.util.Scanner;

//Find Second-largest element in the array
public class Program17 {
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
        int[] temp = new int[ints.length];
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            temp[ints.length - i - 1] = ints[i];
        }
        System.out.println("Elements: " + Arrays.toString(temp));
        System.out.println("Second Large Number: " + temp[1]);
    }
}
/*
Enter the Length:
10
Elements are: [68, 49, 77, 87, 82, 36, 15, 60, 9, 70]
Elements: [87, 82, 77, 70, 68, 60, 49, 36, 15, 9]
Second Large Number: 82
*/
