import java.util.Arrays;

//Convert character to string and vice-versa
public class Program42 {
    public static void main(String[] args) {
        String s = "Red Berries are of Red Color, Blue Berries are Blue Color";
        String[] strings = s.split(" ");
        System.out.println("Printing Original String to Array Of String: ");
        System.out.println(Arrays.toString(strings));
        s = s.substring(0, 28);
        System.out.println("Substring of Original String: ");
        System.out.println(s);
        s = s.replace(" ", "");
        //Converting String to char array
        char[] chars = s.toCharArray();
        System.out.println("Printing the char array from substring: ");
        System.out.println(Arrays.toString(chars));
        //Passing char array to form a new string
        String str = new String(chars);
        System.out.println("Printing the char array converted to string: ");
        System.out.println(str);
        //Converting new string from char array to string array
        String[] strings1 = str.split("");
        System.out.println("Converting that string into an Array of String: ");
        System.out.println(Arrays.toString(strings1));

    }
}
/*
Printing Original String to Array Of String:
[Red, Berries, are, of, Red, Color,, Blue, Berries, are, Blue, Color]
Substring of Original String:
Red Berries are of Red Color
Printing the char array from substring:
[R, e, d, B, e, r, r, i, e, s, a, r, e, o, f, R, e, d, C, o, l, o, r]
Printing the char array converted to string:
RedBerriesareofRedColor
Converting that string into an Array of String:
[R, e, d, B, e, r, r, i, e, s, a, r, e, o, f, R, e, d, C, o, l, o, r]
 */
