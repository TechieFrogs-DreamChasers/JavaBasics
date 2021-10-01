import java.util.Scanner;

//Iterate Through each character in a string using for loop
public class Program17 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        //converting string to char[]
        char[] chars = string.toCharArray();
        //looping through array
        for (int i = 0; i < chars.length; i++) {
            //Printing every Character
            System.out.println("Character at " + i + ": " + chars[i]);
        }
    }
}
