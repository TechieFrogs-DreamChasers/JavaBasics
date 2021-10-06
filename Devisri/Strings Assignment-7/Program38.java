import java.util.Scanner;

//Duplicate words in a string
public class Program38 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        //splitting string to words in to string array
        String[] strings = s.split(" ");
        int length = strings.length;
        //Buffer to append duplicate words
        StringBuffer sb = new StringBuffer();
        //loopin through string array
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                //if index [i] word contains [j] word
                if (strings[i].contains(strings[j])) {
                    //the word is appended to buffer
                    sb.append(strings[i]).append(" ");
                }
            }
        }
        //Printing duplicate words as Buffer strings
        System.out.println(sb);
    }
}
/*
output:
Enter a String:
Red berries are red in color, but Blue berries are blue color.
red berries are blue
 */