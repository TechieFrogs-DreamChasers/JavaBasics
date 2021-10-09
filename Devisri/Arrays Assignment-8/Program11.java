import java.util.Scanner;

//Print the number of elements present in an array
public class Program11 {
    public static void main(String[] args) {
        System.out.println("Enter the length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        int count = 0;
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
            count++;
        }
        System.out.println("Number of Integers: " + count);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        sc.close();
        String[] strings = s.split(" ");
        s = s.replace(" ", "");
        char[] chars = s.toCharArray();
        byte[] bytes = s.getBytes();
        count = 0;
        for (int i = 0; i < strings.length; i++) {
            count++;
        }
        System.out.println("Number of Strings: " + count);
        count = 0;
        for (int i = 0; i < chars.length; i++) {
            count++;
        }
        System.out.println("Number of Characters: " + count);
        count = 0;
        for (int i = 0; i < bytes.length; i++) {
            count++;
        }
        System.out.println("Number of Bytes: " + count);
    }
}
/*
Enter the length:
10
Number of Integers: 10
Enter a String:
String is mutable
Number of Strings: 3
Number of Characters: 15
Number of Bytes: 15
 */
