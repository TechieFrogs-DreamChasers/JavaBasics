import java.util.Scanner;
public class scannermethod {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

    System.out.print("Enter your name: ");

    // takes input from the keyboard
    String name = input.nextLine();

    // prints the name
    System.out.println("My name is " + name);

    System.out.print("Enter your email address: ");

    // takes input from the keyboard
    String email = input.nextLine();

    // prints the name
    System.out.println("My email address is " + email);

    // closes the scanner
    input.close();
  }
}
