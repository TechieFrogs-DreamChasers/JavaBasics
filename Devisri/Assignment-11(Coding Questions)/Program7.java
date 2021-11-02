import java.util.Arrays;
import java.util.Scanner;

//If n is a positive number and a is integer array length....
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[9];
        int size = a.length;
        int n = size + 1;
        int sum = (n * (n + 1)) / 2;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter " + (i + 1) + " number: ");
            a[i] = sc.nextInt();
        }
        //System.out.println(sum);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count += a[i];
        }
        //System.out.println(count);
        System.out.println(Arrays.toString(a));
        System.out.println("Missing element: " + (sum - count));

    }
}
/*
Enter 1 number:
2
Enter 2 number:
1
Enter 3 number:
5
Enter 4 number:
4
Enter 5 number:
6
Enter 6 number:
8
Enter 7 number:
9
Enter 8 number:
7
Enter 9 number:
10
[2, 1, 5, 4, 6, 8, 9, 7, 10]
Missing element: 3
 */