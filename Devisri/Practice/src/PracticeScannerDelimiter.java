import java.util.Scanner;

public class PracticeScannerDelimiter {
    public static void main(String[] args) {
        /*String s="This-a-String-and-Scanner-is-taking-it-as-a-token.";
        //Scanner(String source) constructor
        Scanner sc=new Scanner(s);
        //System.out.println("Boolean check: "+sc.hasNextBoolean());
        sc.useDelimiter("-");
        System.out.println("*****Using Delimiter******");
        while (sc.hasNext())
        System.out.println(sc.next());
        //displays the delimiter we are using
        System.out.println("After Delimiter: "+sc.delimiter());
        sc.close();*/
        System.out.println("*******************************");
        System.out.println("Given Address: ");
        //String address="321 , Hyderabad, Andhra Pradesh, India, 500000.";
        Scanner scanner=new Scanner(System.in);
        //scanner.useDelimiter(".");
        String address="";
        String h_No=scanner.findInLine("321");
        String city=scanner.findInLine("Hyderabad");
        String state=scanner.findInLine("Andhra Pradesh");
        String country=scanner.findInLine("India");
        String zCode=scanner.findInLine("500000");
        System.out.println("Address: "+address);
        System.out.println("House Number: "+h_No);
        System.out.println("City: "+city);
        System.out.println("State: "+state);
        System.out.println("Country: "+country);
        System.out.println("ZipCode: "+zCode);
        scanner.close();
    }
}
