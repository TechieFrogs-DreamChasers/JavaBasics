import java.util.Scanner;

//Take input number from user reverse it and add it to itself...
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        sc.nextLine();
        reverseSum(number);
        sc.close();
    }

    static int reverse(int number) {
        int rem = 0;
        int rev = 0;
        while (number != 0) {
            rem = number % 10;
            rev = (rev * 10) + rem;
            number = number / 10;
        }
        return rev;
    }

    static boolean checkPalindrome(int number) {
        if (reverse(number) == number) {
            return true;
        } else {
            return false;
        }
    }

    static void reverseSum(int number) {
        if (checkPalindrome(number)) {
            System.out.println("Number is a Palindrome");
        } else {
            while (!checkPalindrome(number)) {
                int result = reverse(number);
                int sum = result + number;
                System.out.println(result + " + " + number + " = " + sum);
                number = sum;
            }
        }
    }
}
/*
Enter a number:
2596
6952 + 2596 = 9548
8459 + 9548 = 18007
70081 + 18007 = 88088
 */