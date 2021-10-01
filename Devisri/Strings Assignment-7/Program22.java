import java.util.Scanner;

//Count total number of characters in a string
public class Program22 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int count=string.codePointCount(0,string.length());
        System.out.println("The Character Count is: "+count);
        /*
        Output:
        Enter a String:
        Character count using codePointCount
        The Character Count is: 36
         */
    }
}
