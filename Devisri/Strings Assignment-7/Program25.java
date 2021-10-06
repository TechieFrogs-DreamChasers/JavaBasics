import java.util.Arrays;
import java.util.Scanner;

//Determine Two Strings Are Anagrams
public class Program25 {
    public static void main(String[] args) {
        System.out.println("Enter a Word: ");
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        word1 = word1.toLowerCase();
        System.out.println("Enter a Word: ");
        String word2 = sc.nextLine();
        word2 = word2.toLowerCase();
        char[] w1_Arr = word1.toCharArray();
        Arrays.sort(w1_Arr);
        char[] w2_Arr = word2.toCharArray();
        Arrays.sort(w2_Arr);
        if (word1.length() == word2.length()) {
            if (Arrays.toString(w1_Arr).equals(Arrays.toString(w2_Arr))) {
                System.out.println("Entered words " + word1 + ", " + word2 + " are Anagrams");
            } else {
                System.out.println("Entered words " + word1 + ", " + word2 + " are not Anagrams");
            }
        } else {
            System.out.println("Enter same length Strings");
        }
    }
}
