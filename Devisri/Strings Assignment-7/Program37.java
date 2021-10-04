import java.util.Arrays;
import java.util.Scanner;

//Duplicate characters in a string

public class Program37 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        s = s.toLowerCase();
        //Taking an empty string
        String rep = "";
        //looping through entered string
        for (int i = 0; i < (s.length()) - 1; i++) {
            for (int j = i + 1; j < (s.length()); j++) {
                //if first char is same as remaining characters
                if (s.charAt(i) == s.charAt(j)) {
                    //if its not empty then repeating char is concatenated to rep and loop exits
                    if (!rep.contains(String.valueOf(s.charAt(j)))) {
                        rep += s.charAt(j);
                        break;
                    }
                }
            }
        }
        //spaces are replaced
        rep = rep.replace(" ", "");
        //converting that rep string to char array to display duplicate characters
        char[] chars = rep.toCharArray();
        System.out.println(Arrays.toString(chars));
    }
}
/*
Output:
Enter a String:
Red berries are red color
[r, e, d, o]
 */
