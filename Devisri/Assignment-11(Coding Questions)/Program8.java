import java.util.Arrays;

//Find the longest substring without repeating characters in a given string
public class Program8 {
    static final int NUM_OF_CHAR = 256;

    public static void main(String[] args) {
        String s = "javaconceptoftheday";
        String res = findSubString(s);
        System.out.println(res);
    }

    static String findSubString(String s) {
        int length = s.length();
        int current = 1;
        int start = -1;
        int max = 1;
        int i;
        String sub = "" + s.charAt(0);
        int[] ints = new int[NUM_OF_CHAR];
        Arrays.fill(ints, -1);
        ints[s.charAt(0)] = 0;
        if (s == "") {
            System.err.println("Empty String");
        }
        for (i = 1; i < length; i++) {
            start = ints[s.charAt(i)];
            if (start == -1 || i - current > start) {
                current++;
            } else {
                if (current > max) {
                    max = current;
                    int startIndex = i - current;
                    sub = s.substring(startIndex, i);
                }
                current = i - start;
            }
            ints[s.charAt(i)] = i;
        }
        if (current > max) {
            max = current;
            int index = i - current;
            sub = s.substring(index, i);
        }
        return sub;
    }
}
