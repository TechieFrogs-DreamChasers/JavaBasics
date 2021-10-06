import java.util.Scanner;

//Find the frequency of elements in an array
public class Program2 {
    public static void main(String[] args) {
        System.out.println("*****Boolean*****");
        boolean[] booleans = {true, false, true, false, false, true, true, false, true, true};
        int count = 0;
        for (boolean aBoolean : booleans) {
            if (!aBoolean) {
                count++;
            }
        }
        if (count > 0)
            System.out.println("Frequency of: " + false + " and its frequent occurrences: " + count + " times.");
        count = 0;
        for (boolean aBoolean : booleans) {
            if (aBoolean) {
                count++;
            }
        }
        if (count > 0)
            System.out.println("Frequency of: " + true + " and its frequent occurrences: " + count + " times.");
        System.out.println(" ");
        System.out.println("*****Integer*****");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array length: ");
        int length = sc.nextInt();
        sc.nextLine();
        int[] numbers = new int[length];
        int temp;
        for (int i = 0; i < length; i++) {
            System.out.println("Enter an Integer value: ");
            numbers[i] = sc.nextInt();
            sc.nextLine();
        }
        sc.close();
        for (int i = 0; i < length; i++) {
            temp = 1;
            for (int j = i + 1; j < length - 1; j++) {
                if (numbers[i] == numbers[j]) {
                    temp++;
                    numbers[j] = 0;
                }
            }
            if (numbers[i] != 0) {
                System.out.println("The frequency of value: " + numbers[i] + " and its Count: " + temp);
            }
        }
    }
}
/*
*****Boolean*****
Frequency of: false and its frequent occurrences: 4 times.
Frequency of: true and its frequent occurrences: 6 times.

*****Integer*****
Enter Array length:
10
Enter an Integer value:
90
Enter an Integer value:
89
Enter an Integer value:
90
Enter an Integer value:
89
Enter an Integer value:
90
Enter an Integer value:
89
Enter an Integer value:
90
Enter an Integer value:
90
Enter an Integer value:
89
Enter an Integer value:
62
The frequency of value: 90 and its Count: 5
The frequency of value: 89 and its Count: 4
The frequency of value: 62 and its Count: 1
* */
