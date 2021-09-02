import java.util.Scanner;

public class CharacterOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Alphabet: ");
        char ch = scanner.next().charAt(0);
        scanner.close();
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> System.out.println(ch + " is an Alphabet");
            case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' -> System.out.println(ch + " is an Alphabet");
            case 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z' -> System.out.println(ch + " is an Alphabet");
            default -> System.out.println(ch + " is not an Alphabet");
        }
    }
}
