import java.util.Arrays;

//Check if two String shuffle can form a valid String
public class Program21 {
    public static void main(String[] args) {
        //String 1
        String s1 = "Pre-fix ";
        //String 2
        String s2 = "Post-fix";
        //String 3
        String s3 = "Pre-fix Post-fix";
        //if lengths are equal and shuffle method returns boolean value and if both are true
        if (((s1.length() + s2.length()) == s3.length()) && (shuffle(s1, s2, s3))) {
            System.out.println("This is a Valid Shuffle");
        } else {
            System.out.println("This is not a Valid Shuffle");
        }
    }
        //method to check whether s1+s2=s3
    static boolean shuffle(String s1, String s2, String s3) {
        //Storing concatenated string in temp
        String temp = s1 + s2;
        //Converting the temp to char array
        char[] temp_Arr = temp.toCharArray();
        //Sorting the array
        Arrays.sort(temp_Arr);
        //the given s3 String->Now a char array
        char[] s3_Arr = s3.toCharArray();
        //Sorting s3 array
        Arrays.sort(s3_Arr);
        //returns boolean value if condition satisfies
        return Arrays.toString(temp_Arr).equals(Arrays.toString(s3_Arr));
    }
}

