import java.util.Scanner;
//Find the frequency of characters
public class Program39 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        //reads a String
        String s = sc.nextLine();
        sc.close();
        //converting string characters in to char array
        char[] chars = s.toCharArray();
        //count for counting character repeat
        int count;
        //taking a temp variable and assigning value 1 to it
        int temp = 1;
        //taking a ch variable and passing 'a' value to it
        char ch = 'a';
        //alphabets are 26
        //while temp is <= 26 loop continues
        while (temp <= 26) {
            //assigning count to zero
            count = 0;
            //traversing through loop
            for (int i = 0; i < s.length(); i++) {
                // if (chars[0,1,2,...] == ch('a' here) or char[0,1,2...]=a-32(97-32=65('A'))
                if ((chars[i] == ch) || (chars[i] == (ch - 32))) {
                    //count gets incremented by 1
                    count++;
                }
            }
            //Now after for loop ends & count > 0 then
            // the frequency of that character and its count gets printed
            if (count > 0) {
                System.out.println("Frequency of " + ch + " is " + count);
            }
            //ch++ incremented by 1
            ch++;
            //temp is incremented by 1. while loop ends when temp is > 26
            temp++;
        }
    }
}
/*
OutPut:

Enter a String:
Beginning
Frequency of b is 1
Frequency of e is 1
Frequency of g is 2
Frequency of i is 2
Frequency of n is 3

Enter a String:
Cherry blossoms does not often bloom.
Frequency of b is 2
Frequency of c is 1
Frequency of d is 1
Frequency of e is 3
Frequency of f is 1
Frequency of h is 1
Frequency of l is 2
Frequency of m is 2
Frequency of n is 2
Frequency of o is 7
Frequency of r is 2
Frequency of s is 4
Frequency of t is 2
Frequency of y is 1
 */
