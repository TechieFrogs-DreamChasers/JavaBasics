//Reverse a string preserving spaces
public class Program5 {
    public static void main(String[] args) {
        String s = "I am Not String";
        System.out.println("String: " + s);
        reverseString(s);
    }

    static void reverseString(String string) {
        char[] chars = string.toCharArray();
        char[] rev = new char[chars.length];
        //putting count value to length-1 for reverse index
        int count = chars.length - 1;
        //checking array for space and preserving those spaces in reverse array
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                rev[i] = ' ';
            }
        }

        for (char aChar : chars) {
            //if char value is not space
            if (aChar != ' ') {
                //And rev[length-1]==space
                if (rev[count] == ' ') {
                    //decrementing the count for next index
                    count--;
                }
                //Adding the character to rev array
                rev[count] = aChar;
                //Again decrementing
                count--;
            }
        }
        //System.out.println(Arrays.toString(rev));
        String reverse = new String(rev);
        System.out.println("Result: " + reverse);
    }
}
/*
String: I am Not String
Result: g ni rtS toNmaI
 */