import java.util.Arrays;

//Print biggest and smallest palindrome possible word in a string
//Pup has redder eyes and its noon.
public class Program45 {
    public static void main(String[] args) {
        String str = "Pup has redder eyes";
        str = str.toLowerCase();
        System.out.println("Entered String: " + str);
        String[] strings = str.split(" ");
        String temp;
        StringBuilder sb = new StringBuilder();
        for (String string : strings) {
            if (checkPalindrome(string) && string.length() > 2) {
                sb.append(string).append(" ");
            }
        }
        temp = sb.toString();
        minMaxWord(temp);
    }

    static boolean checkPalindrome(String string) {
        char[] chars = string.toCharArray();
        char[] reverse = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reverse[i] = chars[reverse.length - i - 1];
        }
        return Arrays.toString(chars).equals(Arrays.toString(reverse));
    }

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
        System.out.println("The smaller Palindrome in the String: " + small);
        System.out.println("the larger Palindrome in the String: " + large);
    }
}
