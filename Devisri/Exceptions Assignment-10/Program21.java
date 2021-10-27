import java.util.Scanner;

//Handle the Exception using Multiple Try Catch blocks
public class Program21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char number = sc.next().charAt(0);
        sc.nextLine();
        System.out.println("Enter a Character: ");
        char chars = sc.next().charAt(0);
        sc.nextLine();
        System.out.println("Enter a String: ");
        String string = sc.nextLine();
        System.out.println("Enter an Index: ");
        int index = sc.nextInt();
        sc.nextLine();
        try {
            checkCharacter(number);
        } catch (InvalidCharacterException e) {
            System.out.println(e.initCause(e.getCause()));
        }
        try {
            checkGreater(chars);
        } catch (GreaterException e) {
            System.out.println(e.initCause(e.getCause()));
        }
        try {
            checkNumber(string, index);
        } catch (InvalidCharacterException e) {
            System.out.println(e.initCause(e.getCause()));
        }
    }

    private static void checkCharacter(char ch) throws InvalidCharacterException {
        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit!!!");
        } else {
            throw new InvalidCharacterException("NOT A DIGIT!!!");
        }
    }

    private static void checkGreater(char ch) throws GreaterException {
        if (ch > 100) {
            throw new GreaterException("CHARACTER VALUE LIMIT IS < 100");
        } else {
            System.out.println(ch + " value in Integer: " + (int) ch);
        }
    }

    private static void checkNumber(String ch, int index) throws InvalidCharacterException {
        if (ch.charAt(index) == 65) {
            System.out.println(ch.charAt(index) + ": Is the character at this: " + index + " ,of the given String: " + ch);
        } else {
            throw new InvalidCharacterException("UNWANTED CHARACTER!!!");
        }
    }
}

class InvalidCharacterException extends Exception {
    public InvalidCharacterException(String message) {
        super(message);
    }
}

class GreaterException extends Exception {
    public GreaterException(String message) {
        super(message);
    }
}
/*
Enter a Character:
a
Enter a Character:
j
Enter a String:
Grape
Enter an Index:
2
InvalidCharacterException: NOT A DIGIT!!!
GreaterException: CHARACTER VALUE LIMIT IS < 100
InvalidCharacterException: UNWANTED CHARACTER!!!
 */