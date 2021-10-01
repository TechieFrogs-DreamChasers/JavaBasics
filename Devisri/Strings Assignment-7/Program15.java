import java.util.Scanner;

//Capitalize First character of each word in a String
public class Program15 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        //reads input from console
        String string = sc.nextLine();
        //using split string is stored in a string array
        String[] s_Arr = string.split(" ");
        //String s="this is string program!!!";
        //After conversion a new string is stored in this
        String result = "";
        //String[] sarr=s.split(" ");
        //To append the new string in StringBuilder
        StringBuilder sb = new StringBuilder();
        /* for (int i=0;i< s_Arr.length;i++){
            System.out.println(s_Arr[i]);
        }*/
        //looping through string array
        for (int i = 0; i < s_Arr.length; i++) {
            //first letter in the element i is stored in s1 String
            String s1 = s_Arr[i].substring(0, 1);
            //remaining String is stored here
            String s2 = s_Arr[i].substring(1);
            //converting first letter to caps
            s1 = s1.toUpperCase();
            //concatenating both strings to final result string
            result = s1 + s2;
            //appending result to Builder
            sb.append(result + " ");
        }
        //Printing the fully appended Builder
        System.out.println(sb);
    }
}
