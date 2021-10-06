import java.util.Scanner;

//Check if a string contains a SubString using contains()
public class Program19 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        boolean is = true;
        System.out.println("Enter a Substring: ");
        String str = sc.nextLine();
        //if string contains the substring it enters the loop
        if (string.contains(str)) {
            System.out.println(is + " Entered String contains the \'" + str + "\' sequence!!!");
        } else {
            System.out.println(!is + " Entered String does not contain the \'" + str + "\' sequence!!!");
        }

    }
}
