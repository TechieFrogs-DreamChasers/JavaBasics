import java.util.Scanner;

//reverse a String
public class Program36 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        char[] strings = string.toCharArray();
        char[] reverse = new char[strings.length];
        for (int i = 0; i < strings.length; i++) {
            //passing last index value of strings array in to reverse array's first index
            reverse[i] = strings[reverse.length - i - 1];
        }
        String s = new String(reverse);
        System.out.println(s);
    }
}
