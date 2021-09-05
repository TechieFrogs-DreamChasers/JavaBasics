import java.util.Scanner;

public class DeliveryDetails {
    public static void main(String[] args) {
        System.out.println("******Delivery Address******");
        //asking to enter name on the same line
        System.out.print("Enter your full name:");
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        scan.nextLine();
        System.out.println("Enter your email: ");
        String email = scan.nextLine();
        System.out.println("Enter Your Phone Number: ");
        long phone = scan.nextLong();
        scan.useDelimiter("[,]");//using delimiter as comma
        scan.nextLine();
        System.out.println("Delivery Address: ");
        int h_No = scan.nextInt();
        String city = scan.next();
        String state = scan.next();
        String country = scan.next();
        int zip_Code = scan.nextInt();
        System.out.println("First Name is " + firstName);
        System.out.println("Last Name is " + lastName);
        System.out.println("E-mail is " + email);
        System.out.println("Phone Number is " + phone);
        System.out.println("Address:- ");
        System.out.println("House Number: " + h_No);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("Zip-Code: " + zip_Code);
        /*System.out.println("Enter Address: ");
        scan.useDelimiter("[,]");
        while ((scan.hasNext())){
            String address = scan.next();
            System.out.println(address);
        }*/
        scan.close();
    }
}
