import java.util.Scanner;

//Count Vowels And Consonants in String
public class Program24 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        string = string.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> vowels++;
                case 'b', 'd', 'c', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' -> consonants++;
            }
        }
        System.out.println("String Length: "+string.length());
        System.out.println("Entered & Converted String: "+string);
        System.out.println("Vowels Count: "+vowels);
        System.out.println("Consonants Count: "+consonants);
        /*
        Output:
        Enter a String:
        This is Java String Class.
        String Length: 26
        Entered & Converted String: this is java string class.
        Vowels Count: 6
        Consonants Count: 15
         */
    }
}
