//Illustrate Multiple TryCatch Blocks
public class Program22 {
    public static void main(String[] args) {
        String[] strings = {"Evan", "5000", null, "Anne", "3000"};
        try {
            int result = strings[0].length() + Integer.parseInt(strings[5]);
            System.out.println("The result at strings[5] is: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.initCause(e.getCause()));
        }

        for (int i = 0; i < 5; i++) {
            try {
                int result = strings[i].length() + Integer.parseInt(strings[i]);
                System.out.println("The result at " + i + " is: " + result);
            } catch (NumberFormatException e) {
                System.out.println(e.initCause(e.getCause()));
            }
        }
        for (int i = 0; i < 5; i++) {
            try {
                int result = strings[i].length() + Integer.parseInt(strings[i]);
                System.out.println("The result at " + i + " is: " + result);
            } catch (NullPointerException e) {
                System.out.println(e.initCause(e.getCause()));
            }
        }
        System.out.println("Out of the Try + Catch Block!!!");
    }
}
/*
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
java.lang.NumberFormatException: For input string: "Evan"
The result at 1 is: 5004
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "strings[i]" is null
	at Program22.main(Program22.java:14)

 */