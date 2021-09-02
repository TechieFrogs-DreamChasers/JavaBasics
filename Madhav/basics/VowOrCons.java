import java.util.Scanner;
public class VowOrCons
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        switch (a) {
            case "a","i","e","o","u","A","I","E","O","U":

                System.out.println("Its is a vowel");
                
                break;
        
            default:
                System.out.println("Its is a Consonant");
                break;
        }
    }

    
}
