import java.util.Scanner;

public class assignment5 {
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);
            System.out.println("Enter an alphabet");

        char ch = scannerObj.next().charAt(0);

        if(ch == 'a'  || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println(ch + "  is Vowel");
        else
            System.out.println(ch + "  is Consonant");

        scannerObj.close();


    }

    
}
