import java.util.Scanner;

//Most repeated word in a text file
public class Program41 {
    public static void main(String[] args) {
        //Scanner sc=new Scanner("Strings.txt");
        Scanner sc=new Scanner(System.in);
        //Reads the string from the file
        String s=sc.nextLine();
        s=s.toLowerCase();
        String[] strings = s.split(" ");
        int length = strings.length;
        StringBuilder sb=new StringBuilder();
        //looping through string array
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                //if index [i] word contains [j] word
                if (strings[i].contains(strings[j])) {
                    //the word is appended to buffer
                    sb.append(strings[i]).append(" ");
                }
            }
        }
        System.out.println(sb);
    }
}
