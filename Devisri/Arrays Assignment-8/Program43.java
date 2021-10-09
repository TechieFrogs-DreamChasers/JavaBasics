import java.util.Arrays;
import java.util.Scanner;

//Check if an array contains a given value
public class Program43 {
    public static void main(String[] args) {
        String[] strings = {"Apple", "Berry", "Guava", "Cherry", "Mango"};
        System.out.println("String Elements: " + Arrays.toString(strings));
        System.out.println("Enter a word: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].contains(str)) {
                System.out.println("Yes, String index " + i + " contains: " + str);
            } else {
                System.out.println("String index " + i + " does not contain: " + str);
            }
        }
        System.out.println("Enter a size: ");
        int size = sc.nextInt();
        sc.nextLine();
        int value = (int) (Math.random() * 100) + 1;
        int[] ints = new int[size];
        sc.close();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println(Arrays.toString(ints));
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == value) {
                System.out.println("Value of " + value + " is at index of " + i);
            } else {
                System.out.println("Value of " + value + " is not at index of " + i);
            }
        }
    }
}
/*
String Elements: [Apple, Berry, Guava, Cherry, Mango]
Enter a word:
p
Yes, String index 0 contains: p
String index 1 does not contain: p
String index 2 does not contain: p
String index 3 does not contain: p
String index 4 does not contain: p
Enter a size:
5
[89, 35, 83, 97, 5]
Value of 87 is not at index of 0
Value of 87 is not at index of 1
Value of 87 is not at index of 2
Value of 87 is not at index of 3
Value of 87 is not at index of 4
 */
