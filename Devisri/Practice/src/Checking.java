import java.util.Scanner;

public class Checking {
    public static void main(String[] args) {
        String s = "321,Hyderabad,Telangana,India,500000,";

        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(s).useDelimiter("[,]");

        // check if next token matches the pattern and print it
        System.out.println("" + scanner.next("321"));

        // check if next token matches the pattern and print it
        System.out.println("" + scanner.next("Hyderabad"));

        System.out.println("" + scanner.next("Telangana"));

        // check if next token matches the pattern and print it
        System.out.println("" + scanner.next("India"));

        System.out.println("" + scanner.next("500000"));
        scanner.close();

    }
}
