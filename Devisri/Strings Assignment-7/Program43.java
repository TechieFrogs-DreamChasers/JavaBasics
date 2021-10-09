import java.util.Arrays;
import java.util.Scanner;

//Program to separate individual characters from a string
public class Program43 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        sc.close();
        s=s.replace(" ","");
        String[] strings = s.split("");
        System.out.println(Arrays.toString(strings));
    }
}
/*
Enter a String:
welcome to java
[w, e, l, c, o, m, e, t, o, j, a, v, a]
*/
