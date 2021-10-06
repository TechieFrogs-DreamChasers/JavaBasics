import java.util.Scanner;

//Find the largest and smallest word in a string
public class Program40 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        //reads a string
        String s = sc.nextLine();
        sc.close();
        //calling the static method
        Program40.minMaxWord(s);
    }

    //method with the logic
    static void minMaxWord(String string) {
        //if any string is not entered
        if (string == null)
            return;
        //splitting string and storing those as array
        String[] words = string.split(" ");
        //storing minimum length of a string to its limit
        int min_length = Integer.MAX_VALUE;
        //storing maximum length of a string to 0
        int max_length = 0;
        //taking a string to store small word
        String small = "";
        //taking a string to store large word
        String large = "";
        //traversing through array
        for (String word : words) {
            //for first word the length is stored
            int len = word.length();
            //if that length > 0
            if (len > max_length) {
                //assigning word.length as maximum
                max_length = len;
                //and that word as large word
                large = word;
            }
            //if that length < 0
            if (len < min_length) {
                //assigning word.length as minimum
                min_length = len;
                //and that word as small word
                small = word;
            }
        }
        //Printing those values
        System.out.println("The smaller word in the String: " + small + ", with length: " + min_length);
        System.out.println("the larger word in the String: " + large + ",  with length: " + max_length);
    }
}
/*
Output:
Enter a String:
Cherry blossoms does not often bloom
The smaller word in the String: not, with length: 3
the larger word in the String: blossoms,  with length: 8

*/