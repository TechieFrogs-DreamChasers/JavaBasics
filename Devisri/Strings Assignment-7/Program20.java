import java.util.Scanner;

//Check if a string contains a SubString using indexOf()
public class Program20 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println("Enter a Substring: ");
        String str = sc.nextLine();
        //storing index value
        int index = string.indexOf(str);
        //if string contains the substring. Enters the loop and prints the index
        if (string.contains(str)) {
            System.out.println("Entered SubString \'" + str + "\' is at " + index + " index!!!");
        } else {
            System.out.println("Entered String does not contain the \'" + str + "\' sequence!!!");
        }
    }
}
