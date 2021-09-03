/*

 */
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //scanner.useDelimiter("&");
        System.out.println("Enter Your Name: ");
        String name=scanner.nextLine();
        System.out.println("Enter your phone number: ");
        long number=scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter Your Email: ");
        String email=scanner.nextLine();
        System.out.println("Set Your Password: ");
        String password=scanner.nextLine();
        System.out.println("Enter your Age: ");
        int age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Address: ");
        String address=scanner.nextLine();
        System.out.println("Enter Your Gender: ");
        char gender=scanner.next().charAt(0);
       // scanner.hasNext();
        scanner.nextLine();

        //scanner.nextLine();
        scanner.close();
        System.out.println("Your name is: "+name);
        System.out.println("Your Phone Number is: "+number);
        System.out.println("Your Email is: "+email);
        System.out.println("Your Password is: "+password);
        System.out.println("Your Age is: "+age);
        System.out.println("Your Entered Address is: "+address);
        System.out.println("You have entered your gender as: "+gender);

    }
}
