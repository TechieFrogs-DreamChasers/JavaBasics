/*
password,confirm password,phone,address,zipcode,submit
 */
import java.util.Scanner;

public class UserDetails {
    public static void main(String[] args) {
        System.out.println("***************User Details*****************");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName=sc.next();
        sc.nextLine();
        System.out.println("Enter your email: ");
        String email= sc.nextLine();
        String cPassword= confirmPassCode(sc);
        System.out.println("Enter your gender: ");
        char gender= sc.next().charAt(0);
        sc.nextLine();
        System.out.println("Enter your Phone Number: ");
        long phone=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter your Address: ");
        String address=sc.nextLine();
        /*System.out.println("Please Submit: ");
        boolean isSubmit=false;
        while (!isSubmit) {
            String s=sc.nextLine();
            isSubmit = s.equals("submit");
        }*/
        String firstName= sc.findInLine("Devi");
        System.out.println("Your First name is: "+firstName);
        String lastName= sc.findInLine("Sri");
        System.out.println("Your Last name is: "+lastName);
        System.out.println("Your Email is: "+email);
        System.out.println("Your Confirmed Password is: "+cPassword);
        System.out.println("You have entered your gender as: "+gender);
        System.out.println("Your Phone Number is: "+phone);
        System.out.println("Your Entered Address is: "+address);
        String zCode=sc.findInLine("500000");
        System.out.println("Your Zip Code is: "+zCode);
        String state=sc.findInLine("Andhra Pradesh");
        System.out.println("Your State is: "+state);
        String country=sc.findInLine("India");
        System.out.println("Your Country is: "+country);
        sc.close();
    }
    static String confirmPassCode(Scanner scanner){
        String passcode="";
        String cPasscode="";
        do {
            System.out.println("Enter your password: ");
            passcode=scanner.next();
            System.out.println("Enter your password again: ");
            cPasscode=scanner.next();
            if ((cPasscode.equals(passcode)))
                System.out.println("Passwords matched");
            while (!(cPasscode.equals(passcode))){
                System.out.println("Password does not match");
                //scanner.next();
                cPasscode=scanner.next();
                if ((cPasscode.equals(passcode)))
                System.out.println("Re-entered Password matched");
            }
          }while (!(cPasscode.equals(passcode)));
        return cPasscode;
    }
}
