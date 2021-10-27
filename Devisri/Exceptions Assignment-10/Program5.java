import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Pass Arguments while passing Checked Exceptions
public class Program5 {
    public static void main(String[] args) {
       /* System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        try {
            int number= sc.nextInt();
            sc.nextLine();
            System.out.println("First Number: "+number);
            sc.close();
            System.out.println("Enter a number: ");
            int number2=sc.nextInt();
            sc.nextLine();
            System.out.println("Second Number: "+number2);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }*/
        try {
            Scanner sc = new Scanner(new File("Example"));
            String s = sc.nextLine();
            s = s.toLowerCase();
            System.out.println("Strings: " + s);
        } catch (FileNotFoundException e) {
            System.out.println("Message: " + e.getMessage());
        }
    }
}
/*
Message: Example (The system cannot find the file specified)
 */