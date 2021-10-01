import java.util.Scanner;

//Count total number of punctuation characters in a string
public class Program23 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        //for counting
        int count = 0;
        //looping through string
        for (int i = 0; i < string.length(); i++) {
            //using switch we checking indexes
            switch (string.charAt(i)) {
                //giving some punctuations to case and if case satisfies count increments by 1
                case '.', ',', '?', ':', ';', '/', '!' -> count++;
                // default -> System.out.println(count);
            }
        }
        //Printing Count value
        System.out.println("The Punctuation Characters Count is: " + count);
    }
}
