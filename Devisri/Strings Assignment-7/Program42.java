import java.util.Scanner;

//To find number of words in the file
public class Program42 {
    public static void main(String[] args) {
        //Scanner sc=new Scanner("Strings.txt");
        System.out.println("Enter a String: ");
        Scanner sc=new Scanner(System.in);
        //Reads the string from the file
        String s=sc.nextLine();
        s=s.toLowerCase();
        sc.close();
        String[] strings = s.split(" ");
        int count=0;
        for(String string:strings){
            if(string!=" ")
                count++;

        }
        System.out.println("The number of words in the String are: "+count);
    }
}
