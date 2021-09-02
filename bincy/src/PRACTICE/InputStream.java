package PRACTICE;

import java.util.Scanner;

public class InputStream {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter First name: ");
        String fName = obj.next();
        System.out.println("Enter Last name: ");
        String lName = obj.next();
        System.out.println("Enter the Address : ");
        obj.next();
        String address = obj.nextLine();
        System.out.println("Enter the ItemPrice : ");
        
        double itemPrice = obj.nextDouble();
        
        //obj.close();

        String sen =obj.next("The/ sky /is/ blue");
        obj.useDelimiter("/");
        while(obj.hasNext())
            System.out.println(obj.next());
        obj.close();

        
        System.out.println("Name : "+ fName +" "+ lName);
        System.out.println("Address : "+ address);
        System.out.println("ItemPrice : "+ itemPrice);
    }
}
