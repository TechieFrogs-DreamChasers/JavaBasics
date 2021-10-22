import java.util.Arrays;
import java.util.Scanner;

//Handle Exception using throw keyword
public class Program3 {
    public static void main(String[] args) {
        String[] strings = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Enter a word: ");
            String s = sc.nextLine();
            if (s.length() < 2) {
                try {
                    throw new Exception("WORD IS MORE THAN ONE CHARACTER");
                } catch (Exception e) {
                    //e.printStackTrace();
                    System.out.println(e.getMessage());
                }
            } else {
                strings[i] = s;
            }
        }
        System.out.println(Arrays.toString(strings));
    }
}
/*
Enter a word:
new
Enter a word:
old
Enter a word:
good
Enter a word:
bad
Enter a word:
bye
[new, old, good, bad, bye]

Enter a word:
bad
Enter a word:
mad
Enter a word:
add
Enter a word:
sub
Enter a word:
a
java.lang.Exception: WORD IS MORE THAN ONE CHARACTER
	at Program3.main(Program3.java:14)
[bad, mad, add, sub, null]

Enter a word:
old
Enter a word:
bad
Enter a word:
mad
Enter a word:
god
Enter a word:
b
WORD IS MORE THAN ONE CHARACTER
[old, bad, mad, god, null]
 */