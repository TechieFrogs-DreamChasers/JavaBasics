import java.util.Scanner;

//Convert Every word of a String to uppercase
public class Program16 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Entered String: " + s);
        s = s.toUpperCase();
        System.out.println("After Conversion: " + s);

    }
}
