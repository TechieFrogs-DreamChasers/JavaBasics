import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char ch=scanner.next().charAt(0);
        scanner.close();
        switch (ch){
            case 'a','e','i','o','u','A','E','I','O','U'->
                    System.out.println("Entered Character "+ch+" is a Vowel");
            case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'->
                    System.out.println("Entered Character "+ch+" is a Consonant");
            case  'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z' ->
                    System.out.println("Entered Character "+ch+" is a Consonant");
            default -> System.out.println("Unexpected value: " + ch);
        }

    }
}
