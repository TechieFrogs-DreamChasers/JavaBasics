import java.util.Arrays;
import java.util.Scanner;

//Handle ArrayOutOfBoundsException
public class Program14 {
    public static void main(String[] args) {
        char[] vowels = new char[5];
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter " + i + " Vowel: ");
                vowels[i] = sc.next().charAt(0);
                sc.nextLine();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Arrays.toString(vowels));
    }
}
/*
Enter 1 Vowel:
a
Enter 2 Vowel:
e
Enter 3 Vowel:
i
Enter 4 Vowel:
o
Enter 5 Vowel:
u
Index 5 out of bounds for length 5
[ , a, e, i, o]
 */