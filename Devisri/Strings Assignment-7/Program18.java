import java.util.Scanner;

//Iterate Through each character in a string using foreach loop
public class Program18 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        char[] chars = string.toCharArray();
        //looping through for each
        for (char i : chars) {
            System.out.println("Character at the Current Index: " + i);
        }
    }
}
