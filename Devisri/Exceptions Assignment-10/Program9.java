import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Handle the Checked Exceptions
public class Program9 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Sample"));
            String s = sc.nextLine();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            check();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Out of try + catch block!!!");
    }

    static void check() throws Exception {
        Scanner sc = new Scanner(new File("Manual"));
        String s = sc.nextLine();
        int result = s.length();
        System.out.println("Length: " + result);
    }
}
/*
Sample (The system cannot find the file specified)
Manual (The system cannot find the file specified)
Out of try + catch block!!!
*/