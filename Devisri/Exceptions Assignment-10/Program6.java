import java.util.Scanner;

//Implement the Nested Try Statements
public class Program6 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try {
            try {
                if (s.length() < 2) {
                    throw new NullPointerException("STRING IS MORE THAN ONE CHARACTER");
                }
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
            try {
                System.out.println(s.charAt(s.length()));
            } catch (StringIndexOutOfBoundsException e) {
                System.err.println("RE-CHECK STRING LENGTH");
            }
        } finally {
            System.out.println("String: " + s);
        }
    }
}
/*
Enter a String:
A
STRING IS MORE THAN ONE CHARACTER
String: A
RE-CHECK STRING LENGTH

Enter a String:
ban
RE-CHECK STRING LENGTH
String: ban
 */