import java.util.*;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        System.out.println("Enter the Acc number");
        int num = bill.nextInt(); 
        System.out.println("First Name");
        String fName = bill.next();
        System.out.println("Last Name");
        String lName = bill.next();
        System.out.println("Address");
        bill.nextLine();
        String address = bill.nextLine();
        
        System.out.println("Total Usage");
        int u = bill.nextInt();
        System.out.println("Unit price");
        int p = bill.nextInt();
        int t = u * p;
        System.out.println(address);
        System.out.println("Total price-"  +t);

        bill.close();
        
    }
    
}
